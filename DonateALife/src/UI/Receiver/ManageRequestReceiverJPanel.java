/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Receiver;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import static Backend.Enterprise.Enterprise.EnterpriseType.LimbsBank;
import static Backend.Enterprise.Enterprise.EnterpriseType.OrganBank;
import Backend.NGO.NGO;
import Backend.Organization.CoordinatorOrganization;
import Backend.Organization.Organization;
import Backend.User.User;
import Backend.WorkQueue.CoordinatorTestWorkRequest;
import Backend.WorkQueue.WorkRequest;
import UI.Coordinator.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arun Balasubramanian
 */
public class ManageRequestReceiverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserDetailsJPanel
     */
      private EcoSystem system;
    private User user;
    public ManageRequestReceiverJPanel(EcoSystem system,User user) {
        initComponents();
         this.system = system;
         this.user =user;
         populateTable();
    }
 private void populateTable() {
         
         DefaultTableModel model = (DefaultTableModel)tblentp.getModel();
        
        model.setRowCount(0);
        
         for(NGO ngo:system.getngoList()){ 
             if(ngo.getName().equals("LiverNGO")){
          for(Enterprise enterprise:ngo.getEnterpriseDirectory().getEnterpList()){
            if (enterprise.getEnterpriseType().equals(OrganBank)){
            Object[] row = new Object[4];
            row[0] = ngo;
            row[1] = enterprise ;         
            model.addRow(row);
              }
        }
          
       }
             else{
            for(Enterprise enterprise:ngo.getEnterpriseDirectory().getEnterpList()){
            if (enterprise.getEnterpriseType().equals(LimbsBank)){
            Object[] row = new Object[4];
            row[0] = ngo;
            row[1] = enterprise ;         
            model.addRow(row);
              }
        }
             }}
       populateRequestTable();
    }
 
 private void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) tblstat.getModel();

        model.setRowCount(0);

        for (WorkRequest request : user.getUserRequestList()) {
            Object[] row = new Object[4];
            row[0] = request.getUser().getUserName();
            row[1] = request.getReceiverOrgan();
            row[2] = request.getOverallStatus();
            row[3] = request.getActionDate();
            model.addRow(row);
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

        pnsrl1 = new javax.swing.JScrollPane();
        tblentp = new javax.swing.JTable();
        btnsndreq = new javax.swing.JButton();
        pnsrl2 = new javax.swing.JScrollPane();
        tblstat = new javax.swing.JTable();
        headerlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblentp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NGO", "Enterprise Name"
            }
        ));
        tblentp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        pnsrl1.setViewportView(tblentp);

        add(pnsrl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 100, 690, 88));

        btnsndreq.setBackground(new java.awt.Color(0, 0, 0));
        btnsndreq.setForeground(new java.awt.Color(255, 255, 255));
        btnsndreq.setText("Send Request");
        btnsndreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsndreqActionPerformed(evt);
            }
        });
        add(btnsndreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 130, 30));

        tblstat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Organs Receiving", "Status", "Date"
            }
        ));
        tblstat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        pnsrl2.setViewportView(tblstat);

        add(pnsrl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 690, 107));

        headerlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        headerlabel.setForeground(new java.awt.Color(255, 255, 255));
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Manage Request");
        add(headerlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/receiver1_1100x800.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btnsndreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsndreqActionPerformed
        // TODO add your handling code here:

        if(user.isCompleteProfile()==false){
            JOptionPane.showMessageDialog(null, "Please complete your profile first", "Warning", JOptionPane.WARNING_MESSAGE);
           
        }
        else{
                
        String organReceive = "";

        if (user.isLimbs() == true) {
            organReceive = "Limbs";
        }

        if (user.isEyes() == true) {
            organReceive = "eyes";
        }

        if (user.isKidney() == true) {
            organReceive = "kidney";
        }

        if (user.isLiver() == true) {
            organReceive = "liver";
        }

        if (user.isLungs() == true) {
            organReceive = "lungs";
        }
        System.out.println(organReceive);
        
        for (WorkRequest request : user.getUserRequestList()) {
        
        if (request.getReceiverOrgan().equals(organReceive)){
        
        JOptionPane.showMessageDialog(null, "Organ Already request", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        }
        
        CoordinatorTestWorkRequest request = new CoordinatorTestWorkRequest();
        request.setUser(user);
        request.setReceiverOrgan(organReceive);
        request.setActionDate(new Date());
        request.setCoordinatorStatus("Requested by Receiver");
        request.setOverallStatus("Requested for Donation");


                 
        int row = tblentp.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Organization org = null;
        Enterprise enterprise = (Enterprise) tblentp.getValueAt(row, 1);
        System.out.println(enterprise);
        System.out.println(1);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CoordinatorOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            user.addUserRequest(request);
            JOptionPane.showMessageDialog(null, "Request Sent Sucessfully");
            populateRequestTable();
            
        }else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnsndreqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsndreq;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane pnsrl1;
    private javax.swing.JScrollPane pnsrl2;
    private javax.swing.JTable tblentp;
    private javax.swing.JTable tblstat;
    // End of variables declaration//GEN-END:variables
}