module com.example.rentcar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rentcar to javafx.fxml;
    exports com.example.rentcar;
}