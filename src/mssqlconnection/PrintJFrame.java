/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssqlconnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.*;
import static jdk.nashorn.internal.runtime.Debug.id;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author Aidin
 */
public class PrintJFrame extends javax.swing.JFrame {

    Connection conn;
   	ResultSet rs = null;

    /**
     * Creates new form PrintJFrame
     */
    public PrintJFrame() {
        initComponents();
    }

    
    private void showById(){
        try{
            conn = ConnectMsSql.ConnectDB();
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Aidin\\Documents\\3 курс\\осений семестр\\Клиент сервер\\MsSqlConnection\\src\\mssqlconnection\\report1.jrxml");
            String sql = "SELECT student_info.\"id\" AS student_info_id, student_info.\"name\" AS student_info_name, student_info.\"surname\" AS student_info_surname, student_info.\"address\" AS student_info_address, student_info.\"email\" AS student_info_email, student_info.\"birth_date\" AS student_info_birth_date FROM \"dbo\".\"student_info\" student_info WHERE student_info.\"id\"="+ this.jTextField1.getText();
           JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            JasperViewer.viewReport(jasperPrint);          
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }

    
    private void showMeAllReport(){
        try{
            conn = ConnectMsSql.ConnectDB();
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Aidin\\Documents\\3 курс\\осений семестр\\Клиент сервер\\MsSqlConnection\\src\\mssqlconnection\\report1.jrxml");
            String sql = "SELECT student_info.\"id\" AS student_info_id, student_info.\"name\" AS student_info_name, student_info.\"surname\" AS student_info_surname, student_info.\"address\" AS student_info_address, student_info.\"email\" AS student_info_email, student_info.\"birth_date\" AS student_info_birth_date FROM \"dbo\".\"student_info\" student_info";
            //String sql ="SELECT [id],[name],[surname],[address],[email],[birth_date] FROM [student_info]";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            JasperViewer.viewReport(jasperPrint);
            
        }
        catch(Exception e){
        e.printStackTrace();
        }
    }
    
    
    
////     private void showMeAllReport(){
////        try{
////            conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db1;","AIDIN5;","123");
////            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Aidin\\Documents\\3 курс\\осений семестр\\Клиент сервер\\MsSqlConnection\\src\\mssqlconnection\\report1.jrxml");
////JasperReport jr= JasperCompileManager.compileReport(jasperDesign);
////JasperPrint imp = JasperFillManager.fillReport(jr,null,conn);
////JasperViewer.viewReport(imp);
//////ver.setTitle("student_info");
//////ver.setVisible(true);
//////            String sql ="SELECT [id],[name],[surname],[address],[email],[birth_date] FROM [student_info]";
//////            //String sql = "SELECT student_info.\"id\" AS student_info_id, student_info.\"name\" AS student_info_name, student_info.\"surname\" AS student_info_surname, student_info.\"address\" AS student_info_address, student_info.\"email\" AS student_info_email, student_info.\"birth_date\" AS student_info_birth_date FROM \"dbo\".\"student_info\" student_info";
//////            JRDesignQuery newQuery = new JRDesignQuery();
//////            newQuery.setText(sql);
//////            jasperDesign.setQuery(newQuery);
//////            
//////            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
//////            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
//////            JasperViewer.viewReport(jasperPrint);
////            
////        }
////        catch(Exception e){
////        e.printStackTrace();
////        }
////    }
////    
////    /**
////     * This method is called from within the constructor to initialize the form.
////     * WARNING: Do NOT modify this code. The content of this method is always
////     * regenerated by the Form Editor.
////     */
////    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("Print All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Отчет");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          showById();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     showMeAllReport();
       
       //InputStream i= getClass().getResourceAsStream("C:\\Users\\Aidin\\Documents\\3 курс\\осений семестр\\Клиент сервер\\MsSqlConnection\\src\\mssqlconnection\\report1.jrxml");
       //JasperPrint jp=JasperFillManager.fillReport;
//       try{
//            String report=("C:\\Users\\Aidin\\Documents\\3 курс\\осений семестр\\Клиент сервер\\MsSqlConnection\\src\\mssqlconnection\\report1.jrxml");
//            JasperReport jr=JasperCompileManager.compileReport(report);
//            JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
//            JasperViewer.viewReport(jp);
//        }
//        catch(Exception e){
//     JOptionPane.showConfirmDialog(null, e);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
