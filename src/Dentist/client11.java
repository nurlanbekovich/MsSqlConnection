/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dentist;
import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
/**
 *
 * @author Aidin
 */
public class client11 extends javax.swing.JInternalFrame {
Connection conn = null;
CallableStatement stored_pro = null;
Statement statement = null;
ResultSet rs = null;
    /**
     * Creates new form client1
     */
    public client11() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SearchTxt = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        MeasureInsertButton = new javax.swing.JButton();
        MeasureUpdateButton = new javax.swing.JButton();
        MeasureDeleteButton = new javax.swing.JButton();
        Login = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        addres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Login1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        doctortxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IDtxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Datetxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(826, 800));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(808, 800));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("??????????");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aidin\\Downloads\\Employee Payroll\\Employee Payroll\\Icons\\update icon.png")); // NOI18N
        jButton2.setText("????????????");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SearchTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchTxtMousePressed(evt);
            }
        });

        back.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aidin\\Downloads\\Employee Payroll\\Employee Payroll\\Icons\\attach.png")); // NOI18N
        back.setText("??????????");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        MeasureInsertButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureInsertButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aidin\\Downloads\\Employee Payroll\\Employee Payroll\\Icons\\attachment-512.png")); // NOI18N
        MeasureInsertButton.setText("????????????????");
        MeasureInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureInsertButtonActionPerformed(evt);
            }
        });

        MeasureUpdateButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureUpdateButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aidin\\Downloads\\Employee Payroll\\Employee Payroll\\Icons\\Save-icon.png")); // NOI18N
        MeasureUpdateButton.setText("??????????????????");
        MeasureUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureUpdateButtonActionPerformed(evt);
            }
        });

        MeasureDeleteButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureDeleteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aidin\\Downloads\\Employee Payroll\\Employee Payroll\\Icons\\delete_16x16.gif")); // NOI18N
        MeasureDeleteButton.setText("??????????????");
        MeasureDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureDeleteButtonActionPerformed(evt);
            }
        });

        Login.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("?????????????? ??????????????");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("?????????? ????????????????");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("??????????????");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("??????");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("?????????? Client");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "??????", "?????????????????? ??????????????", "??????????????", "??????????", "??????????", "??????????????", "???????? ???? ????????????"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("?????????????????? ??????????????");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("??????????");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setText("??????_????????");

        Login1.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setText("???????? ???? ????????????");

        doctortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctortxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setText("id");

        IDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDtxtActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aidin\\Downloads\\Employee Payroll\\Employee Payroll\\Icons\\erase-128.png")); // NOI18N
        jButton3.setText("????????????????");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatetxtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setText("????????");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(SearchTxt)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(doctortxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(Login1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Email)
                                            .addComponent(Datetxt)))
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(100, 100, 100)
                                            .addComponent(Login))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel1))
                                            .addGap(1, 1, 1)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(addres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                                .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(IDtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Number)))))
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MeasureInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MeasureUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MeasureDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Login1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doctortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MeasureUpdateButton)
                    .addComponent(MeasureInsertButton)
                    .addComponent(MeasureDeleteButton))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try{
            conn = ConnectMsSql.ConnectDB();

            String perem = SearchTxt.getText();
            String sql = "SELECT [id]\n" +
            "      ,[??????]\n" +
            "      ,[??????????????????_??????????????]\n" +
            "      ,[??????????????]\n" +
            "      ,[??????????]\n" +
            "      ,[??????????_????????????????]\n" +
            "      ,[??????????????_??????????????]\n" +
            "      ,[????????]\n" +
            "      ,[??????_????????] from Table_client where ??????  like '%" + perem + "%'";
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
            this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.getColumnModel().getColumn(0).setHeaderValue("????????????????????????");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("????. ??????.");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("??????????");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("????????????????????");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("??????????????????????????");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "????????????, ?????? ???? ?????????? ???? ?????? :(");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
            String sql = "SELECT [id]\n" +
            "      ,[??????]\n" +
            "      ,[??????????????????_??????????????]\n" +
            "      ,[??????????????]\n" +
            "      ,[??????????]\n" +
            "      ,[??????????_????????????????]\n" +
            "      ,[??????????????_??????????????]\n" +
            "      ,[????????]\n" +
            "      ,[??????_????????],???????? from Table_client";
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
            this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.getColumnModel().getColumn(0).setHeaderValue("id");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("??????");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("??????????????????_??????????????");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("??????????????");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("??????????");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("??????????_????????????????");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("??????????????_??????????????");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("????????");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("??????_????????");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("????????");
            conn.close();
        }

        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SearchTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTxtMousePressed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Main field= new Main();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void MeasureInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureInsertButtonActionPerformed
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
            stored_pro = conn.prepareCall("{call insert_date_about_client (?,?,?,?,?,?,?,?,?)}");
            stored_pro.setString(1, this.Name.getText());
            stored_pro.setString(2, this.addres.getText());
            stored_pro.setString(3, this.Number.getText());
            stored_pro.setString(4, this.Email.getText());
            stored_pro.setString(5, this.Password.getText());
            stored_pro.setString(6, this.Login.getText());
            stored_pro.setString(7, this.Login1.getText());
            stored_pro.setString(8, this.doctortxt.getText());
            stored_pro.setString(9, this.Datetxt.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "?????????????? ??????????????????");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "???????????? ?????? ?????????? ???? ??????");
        }
        UpdateJTable();
    }//GEN-LAST:event_MeasureInsertButtonActionPerformed

    private void MeasureUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureUpdateButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
            stored_pro = conn.prepareCall("{call update_data_about_client (?,?,?,?,?,?,?,?,?,?)}");
            stored_pro.setString(1, this.IDtxt.getText());
            stored_pro.setString(2, this.Name.getText());
            stored_pro.setString(3, this.addres.getText());
            stored_pro.setString(4, this.Number.getText());
            stored_pro.setString(5, this.Login.getText());
            stored_pro.setString(6, this.Email.getText());
            stored_pro.setString(7, this.Password.getText());
            stored_pro.setString(8, this.Login1.getText());
            stored_pro.setString(9, this.doctortxt.getText());
            stored_pro.setString(10, this.Datetxt.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        UpdateJTable();
    }//GEN-LAST:event_MeasureUpdateButtonActionPerformed

    private void MeasureDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureDeleteButtonActionPerformed
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
            JFrame frame = new JFrame("Sure");
            if (JOptionPane.showConfirmDialog(frame, "???? ?????????????????????????? ???????????? ?????????????? ?????????????",
                "???????????????? ????????????", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            stored_pro = conn.prepareCall("{call delete_date_about_client (?)}");
            stored_pro.setString(1, this.IDtxt.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "???????????? ?????????????? ??????????????.");
            Number.setText("");
            Name.setText("");
            IDtxt.setText("");
            Email.setText("");
            addres.setText("");
            Email.setText("");
            Password.setText("");
            Login.setText("");
            Login1.setText("");
            doctortxt.setText("");
            Datetxt.setText("");
        }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "????????????, ?????? ???? ?????????? ???? ?????? :(");
        }
    }//GEN-LAST:event_MeasureDeleteButtonActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();

            int row = jTable1.getSelectedRow();
            String name = (jTable1.getModel().getValueAt(row,0).toString());

            String sql = "SELECT [id]\n" +
            "      ,[??????]\n" +
            "      ,[??????????????????_??????????????]\n" +
            "      ,[??????????????]\n" +
            "      ,[??????????]\n" +
            "      ,[??????????_????????????????]\n" +
            "      ,[??????????????_??????????????]\n" +
            "      ,[????????]\n" +
            "      ,[??????_????????],???????? from Table_client where id ='" + name + "'";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);

            while(rs.next()){
                IDtxt.setText(rs.getString("id"));
                Name.setText(rs.getString("??????"));
                addres.setText(rs.getString("??????????????????_??????????????"));
                Number.setText(rs.getString("??????????????"));
                Login.setText(rs.getString("??????????"));
                Email.setText(rs.getString("??????????_????????????????"));
                Password.setText(rs.getString("??????????????_??????????????"));
                Login1.setText(rs.getString("????????"));
                Datetxt.setText(rs.getString("????????"));
                doctortxt.setText(rs.getString("??????_????????"));
            }

        }
        catch(Exception e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void doctortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctortxtActionPerformed

    private void IDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDtxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Number.setText("");
        Name.setText("");
        IDtxt.setText("");
        Email.setText("");
        addres.setText("");
        Email.setText("");
        Password.setText("");
        Login.setText("");
        Login1.setText("");
        doctortxt.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatetxtActionPerformed

    private void UpdateJTable(){
        try{
            conn = ConnectMsSql.ConnectDB();
            String sql = "SELECT  id,??????,??????????????????_??????????????,??????????????,??????????,??????????_????????????????,??????????????_??????????????,????????,??????_????????,???????? FROM Table_client";
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
            this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Datetxt;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JTextField Login;
    private javax.swing.JTextField Login1;
    private javax.swing.JButton MeasureDeleteButton;
    private javax.swing.JButton MeasureInsertButton;
    private javax.swing.JButton MeasureUpdateButton;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Number;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JTextField addres;
    private javax.swing.JButton back;
    private javax.swing.JTextField doctortxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
