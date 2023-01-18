module com.example.airline {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.airline to javafx.fxml;
    exports com.example.airline;
}