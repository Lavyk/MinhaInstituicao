/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.uepb.source;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Super i3
 */
public class AdmUsuario {
        
    
    
    public void addUsuario(String nome, String senha, int cargo){
            
    }
    
    public void removerUsuario(/*String matricula*/){
        //URL url = this.getClass()*.getResource("logo.png");
        URL url = this.getClass().getResource("../gui/logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        System.out.println(iconeTitulo);
        
    }
    
    public void removerAlunoDisciplina(String matricula, String cadeira){
        
    }
    
    public void addAlunoDisciplina(String matricula, String cadeira){
        
    }
    
    
    public void atualizarLinhas(JTable tabela) throws SQLException{
        Connection c = null;
        Statement stmt2 = null;
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = con.prepareStatement("select * from users");
        ResultSet rs = stmt.executeQuery();
        
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();  
            
        while(rs.next()){
            Object[] data = {rs.getString("matricula"), rs.getString("nome"), rs.getString("periodo"), "Desconhecido"};
            modelo.addRow(data);
        }
        con.close();
       
    }
}
