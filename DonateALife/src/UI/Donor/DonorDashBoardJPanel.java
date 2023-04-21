/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Donor;

import UI.Receiver.ManageRequestReceiverJPanel;
import UI.Coordinator.*;
import UI.Admin.*;
import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.User.User;
import MainPages.LoginPage;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import org.jdesktop.swingx.JXFrame;

/**
 *
 * @author Arun Balasubramanian
 */
public class DonorDashBoardJPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserDashBoardJPanel
     */

   private DB4OUtil dB4OUtil;
    private EcoSystem system;
    private User user;
    public DonorDashBoardJPanel(DB4OUtil dB4OUtil,EcoSystem system,User user) {
        initComponents();
       this.dB4OUtil = dB4OUtil;
        this.system = system;
        this.user =user;
         setColor(dnrprofmng);
        resetColor(new JPanel[]{reqmng});
        ManageDonorDetailsJPanel jpanel = new ManageDonorDetailsJPanel(user,system);
        userProcessContainer.add("ManageDonorDetailsJPanel",jpanel);
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

        jPanel1 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        admmang = new javax.swing.JPanel();
        dnrprofmng = new javax.swing.JPanel();
        prflabel = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        reqmng = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        bgimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 9, 21));
        setLayout(new java.awt.GridLayout(1, 1));

        jPanel1.setMaximumSize(null);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane4.setDividerSize(0);
        jSplitPane4.setMaximumSize(null);

        admmang.setBackground(new java.awt.Color(0, 9, 21));
        admmang.setPreferredSize(new java.awt.Dimension(200, 798));

        dnrprofmng.setBackground(new java.awt.Color(0, 9, 21));
        dnrprofmng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dnrprofmngMousePressed(evt);
            }
        });

        prflabel.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        prflabel.setForeground(new java.awt.Color(255, 255, 255));
        prflabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prflabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account x 32.png"))); // NOI18N
        prflabel.setText("  Profile");

        javax.swing.GroupLayout dnrprofmngLayout = new javax.swing.GroupLayout(dnrprofmng);
        dnrprofmng.setLayout(dnrprofmngLayout);
        dnrprofmngLayout.setHorizontalGroup(
            dnrprofmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prflabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dnrprofmngLayout.setVerticalGroup(
            dnrprofmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prflabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        back.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logoutx32.png"))); // NOI18N
        back.setText("Logout");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });

        reqmng.setBackground(new java.awt.Color(0, 9, 21));
        reqmng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reqmngMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request x 32.png"))); // NOI18N
        jLabel11.setText("  Request Queue");

        javax.swing.GroupLayout reqmngLayout = new javax.swing.GroupLayout(reqmng);
        reqmng.setLayout(reqmngLayout);
        reqmngLayout.setHorizontalGroup(
            reqmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqmngLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        reqmngLayout.setVerticalGroup(
            reqmngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqmngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout admmangLayout = new javax.swing.GroupLayout(admmang);
        admmang.setLayout(admmangLayout);
        admmangLayout.setHorizontalGroup(
            admmangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dnrprofmng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reqmng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        admmangLayout.setVerticalGroup(
            admmangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admmangLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(dnrprofmng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(reqmng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(admmang);

        userProcessContainer.setBackground(new java.awt.Color(0, 9, 21));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane4.setRightComponent(userProcessContainer);

        jPanel1.add(jSplitPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main.jpg"))); // NOI18N
        bgimg.setAlignmentY(0.0F);
        bgimg.setAutoscrolls(true);
        bgimg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgimg.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bgimg.setFocusable(false);
        bgimg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgimg.setIconTextGap(0);
        bgimg.setOpaque(true);
        bgimg.setRequestFocusEnabled(false);
        bgimg.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(bgimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void reqmngMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reqmngMousePressed
        // TODO add your handling code here:
        setColor(reqmng);
        resetColor(new JPanel[]{dnrprofmng});
        DonorRequestJPanel donorRequest = new DonorRequestJPanel(system,user);
        userProcessContainer.add("ManageDonorDetailsJPanel",donorRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reqmngMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        this.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_backMousePressed

    private void dnrprofmngMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dnrprofmngMousePressed
        // TODO add your handling code here:
        setColor(dnrprofmng);
        resetColor(new JPanel[]{reqmng});
        ManageDonorDetailsJPanel jpanel = new ManageDonorDetailsJPanel(user,system);
        userProcessContainer.add("ManageDonorDetailsJPanel",jpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_dnrprofmngMousePressed

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
    private javax.swing.JPanel admmang;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bgimg;
    private javax.swing.JPanel dnrprofmng;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JLabel prflabel;
    private javax.swing.JPanel reqmng;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}