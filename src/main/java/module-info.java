module benjaddi.ayoub.mavenproject5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires java.base;

    opens benjaddi.ayoub.mavenproject5 to javafx.fxml;
    exports benjaddi.ayoub.mavenproject5;
}
