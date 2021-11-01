module com.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.testng;


    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;
}