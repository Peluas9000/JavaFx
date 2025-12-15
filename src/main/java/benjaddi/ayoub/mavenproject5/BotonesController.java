package benjaddi.ayoub.mavenproject5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
// CORREGIDO: Usamos javafx, no java.awt
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class BotonesController implements Initializable {

    // Los nombres aquí deben ser IDÉNTICOS a los fx:id del FXML
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Button reset;   // Antes bReset
    @FXML private Button ok;      // Antes bOK
    @FXML private Button cancel;  // Antes bCancel
    @FXML private Button boton;   // Antes boton1 (para coincidir con tu FXML)

    int contadorOK = 0;
    int contadorCancel = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicialización
    }

    @FXML
    public void pushButton(ActionEvent actionEvent) {
        Object obj = actionEvent.getSource();
        
        if (label1 != null) label1.setText("Ha pulsado un botón");

        if (obj == ok) {
            contadorOK++;
            label1.setText("Ha pulsado OK " + contadorOK + " veces");
        } else if (obj == cancel) {
            contadorCancel++;
            label1.setText("Ha pulsado Cancel " + contadorCancel + " veces");
        } else if (obj == reset) {
            label1.setText("Label1");
            if(label2 != null) label2.setText("Tecla");
            contadorOK = 0;
            contadorCancel = 0;
        } else if (obj == boton) {
             label1.setText("Botón 1 presionado");
        }
    }

    @FXML
    public void teclaPulsada(KeyEvent ke) {
        if(label2 == null) return;
        
        KeyCode key = ke.getCode();
        if (key == KeyCode.ENTER) label2.setText("ENTER");
        if (key == KeyCode.ESCAPE) label2.setText("ESCAPE");
    }
}