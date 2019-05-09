/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionNote;

import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import service.testFacade;

/**
 *
 * @author farah
 */
public class ConnexionController extends Application {
 
    @FXML 
    public testFacade tf;

    public ConnexionController() throws ClassNotFoundException, InstantiationException {
        this.tf = new testFacade();
    }
    public void testfonction() throws SQLException{
    tf.test();
    }
    
    
    
    
    
    
    @Override
     
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    
    String name ;
    public static void main(String[] args) throws SQLException {
        launch(args);
        
    }
   
    
}
