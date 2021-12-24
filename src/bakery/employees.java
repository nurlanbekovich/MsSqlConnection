/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

import java.sql.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author aidin
 */
public class employees extends javax.swing.JFrame {
Connection conn = null;
CallableStatement stored_pro = null;
Statement statement = null;
ResultSet rs = null;

    /**
     * Creates new form measure
     */
    public employees() {
        initComponents();
        
    }

    
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
        NameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SearchTxt = new javax.swing.JTextField();
        SalaryTxt = new javax.swing.JTextField();
        adressTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PositionTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        phoneTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneTxt1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Фио", "Должность", "Зарплата", "Адресс", "Телефон"
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
        MeasureInsertButton.setText("Добавить");
        MeasureInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureInsertButtonActionPerformed(evt);
            }
        });

        MeasureUpdateButton.setBackground(new java.awt.Color(0, 102, 102));
        MeasureUpdateButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        MeasureUpdateButton.setText("Изменить");
        MeasureUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureUpdateButtonActionPerformed(evt);
            }
        });

        MeasureDeleteButton.setBackground(new java.awt.Color(0, 102, 102));
        MeasureDeleteButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MeasureDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        MeasureDeleteButton.setText("Удалить");
        MeasureDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasureDeleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Фио");

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("назад");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 29)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Форма сотрудников");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("найти");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SearchTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchTxtMousePressed(evt);
            }
        });

        adressTxt.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Должность");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Зарплата");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("Адресс");

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("список");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        phoneTxt.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setText("Премия");

        phoneTxt1.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setText("Телефон");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MeasureInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MeasureUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MeasureDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adressTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SalaryTxt)
                                    .addComponent(NameTxt)
                                    .addComponent(PositionTxt)
                                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(517, 517, 517)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(206, 206, 206))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PositionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MeasureInsertButton)
                    .addComponent(MeasureUpdateButton)
                    .addComponent(MeasureDeleteButton))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
             
//            int row = jTable1.getSelectedRow();
//            String name = (jTable1.getModel().getValueAt(row,0).toString());

            int i=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        NameTxt.setText(model.getValueAt(i,0).toString());
        PositionTxt.setText(model.getValueAt(i,1).toString());
        SalaryTxt.setText(model.getValueAt(i,2).toString());
        adressTxt.setText(model.getValueAt(i,3).toString());
        phoneTxt.setText(model.getValueAt(i,4).toString());
 phoneTxt1.setText(model.getValueAt(i,6).toString());
            
            
//          
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try{
        conn = ConnectMsSql.ConnectDB();
        //String sql = "SELECT Employees.Name,Position.Position as pos,Employees.Final_sallary, Employees.Address, Employees.Phone FROM Employees INNER JOIN Position ON Employees.Position = Position.ID WHERE Employees.Name ='" + name + "'";
            
        String sql = "SELECT Employees.Name, Position.Position, Employees.Salary, Employees.Address, Employees.Phone,Employees.[Nalog_k​_uplate],Employees.Nadbavka, Employees.Final_sallary FROM Employees INNER JOIN Position ON Employees.Position = Position.ID";
        statement = conn.createStatement();
        rs = statement.executeQuery(sql);
        this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Фио");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Должность");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Зарплата");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Адресс");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Телефон");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Nalog_k​_uplate");
        jTable1.getColumnModel().getColumn(6).setHeaderValue("Nadbavka");
          jTable1.getColumnModel().getColumn(7).setHeaderValue("Final_sallary");
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
            Statement st=conn.createStatement();
            String txt = PositionTxt.getText();
            int pos = 0;
            
            ResultSet measure = st.executeQuery("select ID from Position where Position = '" + txt + "'");
            while(measure.next()){
                   pos = measure.getInt("ID");
            }

            String name=NameTxt.getText();
            String salary=SalaryTxt.getText();
            String adress=adressTxt.getText();
            String phone=phoneTxt.getText();
             String phone1=phoneTxt1.getText();
            String dobavlenie = "INSERT INTO Employees(Name,Position,Salary,Address,Phone,Nadbavka) VALUES(?,?,?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(dobavlenie);

            pst.setString(1, name);
            pst.setInt(2, pos);
            pst.setString(3, salary);
            pst.setString(4, adress);
            pst.setString(5, phone);
            pst.setString(6, phone1);
            JOptionPane.showMessageDialog(null, "Данные успешно добавленны.");
            pst.executeUpdate();
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ошибка, что то пошло не так :(");
        }
    }//GEN-LAST:event_MeasureInsertButtonActionPerformed

    private void MeasureDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureDeleteButtonActionPerformed
        // TODO add your handling code here:
        try{
            conn = ConnectMsSql.ConnectDB();
            JFrame frame = new JFrame("Sure");
            if (JOptionPane.showConfirmDialog(frame, "Вы действительно хотите удалить данные?",
                "Удаление данных", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            {
            stored_pro = conn.prepareCall("{call delete_date_about_Employess (?)}");
            stored_pro.setString(1, this.NameTxt.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "Данные успешно удалены.");
            NameTxt.setText("");
            PositionTxt.setText("");
            SalaryTxt.setText("");
            adressTxt.setText("");
            phoneTxt.setText("");
            }
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ошибка, что то пошло не так :(");
        }
    }//GEN-LAST:event_MeasureDeleteButtonActionPerformed

    private void MeasureUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasureUpdateButtonActionPerformed
        // TODO add your handling code here:
        try{
        conn = ConnectMsSql.ConnectDB();
        Statement st=conn.createStatement();
        int row = jTable1.getSelectedRow();
            String id = (jTable1.getModel().getValueAt(row,0).toString());
            String sql = "SELECT ID FROM Employees WHERE Name ='" + id + "'";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
          
            int ID=0;  
            while(rs.next()){
                ID=Integer.parseInt(rs.getString("ID")) ;
             }
            
        String txt = PositionTxt.getText();
            int pos = 0;
            ResultSet measure = st.executeQuery("select ID from Position where Position  = '" + txt + "'");
            while(measure.next()){
                   pos = measure.getInt("ID");
            }
            
        double sum=Double.parseDouble(SalaryTxt.getText());
            double nad=Double.parseDouble(phoneTxt1.getText());
        String adress=adressTxt.getText();
        String phone = phoneTxt.getText();
        String name = NameTxt.getText();
        
        stored_pro = conn.prepareCall("{call update_data_about_employees (?,?,?,?,?,?,?)}");
        stored_pro.setInt(1, ID);
        stored_pro.setString(2, name);
        stored_pro.setInt(3, pos);
        stored_pro.setDouble(4, sum);
        stored_pro.setString(5, adress);
        stored_pro.setString(6, phone);
          stored_pro.setDouble(7, nad);
        stored_pro.execute();
        JOptionPane.showMessageDialog(null, "Данные успешно обновлены.");
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ошибка, что то пошло не так :(");
        }
    }//GEN-LAST:event_MeasureUpdateButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Main1 field= new Main1();
                field.setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        conn = ConnectMsSql.ConnectDB();
        //String sql = "SELECT Employees.Name, Position.Position, Employees.Final_sallary, Employees.Address, Employees.Phone FROM Employees INNER JOIN Position ON Employees.Position = Position.ID";

        String perem = SearchTxt.getText();
        String sql = "SELECT Employees.Name, Position.Position, Employees.Final_sallary, Employees.Address, Employees.Phone FROM Employees INNER JOIN Position ON Employees.Position = Position.ID WHERE Employees.Name like '%" + perem + "%'";
        statement = conn.createStatement();
        rs = statement.executeQuery(sql);
        this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Фио");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Должность");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Зарплата");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Адресс");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Телефон");
 
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ошибка, что то пошло не так :(");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTxtMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        conn = ConnectMsSql.ConnectDB();
        //String sql = "SELECT Employees.Name, Position.Position, Employees.Final_sallary, Employees.Address, Employees.Phone FROM Employees INNER JOIN Position ON Employees.Position = Position.ID WHERE Employees.Name like '%" + perem + "%'";

        String sql = "SELECT Employees.Name, Position.Position, Employees.Final_sallary, Employees.Address, Employees.Phone FROM Employees INNER JOIN Position ON Employees.Position = Position.ID";
        statement = conn.createStatement();
        rs = statement.executeQuery(sql);
        this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Фио");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Должность");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Зарплата");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Адресс");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Телефон");
        conn.close();
        }
        
        catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MeasureDeleteButton;
    private javax.swing.JButton MeasureInsertButton;
    private javax.swing.JButton MeasureUpdateButton;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PositionTxt;
    private javax.swing.JTextField SalaryTxt;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JTextField adressTxt;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JTextField phoneTxt1;
    // End of variables declaration//GEN-END:variables
}
