/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author miris
 */
public class autorization extends javax.swing.JFrame {
    
    /**
     * Creates new form login_form
     **/
    /**
     * Variables
     **/
    
    String driverName;
    ResultSet res;
    Connection conn = null;
    /*
    public void connect(){
        driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try{
            Class.forName(driverName);
            //jdbc:sqlserver://localhost:1433;databaseName=MagnumShopDB; user=Fantom; password=12345543211234554321
            String mydb = "localhost:1433;";
            String username = "sa";
            String password = "123";
            String url = "jdbc:sqlserver://" + mydb + "databaseName=KP";
            KetchupProduction.conn = DriverManager.getConnection(url,username,password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    */
    public void dialogSet(){
        UIManager UI= new UIManager();
        UI.put("OptionPane.background",Color.DARK_GRAY);
        UI.put("Panel.background",Color.DARK_GRAY);
        UI.put("OptionPane.okButtonText","Окей");
        UI.put("OptionPane.messageForeground",Color.BLACK);
        UI.put("Button.background",Color.LIGHT_GRAY);
        UI.put("Button.foreground",Color.BLACK);
        UI.put("OptionPane.messageFont",new Font("Comic Sans MS",Font.BOLD,14));
        UI.put("OptionPane.buttonFont",new Font("Comic Sans MS",Font.BOLD,14));
    }
    
    
    
    public void openRegForm(){
        //new registration_form().setVisible(true);
        this.dispose();
    }
    
    
    public autorization() {
        initComponents();
        this.setSize(500, 396);
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("tomato-sauce.png")));
        //connect();
        dialogSet();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        loginL = new javax.swing.JLabel();
        passwordL = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        entryL = new javax.swing.JLabel();
        txtLogin1 = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Вход");
        setFocusTraversalPolicyProvider(true);
        setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(435, 380));
        setName("loginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 357));

        desktopPane.setBackground(new java.awt.Color(51, 51, 51));
        desktopPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.setFocusable(false);
        desktopPane.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        desktopPane.setName(""); // NOI18N

        loginL.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        loginL.setForeground(new java.awt.Color(255, 255, 255));
        loginL.setText("Логин");
        desktopPane.add(loginL);
        loginL.setBounds(120, 130, 110, 30);

        passwordL.setBackground(new java.awt.Color(204, 204, 204));
        passwordL.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        passwordL.setForeground(new java.awt.Color(255, 255, 255));
        passwordL.setText("Пароль");
        desktopPane.add(passwordL);
        passwordL.setBounds(120, 210, 110, 30);

        loginBtn.setBackground(new java.awt.Color(0, 102, 102));
        loginBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Войти");
        loginBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginBtn.setContentAreaFilled(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setHideActionText(true);
        loginBtn.setRequestFocusEnabled(false);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        desktopPane.add(loginBtn);
        loginBtn.setBounds(190, 300, 120, 40);
        loginBtn.getAccessibleContext().setAccessibleDescription("");

        background.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bakery/11.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(415, 340));
        background.setMinimumSize(new java.awt.Dimension(415, 340));
        background.setPreferredSize(new java.awt.Dimension(415, 340));
        desktopPane.add(background);
        background.setBounds(0, 0, 680, 30);

        entryL.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        entryL.setForeground(new java.awt.Color(255, 255, 255));
        entryL.setText(" Вход в систему");
        desktopPane.add(entryL);
        entryL.setBounds(130, 80, 200, 40);

        txtLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogin1ActionPerformed(evt);
            }
        });
        desktopPane.add(txtLogin1);
        txtLogin1.setBounds(130, 170, 220, 26);

        txtPassword.setText("****");
        desktopPane.add(txtPassword);
        txtPassword.setBounds(130, 250, 220, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
       
    }//GEN-LAST:event_loginBtnMousePressed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        try{
            String inputUserName = txtLogin1.getText();  //assign the user's input username
            String inputPassword = txtPassword.getText();
            String pas="aidin";
            String log="aidin";
            //            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //            String url="jdbc:sqlserver://localhost:1433;databaseName=bakery;user=aidin007;password=123";
            //            Connection con = DriverManager.getConnection(url);
            //            String sql = "Select * from Table_doctor where Login=BA and Password = ?";
            //            PreparedStatement pst = con.prepareStatement(sql);
            //
            //            pst.setString(1, txtLogin.getText());
            //            pst.setString(2, txtPassword.getText());
            //            ResultSet rs = pst.executeQuery();

            if(inputUserName.equals("ali")&& inputPassword.equals("ali")){
                JOptionPane.showMessageDialog(null, "Добро пожаловать  пользователь");

                Main11 field= new Main11();
                field.setVisible(true);
                setVisible(false);
            }
            else if(inputUserName.equals("aidin")&& inputPassword.equals("aidin")){
                JOptionPane.showMessageDialog(null, "Добро пожаловать Админ");

                Main1 field= new Main1();
                field.setVisible(true);
                setVisible(false);
            }
            else if(inputUserName.equals("asan")&& inputPassword.equals("asan")){
                JOptionPane.showMessageDialog(null, "Добро пожаловать  кондитер");

                Main111 field= new Main111();
                field.setVisible(true);
                setVisible(false);
            }else if(inputUserName.equals("insan")&& inputPassword.equals("insan")){
                JOptionPane.showMessageDialog(null, "Добро пожаловать  бухгалтер");

                Payments_ex field= new Payments_ex();
                field.setVisible(true);
                setVisible(false);
            }

            else{
                JOptionPane.showMessageDialog(null, "Username and password not Correct");
                txtLogin1.setText("");
                txtPassword.setText("");
            }

            //            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void txtLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(autorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(autorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(autorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(autorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new autorization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel entryL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginL;
    private javax.swing.JLabel passwordL;
    private javax.swing.JTextField txtLogin1;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}