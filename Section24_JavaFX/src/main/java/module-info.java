module com.example.section24_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.section24_javafx to javafx.fxml;
    exports com.example.section24_javafx;
}