/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ems.view;

import com.ems.model.Employee;
import com.ems.model.EmployeeDirectory;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Shabina
 */
public class ViewDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDirectoryJPanel
     */
    EmployeeDirectory directory;
    ViewEmployeeJPanel viewEmployeeJPanel;
        
    public ViewDirectoryJPanel( JSplitPane splitViewPane, EmployeeDirectory directory) {
        initComponents();
        this.directory = directory;
        buttonGroup.add(rdbtnSearchById);
        buttonGroup.add(rdbtnSearchByName);
        tblEmployee.setPreferredScrollableViewportSize(new Dimension(2000, 1000));
        populateEmployeeTable(directory);
        viewEmployeeJPanel = new ViewEmployeeJPanel();
        splitViewPane.setRightComponent(viewEmployeeJPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtFilterName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rdbtnSearchByName = new javax.swing.JRadioButton();
        rdbtnSearchById = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee Directory");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee Id", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone Number", "Email Address"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtFilterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Search by:");

        rdbtnSearchByName.setText("Name");
        rdbtnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSearchByNameActionPerformed(evt);
            }
        });

        rdbtnSearchById.setText("Employee Id");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(rdbtnSearchByName)
                            .addGap(18, 18, 18)
                            .addComponent(rdbtnSearchById))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(txtFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(btnSearch))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1349, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rdbtnSearchByName)
                    .addComponent(rdbtnSearchById))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addContainerGap(641, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblTitle)
                    .addContainerGap(959, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRowIndex = tblEmployee.getSelectedRow();
        ArrayList<String> fields = viewEmployeeJPanel.fetchEmployeeFields();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select an employee to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);
        Employee updatedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        boolean flag = true;
        
        if(!validatePhoneNumber(selectedEmployee.getPhoneNumber()) || !validateEmailAddress(selectedEmployee.getEmailAddress())) {
            flag = false;
        }   
        
        if(flag == true){
            updatedEmployee.setName(fields.get(0));
            if( fields.get(2).equals("")){
                updatedEmployee.setAge(0);
            }else{
                updatedEmployee.setAge(Integer.parseInt(fields.get(2)));
            }
            updatedEmployee.setGender( fields.get(3));
            updatedEmployee.setStartDate(fields.get(4));
            updatedEmployee.setLevel(fields.get(5));
            updatedEmployee.setTeamInfo( fields.get(6));
            updatedEmployee.setPositionTitle( fields.get(7));
            updatedEmployee.setPhoto(fields.get(10));
            updatedEmployee.setPhoneNumber(fields.get(8));
            updatedEmployee.setEmailAddress(fields.get(9));
            directory.updateEmployee(selectedEmployee, updatedEmployee);

            JOptionPane.showMessageDialog(this, "Employee updated.");
        }else{
            JOptionPane.showMessageDialog(this, "Failed to update employee.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        btnSearchActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRowIndex = tblEmployee.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select an employee to view.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);        
        
        viewEmployeeJPanel.populateEmployeeFields(selectedEmployee);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRowIndex = tblEmployee.getSelectedRow();
                

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select an employee to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex, 0);
        directory.deleteEmployee(selectedEmployee);
        
        JOptionPane.showMessageDialog(this, "Employee deleted.");
        
        populateEmployeeTable(directory);
        viewEmployeeJPanel.populateEmployeeFields();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtFilterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterNameActionPerformed
        btnSearchActionPerformed(evt);
    }//GEN-LAST:event_txtFilterNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String input = txtFilterName.getText();
        if(input.equals(null) || input.equals("")){
            populateEmployeeTable(directory);
        }else{
            if(rdbtnSearchById.isSelected()){
                if(checkInteger(input)){
                    filterEmployeeTable(Integer.parseInt(input));
                }else {
                    JOptionPane.showMessageDialog(this, "Please enter an Integer.");
                }
            
            }else if (rdbtnSearchByName.isSelected()){
                if(checkInteger(input)){
                    JOptionPane.showMessageDialog(this, "Please enter a String.");
                }else {
                    filterEmployeeTable(input);
                }
                filterEmployeeTable(input);
            }else {
                JOptionPane.showMessageDialog(this, "Please select a method of search.");
            }
        }
                
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rdbtnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSearchByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnSearchByNameActionPerformed

    
    public boolean checkInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
    private void filterEmployeeTable(String Name) {
        
        EmployeeDirectory filteredDirectory = new EmployeeDirectory();
        for(Employee employee : directory.getDirectory()){
            if( employee.getName().equals(Name)){
                filteredDirectory.getDirectory().add(employee);
            }else{
                //do nothing
            }
        }
        populateEmployeeTable(filteredDirectory);
    }
    
    private void filterEmployeeTable(Integer Id) {
        EmployeeDirectory filteredDirectory = new EmployeeDirectory();
        for(Employee employee : directory.getDirectory()){
            if( employee.getEmployeeId()== Id){
                filteredDirectory.getDirectory().add(employee);
            }else{
                //do nothing
            }
        }
        populateEmployeeTable(filteredDirectory);
    }
    
    private void filterEmployeeTable() {

        populateEmployeeTable(directory);
    }
    
    
    
    private void populateEmployeeTable(EmployeeDirectory directory) {

        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        
        for(Employee employee : directory.getDirectory()){
            Object[] row = new Object[11];
            row[0] = employee;
            row[1] = employee.getEmployeeId();
            row[2] = employee.getAge();
            row[3] = employee.getGender();
            row[4] = employee.getStartDate();
            row[5] = employee.getLevel();
            row[6] = employee.getTeamInfo();
            row[7] = employee.getPositionTitle();
            row[8] = employee.getPhoneNumber();
            row[9] = employee.getEmailAddress();
            row[10] = employee.getPhoto();
            model.addRow(row);
        }

    }
    
    public boolean validatePhoneNumber(String PhoneNumber){

        try{
            String regexPattern = "^\\d{10}$";
            Pattern.compile(regexPattern).matcher(PhoneNumber).matches();
            if(!Pattern.compile(regexPattern).matcher(PhoneNumber).matches()){
                throw new IllegalArgumentException("Please check your phone number");
            }
            return true;
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);      
        }
        return false;
    }
    
        
    public boolean validateEmailAddress(String EmailAddress){
        
        try{
            String regexPattern = "^(.+)@(\\S+)$";
            Pattern.compile(regexPattern).matcher(EmailAddress).matches();
            if(!Pattern.compile(regexPattern).matcher(EmailAddress).matches()){
                throw new IllegalArgumentException("Please check your email address");
            }return true;
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);      
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rdbtnSearchById;
    private javax.swing.JRadioButton rdbtnSearchByName;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtFilterName;
    // End of variables declaration//GEN-END:variables
}

