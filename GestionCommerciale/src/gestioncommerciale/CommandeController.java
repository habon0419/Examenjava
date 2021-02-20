/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncommerciale;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author habon
 */
public class CommandeController implements Initializable {

    @FXML
    private TextField txtNoms;
    @FXML
    private TextField txtNom;
    @FXML
    private TextField txtNumero;
    @FXML
    private DatePicker cboDate;
    @FXML
    private Rectangle txtTelephone;
    @FXML
    private TextField txtAdresse;
    @FXML
    private TextField txtReference;
    @FXML
    private Button btnSearch;
    @FXML
    private Button btnADD;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
