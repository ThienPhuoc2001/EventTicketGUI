package eventadministrator.eventadministrator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 260);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
/*
Set up the JavaFX project and file structure. (done)

Create the main application class (Main.java) to launch the GUI. (done)

Design the layout for each screen using FXML or hand-coded JavaFX components. (done)

Implement navigation between screens (e.g., button clicks to switch scenes). (done)

Apply CSS styling to enhance the GUI.



Testing. */
