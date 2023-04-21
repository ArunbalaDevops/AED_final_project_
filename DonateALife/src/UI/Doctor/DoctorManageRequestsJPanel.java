/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Doctor;

import Backend.Connection.Connection;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.DoctorOrganization;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harish
 */
public class DoctorManageRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsersJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private DoctorOrganization docOrganization;
    private Enterprise enterprise;

    public DoctorManageRequestsJPanel(JPanel userProcessContainer, UserAccount account, Organization docOrganization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        btncelebrate.setEnabled(false);
        this.userAccount = account;
        this.system = business;
        this.docOrganization = (DoctorOrganization) docOrganization;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        txtdoctname.setText(userAccount.getEmployee().getName());
        txtorg.setText(docOrganization.getOrgName());
        txtornbnk.setText(enterprise.getName());
        populateTable();
        if (userAccount.getEmployee().getdP() != null) {
            //Working line
            byte[] JLabelpictureLabel = userAccount.getEmployee().getdP();
            ImageIcon i = setPicturebyte(JLabelpictureLabel);
            lblphoto.setIcon(i);
        } else {
            System.err.println("No Image");
        }
    }

    private ImageIcon setPicturebyte(byte[] byteArrayImage) {

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tbtdoct.getModel();

        model.setRowCount(0);
        System.out.println(docOrganization.getConnectionDirectory().getconnecList());
        System.out.println("nee ayya ra");
        for (Connection connection : docOrganization.getConnectionDirectory().getconnecList()) {
            System.out.println(connection.getDocStatus() + "reddy gundu");
            if (connection.getDocStatus()!= null && (connection.getDocStatus().equals("Requested to Doctor") || connection.getDocAss().getUsername() == userAccount.getUsername())) {

                Object[] row = new Object[5];
//                row[0] = connection.getDonorReq().getUser().getName();
                row[0] = connection;
                row[1] = connection.getReceiverReq().getUser().getName();
                if (connection.getDocStatus().equals("Requested to Doctor")) {
                    row[2] = "unassinged";
                } else {
                    row[2] = connection.getDocAss().getUsername();
                }
                row[3] = connection.getDocStatus();

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

        scrlpn1 = new javax.swing.JScrollPane();
        tbtdoct = new javax.swing.JTable();
        btnasgn = new javax.swing.JButton();
        btnapr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblnmdoct = new javax.swing.JLabel();
        txtdoctname = new javax.swing.JTextField();
        lblornbnk = new javax.swing.JLabel();
        txtornbnk = new javax.swing.JTextField();
        lblorg = new javax.swing.JLabel();
        txtorg = new javax.swing.JTextField();
        lblphoto = new javax.swing.JLabel();
        btnrjct = new javax.swing.JButton();
        btncelebrate = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(null);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbtdoct.setBackground(new java.awt.Color(0, 0, 0));
        tbtdoct.setForeground(new java.awt.Color(204, 255, 255));
        tbtdoct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organ", "Receiver Name", "Doctor Treating", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrlpn1.setViewportView(tbtdoct);

        add(scrlpn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 470, 247));

        btnasgn.setBackground(new java.awt.Color(3, 15, 43));
        btnasgn.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        btnasgn.setForeground(new java.awt.Color(255, 255, 255));
        btnasgn.setText("Assign to me");
        btnasgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnasgnActionPerformed(evt);
            }
        });
        add(btnasgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        btnapr.setBackground(new java.awt.Color(3, 15, 43));
        btnapr.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        btnapr.setForeground(new java.awt.Color(255, 255, 255));
        btnapr.setText("Approve");
        btnapr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaprActionPerformed(evt);
            }
        });
        add(btnapr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 100, -1));

        jPanel1.setBackground(new java.awt.Color(3, 15, 41));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblnmdoct.setBackground(new java.awt.Color(255, 255, 255));
        lblnmdoct.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblnmdoct.setForeground(new java.awt.Color(255, 255, 255));
        lblnmdoct.setText("Doctor's Name");

        txtdoctname.setBorder(null);
        txtdoctname.setCaretColor(new java.awt.Color(30, 59, 92));
        txtdoctname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdoctnameFocusGained(evt);
            }
        });
        txtdoctname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdoctnameActionPerformed(evt);
            }
        });

        lblornbnk.setBackground(new java.awt.Color(255, 255, 255));
        lblornbnk.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblornbnk.setForeground(new java.awt.Color(255, 255, 255));
        lblornbnk.setText("Organ Bank ");

        txtornbnk.setBorder(null);
        txtornbnk.setCaretColor(new java.awt.Color(30, 59, 92));
        txtornbnk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtornbnkFocusGained(evt);
            }
        });
        txtornbnk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtornbnkActionPerformed(evt);
            }
        });

        lblorg.setBackground(new java.awt.Color(255, 255, 255));
        lblorg.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblorg.setForeground(new java.awt.Color(255, 255, 255));
        lblorg.setText("Organization");

        txtorg.setBorder(null);
        txtorg.setCaretColor(new java.awt.Color(30, 59, 92));
        txtorg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtorgFocusGained(evt);
            }
        });
        txtorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorgActionPerformed(evt);
            }
        });

        lblphoto.setBackground(new java.awt.Color(255, 255, 255));
        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdoctname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblornbnk)
                    .addComponent(txtornbnk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblorg)
                    .addComponent(txtorg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnmdoct, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblnmdoct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdoctname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblornbnk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtornbnk, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblorg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtorg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btnrjct.setBackground(new java.awt.Color(3, 15, 43));
        btnrjct.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        btnrjct.setForeground(new java.awt.Color(255, 255, 255));
        btnrjct.setText("Reject");
        btnrjct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrjctActionPerformed(evt);
            }
        });
        add(btnrjct, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 100, -1));

        btncelebrate.setBackground(new java.awt.Color(3, 15, 43));
        btncelebrate.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        btncelebrate.setForeground(new java.awt.Color(255, 255, 255));
        btncelebrate.setText("Celebrate");
        btncelebrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncelebrateActionPerformed(evt);
            }
        });
        add(btncelebrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 100, -1));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Requests Management ");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 60));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctor.jpg"))); // NOI18N
        bgdimg.setMaximumSize(null);
        bgdimg.setMinimumSize(null);
        bgdimg.setPreferredSize(null);
        bgdimg.setRequestFocusEnabled(false);
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnasgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnasgnActionPerformed

        int selectedRow = tbtdoct.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        if (tbtdoct.getValueAt(selectedRow, 2) == "unassinged") {

            Connection connection = (Connection) tbtdoct.getValueAt(selectedRow, 0);

//            connection.getDonorReq().setOverallStatus("Assigned to Doctor " + userAccount.getUsername());
            connection.getReceiverReq().setOverallStatus("Assigned to Doctor " + userAccount.getUsername());

            connection.setDocAss(userAccount);
            connection.setDocStatus("In progress");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "The request is already assigned");

        }


    }//GEN-LAST:event_btnasgnActionPerformed

    private void btnaprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprActionPerformed
        int selectedRow = tbtdoct.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        if (tbtdoct.getValueAt(selectedRow, 3).equals("Completed") || tbtdoct.getValueAt(selectedRow, 3).equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Request is either Completed or Rejected ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tbtdoct.getValueAt(selectedRow, 2) == "unassinged") {
            JOptionPane.showMessageDialog(null, "Please assign the request to yourself and then proceed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Connection connection = (Connection) tbtdoct.getValueAt(selectedRow, 0);

//        connection.getDonorReq().setOverallStatus("Donation Completed");
        connection.getReceiverReq().setOverallStatus("Received Organ");
        connection.setDocStatus("Completed");
        connection.setInventStatus("Approved By Doctor, Donation Complete");
        btncelebrate.setEnabled(true);
        JOptionPane.showConfirmDialog(null, "Donation is complete", "Info", JOptionPane.INFORMATION_MESSAGE);
        populateTable();


    }//GEN-LAST:event_btnaprActionPerformed

    private void txtdoctnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdoctnameFocusGained
        // TODO add your handling code here:
        txtdoctname.setText("");
    }//GEN-LAST:event_txtdoctnameFocusGained

    private void txtdoctnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoctnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoctnameActionPerformed

    private void txtornbnkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtornbnkFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtornbnkFocusGained

    private void txtornbnkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtornbnkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtornbnkActionPerformed

    private void txtorgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtorgFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgFocusGained

    private void txtorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorgActionPerformed

    private void btnrjctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrjctActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbtdoct.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        if (tbtdoct.getValueAt(selectedRow, 3).equals("Completed") || tbtdoct.getValueAt(selectedRow, 3).equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "Request is either Completed or Rejected ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tbtdoct.getValueAt(selectedRow, 2) == "unassinged") {
            JOptionPane.showMessageDialog(null, "Please assign the request to yourself and then proceed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Connection connection = (Connection) tbtdoct.getValueAt(selectedRow, 0);

        connection.getDonorReq().setOverallStatus("Donation Rejected By Doctor");
        connection.getReceiverReq().setOverallStatus("Request Rejected by Doctor");
        connection.setDocStatus("Rejected");
        connection.setInventStatus("Rejected by Doctor");
    }//GEN-LAST:event_btnrjctActionPerformed

    private void btncelebrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncelebrateActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Fireworks");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width/2, screenSize.height/2);
        frame.setResizable(false);
        frame.setUndecorated(false);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel jLabel = new JLabel("Fireworks By Team: 200 Success");
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(jLabel);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        //frame.getContentPane().add(new FireworkPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
        Icon imgIcon = new ImageIcon(this.getClass().getResource("/Images/confetti.gif"));
       JLabel label = new JLabel(imgIcon);
      label.setBounds(668, 43, 46, 14); // You can use your own values
        frame.getContentPane().add(label);
    }//GEN-LAST:event_btncelebrateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnapr;
    private javax.swing.JButton btnasgn;
    private javax.swing.JButton btncelebrate;
    private javax.swing.JButton btnrjct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblnmdoct;
    private javax.swing.JLabel lblorg;
    private javax.swing.JLabel lblornbnk;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JScrollPane scrlpn1;
    private javax.swing.JTable tbtdoct;
    private javax.swing.JTextField txtdoctname;
    private javax.swing.JTextField txtorg;
    private javax.swing.JTextField txtornbnk;
    // End of variables declaration//GEN-END:variables
}