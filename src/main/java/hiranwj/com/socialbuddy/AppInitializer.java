package hiranwj.com.socialbuddy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws IOException {

        URL resource = this.getClass().getResource("view/LoginForm.fxml");

        Parent container = FXMLLoader.load(resource);
        var scene = new Scene(container);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome");
//        primaryStage.initStyle(StageStyle.UTILITY); // Optionally use StageStyle.UTILITY or StageStyle.TRANSPARENT
//        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        primaryStage.centerOnScreen();
    }
}