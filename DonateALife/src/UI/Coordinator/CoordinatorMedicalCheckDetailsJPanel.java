/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Coordinator;

import Backend.Enterprise.Enterprise;
import Backend.Organization.LabOrganization;
import Backend.Organization.LimbsManufacturerOrganization;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import Backend.WorkQueue.CoordinatorTestWorkRequest;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Arun Balasubramanian
 */
public class CoordinatorMedicalCheckDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsersJPanel
     */
    private CoordinatorTestWorkRequest request ;
    private Enterprise enterprise ;
    private UserAccount userAccount;
    private String organ;
    public CoordinatorMedicalCheckDetailsJPanel(CoordinatorTestWorkRequest request , Enterprise enterprise,UserAccount userAccount, String organ) {
      initComponents();
        this.request = request ; 
        this.enterprise = enterprise ;
        this.userAccount= userAccount;
        this.organ = organ;
        btnaprv.setEnabled(false);
        btnrjct.setEnabled(false);
         ButtonGroup sugar = new ButtonGroup();
         sugar.add(yessug);
         sugar.add(nosug);
         
         ButtonGroup aids = new ButtonGroup();
         aids.add(yesad);
         aids.add(noad);
         
         ButtonGroup tatto = new ButtonGroup();
         tatto.add(yestato);
         tatto.add(notato);
         
         ButtonGroup diabetes = new ButtonGroup();
         diabetes.add(yesdieb);
         diabetes.add(nodieb);
         
         ButtonGroup heart = new ButtonGroup();
         heart.add(yeshrt);
         heart.add(nohrt);
         
         ButtonGroup asthama = new ButtonGroup();
         asthama.add(yesastm);
         asthama.add(noastm);     
        populateDefault();
        
    }
    

   private void populateDefault() {
      nametxt.setText(userAccount.getEmployee().getName());
      cntnumtxt.setText(userAccount.getEmployee().getPhoneNumber()+"");
      DateofBirthtxt.setText(userAccount.getEmployee().getDOB().toString());
      gndtxt.setText(userAccount.getEmployee().getGender());      
      emercnttxt.setText(userAccount.getEmployee().getEmergencyPhoneNumber()+ "");
      System.out.println(organ);
      System.out.println(request);
         if(userAccount.getEmployee().getdP() !=null){
        //Working line
         byte[] JLabelpictureLabel = userAccount.getEmployee().getdP();
        ImageIcon i = setPicturebyte(JLabelpictureLabel);
        photolbl.setIcon(i);
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

        btnrjct = new javax.swing.JButton();
        btnaprv = new javax.swing.JButton();
        btnsbt = new javax.swing.JButton();
        srlpn1 = new javax.swing.JScrollPane();
        TextField = new javax.swing.JTextArea();
        titlelbl = new javax.swing.JLabel();
        photolbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        cntnumtxt = new javax.swing.JTextField();
        DateofBirthtxt = new javax.swing.JTextField();
        gndtxt = new javax.swing.JTextField();
        emercnttxt = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        lblcnt = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblgen = new javax.swing.JLabel();
        lblemercnt = new javax.swing.JLabel();
        mandtstlbl = new javax.swing.JLabel();
        lbldiebeties = new javax.swing.JLabel();
        lbltatoo = new javax.swing.JLabel();
        lblheart = new javax.swing.JLabel();
        lblAsthama = new javax.swing.JLabel();
        yessug = new javax.swing.JRadioButton();
        nosug = new javax.swing.JRadioButton();
        yesad = new javax.swing.JRadioButton();
        noad = new javax.swing.JRadioButton();
        yestato = new javax.swing.JRadioButton();
        notato = new javax.swing.JRadioButton();
        yesdieb = new javax.swing.JRadioButton();
        nodieb = new javax.swing.JRadioButton();
        yeshrt = new javax.swing.JRadioButton();
        nohrt = new javax.swing.JRadioButton();
        yesastm = new javax.swing.JRadioButton();
        noastm = new javax.swing.JRadioButton();
        lblsugar = new javax.swing.JLabel();
        lblaids = new javax.swing.JLabel();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(890, 539));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrjct.setBackground(new java.awt.Color(0, 0, 0));
        btnrjct.setForeground(new java.awt.Color(255, 255, 255));
        btnrjct.setText("Reject");
        btnrjct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrjctActionPerformed(evt);
            }
        });
        add(btnrjct, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 93, -1));

        btnaprv.setBackground(new java.awt.Color(0, 0, 0));
        btnaprv.setForeground(new java.awt.Color(255, 255, 255));
        btnaprv.setText("Approve");
        btnaprv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaprvActionPerformed(evt);
            }
        });
        add(btnaprv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 93, -1));

        btnsbt.setBackground(new java.awt.Color(0, 0, 0));
        btnsbt.setForeground(new java.awt.Color(255, 255, 255));
        btnsbt.setText("Submit ");
        btnsbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsbtActionPerformed(evt);
            }
        });
        add(btnsbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 320, -1));

        TextField.setBackground(new java.awt.Color(0, 0, 0));
        TextField.setColumns(20);
        TextField.setForeground(new java.awt.Color(51, 153, 0));
        TextField.setRows(5);
        TextField.setAutoscrolls(false);
        srlpn1.setViewportView(TextField);

        add(srlpn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 316, 196));

        titlelbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titlelbl.setForeground(new java.awt.Color(255, 255, 255));
        titlelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelbl.setText("Analyse Requests");
        add(titlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 60));

        photolbl.setBackground(new java.awt.Color(255, 255, 255));
        photolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photolbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(photolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 107, 133));

        nametxt.setBorder(null);
        nametxt.setCaretColor(new java.awt.Color(30, 59, 92));
        nametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nametxtFocusGained(evt);
            }
        });
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, -1));

        cntnumtxt.setBorder(null);
        cntnumtxt.setCaretColor(new java.awt.Color(30, 59, 92));
        cntnumtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cntnumtxtFocusGained(evt);
            }
        });
        cntnumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntnumtxtActionPerformed(evt);
            }
        });
        add(cntnumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, -1));

        DateofBirthtxt.setBorder(null);
        add(DateofBirthtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, -1));

        gndtxt.setBorder(null);
        add(gndtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 150, -1));

        emercnttxt.setBorder(null);
        emercnttxt.setCaretColor(new java.awt.Color(30, 59, 92));
        emercnttxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emercnttxtFocusGained(evt);
            }
        });
        emercnttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emercnttxtActionPerformed(evt);
            }
        });
        add(emercnttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 150, -1));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Name");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        lblcnt.setBackground(new java.awt.Color(255, 255, 255));
        lblcnt.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblcnt.setForeground(new java.awt.Color(255, 255, 255));
        lblcnt.setText("Contact");
        add(lblcnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Birth Date");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 103, -1));

        lblgen.setBackground(new java.awt.Color(255, 255, 255));
        lblgen.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblgen.setForeground(new java.awt.Color(255, 255, 255));
        lblgen.setText("Gender");
        add(lblgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 51, -1));

        lblemercnt.setBackground(new java.awt.Color(255, 255, 255));
        lblemercnt.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblemercnt.setForeground(new java.awt.Color(255, 255, 255));
        lblemercnt.setText("Emergency Contact");
        add(lblemercnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 140, -1));

        mandtstlbl.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        mandtstlbl.setForeground(new java.awt.Color(255, 255, 255));
        mandtstlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mandtstlbl.setText("Mandatory Tests");
        add(mandtstlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 268, 33));

        lbldiebeties.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lbldiebeties.setForeground(new java.awt.Color(255, 255, 255));
        lbldiebeties.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbldiebeties.setText("Diebeties");
        add(lbldiebeties, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 70, 30));

        lbltatoo.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lbltatoo.setForeground(new java.awt.Color(255, 255, 255));
        lbltatoo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbltatoo.setText("Tattoo");
        add(lbltatoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 70, 30));

        lblheart.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblheart.setForeground(new java.awt.Color(255, 255, 255));
        lblheart.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblheart.setText("Heart");
        add(lblheart, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 70, 30));

        lblAsthama.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblAsthama.setForeground(new java.awt.Color(255, 255, 255));
        lblAsthama.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAsthama.setText("Asthama");
        add(lblAsthama, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 70, 20));

        yessug.setBackground(new java.awt.Color(55, 96, 128));
        yessug.setForeground(new java.awt.Color(255, 255, 255));
        yessug.setText("Yes");
        yessug.setBorder(null);
        add(yessug, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        nosug.setBackground(new java.awt.Color(55, 96, 128));
        nosug.setForeground(new java.awt.Color(255, 255, 255));
        nosug.setText("No");
        nosug.setBorder(null);
        add(nosug, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        yesad.setBackground(new java.awt.Color(55, 96, 128));
        yesad.setForeground(new java.awt.Color(255, 255, 255));
        yesad.setText("Yes");
        yesad.setBorder(null);
        add(yesad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        noad.setBackground(new java.awt.Color(55, 96, 128));
        noad.setForeground(new java.awt.Color(255, 255, 255));
        noad.setText("No");
        noad.setBorder(null);
        add(noad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        yestato.setBackground(new java.awt.Color(55, 96, 128));
        yestato.setForeground(new java.awt.Color(255, 255, 255));
        yestato.setText("Yes");
        yestato.setBorder(null);
        add(yestato, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        notato.setBackground(new java.awt.Color(55, 96, 128));
        notato.setForeground(new java.awt.Color(255, 255, 255));
        notato.setText("No");
        notato.setBorder(null);
        add(notato, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        yesdieb.setBackground(new java.awt.Color(55, 96, 128));
        yesdieb.setForeground(new java.awt.Color(255, 255, 255));
        yesdieb.setText("Yes");
        yesdieb.setBorder(null);
        add(yesdieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        nodieb.setBackground(new java.awt.Color(55, 96, 128));
        nodieb.setForeground(new java.awt.Color(255, 255, 255));
        nodieb.setText("No");
        nodieb.setBorder(null);
        add(nodieb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        yeshrt.setBackground(new java.awt.Color(55, 96, 128));
        yeshrt.setForeground(new java.awt.Color(255, 255, 255));
        yeshrt.setText("Yes");
        yeshrt.setBorder(null);
        add(yeshrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        nohrt.setBackground(new java.awt.Color(55, 96, 128));
        nohrt.setForeground(new java.awt.Color(255, 255, 255));
        nohrt.setText("No");
        nohrt.setBorder(null);
        add(nohrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        yesastm.setBackground(new java.awt.Color(55, 96, 128));
        yesastm.setForeground(new java.awt.Color(255, 255, 255));
        yesastm.setText("Yes");
        yesastm.setBorder(null);
        add(yesastm, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        noastm.setBackground(new java.awt.Color(55, 96, 128));
        noastm.setForeground(new java.awt.Color(255, 255, 255));
        noastm.setText("No");
        noastm.setBorder(null);
        add(noastm, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        lblsugar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblsugar.setForeground(new java.awt.Color(255, 255, 255));
        lblsugar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblsugar.setText("Sugar");
        add(lblsugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 70, 30));

        lblaids.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblaids.setForeground(new java.awt.Color(255, 255, 255));
        lblaids.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblaids.setText("Aids");
        add(lblaids, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 70, 30));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HealthcareData.png"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btnaprvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprvActionPerformed
        // TODO add your handling code here:
        btnsbt.setEnabled(true);
          if (yesastm.isSelected()   && yeshrt.isSelected() 
             && yesad.isSelected()   && yessug.isSelected()
             && yestato.isSelected() && yesdieb.isSelected()) {
              
             Organization org = null;
             
             for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                 System.out.println(organ);
                 System.out.println(organization);
                 System.out.println(1);
                 if ((organization instanceof LabOrganization && organ.equals("liver")) || (organization instanceof LimbsManufacturerOrganization && organ.equals("Limbs"))) {
                    org = organization;
                    break;
                }
            }
            System.out.println(org);
            System.out.println(1); 
            
            if(org instanceof LimbsManufacturerOrganization){
                System.out.println(2); 
                request.setCoordinatorStatus("Completed");
                request.setManStatus("Requested to Manufacturer");
                request.setActionDate(new Date());
                request.setReceiverOrgan(organ);
                System.out.println(org.getWorkQueue().getWorkRequestList());
                 org.getWorkQueue().getWorkRequestList().add(request); 
                System.out.println(org.getWorkQueue().getWorkRequestList());
                JOptionPane.showMessageDialog(null, "Request Approved" ,"Info" , JOptionPane.INFORMATION_MESSAGE);
                request.setOverallStatus("Request Approved by Co-ordinator. Now will be assigned to Manufacturer for donation");

               
               
                
             }
            
            else if (org != null) {
                request.setCoordinatorStatus("Completed");
                System.out.println(3); 
                request.setLabStatus("Requested to lab");
                request.setActionDate(new Date());
                System.out.println(org.getWorkQueue().getWorkRequestList());
                org.getWorkQueue().getWorkRequestList().add(request);          
                JOptionPane.showMessageDialog(null, "Request Approved" ,"Info" , JOptionPane.INFORMATION_MESSAGE);
                request.setOverallStatus("Request Approved by Co-ordinator. Now will be assigned to Lab for Tests");
                btnaprv.setEnabled(false);
            }else {
                JOptionPane.showMessageDialog(null, "Organization not present" ,"Error" , JOptionPane.ERROR_MESSAGE);
            }

        } else {
             
              JOptionPane.showMessageDialog(null, "All test not passed so need to reject the Request" ,"Info" , JOptionPane.INFORMATION_MESSAGE);
              
        }
        
        
        
    }//GEN-LAST:event_btnaprvActionPerformed

    private void nametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtFocusGained

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void cntnumtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cntnumtxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cntnumtxtFocusGained

    private void cntnumtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntnumtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cntnumtxtActionPerformed

    private void emercnttxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emercnttxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emercnttxtFocusGained

    private void emercnttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emercnttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emercnttxtActionPerformed

    private void btnsbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsbtActionPerformed
        // TODO add your handling code here:
        btnsbt.setEnabled(false);
        btnaprv.setEnabled(false);
        btnrjct.setEnabled(false);
        javax.swing.Timer timer3 = new javax.swing.Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "\nStarting a new Process............................";
                TextField.append(text);
                TextField.setCaretPosition(TextField.getText().length());
                ((javax.swing.Timer)e.getSource()).stop();
            }
        });
        timer3.start();
        javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "\nProcessing the Tests ...............";
                TextField.append(text);
                TextField.setCaretPosition(TextField.getText().length());
                ((javax.swing.Timer)e.getSource()).stop();
            }
        });
        timer.start();

        javax.swing.Timer timer1 = new javax.swing.Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "\nValidating the Tests .............";
                TextField.append(text);
                TextField.setCaretPosition(TextField.getText().length());
                ((javax.swing.Timer)e.getSource()).stop();
            }
        });
        timer1.start();
        if (yessug.isSelected() && yesad.isSelected()
            && yestato.isSelected()  && yesdieb.isSelected()
            && yeshrt.isSelected() && yesastm.isSelected()) {
            javax.swing.Timer timer2 = new javax.swing.Timer(6000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = "\nYou can approve the request!";
                    TextField.append(text);
                    TextField.setCaretPosition(TextField.getText().length());
                    ((javax.swing.Timer)e.getSource()).stop();                    
                    btnaprv.setEnabled(true);
                }
            });
            timer2.start();
            

        }
        else {
            javax.swing.Timer timer2 = new javax.swing.Timer(6000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = "\nReject the Request!";
                    TextField.append(text);
                    TextField.setCaretPosition(TextField.getText().length());
                    ((javax.swing.Timer)e.getSource()).stop();                    
            btnrjct.setEnabled(true);
                }
            });
            timer2.start();
        }
    }//GEN-LAST:event_btnsbtActionPerformed

    private void btnrjctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrjctActionPerformed
        // TODO add your handling code here:
        btnsbt.setEnabled(true);
       request.setCoordinatorStatus("Rejected");
       request.setOverallStatus("Requestis Rejected by Co-ordinator");
       request.setActionDate(new Date());
       JOptionPane.showMessageDialog(null, "Request Rejected" ,"Info" , JOptionPane.INFORMATION_MESSAGE);
       btnrjct.setEnabled(false);
    }//GEN-LAST:event_btnrjctActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateofBirthtxt;
    private javax.swing.JTextArea TextField;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnaprv;
    private javax.swing.JButton btnrjct;
    private javax.swing.JButton btnsbt;
    private javax.swing.JTextField cntnumtxt;
    private javax.swing.JTextField emercnttxt;
    private javax.swing.JTextField gndtxt;
    private javax.swing.JLabel lblAsthama;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblaids;
    private javax.swing.JLabel lblcnt;
    private javax.swing.JLabel lbldiebeties;
    private javax.swing.JLabel lblemercnt;
    private javax.swing.JLabel lblgen;
    private javax.swing.JLabel lblheart;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblsugar;
    private javax.swing.JLabel lbltatoo;
    private javax.swing.JLabel mandtstlbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JRadioButton noad;
    private javax.swing.JRadioButton noastm;
    private javax.swing.JRadioButton nodieb;
    private javax.swing.JRadioButton nohrt;
    private javax.swing.JRadioButton nosug;
    private javax.swing.JRadioButton notato;
    private javax.swing.JLabel photolbl;
    private javax.swing.JScrollPane srlpn1;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JRadioButton yesad;
    private javax.swing.JRadioButton yesastm;
    private javax.swing.JRadioButton yesdieb;
    private javax.swing.JRadioButton yeshrt;
    private javax.swing.JRadioButton yessug;
    private javax.swing.JRadioButton yestato;
    // End of variables declaration//GEN-END:variables
}
