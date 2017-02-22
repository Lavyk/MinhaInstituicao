/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.uepb.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import my.uepb.source.*;

/**
 *
 * @author Super i3
 */
public class Login extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
   
    
    public Login() throws ClassNotFoundException {
        
        initComponents();
        
        URL url = this.getClass().getResource("../imgs/logo.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);

      
        //con = ConectaBd.conectabd();
        con = ConectarSQLite.conectabd();
    }
    
    public void Logar(){
        String sql = "Select *from users where matricula = ? and senha = ?";
        
        try{
            
            pst = con.prepareStatement(sql);
            pst.setString(1, textLogin.getText());
            pst.setString(2, textSenha.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                String[] dados = {"id","nome","senha", "cre", "periodo", "matricula", "cargo"};
                String[] dadosType = {"int","String","String", "double", "int", "String", "int"};
                Map<String, String> userData = new HashMap<String,String>();
                for(int i = 0; i < dadosType.length; i++){
                    
                    if(dadosType[i].equals("int")){
                        userData.put(dados[i], Integer.toString(rs.getInt(dados[i])));
                    }
                    
                    if(dadosType[i].equals("String")){
                        userData.put(dados[i], rs.getString(dados[i]));
                    }
                    
                    if(dadosType[i].equals("double")){
                        userData.put(dados[i], Double.toString(rs.getDouble(dados[i])));
                    }
                    
                }
               
                Main main = new Main(userData);
                main.guiSetDados();
                main.setVisible(true);
                
                
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e senha inválidos!");
            }
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        textLogin = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        panelLogo = new javax.swing.JPanel();
        uepb = new javax.swing.JLabel();
        minhaInst = new javax.swing.JLabel();
        panelFechar = new javax.swing.JPanel();
        textFechar = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minha Insituição");
        setMinimumSize(new java.awt.Dimension(1, 1));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        fundo.setBackground(new java.awt.Color(10, 158, 219));
        fundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(8, 47, 69), 3));

        textLogin.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        textLogin.setForeground(new java.awt.Color(204, 204, 204));
        textLogin.setText("Matricula");
        textLogin.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        textLogin.requestFocus(false);
        textLogin.setRequestFocusEnabled(true);
        textLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textLoginFocusLost(evt);
            }
        });
        textLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textLoginMouseClicked(evt);
            }
        });
        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        textLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textLoginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textLoginKeyTyped(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(51, 51, 51));
        btnEntrar.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        panelLogo.setBackground(new java.awt.Color(51, 51, 51));

        uepb.setFont(new java.awt.Font("Aharoni", 3, 18)); // NOI18N
        uepb.setForeground(new java.awt.Color(204, 204, 204));
        uepb.setText("UEPB |||");

        minhaInst.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        minhaInst.setForeground(new java.awt.Color(255, 255, 255));
        minhaInst.setText("Minha instituicao");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(uepb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minhaInst, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uepb)
                    .addComponent(minhaInst))
                .addContainerGap())
        );

        panelFechar.setBackground(new java.awt.Color(51, 51, 51));
        panelFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelFecharMouseExited(evt);
            }
        });

        textFechar.setBackground(new java.awt.Color(51, 51, 51));
        textFechar.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        textFechar.setForeground(new java.awt.Color(255, 255, 255));
        textFechar.setText("X");

        javax.swing.GroupLayout panelFecharLayout = new javax.swing.GroupLayout(panelFechar);
        panelFechar.setLayout(panelFecharLayout);
        panelFecharLayout.setHorizontalGroup(
            panelFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFecharLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        panelFecharLayout.setVerticalGroup(
            panelFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFechar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        textSenha.setEchoChar((char)0);
        textSenha.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        textSenha.setForeground(new java.awt.Color(204, 204, 204));
        textSenha.setText("Senha");
        textSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSenhaFocusLost(evt);
            }
        });
        textSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSenhaMouseClicked(evt);
            }
        });
        textSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(fundoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fundoLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addComponent(panelFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnEntrar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLoginActionPerformed

    private void textLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textLoginMouseClicked
        
    }//GEN-LAST:event_textLoginMouseClicked

    private void textLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLoginKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            
        }
    }//GEN-LAST:event_textLoginKeyTyped

    private void panelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseClicked
        System.exit(0);        
    }//GEN-LAST:event_panelFecharMouseClicked

    private void panelFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseEntered
        panelFechar.setBackground(new java.awt.Color(255, 255, 255));
        textFechar.setForeground(Color.BLACK);
    }//GEN-LAST:event_panelFecharMouseEntered

    private void panelFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseExited
        panelFechar.setBackground(new java.awt.Color(51, 51, 51));
        textFechar.setForeground(Color.white);
    }//GEN-LAST:event_panelFecharMouseExited

    private void textSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSenhaMouseClicked
        
    }//GEN-LAST:event_textSenhaMouseClicked

    private void textSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusLost
        char[] senhaPass = textSenha.getPassword();
        String senha = String.valueOf(senhaPass);
        if(senha.equals("")){
            textSenha.setEchoChar((char)0);
            textSenha.setText("Senha");
            textSenha.setForeground(new java.awt.Color(204, 204, 204));
            
        }
    }//GEN-LAST:event_textSenhaFocusLost

    private void textLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLoginFocusGained
        /*String matricula = textLogin.getText();
        if(matricula.equals("Matricula")){
        textLogin.setText("");
        }*/
        textLogin.setCaretPosition(0);
        
    }//GEN-LAST:event_textLoginFocusGained

    private void textLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLoginFocusLost
        String matricula = textLogin.getText();
        if(matricula.equals("")){
            textLogin.setText("Matricula");
            textLogin.setForeground(new java.awt.Color(204, 204, 204));
        }         // TODO add your handling code here:
    }//GEN-LAST:event_textLoginFocusLost

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Logar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void textSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusGained
        /*char[] senhaPass = textSenha.getPassword();
        String senha = String.valueOf(senhaPass);
        //System.out.println(senha);
        if(senha.equals("Senha")){
        textSenha.setText("");
        textSenha.setEchoChar('*');
        }*/
        
        textSenha.setCaretPosition(0);
    }//GEN-LAST:event_textSenhaFocusGained

    private void textSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyPressed
        char[] senhaPass = textSenha.getPassword();
        String senha = String.valueOf(senhaPass);
        //System.out.println(senha);
        if(senha.equals("Senha")){
        textSenha.setText("");
        textSenha.setEchoChar('*');
        }
        
        
        textSenha.setForeground(Color.BLACK);
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Logar();
        }
    }//GEN-LAST:event_textSenhaKeyPressed

    private void textLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textLoginKeyPressed
       String matricula = textLogin.getText();
        if(matricula.equals("Matricula")){
            textLogin.setText("");
            textLogin.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textLoginKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel minhaInst;
    private javax.swing.JPanel panelFechar;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JLabel textFechar;
    private javax.swing.JTextField textLogin;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JLabel uepb;
    // End of variables declaration//GEN-END:variables
}
