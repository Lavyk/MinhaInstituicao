package my.uepb.source;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lavyk
 */
public class ConectaBd {
    
    public static Connection conectabd() throws ClassNotFoundException{
        try {

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/minhaInstituicao","postgres", "root");

            return con;
        } catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            
            return null;
        }
    
    }
    
    
    
    
   public static void main(String args[]) throws SQLException {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/",
            "postgres", "root");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      
   }

}
