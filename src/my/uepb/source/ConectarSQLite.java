
package my.uepb.source;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lavyk
 */
public class ConectarSQLite {
    
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    

    public ConectarSQLite() throws ClassNotFoundException{
        con = conectabd();

    }
    
    
    public static Connection conectabd() throws ClassNotFoundException{
        try {

            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:src/my/uepb/AppBD.db");

            return con;
        } catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            
            return null;
        }
    }
  
    
    
}
