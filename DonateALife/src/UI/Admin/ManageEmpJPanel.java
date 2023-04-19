/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Backend.EcoSystem;
import Backend.Employee.Employee;
import Backend.Enterprise.Enterprise;
import Backend.NGO.NGO;
import Backend.Organization.Organization;
import Backend.Organization.Organization.LegalType;
import Backend.Organization.Organization.Type;
import Backend.Organization.OrganizationDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehar
 */
public class ManageEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private OrganizationDirectory organizationDir;
    private Enterprise enterprise;

    public ManageEmpJPanel(OrganizationDirectory organizationDir, Enterprise enterprise) {
        initComponents();
        this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        NameEntptxtField.setText(enterprise.getName());
        populateOrganizationComboBox();
        populateTable();
//        for (Organization o : organizationDir.getOrganizationList()) {
//
//            populateTable(o);
//        }

    }

    private void populateOrganizationComboBox() {
        orgcmbbox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            orgcmbbox.addItem(organization);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) orgtbl.getModel();

        model.setRowCount(0);
        for (Organization o : organizationDir.getOrganizationList()) {
            for (Employee employee : o.getEmployeeDirectory().getEmplyList()) {
                Object[] row = new Object[3];
                row[0] = o.getOrgName();
                row[1] = employee.getName();
                row[2] = o;
                model.addRow(row);
            }

        }

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
        removeBtn = new javax.swing.JButton();
        NameEntptxtField = new javax.swing.JTextField();
        titlelabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Orglbl = new javax.swing.JLabel();
        orgcmbbox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        employeeNametxt = new javax.swing.JTextField();
        orgcreateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orginizationNmtxt = new javax.swing.JTextField();
        NameEntplbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgtbl = new javax.swing.JTable();
        bgdimg = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(55, 96, 128));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(null);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removeBtn.setText("Delete");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 121, 33));

        NameEntptxtField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameEntptxtField.setBorder(null);
        NameEntptxtField.setCaretColor(new java.awt.Color(30, 59, 92));
        NameEntptxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameEntptxtFieldFocusGained(evt);
            }
        });
        NameEntptxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameEntptxtFieldActionPerformed(evt);
            }
        });
        add(NameEntptxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        titlelabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titlelabel.setForeground(new java.awt.Color(255, 255, 255));
        titlelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelabel.setText("Add New Employee");
        add(titlelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 40));

        jPanel2.setBackground(new java.awt.Color(8, 21, 49));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        Orglbl.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        Orglbl.setForeground(new java.awt.Color(255, 255, 255));
        Orglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Orglbl.setText("Organization");

        orgcmbbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgcmbbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                orgcmbboxItemStateChanged(evt);
            }
        });
        orgcmbbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orgcmbboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orgcmbboxMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orgcmbboxMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name");

        employeeNametxt.setBorder(null);
        employeeNametxt.setCaretColor(new java.awt.Color(30, 59, 92));
        employeeNametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                employeeNametxtFocusGained(evt);
            }
        });
        employeeNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNametxtActionPerformed(evt);
            }
        });

        orgcreateBtn.setBackground(new java.awt.Color(8, 21, 49));
        orgcreateBtn.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        orgcreateBtn.setForeground(new java.awt.Color(255, 255, 255));
        orgcreateBtn.setText("CREATE");
        orgcreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgcreateBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Organization Name");

        orginizationNmtxt.setEditable(false);
        orginizationNmtxt.setBorder(null);
        orginizationNmtxt.setCaretColor(new java.awt.Color(30, 59, 92));
        orginizationNmtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                orginizationNmtxtFocusGained(evt);
            }
        });
        orginizationNmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orginizationNmtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(orgcreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(orginizationNmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(employeeNametxt)
                        .addGap(52, 52, 52))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Orglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(orgcmbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Orglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orgcmbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orginizationNmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(orgcreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 630, 250));

        NameEntplbl.setFont(new java.awt.Font("Dubai Medium", 1, 13)); // NOI18N
        NameEntplbl.setForeground(new java.awt.Color(255, 255, 255));
        NameEntplbl.setText("Enterprise Name");
        add(NameEntplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));

        orgtbl.setBackground(new java.awt.Color(204, 255, 255));
        orgtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Org Name", "Name", "Enterprise Name"
            }
        ));
        jScrollPane1.setViewportView(orgtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 633, 120));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin_management.jpg"))); // NOI18N
        bgdimg.setMaximumSize(null);
        bgdimg.setMinimumSize(null);
        bgdimg.setPreferredSize(null);
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void employeeNametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employeeNametxtFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_employeeNametxtFocusGained

    private void employeeNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNametxtActionPerformed

    private void orgcreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgcreateBtnActionPerformed
        // TODO add your handling code here:
        //directory.createDonorBankOrganization((Type)organizationComboBox.getSelectedItem());

        if (employeeNametxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Employee  name cannot be empty");
            return;
        }

        Organization organization = (Organization) orgcmbbox.getSelectedItem();
        for (Employee employee : organization.getEmployeeDirectory().getEmplyList()) {

            if (employee.getName().equals(employeeNametxt.getText())) {
                JOptionPane.showMessageDialog(null, "Employee cannot have same name");
                return;

            }

        }
        String name = employeeNametxt.getText();
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable();
        employeeNametxt.setText("");
    }//GEN-LAST:event_orgcreateBtnActionPerformed

    private void NameEntptxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameEntptxtFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_NameEntptxtFieldFocusGained

    private void NameEntptxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameEntptxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameEntptxtFieldActionPerformed

    private void orginizationNmtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orginizationNmtxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_orginizationNmtxtFocusGained

    private void orginizationNmtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orginizationNmtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orginizationNmtxtActionPerformed

    private void orgcmbboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgcmbboxMouseClicked
        // TODO add your handling code here:

//        Organization o = (Organization) organizationComboBox.getSelectedItem();
//        orgNameTextField.setText(o.getOrgName());
    }//GEN-LAST:event_orgcmbboxMouseClicked

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        int selectedItem = orgtbl.getSelectedRow();
        if (selectedItem >= 0) {
            int dialougeButton = JOptionPane.YES_NO_OPTION;
            int dialougeSubmit = JOptionPane.showConfirmDialog(null, "Would you like to delete the employee?", "Warning!", dialougeButton);
            if (dialougeSubmit == JOptionPane.YES_OPTION) {
                Organization organization = (Organization) orgtbl.getValueAt(selectedItem, 2);
                String employeeName = (String) orgtbl.getValueAt(selectedItem, 1);
                for (Employee employ : organization.getEmployeeDirectory().getEmplyList()) {

                    if (employ.getName().equals(employeeName)) {
                        organization.getEmployeeDirectory().removeEmployee(employ);
                        populateTable();
                    }
                }
      
                
            }
        } else {

            JOptionPane.showMessageDialog(null, "Please select a row");
        }

        //  for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
        //  }

    }//GEN-LAST:event_removeBtnActionPerformed

    private void orgcmbboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgcmbboxMousePressed
        // TODO add your handling code here:
       //     Organization o = (Organization) organizationComboBox.getSelectedItem();
      //  orgNameTextField.setText(o.getOrgName());
    }//GEN-LAST:event_orgcmbboxMousePressed

    private void orgcmbboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_orgcmbboxItemStateChanged
        // TODO add your handling code here:
//          Organization o = (Organization) organizationComboBox.getSelectedItem();
//        orgNameTextField.setText(o.getOrgName());
    }//GEN-LAST:event_orgcmbboxItemStateChanged

    private void orgcmbboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgcmbboxMouseEntered
        // TODO add your handling code here:
        Organization o = (Organization) orgcmbbox.getSelectedItem();
        orginizationNmtxt.setText(o.getOrgName());
    }//GEN-LAST:event_orgcmbboxMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameEntplbl;
    private javax.swing.JTextField NameEntptxtField;
    private javax.swing.JLabel Orglbl;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JTextField employeeNametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgcmbbox;
    private javax.swing.JButton orgcreateBtn;
    private javax.swing.JTextField orginizationNmtxt;
    private javax.swing.JTable orgtbl;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables

}
