/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author aidin
 */
public class positions extends javax.swing.JFrame {
Connection conn = null;
CallableStatement stored_pro = null;
Statement statement = null;
ResultSet rs = null;
    /**
     * Creates new form measure
     */
    public positions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MeasureInsertButton = new javax.swing.JButton();
        MeasureUpdateButton = new javax.swing.JButton();
        MeasureDeleteButton = new javax.swing.JButton();
        MeasureName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "??????????????????"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        MeasureInsertButton.setBackground(new java.awt.Color(0, 102, 102));
        MeasureInsertButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureInsertButton.setForeground(new java.awt.Color(255, 255, 255));
        MeasureInsertButton.setText("????????????????");
        MeasureInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureInsertButtonActionPerformed(evt);
            }
        });

        MeasureUpdateButton.setBackground(new java.awt.Color(0, 102, 102));
        MeasureUpdateButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        MeasureUpdateButton.setText("????????????????");
        MeasureUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureUpdateButtonActionPerformed(evt);
            }
        });

        MeasureDeleteButton.setBackground(new java.awt.Color(0, 102, 102));
        MeasureDeleteButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        MeasureDeleteButton.setText("??????????????");
        MeasureDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureDeleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("??????????????????");

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("??????????");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("?????????? ??????????????????");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MeasureName)
                            .addComponent(MeasureDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MeasureInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(MeasureUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MeasureName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MeasureInsertButton)
                            .addComponent(MeasureUpdateButton))
                        .addGap(18, 18, 18)
                        .addComponent(MeasureDeleteButton)
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(back)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            MeasureName.setText("");
            conn = ConnectMsSql.ConnectDB();

            int row = jTable1.getSelectedRow();
            String name = (jTable1.getModel().getValueAt(row,0).toString());
    
            String sql = "SELECT Position FROM Position WHERE Position ='" + name + "'";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
             while(rs.next()){
                 MeasureName.setText(rs.getString("Position")); 
             }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try{
        conn = ConnectMsSql.ConnectDB();
        String sql = "SELECT Position FROM Position";
        statement = conn.createStatement();
        rs = statement.executeQuery(sql);
        this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("??????????????????");
        conn.close();
        }
        
        catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void MeasureInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureInsertButtonActionPerformed
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
            String name=MeasureName.getText();          
            String dobavlenie = "INSERT INTO Position(Position) VALUES(?)";
            PreparedStatement pst1=conn.prepareStatement(dobavlenie);
            pst1.setString(1, name);
            JOptionPane.showMessageDialog(null, "???????????? ?????????????? ????????????????????.");
            pst1.executeUpdate();
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "????????????, ?????? ???? ?????????? ???? ?????? :(");
        }
    }//GEN-LAST:event_MeasureInsertButtonActionPerformed

    private void MeasureDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureDeleteButtonActionPerformed
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
            JFrame frame = new JFrame("Sure");
            if (JOptionPane.showConfirmDialog(frame, "???? ?????????????????????????? ???????????? ?????????????? ?????????????",
                "???????????????? ????????????", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            {
            stored_pro = conn.prepareCall("{call delete_date_about_Position (?)}");
            stored_pro.setString(1, this.MeasureName.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "???????????? ?????????????? ??????????????.");
            MeasureName.setText("");
            }
          
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "????????????, ?????? ???? ?????????? ???? ?????? :(");
        }
    }//GEN-LAST:event_MeasureDeleteButtonActionPerformed

    private void MeasureUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureUpdateButtonActionPerformed
        // TODO add your handling code here:
        try{
        conn = ConnectMsSql.ConnectDB();
        int row = jTable1.getSelectedRow();
            String id = (jTable1.getModel().getValueAt(row,0).toString());
            String sql = "SELECT ID FROM Position WHERE Position ='" + id + "'";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
          
            int ID=0;  
            while(rs.next()){
                ID=Integer.parseInt(rs.getString("ID")) ;
             }

        stored_pro = conn.prepareCall("{call update_data_about_position (?,?)}");
        stored_pro.setInt(1, ID);
        stored_pro.setString(2, this.MeasureName.getText());
        stored_pro.execute();
        JOptionPane.showMessageDialog(null, "???????????? ?????????????? ??????????????????.");
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "????????????, ?????? ???? ?????????? ???? ?????? :(");
        }
    }//GEN-LAST:event_MeasureUpdateButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
       Main1 field = new Main1();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new positions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MeasureDeleteButton;
    private javax.swing.JButton MeasureInsertButton;
    private javax.swing.JTextField MeasureName;
    private javax.swing.JButton MeasureUpdateButton;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
