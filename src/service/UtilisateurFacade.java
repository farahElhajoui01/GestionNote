/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.fxml.FXML;
import javax.swing.JOptionPane;



/**
 *
 * @author fatima
 */
public class UtilisateurFacade {
    static Connection c;
    @FXML
    private JFXTextField loginTF;
    private JFXPasswordField mdpPF;
    
      public UtilisateurFacade() throws ClassNotFoundException, InstantiationException {
         c = connexion.ConnexionBd.getConnexion();
    }
    
     public void seConnecter(){
         System.out.println("hani dkhlt l seconnecter");      
        try{
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@127.0.1:1521:orcl");
             String requete="select * from utilisateur where login='"+loginTF.getText()+"' and password ='"+mdpPF.getText()+"'";
           
             PreparedStatement ps = c.prepareStatement(requete);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "login hwa hadak");
            }else{
                JOptionPane.showMessageDialog(null, "echec ta3 login");
            }
             }
            catch (Exception e){
                    System.out.println(e);
                    }
       
       
           }
}
