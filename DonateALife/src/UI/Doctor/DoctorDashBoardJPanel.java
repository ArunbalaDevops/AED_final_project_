/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Doctor;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.DoctorOrganization;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import org.jdesktop.swingx.JXFrame;

/**
 *
 * @author harish
 */
public class DoctorDashBoardJPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserDashBoardJPanel
     */

    private EcoSystem system;
    private Enterprise enterprise ;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private DoctorOrganization docOrganization;
    public DoctorDashBoardJPanel(UserAccount account, Organization organization, EcoSystem system,DB4OUtil dB4OUtil,Enterprise enterprise) {
        initComponents();
        this.dB4OUtil = dB4OUtil;
        this.system = system;
         this.enterprise = enterprise ;
        this.dB4OUtil = dB4OUtil;
        this.system = system;
        this.userAccount =account;
        this.docOrganization = (DoctorOrganization)organization;
          setColor(btndoctprof);
        resetColor(new JPanel[]{reqmangdoct});
        ManageDoctorDetailsJPanel jpanel = new ManageDoctorDetailsJPanel(userAccount,system,docOrganization,enterprise);
        userProcessContainer.add("ManageDoctorDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        this.setExtendedState(JXFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane4 = new javax.swing.JSplitPane();
        admnmng = new javax.swing.JPanel();
        reqmangdoct = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        btndoctprof = new javax.swing.JPanel();
        lblprof = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setMaximumSize(null);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jSplitPane4.setBackground(new java.awt.Color(55, 96, 128));
        jSplitPane4.setDividerSize(0);

        admnmng.setBackground(new java.awt.Color(3, 15, 43));

        reqmangdoct.setBackground(new java.awt.Color(3, 15, 43));
        reqmangdoct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reqmangdoctMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request x 32.png"))); // NOI18N
        jLabel10.setText("Requests");

        javax.swing.GroupLayout reqmangdoctLayout = new javax.swing.GroupLayout(reqmangdoct);
        reqmangdoct.setLayout(reqmangdoctLayout);
        reqmangdoctLayout.setHorizontalGroup(
            reqmangdoctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqmangdoctLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        reqmangdoctLayout.setVerticalGroup(
            reqmangdoctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqmangdoctLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        logout.setFont(new java.awt.Font("Dubai Medium", 0, 13)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logoutx32.png"))); // NOI18N
        logout.setText(" Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        btndoctprof.setBackground(new java.awt.Color(3, 15, 43));
        btndoctprof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btndoctprofMousePressed(evt);
            }
        });

        lblprof.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblprof.setForeground(new java.awt.Color(255, 255, 255));
        lblprof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account x 32.png"))); // NOI18N
        lblprof.setText("Profile");

        javax.swing.GroupLayout btndoctprofLayout = new javax.swing.GroupLayout(btndoctprof);
        btndoctprof.setLayout(btndoctprofLayout);
        btndoctprofLayout.setHorizontalGroup(
            btndoctprofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btndoctprofLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblprof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btndoctprofLayout.setVerticalGroup(
            btndoctprofLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btndoctprofLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblprof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout admnmngLayout = new javax.swing.GroupLayout(admnmng);
        admnmng.setLayout(admnmngLayout);
        admnmngLayout.setHorizontalGroup(
            admnmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reqmangdoct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btndoctprof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        admnmngLayout.setVerticalGroup(
            admnmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admnmngLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(btndoctprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(reqmangdoct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(admnmng);

        userProcessContainer.setBackground(new java.awt.Color(3, 15, 43));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane4.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane4);
    }// </editor-fold>//GEN-END:initComponents

    private void reqmangdoctMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reqmangdoctMousePressed
        // TODO add your handling code here:
        setColor(reqmangdoct);
        resetColor(new JPanel[]{btndoctprof});
        DoctorManageRequestsJPanel jpanel = new DoctorManageRequestsJPanel(userProcessContainer,userAccount,docOrganization , system,  enterprise);
        userProcessContainer.add("ManageRequestsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reqmangdoctMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        // TODO add your handling code here:
       this.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutMousePressed

    private void btndoctprofMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndoctprofMousePressed
        // TODO add your handling code here:
        setColor(btndoctprof);
        resetColor(new JPanel[]{reqmangdoct});
        ManageDoctorDetailsJPanel jpanel = new ManageDoctorDetailsJPanel(userAccount,system,docOrganization,enterprise);
        userProcessContainer.add("ManageDoctorDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btndoctprofMousePressed

 private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(50, 62, 168));
    }
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } 
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admnmng;
    private javax.swing.JPanel btndoctprof;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JLabel lblprof;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel reqmangdoct;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}