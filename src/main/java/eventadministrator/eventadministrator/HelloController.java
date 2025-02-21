package eventadministrator.eventadministrator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private void switchScene(ActionEvent actionEvent, String fxmlFile, String title) throws IOException {
        // Load the new FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = fxmlLoader.load();

        // Get the current stage from the action event
        Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();

        // Set the new scene to the current stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
    @FXML
    public void loginBtnClicked(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "dashboard.fxml", "Event Administrator Dashboard");
    }

    @FXML
    public void eventSettinghBtnClicked(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "eventsetting.fxml", "Setting");
    }

    @FXML
    public void seeMoreBtnClicked(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "eventstatus.fxml", "Event Status");
    }

    @FXML
    public void creatEventBtnClicked(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "createevent.fxml", "Create Event");
    }

    @FXML
    public void userManagementBtnCLicked(ActionEvent actionEvent) throws IOException {
        switchScene(actionEvent, "addingusers.fxml", "User Management");
    }


}