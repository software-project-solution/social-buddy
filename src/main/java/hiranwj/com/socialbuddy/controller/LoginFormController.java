package hiranwj.com.socialbuddy.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    @FXML
    public TextField txtLoginEmail;
    @FXML
    public TextField txtLoginPassword;
    @FXML
    public Button btnLogin;
    @FXML
    public Label lblSignup;

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
                } else if (email.equals("admin") && password.equals("admin")) {
                    URL resource = this.getClass().getResource("/hiranwj/com/socialbuddy/view/MainView.fxml");
                    if (resource == null) {
                        System.err.println("FXML file not found! Please check the file path.");
                        return;
                    }
                    try {
                        Parent container = FXMLLoader.load(resource);
                        Scene secondScene = new Scene(container);
                        Stage stage = (Stage) btnLogin.getScene().getWindow(); // The scene is set for the current stage
                        stage.setScene(secondScene);
                        stage.setTitle("Social Buddy v1.0.0");
                        stage.show();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                txtLoginEmail.clear();
                txtLoginPassword.clear();
                txtLoginEmail.requestFocus();
            }
        });

        lblSignup.setOnMouseClicked(event -> {
            URL resource = getClass().getResource("/hiranwj/com/socialbuddy/view/SignupForm.fxml");
            if (resource == null) {
                System.err.println("FXML file not found! Please check the file path.");
                return;
            }
            try {
                Parent container = FXMLLoader.load(resource);
                Scene secondScene = new Scene(container);
                Stage stage = (Stage) lblSignup.getScene().getWindow();
                stage.setScene(secondScene);
                stage.setTitle("SignUp");
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Error loading FXML file", e);
            }
        });
    }
}
