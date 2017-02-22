/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.uepb.gui;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import my.uepb.source.ConnectionFactory;

/**
 *
 * @author Super i3
 */
public class desconectar {
    
    public void desconecta() {
        Connection con = new ConnectionFactory().getConnection();
        boolean result = true;
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"Desconectado com sucesso!");
        }
        catch(SQLException fecha) {
            JOptionPane.showMessageDialog(null,"Não foi possivel fechar o banco de dados: " + fecha);
            result = false;
        }
    }

}
