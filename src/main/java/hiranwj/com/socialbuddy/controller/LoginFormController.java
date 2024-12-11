package hiranwj.com.socialbuddy.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginFormController {

    public TextField txtLoginEmail;
    public TextField txtLoginPassword;
    public Button btnLogin;

    public void initialize(){

        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String email = txtLoginEmail.getText();
                String password = txtLoginPassword.getText();

                if (email.isBlank()){
                    new Alert(Alert.AlertType.ERROR,"Email cannot be empty").showAndWait();
                    txtLoginEmail.requestFocus();
                    return;
                } else if (password.isBlank()) {
                    new Alert(Alert.AlertType.ERROR, "Password cannot be empty").showAndWait();
                    txtLoginPassword.requestFocus();
                    return;
                } else if (email == "admin" && password == "admin") {
                    
                }

                txtLoginPassword.clear();
                txtLoginPassword.clear();
                txtLoginEmail.requestFocus();
            }
        });
    }
}
