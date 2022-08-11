module com.example.simpleceilingfan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simpleceilingfan to javafx.fxml;
    exports com.example.simpleceilingfan;
}