package hiranwj.com.socialbuddy.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WelcomeFormController {
    public TextField txtFirstName;
    public TextField txtLastName;
    public TextField txtEmail;
    public TextField txtPassword;
    public TextField txtConfirmPassword;
    public Button btnCreateAccount;

    public void initialize(){

        btnCreateAccount.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                String email = txtEmail.getText();
                String password = txtPassword.getText();
                String confirmPassword = txtConfirmPassword.getText();

                if(firstName.isBlank()){
                    new Alert(Alert.AlertType.ERROR,"FirstName cannot be empty").showAndWait();
                    txtFirstName.requestFocus();
                    return;
                } else if (lastName.isBlank()) {
                    new Alert(Alert.AlertType.ERROR,"LastName cannot be empty").showAndWait();
                    txtLastName.requestFocus();
                    return;
                } else if (email.isBlank()) {
                    new Alert(Alert.AlertType.ERROR,"Email cannot be empty").showAndWait();
                    txtEmail.requestFocus();
                    return;
                } else if (password.isBlank()) {
                    new Alert(Alert.AlertType.ERROR,"Password cannot be empty").showAndWait();
                    txtPassword.requestFocus();
                    return;
                } else if (confirmPassword.isBlank()) {
                    new Alert(Alert.AlertType.ERROR,"Confirm Password cannot be empty").showAndWait();
                    txtConfirmPassword.requestFocus();
                    return;
                }

                txtFirstName.clear();
                txtLastName.clear();
                txtEmail.clear();
                txtPassword.clear();
                txtConfirmPassword.clear();
                txtFirstName.requestFocus();
            }
        });

    }

}