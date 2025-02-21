package eventadministrator.eventadministrator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    public void loginBtnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Event Administrator Dashboard");
        stage.show();

    }
@FXML
    public void eventSettinghBtnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eventsetting.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Setting");
        stage.show();
    }

@FXML
    public void seeMoreBtnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eventstatus.fxml"));
        Parent roor = fxmlLoader.load();
        Scene scene = new Scene(roor);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Event Status");
        stage.show();
    }
@FXML
    public void creatEventBtnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("createevent.fxml"));
        Parent roor = fxmlLoader.load();
        Scene scene = new Scene(roor);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Event Status");
        stage.show();
    }
@FXML
    public void userManagementBtnCLicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addingusers.fxml"));
        Parent roor = fxmlLoader.load();
        Scene scene = new Scene(roor);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Event Status");
        stage.show();
    }
}


