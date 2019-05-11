/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author farah
 */
public class testFacade {
     static Connection c;

    public testFacade() throws ClassNotFoundException, InstantiationException {
         c = connexion.ConnexionBd.getConnexion();
    }
     public void test() throws SQLException{
      System.out.println("aaaaaaatest");
      
        String requete="insert into utilisateur values('lui','lui')";
        Statement st;
        st = c.createStatement();
        try{
        int test=st.executeUpdate(requete);
      if(test==1)
                JOptionPane.showConfirmDialog(null, "success");
            else
                JOptionPane.showConfirmDialog(null, "field");   
    }
    
     catch(SQLException ex1) {JOptionPane.showMessageDialog(null, "erreur: execuuuution"+ex1.getMessage());}
    
    
 }    
    
    
    
}
