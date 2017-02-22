package my.uepb.source;

import java.sql.*;  
import java.sql.PreparedStatement;  
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import my.uepb.source.ConectarSQLite;
import org.sqlite.jdbc4.JDBC4PreparedStatement;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Date;
import javax.swing.JOptionPane;
import my.uepb.gui.RemoverUser;
import my.uepb.gui.desconectar;

public class AddUser{
    desconectar bd = new desconectar();
    public static void main(String[] args) throws SQLException  {
        
        /*Connection c = null;
        Statement stmt2 = null;
        Connection con = new ConnectionFactory().getConnection();
        con.setAutoCommit(false); */

                
        /*PreparedStatement stmt = con.prepareStatement("select * from users");
        ResultSet rs = stmt.executeQuery();

         while (rs.next()) {
             String matricula, nome, periodo,id;
             id = rs.getString("id");
             matricula = rs.getString("matricula");
             nome = rs.getString("nome");
             periodo = rs.getString("periodo");
             System.out.println(matricula + " | "+ nome +  "[" +id + "] | " + periodo);
         }*/
         
        //AddUser user = new AddUser();
        //user.CriarUser("Layo Doidera", "2", "Masculino", "23", "784632");
        
        String cargo = "3";
        int novoCargo = Integer.valueOf(cargo)+1;
        cargo = novoCargo + "";
        System.out.println(cargo);
        
        
    }
    
    public void CriarUser(String nome, String cargo, String sexo, String idade, String senha) throws SQLException{
        Statement stmt2 = null;
        Connection con = new ConnectionFactory().getConnection();
        con.setAutoCommit(false);
        AddUser add = new AddUser();
        
        try{
            int novoCargo = Integer.valueOf(cargo)+1;
            cargo = novoCargo + "";
            
            String matricula = gerarMatricula();
            stmt2 = con.createStatement();
            String sql = "INSERT INTO users (id,matricula,nome,senha,cre, periodo,cargo, sexo, idade) " +
            "VALUES ('" + add.getUltimoID() + "', '" + matricula + "', '" + nome + "', '" + senha + "', '0.0', '1', '" + cargo + "', '" + sexo + "', '" + idade + "' );";
            stmt2.execute(sql);
            stmt2.close();
            con.commit();
            con.close();
      
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    
    public String getUltimoID() throws SQLException{
        Connection c = new ConnectionFactory().getConnection();
        String ultimoID = "select * from users where id = (select max(id) from users);";
        PreparedStatement stmt = c.prepareStatement(ultimoID);
        ResultSet rs = stmt.executeQuery();
        ultimoID = rs.getString("id");
        ultimoID = Integer.valueOf(ultimoID) + 1 + "";
        c.close();
    return ultimoID;
    }
    
    public Map pesquisarUser(String matricula) throws SQLException{
        
        Map<String, String> userDados = new HashMap<String,String>();
        try {
            Statement stmt2 = null;
            Connection con = new ConnectionFactory().getConnection();
            con.setAutoCommit(false);
            String pesquisa = "select * from users where matricula = " + matricula;
            PreparedStatement stmt = con.prepareStatement(pesquisa);
            ResultSet rs = stmt.executeQuery();
            pesquisa = rs.getString("id");
            userDados.put("nome", rs.getString("Nome"));
            userDados.put("cargo", rs.getString("cargo"));
            userDados.put("sexo", rs.getString("sexo"));
            userDados.put("matricula", rs.getString("matricula"));
            con.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Nenhum usuario encontrado");
        }
        
        return userDados;
    }
    
    public String gerarMatricula(){
        
        //Gera matricula aleatoria de acordo com o Ano, Mês e o Dia.
        String ano = (Calendar.getInstance().get(Calendar.YEAR)+"").substring(2, 4);
        
        int intMes = Calendar.getInstance().get(Calendar.MONTH)+1;
        String mes = null;
        if(intMes <= 9){
            mes = "0" + intMes;
        } else {
            mes = intMes+"";
        }
        
        int intDia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        String dia = null;
        if(intDia <= 9){
            dia = "0" + intDia;
        } else {
            dia = intDia+"";
        }
        
        String matriculaResto = ThreadLocalRandom.current().nextInt(100, 999 + 1) + "";
        
        String matricula = (ano + mes + dia + matriculaResto);
    return matricula;
    }
    
    public void deletarUser(String matricula) throws SQLException{
        Statement stmt = null;
        Connection c = new ConnectionFactory().getConnection();
        c.setAutoCommit(false);
        stmt = c.createStatement();
        RemoverUser main = new RemoverUser();
        try{
            
            
            String sql = "DELETE FROM users WHERE matricula = " + matricula;
            stmt.executeUpdate(sql);
            c.commit();
            c.close();
            JOptionPane.showMessageDialog(null,"Usuario deletado com sucesso!");
            
      
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null,e);
            JOptionPane.showMessageDialog(null,"Você não selecionou nenhum usuário!");

        }
    }
}