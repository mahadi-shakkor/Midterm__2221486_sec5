package com.oop.mahadi.demo6midexam;

import javafx.scene.control.cell.PropertyValueFactory;

public class Demotable {
    String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;

    /*

            int x=0;
        tableView.getItems().add(new Demotable(
               1.0f+ "",1.0+"",x+"",
                x+ "",x+"",x+"",
                x+ "",x+"",x+"",
                x+ "",x+""





        ));

    -----------------

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
    ---------------------------------
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

--------------Allert-0----

    private void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();

    }

    }
       */



    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getC6() {
        return c6;
    }

    public void setC6(String c6) {
        this.c6 = c6;
    }

    public String getC7() {
        return c7;
    }

    public void setC7(String c7) {
        this.c7 = c7;
    }

    public String getC8() {
        return c8;
    }

    public void setC8(String c8) {
        this.c8 = c8;
    }

    public String getC9() {
        return c9;
    }

    public void setC9(String c9) {
        this.c9 = c9;
    }

    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    public String getC11() {
        return c11;
    }

    public void setC11(String c11) {
        this.c11 = c11;
    }

    public Demotable(String c1, String c2, String c3, String c4, String c5, String c6, String c7, String c8, String c9, String c10, String c11) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;
        this.c9 = c9;
        this.c10 = c10;
        this.c11 = c11;
    }
}
