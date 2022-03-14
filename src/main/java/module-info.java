module com.example.gestionetudiants {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.gestionetudiants to javafx.fxml;
    exports com.example.gestionetudiants;
}