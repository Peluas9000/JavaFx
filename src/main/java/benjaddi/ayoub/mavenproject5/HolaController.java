package benjaddi.ayoub.mavenproject5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField; // Necesario para usar TextField
import javafx.scene.image.ImageView; // Necesario para usar ImageView
import javafx.event.ActionEvent; // Necesario para el método de acción del botón

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class HolaController implements Initializable {

    
    
    @FXML
    private TextField campoTextoOculto;

    @FXML
    private ImageView imagenOculta;

   
    @FXML
    protected void mostrarElementos(ActionEvent event) {
        // Lógica para hacer visibles los elementos
        
        // Hacemos visible el TextField
        campoTextoOculto.setVisible(true); 
        
        // Hacemos visible la ImageView
        imagenOculta.setVisible(true);
    }
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Si necesitas realizar alguna inicialización al cargar la vista, va aquí.
        // Por ahora, lo dejamos vacío.
    }    
    
}