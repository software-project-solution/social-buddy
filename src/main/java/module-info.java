module hiranwj.com.socialbuddy {
    requires javafx.controls;
    requires javafx.fxml;


    opens hiranwj.com.socialbuddy to javafx.fxml;
    exports hiranwj.com.socialbuddy;
}