package com.oop.mahadi.demo6midexam;

import java.io.*;
import java.net.URL;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MidtermController {

    @FXML
    private TableColumn<Demotable, String> c1;

    @FXML
    private TableColumn<Demotable, String> c10;

    @FXML
    private TableColumn<Demotable, String> c11;

    @FXML
    private TableColumn<Demotable, String> c2;

    @FXML
    private TableColumn<Demotable, String> c3;

    @FXML
    private TableColumn<Demotable, String> c4;

    @FXML
    private TableColumn<Demotable, String> c5;

    @FXML
    private TableColumn<Demotable, String> c6;

    @FXML
    private TableColumn<Demotable, String> c7;

    @FXML
    private TableColumn<Demotable, String> c8;

    @FXML
    private TableColumn<Demotable, String> c9;
    @FXML
    private TableView<Demotable> tableView;

    @FXML
    private ComboBox<String> com1brand;

    @FXML
    private ComboBox<String> com2Model;

    @FXML
    private TextField noofCorefxid;

    @FXML
    private TextField pricefxid;

    @FXML
    private TextField serialnoFxid;
    @FXML
    private ComboBox<String> com4modl;
    @FXML
    private ComboBox<String> com3brand;
    @FXML
    private CheckBox hasGpuChackbox;
ArrayList<Computer> arrComputerlist=new ArrayList<>();
//HashMap<>

    @FXML
    void add(ActionEvent event) {
        boolean a=true;

        if (!hasGpuChackbox.isSelected()){
            a=false;
            noofCorefxid.setText("0");
            showAlert("Success fully added ","validation success your gpu core set to be 0");
//                (int serialNo, String brand, String model,
//                float price, boolean hasGpu, int noofGpuCore) {

            arrComputerlist.add(new Computer(Integer.parseInt(serialnoFxid.getText()),
                    com3brand.getValue(),com4modl.getValue(),
                    Float.parseFloat(pricefxid.getText()),a,
                    Integer.parseInt(noofCorefxid.getText())));


        }
        else {
            if(Integer.parseInt(noofCorefxid.getText())%2!=0){
                showAlert("Validation fail","Your gpu  hase to be multiple of 2 ");
                return;

            }
            else {
                showAlert("Success fully added ","validation success");
//                (int serialNo, String brand, String model,
//                float price, boolean hasGpu, int noofGpuCore) {

                    arrComputerlist.add(new Computer(Integer.parseInt(serialnoFxid.getText()),
                            com3brand.getValue(),com4modl.getValue(),
                            Float.parseFloat(pricefxid.getText()),a,
                            Integer.parseInt(noofCorefxid.getText())));


            }
        }




    }
public float updateVapprice(float f){


        return  f+(f*(15/100.0f));
}
    @FXML
    void show(ActionEvent event) {
        if (arrComputerlist.isEmpty()){
            showAlert("Your Computer arr is empty","Add Computer Obj");
            return;
        }
        for(Computer c:arrComputerlist){
//            if ((com1brand.getValue().isEmpty())&& com2Model.getValue().isEmpty()){
//                showAlert("","select at lest1 from combow box (Brand or Model)");
//                return;
//            }

            if ((com2Model.getValue().equals(c.getModel())) || (com1brand.getValue().equals(c.getBrand()))){
                String x="";
                Float p=1.0f;

//                p=c.getPrice()+c.getPrice()*(15/100.0f);
                tableView.getItems().add(new Demotable(
                        c.getSerialNo()+ "",c.getBrand()+"",""+c.getModel()+" "+"",
                        Float.toString(updateVapprice(c.getPrice()))+ "",x+"",x+"",
                        x+ "",x+"",x+"",
                        x+ "",x+""





                ));

            }


        }



    }
    private void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();

    }
    @FXML
    void initialize() {
        showFromBin2(arrComputerlist);
        com4modl.getItems().addAll("samsung s1","apple m1","samsung s11","apple m11","samsung s12","apple m12","mokoa 12--","nokia 1300");
        com1brand.getItems().addAll("samsung","apple","nokia");

        com2Model.getItems().addAll("samsung s1","apple m1","samsung s11","apple m11","samsung s12","apple m12","mokoa 12--","nokia 1300");
        com3brand.getItems().addAll("samsung","apple","nokia");
        com2Model.setValue("samsung s1");
        com1brand.setValue("samsung");
        com4modl.setValue("samsung s1");
        com3brand.setValue("samsung");


        c1.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C1"));
        c2.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C2"));
        c3.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C3"));
        c4.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C4"));
        c5.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C5"));
        c6.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C6"));
        c7.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C7"));
        c8.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C8"));
        c9.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C9"));
        c10.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C10"));
        c11.setCellValueFactory(new PropertyValueFactory<Demotable,String>("C11"));

    }


    @FXML
    public void saveToBin(ActionEvent actionEvent) {
        File f = new File("x.bin");

        try {
            if (!f.exists()) {
                f.createNewFile(); // Create a new blank binary file if it doesn't exist
            }

            FileOutputStream fios = new FileOutputStream(f);
            ObjectOutputStream obfs = new ObjectOutputStream(fios);

            for (Computer c : arrComputerlist) {
                obfs.writeObject(c);
            }

            obfs.close();
            showAlert("Done ","Successfully Saved to bin File");
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions and print stack trace
        }
    }


    @FXML
    public void showFromBin(ActionEvent actionEvent) {

        File f = new File("x.bin");
        ArrayList<Computer> ccc=new ArrayList<>();

        if (f.exists()) {
            try {
                FileInputStream fios = new FileInputStream(f);
                ObjectInputStream obfs = new ObjectInputStream(fios);

                try {
                    while (true) {
                        Computer c = (Computer) obfs.readObject();
                        // Display the object, for example, using System.out.println
                        System.out.println(c.toString());
                        // Optionally, add the object to a list or update the UI
                        ccc.add(c);
                    }
                } catch (EOFException e) {
                    // End of file reached
                } finally {
                    obfs.close();
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace(); // Handle exceptions and print stack trace
            }
        } else {
            System.out.println("The file does not exist.");
        }
        tableView.getItems().clear();
        if(!ccc.isEmpty()){

            showAlert("Success","successfully load from bin file");
            for(Computer c:ccc){


                String x="";
                Float p=1.0f;

//                p=c.getPrice()+c.getPrice()*(15/100.0f);
                tableView.getItems().add(new Demotable(
                        c.getSerialNo()+ "",c.getBrand()+"",""+c.getModel()+" "+"",
                        Float.toString(updateVapprice(c.getPrice()))+ "",x+"",x+"",
                        x+ "",x+"",x+"",
                        x+ "",x+""


                ));
            }
        }



    }


    @FXML
    public void showFromBin2(ArrayList<Computer> com) {

        File f = new File("x.bin");
        ArrayList<Computer> ccc=new ArrayList<>();

        if (f.exists()) {
            try {
                FileInputStream fios = new FileInputStream(f);
                ObjectInputStream obfs = new ObjectInputStream(fios);

                try {
                    while (true) {
                        Computer c = (Computer) obfs.readObject();
                        // Display the object, for example, using System.out.println
//                        System.out.println(c.toString());
                        // Optionally, add the object to a list or update the UI
                        com.add(c);
                    }
                } catch (EOFException e) {
                    // End of file reached
                } finally {
                    obfs.close();
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace(); // Handle exceptions and print stack trace
            }
        }



    }

}
