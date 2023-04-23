/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabAssistant;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.LabOrganization;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import Backend.WorkQueue.CoordinatorTestWorkRequest;
import Backend.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harish
 */
public class LabAssistantManageRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsersJPanel
     */
   private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization coordinator;
    private Enterprise enterprise;

    public LabAssistantManageRequestsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userAccount = account;
        this.business = business;
        this.coordinator = (LabOrganization)organization;
        this.enterprise = enterprise ;
        this.userProcessContainer = userProcessContainer;
         txtlbassnname.setText(userAccount.getEmployee().getName());
        txtorgn.setText(coordinator.getOrgName());
        txtorgnname.setText(enterprise.getName());
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblwrkreqs.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : coordinator.getWorkQueue().getWorkRequestList()){

         if ( request.getLabStatus().equals("Requested to lab") || request.getLabAssitantAssigned().getUsername() == userAccount.getUsername()  )  { 
            Object[] row = new Object[6];
            row[0] = request.getUser();
            row[1] = request.getUser().getType() == 'd'  ? "donor" : "receiver" ;
            row[2] = request ;
            if (request.getLabStatus().equals("Requested to lab")) {
                row[3] =  "unassinged";
            }
            else {
             row[3] = request.getLabAssitantAssigned().getUsername();
            }
            row[4] = request.getLabStatus();
            if(request.getUser().getType() == 'd'){
            row[5] = request.getDonorOrgan();
                    }
            else{
            row[5] = request.getReceiverOrgan();
            }
            model.addRow(row);
        }
        }
      if(userAccount.getEmployee().getdP() !=null){
        //Working line
         byte[] JLabelpictureLabel = userAccount.getEmployee().getdP();
        ImageIcon i = setPicturebyte(JLabelpictureLabel);
        photolabel.setIcon(i);
        }
        else{
            System.err.println("No Image");
        }
    }
  private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblwrkreqs = new javax.swing.JTable();
        btnassntome = new javax.swing.JButton();
        btnproc = new javax.swing.JButton();
        headerlabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbassnnamelbl = new javax.swing.JLabel();
        txtlbassnname = new javax.swing.JTextField();
        lblorgnname = new javax.swing.JLabel();
        txtorgnname = new javax.swing.JTextField();
        orgnlabel = new javax.swing.JLabel();
        txtorgn = new javax.swing.JTextField();
        photolabel = new javax.swing.JLabel();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 96, 128));
        setMaximumSize(null);
        setLayout(new java.awt.GridLayout(1, 1));

        jPanel2.setBackground(new java.awt.Color(55, 96, 128));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblwrkreqs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client's Name", "Type", "Date", "Assigned", "Status", "Organ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblwrkreqs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblwrkreqs);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 550, 170));

        btnassntome.setBackground(new java.awt.Color(0, 8, 51));
        btnassntome.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        btnassntome.setForeground(new java.awt.Color(255, 255, 255));
        btnassntome.setText("Assign to me");
        btnassntome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassntomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnassntome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        btnproc.setBackground(new java.awt.Color(0, 8, 51));
        btnproc.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        btnproc.setForeground(new java.awt.Color(255, 255, 255));
        btnproc.setText("Process");
        btnproc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocActionPerformed(evt);
            }
        });
        jPanel2.add(btnproc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 110, -1));

        headerlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        headerlabel.setForeground(new java.awt.Color(255, 255, 255));
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Manage Requests for Lab Assistant");
        jPanel2.add(headerlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        jPanel1.setBackground(new java.awt.Color(0, 8, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lbassnnamelbl.setBackground(new java.awt.Color(255, 255, 255));
        lbassnnamelbl.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        lbassnnamelbl.setForeground(new java.awt.Color(255, 255, 255));
        lbassnnamelbl.setText("Lab Assistant's Name");

        txtlbassnname.setEditable(false);
        txtlbassnname.setBorder(null);
        txtlbassnname.setCaretColor(new java.awt.Color(30, 59, 92));
        txtlbassnname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlbassnnameFocusGained(evt);
            }
        });
        txtlbassnname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlbassnnameActionPerformed(evt);
            }
        });

        lblorgnname.setBackground(new java.awt.Color(255, 255, 255));
        lblorgnname.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        lblorgnname.setForeground(new java.awt.Color(255, 255, 255));
        lblorgnname.setText("Organ Bank ");

        txtorgnname.setEditable(false);
        txtorgnname.setBorder(null);
        txtorgnname.setCaretColor(new java.awt.Color(30, 59, 92));
        txtorgnname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtorgnnameFocusGained(evt);
            }
        });
        txtorgnname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorgnnameActionPerformed(evt);
            }
        });

        orgnlabel.setBackground(new java.awt.Color(255, 255, 255));
        orgnlabel.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        orgnlabel.setForeground(new java.awt.Color(255, 255, 255));
        orgnlabel.setText("Organization");

        txtorgn.setEditable(false);
        txtorgn.setBorder(null);
        txtorgn.setCaretColor(new java.awt.Color(30, 59, 92));
        txtorgn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtorgnFocusGained(evt);
            }
        });
        txtorgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorgnActionPerformed(evt);
            }
        });

        photolabel.setBackground(new java.awt.Color(255, 255, 255));
        photolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photolabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtlbassnname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblorgnname)
                    .addComponent(txtorgnname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgnlabel)
                    .addComponent(txtorgn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbassnnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lbassnnamelbl)
                .addGap(3, 3, 3)
                .addComponent(txtlbassnname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblorgnname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtorgnname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(orgnlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtorgn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab_assistant.jpg"))); // NOI18N
        bgdimg.setMaximumSize(null);
        bgdimg.setMinimumSize(null);
        bgdimg.setName(""); // NOI18N
        bgdimg.setOpaque(true);
        bgdimg.setPreferredSize(null);
        jPanel2.add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnassntomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassntomeActionPerformed

         int selectedRow = tblwrkreqs.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to Process" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         if (tblwrkreqs.getValueAt(selectedRow, 4).equals("Completed") || tblwrkreqs.getValueAt(selectedRow, 4).equals("Rejected") ) {
            JOptionPane.showMessageDialog(null, "Request is either Completed or Rejected " ,"Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (tblwrkreqs.getValueAt(selectedRow, 3) != "unassinged") {
            JOptionPane.showMessageDialog(null, "Request is already assigned " ,"Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
        
       
       
        WorkRequest request = (WorkRequest)tblwrkreqs.getValueAt(selectedRow, 2);
        request.setLabAssitantAssigned(userAccount);
        request.setLabStatus("In lab for testing");
        request.setActionDate(new Date());
        request.setOverallStatus("Request with lab assistant " + userAccount.getUsername());
        JOptionPane.showMessageDialog(null, "Request assigned " ,"Info" , JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_btnassntomeActionPerformed

    private void btnprocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocActionPerformed
          int selectedRow = tblwrkreqs.getSelectedRow();

       if (tblwrkreqs.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null, "Please select one row to Process" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         if (tblwrkreqs.getValueAt(selectedRow, 4).equals("Completed") || tblwrkreqs.getValueAt(selectedRow, 4).equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Request is either Completed or Rejected " ,"Error" , JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        if (tblwrkreqs.getValueAt(selectedRow, 3) == "unassinged") {
            JOptionPane.showMessageDialog(null, "Please assign the request to yourself and then proceed" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        CoordinatorTestWorkRequest request = (CoordinatorTestWorkRequest)tblwrkreqs.getValueAt(selectedRow, 2);

        AnalyseRequestJPanel anayseRequest = new AnalyseRequestJPanel(request,enterprise,userAccount);
        userProcessContainer.add("CoordinatorAssistantWorkAreaJPanel",anayseRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_btnprocActionPerformed

    private void txtlbassnnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlbassnnameFocusGained
        // TODO add your handling code here:
        txtlbassnname.setText("");
    }//GEN-LAST:event_txtlbassnnameFocusGained

    private void txtlbassnnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlbassnnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlbassnnameActionPerformed

    private void txtorgnnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtorgnnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgnnameFocusGained

    private void txtorgnnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorgnnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgnnameActionPerformed

    private void txtorgnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtorgnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgnFocusGained

    private void txtorgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorgnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnassntome;
    private javax.swing.JButton btnproc;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbassnnamelbl;
    private javax.swing.JLabel lblorgnname;
    private javax.swing.JLabel orgnlabel;
    private javax.swing.JLabel photolabel;
    private javax.swing.JTable tblwrkreqs;
    private javax.swing.JTextField txtlbassnname;
    private javax.swing.JTextField txtorgn;
    private javax.swing.JTextField txtorgnname;
    // End of variables declaration//GEN-END:variables
}