package hiranwj.com.socialbuddy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws IOException {

        URL resource = this.getClass().getResource("view/WelcomeForm.fxml");

        Parent container = FXMLLoader.load(resource);
        var scene = new Scene(container);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Table Demo");
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}