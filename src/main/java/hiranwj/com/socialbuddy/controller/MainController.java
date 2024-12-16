package hiranwj.com.socialbuddy.controller;

import hiranwj.com.socialbuddy.model.Channel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    public TextArea txtChannelContent;
    @FXML
    public TextArea txtPostArea;
    @FXML
    public Button btnPost;

    @FXML
    public TextArea txtSubscribeArea;
    @FXML
    public Button btnSubscribe;
    @FXML
    public Button btnUnsubscribe;
    private final ChannelController channelController = new ChannelController();

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void initialize() {

        Channel channel = Channel.getInstance();


        btnPost.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String content = txtPostArea.getText().trim();
                if (!content.isEmpty()) {
                    channel.postMessage(content);
                    txtChannelContent.setText(channel.getPosts());
                    if (!channel.getSubscribers().isEmpty()) {
                        txtPostArea.appendText("New Post: " + content + "\n");
                    }
                    txtPostArea.clear();
                }
            }
        });

        btnSubscribe.setOnAction(e -> {
            try {
                channelController.subscribe("User1");
                txtSubscribeArea.appendText("User1 subscribed to the channel.\n");
            } catch (Exception ex) {
                showAlert(Alert.AlertType.ERROR, "Error", ex.getMessage());
            }
        });

        btnUnsubscribe.setOnAction(e -> {
            try {
                channelController.unsubscribe("User1");
                txtSubscribeArea.appendText("User1 unsubscribed from the channel.\n");
            } catch (Exception ex) {
                showAlert(Alert.AlertType.ERROR, "Error", ex.getMessage());
            }
        });

    }
}
