/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncommerciale;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import metier.Service;
import models.Client;
import models.Commande;
import models.Personne;

/**
 * FXML Controller class
 *
 * @author habon
 */
public class InscriptionController implements Initializable {
    
    
    
     private Service metier;
    //ObservableList
     ObservableList<Commande> obClasses;
     ObservableList<Client> obEtudiants;
    

    @FXML
    private PasswordField txtPwdsss;
    @FXML
    private Button btnEnregistrement;
      @FXML
    private TextField txtNom;
    @FXML
    private TextField txtPrenom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
               metier=new Service();

    }    
    
    
    
    @FXML
    private void handleCreerInscription(ActionEvent event) {
         String nom=txtNom.getText();
         String prenom=txtPrenom.getText();
        
         
          Personne pers=new Personne(nom,prenom) {};
          if (metier.creerPersonne(pers)){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Personne ajoutée avec success");
            alert.setTitle("Information");
            alert.show();
            //Mettre Jour la Table View
             obCommande.add(Commande);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Erreur Insertion");
            alert.setTitle("Erreur");
            alert.show();
        }
    }
    
    
}
