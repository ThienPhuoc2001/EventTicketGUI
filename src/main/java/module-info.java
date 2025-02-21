module eventadministrator.eventadministrator {
    requires javafx.controls;
    requires javafx.fxml;


    opens eventadministrator.eventadministrator to javafx.fxml;
    exports eventadministrator.eventadministrator;
}