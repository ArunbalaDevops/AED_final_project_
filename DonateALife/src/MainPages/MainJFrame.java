/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPages;

import org.jdesktop.swingx.JXFrame;

/**
 *
 * @author harish
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
       // this.setSize(1100, 650);
        this.setExtendedState(JXFrame.MAXIMIZED_BOTH);
        //this.bgimg.disable();
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Donorimage = new javax.swing.JLabel();
        Homelabel = new javax.swing.JLabel();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MNGO HOME");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel15);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout());

        Donorimage.setBackground(new java.awt.Color(102, 0, 102));
        Donorimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Donorimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donate-click.png"))); // NOI18N
        Donorimage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Donorimage.setMaximumSize(new java.awt.Dimension(200, 200));
        Donorimage.setMinimumSize(new java.awt.Dimension(200, 200));
        Donorimage.setPreferredSize(new java.awt.Dimension(200, 200));
        Donorimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DonorimageMousePressed(evt);
            }
        });
        jPanel3.add(Donorimage);

        jPanel1.add(jPanel3);

        Homelabel.setBackground(new java.awt.Color(255, 255, 255));
        Homelabel.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        Homelabel.setForeground(new java.awt.Color(255, 255, 255));
        Homelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Homelabel.setText("Exit");
        Homelabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomelabelMouseClicked(evt);
            }
        });
        jPanel1.add(Homelabel);
        Homelabel.getAccessibleContext().setAccessibleDescription("");

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main.jpg"))); // NOI18N
        bgimg.setLabelFor(bgimg);
        bgimg.setAlignmentY(0.0F);
        bgimg.setAutoscrolls(true);
        bgimg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgimg.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bgimg.setFocusable(false);
        bgimg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bgimg.setIconTextGap(0);
        bgimg.setMaximumSize(null);
        bgimg.setMinimumSize(null);
        bgimg.setPreferredSize(null);
        bgimg.setRequestFocusEnabled(false);
        bgimg.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2653, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bgimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1192, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bgimg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);

        getAccessibleContext().setAccessibleParent(bgimg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DonorimageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonorimageMousePressed
        // TODO add your handling code here:
        new LoginPage().show();
    }//GEN-LAST:event_DonorimageMousePressed

    private void HomelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomelabelMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_HomelabelMouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Donorimage;
    private javax.swing.JLabel Homelabel;
    private javax.swing.JLabel bgimg;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}