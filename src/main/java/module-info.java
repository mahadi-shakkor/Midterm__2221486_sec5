module com.oop.mahadi.demo6midexam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo6midexam to javafx.fxml;
    exports com.oop.mahadi.demo6midexam;
}