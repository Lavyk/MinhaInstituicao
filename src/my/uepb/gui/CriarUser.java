/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.uepb.gui;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import my.uepb.source.AddUser;

/**
 *
 * @author Super i3
 */
public class CriarUser extends javax.swing.JFrame {

    
    public CriarUser() {
        initComponents();
        //setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textNome = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        comboCargo = new javax.swing.JComboBox<>();
        textIdade = new javax.swing.JTextField();
        panelCriar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelFechar = new javax.swing.JPanel();
        textFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(3, 116, 163));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/menu/subMenus/addUserBig.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(10, 158, 219));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 127, 179), 3));

        textNome.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        textNome.setForeground(new java.awt.Color(204, 204, 204));
        textNome.setText("Nome completo");
        textNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNomeFocusLost(evt);
            }
        });
        textNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textNomeMouseClicked(evt);
            }
        });
        textNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNomeKeyTyped(evt);
            }
        });

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        comboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor", "Coordenador"}));

        textIdade.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        textIdade.setForeground(new java.awt.Color(204, 204, 204));
        textIdade.setText("Idade");
        textIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textIdadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textIdadeFocusLost(evt);
            }
        });
        textIdade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textIdadeMouseClicked(evt);
            }
        });
        textIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textIdadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdadeKeyTyped(evt);
            }
        });

        panelCriar.setBackground(new java.awt.Color(255, 255, 255));
        panelCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCriarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCriarMouseExited(evt);
            }
        });
        panelCriar.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel2.setText("Criar usuario!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 30, 15, 30);
        panelCriar.add(jLabel2, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(comboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 20, 25);
        jPanel1.add(jPanel2, gridBagConstraints);

        panelFechar.setBackground(new java.awt.Color(0, 0, 0));
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

        textFechar.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        textFechar.setForeground(new java.awt.Color(255, 255, 255));
        textFechar.setText("X");

        javax.swing.GroupLayout panelFecharLayout = new javax.swing.GroupLayout(panelFechar);
        panelFechar.setLayout(panelFecharLayout);
        panelFecharLayout.setHorizontalGroup(
            panelFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFecharLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFechar)
                .addContainerGap())
        );
        panelFecharLayout.setVerticalGroup(
            panelFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel1.add(panelFechar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNomeFocusLost
        String nome = textNome.getText();
        if(nome.equals("")){
            textNome.setText("Nome completo");
            textNome.setForeground(new java.awt.Color(204, 204, 204));
        }             
    }//GEN-LAST:event_textNomeFocusLost

    private void textNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNomeMouseClicked
        String nome = textNome.getText();
        if(nome.equals("Nome completo")){
            textNome.setCaretPosition(0);
        } 
        
    }//GEN-LAST:event_textNomeMouseClicked

    private void textNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomeKeyPressed
        String nome = textNome.getText();
        if(nome.equals("Nome completo")){
            textNome.setText("");
            textNome.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_textNomeKeyPressed

    private void textIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdadeFocusLost
        String idade = textIdade.getText();
        if(idade.equals("")){
            textIdade.setText("Idade");
            textIdade.setForeground(new java.awt.Color(204, 204, 204));
        }  
    }//GEN-LAST:event_textIdadeFocusLost

    private void textIdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdadeKeyPressed
        String idade = textIdade.getText();
        if(idade.equals("Idade")){
            textIdade.setText("");
            textIdade.setForeground(Color.BLACK);
        }
        
        
    }//GEN-LAST:event_textIdadeKeyPressed

    private void textIdadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textIdadeMouseClicked
        String idade = textIdade.getText();
        if(idade.equals("Idade")){
            textIdade.setCaretPosition(0);
        } 
    }//GEN-LAST:event_textIdadeMouseClicked

    private void textIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdadeKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();        
        }
        
        String text = textIdade.getText();

        if(text.length() == 2){
            evt.consume();
        }

    }//GEN-LAST:event_textIdadeKeyTyped

    private void panelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseClicked
        try {
            Usuarios usuarios = new Usuarios();
            usuarios.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CriarUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_panelFecharMouseClicked

    private void panelCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCriarMouseEntered
        panelCriar.setBackground(new Color(230,230,230));
        panelCriar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_panelCriarMouseEntered

    private void panelCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCriarMouseExited
        //panelCriar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_panelCriarMouseExited

    private void panelFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseEntered
        panelFechar.setBackground(new Color(230,230,230));
        textFechar.setForeground(new Color(0, 0, 0));
        panelFechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    }//GEN-LAST:event_panelFecharMouseEntered

    private void panelFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseExited
        textFechar.setForeground(new Color(255, 255, 255));
        panelFechar.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_panelFecharMouseExited

    private void panelCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCriarMouseClicked
        boolean passouNome = true;
        boolean passouIdade = true;
        if(textNome.getText().equals("Nome completo")){
            JOptionPane.showMessageDialog(null,"O nome do Usuario não pode ficar em branco.");
            textNome.requestFocus();
            passouNome = false;
        }      
        
        if(textIdade.getText().equals("Idade")){
            JOptionPane.showMessageDialog(null,"A idade não pode ficar em branco.");
            textIdade.requestFocus();
            passouIdade = false;
        }  
        
        if(passouIdade == true && passouNome == true){
            AddUser user = new AddUser();
            panelCriar.setBackground(Color.GREEN);
            try {
                
                String senha = ThreadLocalRandom.current().nextInt(100000, 999999 + 1) + "";
                user.CriarUser(textNome.getText(), comboCargo.getSelectedIndex()+"", comboSexo.getSelectedItem()+"", textIdade.getText(), senha);
                JOptionPane.showMessageDialog(null,"Usuario criado com sucesso. \n Senha do usuario: " + senha);
                dispose();
                Usuarios usuarios = new Usuarios();
                usuarios.setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(CriarUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            


        } else {
            panelCriar.setBackground(new Color(200, 0,0 , 100));
        }
        
        passouNome = false;
        passouIdade = false;
        
    }//GEN-LAST:event_panelCriarMouseClicked

    private void textNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNomeFocusGained
        textNome.setCaretPosition(0);
    }//GEN-LAST:event_textNomeFocusGained

    private void textIdadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdadeFocusGained
        textIdade.setCaretPosition(0);
    }//GEN-LAST:event_textIdadeFocusGained

    private void textNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomeKeyTyped
        String caracteres="abcdefghijklmnopqrstuvxyzw ABCDEFGHIJKLMNOPQRSTUVXYZW";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();        
        }
    }//GEN-LAST:event_textNomeKeyTyped
   

    public static void main(String args[]) {

        
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
            java.util.logging.Logger.getLogger(CriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new CriarUser().setVisible(true);
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelCriar;
    private javax.swing.JPanel panelFechar;
    private javax.swing.JLabel textFechar;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
