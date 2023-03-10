package familymanagersystem.forms;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
/**
 * <strong>Manager</strong>
 * is Family Manager Software<br> built with Java oriented by
 * <strong>Tchingunji</strong> <br>
 * for our school project.<br>
 * This is an open source, so you can <br>
 * use it for studyies or for teaching purposes<br>
 * as like you <strong>mention the GitHub Repository</strong><br>
 * where the project is.<br>
 * @link https://github.com/DevDario/familyManagerSystem
 */
public class SystemDashBoard extends javax.swing.JFrame {
    
    static protected String familyToRegister;

    // variables for the screen
    int xMouse;
    int yMouse;

    /**
     * Creates new form SystemDashBoard
     */
    public SystemDashBoard() {
        initComponents();
        // opens the default home screen
        DashboardHomeScreen screen = new DashboardHomeScreen();
        showPanel(screen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jdashboardDarkBackground = new javax.swing.JPanel();
        jdashboardMenu = new javax.swing.JPanel();
        jhomeIcon = new javax.swing.JLabel();
        jhomeTitle = new javax.swing.JLabel();
        jaddFamilyIcon = new javax.swing.JLabel();
        jnewFamilyTitle = new javax.swing.JLabel();
        jcompanyIcon = new javax.swing.JLabel();
        jcompanyTitle = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DashBoard - Manage All Families");
        setBackground(new java.awt.Color(19, 19, 19));
        setLocation(new java.awt.Point(330, 90));
        setName("Dasboard"); // NOI18N
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdashboardDarkBackground.setBackground(new java.awt.Color(19, 19, 19));

        javax.swing.GroupLayout jdashboardDarkBackgroundLayout = new javax.swing.GroupLayout(jdashboardDarkBackground);
        jdashboardDarkBackground.setLayout(jdashboardDarkBackgroundLayout);
        jdashboardDarkBackgroundLayout.setHorizontalGroup(
            jdashboardDarkBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jdashboardDarkBackgroundLayout.setVerticalGroup(
            jdashboardDarkBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jdashboardDarkBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 800, 500));

        jdashboardMenu.setBackground(new java.awt.Color(37, 37, 37));

        jhomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_icon.png"))); // NOI18N
        jhomeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jhomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jhomeIconMouseClicked(evt);
            }
        });

        jhomeTitle.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jhomeTitle.setForeground(new java.awt.Color(255, 255, 255));
        jhomeTitle.setText("home");

        jaddFamilyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_family_icon.png"))); // NOI18N
        jaddFamilyIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jaddFamilyIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaddFamilyIconMouseClicked(evt);
            }
        });

        jnewFamilyTitle.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jnewFamilyTitle.setForeground(new java.awt.Color(255, 255, 255));
        jnewFamilyTitle.setText(" new");

        jcompanyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/company.png"))); // NOI18N
        jcompanyIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jcompanyTitle.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jcompanyTitle.setForeground(new java.awt.Color(255, 255, 255));
        jcompanyTitle.setText(" new");

        javax.swing.GroupLayout jdashboardMenuLayout = new javax.swing.GroupLayout(jdashboardMenu);
        jdashboardMenu.setLayout(jdashboardMenuLayout);
        jdashboardMenuLayout.setHorizontalGroup(
            jdashboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdashboardMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jdashboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnewFamilyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcompanyTitle)
                    .addComponent(jhomeTitle)
                    .addGroup(jdashboardMenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jdashboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jaddFamilyIcon)
                            .addComponent(jcompanyIcon)
                            .addComponent(jhomeIcon))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jdashboardMenuLayout.setVerticalGroup(
            jdashboardMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdashboardMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jhomeIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jhomeTitle)
                .addGap(38, 38, 38)
                .addComponent(jaddFamilyIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jnewFamilyTitle)
                .addGap(35, 35, 35)
                .addComponent(jcompanyIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcompanyTitle)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        getContentPane().add(jdashboardMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // allows the user to moviment the form when dragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged
    
    private void showPanel(JPanel p) {
        p.setSize(766, 437);
        p.setLocation(0, 0);
        
        jdashboardDarkBackground.removeAll();
        jdashboardDarkBackground.add(p, BorderLayout.CENTER);
        jdashboardDarkBackground.revalidate();
        jdashboardDarkBackground.repaint();
    }
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // gets the X and Y from the Screen
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jaddFamilyIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaddFamilyIconMouseClicked
        // opens the family options panel
        DashboardFamilyOptionsScreen screen = new DashboardFamilyOptionsScreen();
        showPanel(screen);
    }//GEN-LAST:event_jaddFamilyIconMouseClicked

    private void jhomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jhomeIconMouseClicked
        // opens the default home screen
        DashboardHomeScreen screen = new DashboardHomeScreen();
        showPanel(screen);
    }//GEN-LAST:event_jhomeIconMouseClicked


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
            java.util.logging.Logger.getLogger(SystemDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jaddFamilyIcon;
    private javax.swing.JLabel jcompanyIcon;
    private javax.swing.JLabel jcompanyTitle;
    private javax.swing.JPanel jdashboardDarkBackground;
    private javax.swing.JPanel jdashboardMenu;
    private javax.swing.JLabel jhomeIcon;
    private javax.swing.JLabel jhomeTitle;
    private javax.swing.JLabel jnewFamilyTitle;
    // End of variables declaration//GEN-END:variables
}
