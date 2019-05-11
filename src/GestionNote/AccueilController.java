/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionNote;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import service.UtilisateurFacade;


/**
 * FXML Controller class
 *
 * @author fatima
 */
public class AccueilController implements Initializable {
    @FXML 
    private UtilisateurFacade utilisateurFacade;
    private JFXTextField loginTF;
    private JFXPasswordField mdpPF;
    private JFXButton seConnBtn;
     

    public AccueilController() throws ClassNotFoundException, InstantiationException {
        this.utilisateurFacade = new UtilisateurFacade();
    }
    
    /**
     * Initializes the controller class.
     */
    public void connexion(){   
        utilisateurFacade.seConnecter();
         System.out.println(loginTF.getText()+"ou"+mdpPF.getText());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
