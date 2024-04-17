
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Mudit
 */
public class BUYER_LOGIN_WINDOW extends javax.swing.JFrame {
    int buyerid;
    /**
     * Creates new form LOGIN_WINDOW
     */
    public BUYER_LOGIN_WINDOW() {
        initComponents();
        //adding the connector to java project
        //open xampp & start apache and mysql
        //create the mysql database using phpmyadmin
        //create a class for the connection
        //center the form
        this.setLocationRelativeTo(null);

        //display image in jlabel
        jLabel_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/dbs.png")));
        jLabel_Username_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/user.png")));
        jLabel_Password_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/password.png")));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/back.png")));
        //add a bottom border to jlabel_title
        Border title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK);
        jLabel_Title.setBorder(title_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_Username_Icon = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Password_Icon = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel_Image.setBackground(new java.awt.Color(0, 153, 195));
        jLabel_Image.setOpaque(true);

        jLabel_Username_Icon.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Username_Icon.setOpaque(true);

        jLabel_Title.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("BUYER LOGIN");
        jLabel_Title.setToolTipText("");
        jLabel_Title.setAutoscrolls(true);
        jLabel_Title.setMinimumSize(new java.awt.Dimension(206, 80));
        jLabel_Title.setName(""); // NOI18N

        jLabel_Password_Icon.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Password_Icon.setOpaque(true);

        jTextField_Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_Username.setText("Username");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("password    ");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(255, 204, 153));
        jButton_Login.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel1.setText("b");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(37, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel_Username_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel_Password_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField_Username)
                                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                                                .addGap(88, 88, 88))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(149, 149, 149))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_Username)
                                        .addComponent(jLabel_Username_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_Password_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(jButton_Login)
                                .addGap(192, 192, 192))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

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
    }// </editor-fold>

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        //remove the text from the text field on the focus gained

        if(jTextField_Username.getText().trim().equals("Username")){
            jTextField_Username.setText("");
            //change the text of the text field color to black
            jTextField_Username.setForeground(Color.black);
        }
    }

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        //if the text field is empty set it to "username"
        if(jTextField_Username.getText().trim().equals("") || jTextField_Username.getText().trim().toLowerCase().equals("username")){
            jTextField_Username.setText("Username");
            jTextField_Username.setForeground(new Color(153,153,153));
        }
    }

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        String password = String.valueOf(jPasswordField1.getPassword());
        if(password.trim().toLowerCase().equals("password")){
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.black);
        }
    }

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        String password = String.valueOf(jPasswordField1.getPassword());
        if(password.trim().equals("") || password.trim().toLowerCase().equals("password")){
            jPasswordField1.setText("Password");
            jPasswordField1.setForeground(new Color(153,153,153));
        }
    }

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String username = jTextField_Username.getText();
        String  password= String.valueOf(jPasswordField1.getPassword());
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery="SELECT B_Id from Buyer WHERE Email=? AND Password =?";
        if(username.trim().toLowerCase().equals("username") || password.trim().toLowerCase().equals("password")){
            JOptionPane.showMessageDialog(null,"ENTER YOUR USERNAME AND PASSWORD FIRST");
        }
        else{
            try {
                ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
                ps.setString(1, username);
                ps.setString(2, password);
                rs=ps.executeQuery();
                if (rs.next()){
                    buyerid = rs.getInt("B_Id");
//                    JOptionPane.showMessageDialog(null,"WE NEED TO SHOW THE MAIN FORM TO THE USER");
                    BUYER_DASHBOARD obj = new BUYER_DASHBOARD(buyerid);
                    obj.setVisible(true);
                    this.dispose();
                    buyerid = rs.getInt("B_Id");

                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password.");
                }
            }
            catch (SQLException ex){
                Logger.getLogger(BUYER_LOGIN_WINDOW.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        LOGIN w1 = new LOGIN();
        w1.setVisible(true);
        this.dispose();
    }

    public int getBID(){
        return buyerid;
    }



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
            java.util.logging.Logger.getLogger(BUYER_LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BUYER_LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BUYER_LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BUYER_LOGIN_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUYER_LOGIN_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Password_Icon;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_Username_Icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration
}
