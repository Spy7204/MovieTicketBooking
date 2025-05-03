module com.example.movieticket {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.movieticket to javafx.fxml;
    exports com.example.movieticket;
}