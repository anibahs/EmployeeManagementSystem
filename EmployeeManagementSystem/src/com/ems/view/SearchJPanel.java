/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ems.view;

/**
 *
 * @author Shabina
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    public SearchJPanel() {
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

        tabbedPaneSearchEmployee = new javax.swing.JTabbedPane();
        pnlSearchByName = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        lblFilterName = new javax.swing.JLabel();
        txtFilterName = new javax.swing.JTextField();
        pnlSearchByEmployeeId = new javax.swing.JPanel();
        lblFilterEmployeeId = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();
        txtFilterEmployeeId = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        viewJPanel = new javax.swing.JPanel();

        btnSearch.setText("Search");

        lblFilterName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFilterName.setText("Name:");

        javax.swing.GroupLayout pnlSearchByNameLayout = new javax.swing.GroupLayout(pnlSearchByName);
        pnlSearchByName.setLayout(pnlSearchByNameLayout);
        pnlSearchByNameLayout.setHorizontalGroup(
            pnlSearchByNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchByNameLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(64, 64, 64))
        );
        pnlSearchByNameLayout.setVerticalGroup(
            pnlSearchByNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchByNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchByNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(lblFilterName)
                    .addComponent(txtFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tabbedPaneSearchEmployee.addTab("Search By Name", pnlSearchByName);

        lblFilterEmployeeId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFilterEmployeeId.setText("Employee ID:");

        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        txtFilterEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterEmployeeIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchByEmployeeIdLayout = new javax.swing.GroupLayout(pnlSearchByEmployeeId);
        pnlSearchByEmployeeId.setLayout(pnlSearchByEmployeeIdLayout);
        pnlSearchByEmployeeIdLayout.setHorizontalGroup(
            pnlSearchByEmployeeIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchByEmployeeIdLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblFilterEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtFilterEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnSearch1)
                .addGap(64, 64, 64))
        );
        pnlSearchByEmployeeIdLayout.setVerticalGroup(
            pnlSearchByEmployeeIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchByEmployeeIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchByEmployeeIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch1)
                    .addComponent(lblFilterEmployeeId)
                    .addComponent(txtFilterEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tabbedPaneSearchEmployee.addTab("Search By Employee Id", pnlSearchByEmployeeId);

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Search Employee");

        javax.swing.GroupLayout viewJPanelLayout = new javax.swing.GroupLayout(viewJPanel);
        viewJPanel.setLayout(viewJPanelLayout);
        viewJPanelLayout.setHorizontalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        viewJPanelLayout.setVerticalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabbedPaneSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPaneSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilterEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterEmployeeIdActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JLabel lblFilterEmployeeId;
    private javax.swing.JLabel lblFilterName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlSearchByEmployeeId;
    private javax.swing.JPanel pnlSearchByName;
    private javax.swing.JTabbedPane tabbedPaneSearchEmployee;
    private javax.swing.JTextField txtFilterEmployeeId;
    private javax.swing.JTextField txtFilterName;
    private javax.swing.JPanel viewJPanel;
    // End of variables declaration//GEN-END:variables
}
