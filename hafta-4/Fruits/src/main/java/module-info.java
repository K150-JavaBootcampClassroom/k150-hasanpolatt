module com.example.fruits {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fruits to javafx.fxml;
    exports com.example.fruits;
}