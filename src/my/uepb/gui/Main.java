
package my.uepb.gui;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import my.uepb.source.*;
import my.uepb.*;
/**
 *
 * @author Lavyk
 * 
 */
public class Main extends javax.swing.JFrame {

    
    private Map dataMap;
    
    public Main(Map data) {
        initComponents();
        this.setLocationRelativeTo(null);
       
        URL url = this.getClass().getResource("../imgs/logo.png"); 
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
        
        
        dataMap = data;

        //UsersData dados = new UsersData();
        
        //String[] arrayCargo = {"Null","Aluno", "Professor", "Coordenador"};  
          
        //textNome.setText(dataMap.get("nome").toString());
        //textMatr.setText(dataMap.get("matricula").toString());
        //textCargo.setText(arrayCargo[Integer.valueOf(dados.getCargo())]);
        mudarIcone();
        guiSetDados();
        mudarMenus(dataMap.get("cargo").toString());
    }
    

    
    public void guiSetDados(){
        String[] arrayCargo = {"Null","Aluno", "Professor", "Coordenador"};        
        textNome.setText(dataMap.get("nome").toString());
        textMatr.setText(dataMap.get("matricula").toString());
        int intCargo = Integer.valueOf(dataMap.get("cargo").toString());
        textCargo.setText(arrayCargo[intCargo]);
    }
    
    public void mudarIcone(){
        String[] arrayCargo = {"Null","Aluno", "Professor", "Coordenador"};  
        int intCargo = Integer.valueOf(dataMap.get("cargo").toString());
        
        ImageIcon imageIcon = null;
        
        if(intCargo == 1){      
        imageIcon = new javax.swing.ImageIcon(getClass().getResource("../imgs/userAluno.png"));
        }
        
        if(intCargo == 2){      
        imageIcon = new javax.swing.ImageIcon(getClass().getResource("../imgs/userProfessor.png"));
        }
        
        if(intCargo == 3){      
        imageIcon = new javax.swing.ImageIcon(getClass().getResource("../imgs/userCoord.png"));
        }
        imgUser.setIcon(imageIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        textNome = new javax.swing.JLabel();
        textMatr = new javax.swing.JLabel();
        imgUser = new javax.swing.JLabel();
        textCargo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        textMenu1 = new javax.swing.JLabel();
        imgMenu1 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        textMenu2 = new javax.swing.JLabel();
        imgMenu2 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        textMenu3 = new javax.swing.JLabel();
        imgMenu3 = new javax.swing.JLabel();
        menu4 = new javax.swing.JPanel();
        textMenu4 = new javax.swing.JLabel();
        imgMenu4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minha instituição [Coordenador]");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(3, 116, 163));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(10, 158, 219));

        textNome.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        textNome.setText("textNome");

        textMatr.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        textMatr.setText("textMatr");

        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/userPadrao.png"))); // NOI18N

        textCargo.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        textCargo.setForeground(new java.awt.Color(0, 98, 138));
        textCargo.setText("textCargo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(imgUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(textMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgUser)
                .addGap(8, 8, 8))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel2.add(jPanel1, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(23, 138, 185));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setMinimumSize(new java.awt.Dimension(32, 32));
        btnLogout.setPreferredSize(new java.awt.Dimension(102, 45));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/logout.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        btnLogout.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setText("Logout");
        btnLogout.add(jLabel3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(btnLogout, gridBagConstraints);

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setMinimumSize(new java.awt.Dimension(32, 32));
        btnSair.setPreferredSize(new java.awt.Dimension(102, 45));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        btnSair.setLayout(new java.awt.GridBagLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/exit.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        btnSair.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel5.setText("Sair");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        btnSair.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 10, 10, 10);
        jPanel3.add(btnSair, gridBagConstraints);

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
        });
        menu1.setLayout(new java.awt.GridBagLayout());

        textMenu1.setText("textMenu1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 20, 11, 20);
        menu1.add(textMenu1, gridBagConstraints);

        imgMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/menu.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(-25, 0, 0, 0);
        menu1.add(imgMenu1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(menu1, gridBagConstraints);

        menu2.setBackground(new java.awt.Color(255, 255, 255));
        menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2MouseClicked(evt);
            }
        });
        menu2.setLayout(new java.awt.GridBagLayout());

        textMenu2.setText("textMenu2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 20, 11, 20);
        menu2.add(textMenu2, gridBagConstraints);

        imgMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/menu.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(-25, 0, 0, 0);
        menu2.add(imgMenu2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(menu2, gridBagConstraints);

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu3MouseClicked(evt);
            }
        });
        menu3.setLayout(new java.awt.GridBagLayout());

        textMenu3.setText("textMenu3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 20, 11, 20);
        menu3.add(textMenu3, gridBagConstraints);

        imgMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/menu.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(-25, 0, 0, 0);
        menu3.add(imgMenu3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(menu3, gridBagConstraints);

        menu4.setBackground(new java.awt.Color(255, 255, 255));
        menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu4MouseClicked(evt);
            }
        });
        menu4.setLayout(new java.awt.GridBagLayout());

        textMenu4.setText("textMenu4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(80, 20, 11, 20);
        menu4.add(textMenu4, gridBagConstraints);

        imgMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/uepb/imgs/menu.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(-25, 0, 0, 0);
        menu4.add(imgMenu4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(menu4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
        Usuarios menuUsuario;
        try {
            menuUsuario = new Usuarios();
            menuUsuario.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menu1MouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        try {
            Login login = new Login();
            login.setVisible(true);
            dispose();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menu2MouseClicked

    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menu3MouseClicked

    private void menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menu4MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnSair;
    private javax.swing.JLabel imgMenu1;
    private javax.swing.JLabel imgMenu2;
    private javax.swing.JLabel imgMenu3;
    private javax.swing.JLabel imgMenu4;
    private javax.swing.JLabel imgUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JLabel textCargo;
    private javax.swing.JLabel textMatr;
    private javax.swing.JLabel textMenu1;
    private javax.swing.JLabel textMenu2;
    private javax.swing.JLabel textMenu3;
    private javax.swing.JLabel textMenu4;
    private javax.swing.JLabel textNome;
    // End of variables declaration//GEN-END:variables

    public void setImgMenu1(String img) {
        ImageIcon imageIcon = null;
        imageIcon = new javax.swing.ImageIcon(getClass().getResource("../imgs/menu/"+ img + ".png"));
        imgMenu1.setIcon(imageIcon);
    }

    public void setImgMenu2(String img) {
        ImageIcon imageIcon = null;
        imageIcon = new javax.swing.ImageIcon(getClass().getResource("../imgs/menu/"+ img + ".png"));
        imgMenu2.setIcon(imageIcon);
    }

    public void setImgMenu3(String img) {
        ImageIcon imageIcon = null;
        imageIcon = new javax.swing.ImageIcon(getClass().getResource("../imgs/menu/"+ img + ".png"));
        imgMenu3.setIcon(imageIcon);
    }

    public void setImgMenu4(String img) {
        ImageIcon imageIcon = null;
        imageIcon = new javax.swing.ImageIcon(getClass().getResource("../imgs/menu/"+ img + ".png"));
        imgMenu4.setIcon(imageIcon);
    }
    
    public void setTextMenu1(String menuNome) {
        textMenu1.setText(menuNome);
    }

    public void setTextMenu2(String menuNome) {
        textMenu2.setText(menuNome);
    }

    public void setTextMenu3(String menuNome) {
        textMenu3.setText(menuNome);
    }

    public void setTextMenu4(String menuNome) {
        textMenu4.setText(menuNome);
    }
    
    public void mudarMenus(String cargo){
        Menus menu = new Menus();
        menu.verificaCargo(cargo);
    }
        
}
