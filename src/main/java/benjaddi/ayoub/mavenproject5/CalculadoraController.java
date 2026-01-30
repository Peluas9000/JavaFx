package benjaddi.ayoub.mavenproject5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private TextField pantalla;

    private double numero1 = 0;
    private String operador = "";
    private boolean nuevaEntrada = true;

    public void initialize() {
        // Hacemos que la pantalla no sea editable con el teclado para evitar letras
        pantalla.setEditable(false);
    }

    // Acción para todos los botones numéricos (0-9) y el punto
    @FXML
    public void clicNumero(ActionEvent event) {
        if (nuevaEntrada) {
            pantalla.setText("");
            nuevaEntrada = false;
        }

        // Obtenemos el texto del botón que se pulsó
        String numero = ((Button) event.getSource()).getText();
        pantalla.setText(pantalla.getText() + numero);
    }

    // Acción para los operadores (+, -, *, /)
    @FXML
    public void clicOperador(ActionEvent event) {
        String op = ((Button) event.getSource()).getText();
        
        if (!"=".equals(op)) {
            if (!operador.isEmpty()) return; // Evitar pulsar dos operadores seguidos
            
            numero1 = Double.parseDouble(pantalla.getText());
            operador = op;
            nuevaEntrada = true;
        }
    }

    // Acción para el botón Igual (=)
    @FXML
    public void clicIgual(ActionEvent event) {
        if (operador.isEmpty()) return;

        double numero2 = Double.parseDouble(pantalla.getText());
        double resultado = 0;

        switch (operador) {
            case "+": resultado = numero1 + numero2; break;
            case "-": resultado = numero1 - numero2; break;
            case "X": resultado = numero1 * numero2; break; // Ojo: en el FXML usa X mayúscula
            case "/": 
                if (numero2 == 0) {
                    pantalla.setText("Error");
                    nuevaEntrada = true;
                    return;
                }
                resultado = numero1 / numero2; 
                break;
        }

        pantalla.setText(String.valueOf(resultado));
        operador = "";
        nuevaEntrada = true;
    }

    // Acción para borrar (C)
    @FXML
    public void clicBorrar(ActionEvent event) {
        pantalla.setText("");
        numero1 = 0;
        operador = "";
        nuevaEntrada = true;
    }
}