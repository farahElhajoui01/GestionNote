/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author farah
 */
public class ConnexionBd {
    
  private static  Connection c;
   private static Statement st;
  private  static ResultSet rs;
    
      public  static Connection getConnexion() throws ClassNotFoundException, InstantiationException{
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ConnexionBd.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            JOptionPane.showMessageDialog(null, "aaaaaaaaa:");}
            
        String dburl = "jdbc:oracle:thin:@127.0.1:1521:orcl";
        try {
        c = DriverManager.getConnection(dburl, "system", "system");}
        catch(SQLException ex1) {JOptionPane.showMessageDialog(null, "erreur: connxion"+ex1.getMessage());}
        try{
        st= c.createStatement();}
        catch(SQLException ex2) {JOptionPane.showMessageDialog(null, "erreur statement:"+ex2.getMessage());}
       
        JOptionPane.showMessageDialog(null, "Connexion établie");
        return c;
    }}
