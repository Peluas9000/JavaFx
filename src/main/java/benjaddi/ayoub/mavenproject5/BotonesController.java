/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package benjaddi.ayoub.mavenproject5;

import java.awt.Button;
import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class BotonesController implements Initializable {
        @FXML
        private Label label2;
        @FXML
        private Button bReset;
        @FXML
        private Button bOK;
        @FXML
        private Button bCancel;
        @FXML
        private Label label1;
        @FXML
        private Button boton1;
        int contadorOK = 0;
        int contadorCancel = 0;
        
    /**
     * Initializes the controller class.
     */
        
            public void pushButton(ActionEvent actionEvent) {
             label1.setText("Ha pulsado el botón");
             //compruebo qué objeto botón ha sido pulsado
             //ok o cancel para contarlo
             Object obj = actionEvent.getSource();
             if (obj == bOK){
             contadorOK ++;
             label1.setText("Ha pulsado OK " + contadorOK + " veces");
             }
             if (obj == bCancel){
             contadorCancel ++;
             label1.setText("Ha pulsado Cancel " + contadorCancel + " veces");
             }
             if (obj == bReset){
             label1.setText("Label1");
             label2.setText("Tecla");
             contadorOK = 0;
             contadorCancel = 0;
             }
             }
        
            //codigos de las teclas
//https://docs.oracle.com/javafx/2/api/javafx/scene/input/KeyCode.html
            public void teclaPulsada(KeyEvent ke) {
                KeyCode key = ke.getCode();
             if (key == KeyCode.ENTER)
             label2.setText("ENTER");
             if (key == KeyCode.ESCAPE)
             label2.setText("ESCAPE");
            }
            

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
    }    
    
}
