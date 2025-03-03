module sio.devoir1sio1a {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens sio.devoir1sio1a.models;
    opens sio.devoir1sio1a to javafx.fxml;
    exports sio.devoir1sio1a;
}