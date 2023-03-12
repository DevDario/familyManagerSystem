package familymanagersystem.forms;

import static familymanagersystem.forms.RegistrationMainScreenInfoFields.defaultFamilyFilePath;
import static familymanagersystem.forms.RegistrationMainScreenInfoFields.familyLastname;
import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JOptionPane;
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
 * for my school project.<br>
 * This is an open source, so you can <br>
 * use it for studyies or for teaching purposes<br>
 * as like you <strong>mention the GitHub Repository</strong><br>
 * where the project is.<br>
 * @link https://github.com/DevDario/Manager
 */
public class RegistrationMainScreen extends javax.swing.JFrame {

    //variables used to move to screen
    int xMouse;
    int yMouse;

    /**
     * Creates new form SystemLoginScreen
     */
    public RegistrationMainScreen() {
        initComponents();
        try {
            // opens the default home screen
            RegistrationMainScreenInfoFields InfoFieldsScreen = new RegistrationMainScreenInfoFields();
            showPanel(InfoFieldsScreen);
        } catch (Exception e) {

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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jregistrationMainScreenDarkBackground = new javax.swing.JPanel();
        jYellowedBackground = new javax.swing.JPanel();
        jSystemLogo = new javax.swing.JLabel();
        jSystemBrand = new javax.swing.JLabel();
        jSystemPhrase = new javax.swing.JLabel();
        jExitSystemIcon = new javax.swing.JLabel();
        jExitSystemIcon1 = new javax.swing.JLabel();
        jGoBackToLogin = new javax.swing.JLabel();
        jExitSystem = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration | Set up a new Family");
        setLocation(new java.awt.Point(330, 90));
        setName("Registration"); // NOI18N
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jregistrationMainScreenDarkBackground.setBackground(new java.awt.Color(19, 19, 19));
        jregistrationMainScreenDarkBackground.setFocusCycleRoot(true);

        javax.swing.GroupLayout jregistrationMainScreenDarkBackgroundLayout = new javax.swing.GroupLayout(jregistrationMainScreenDarkBackground);
        jregistrationMainScreenDarkBackground.setLayout(jregistrationMainScreenDarkBackgroundLayout);
        jregistrationMainScreenDarkBackgroundLayout.setHorizontalGroup(
            jregistrationMainScreenDarkBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jregistrationMainScreenDarkBackgroundLayout.setVerticalGroup(
            jregistrationMainScreenDarkBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(jregistrationMainScreenDarkBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 450, 550));

        jYellowedBackground.setBackground(new java.awt.Color(34, 34, 34));
        jYellowedBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSystemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system_logo.png"))); // NOI18N
        jYellowedBackground.add(jSystemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 167, -1, -1));

        jSystemBrand.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jSystemBrand.setForeground(new java.awt.Color(110, 86, 219));
        jSystemBrand.setText("E-Manager");
        jYellowedBackground.add(jSystemBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jSystemPhrase.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jSystemPhrase.setForeground(new java.awt.Color(110, 86, 219));
        jSystemPhrase.setText("Safely Manage a Family");
        jYellowedBackground.add(jSystemPhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jExitSystemIcon.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jExitSystemIcon.setForeground(new java.awt.Color(52, 61, 89));
        jExitSystemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go_back_icon.png"))); // NOI18N
        jExitSystemIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jYellowedBackground.add(jExitSystemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 505, -1, -1));

        jExitSystemIcon1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jExitSystemIcon1.setForeground(new java.awt.Color(52, 61, 89));
        jExitSystemIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit_icon.png"))); // NOI18N
        jExitSystemIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jYellowedBackground.add(jExitSystemIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 474, -1, -1));

        jGoBackToLogin.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jGoBackToLogin.setForeground(new java.awt.Color(110, 86, 219));
        jGoBackToLogin.setText("Home Screen");
        jGoBackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jGoBackToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGoBackToLoginMouseClicked(evt);
            }
        });
        jYellowedBackground.add(jGoBackToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 505, -1, -1));

        jExitSystem.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jExitSystem.setForeground(new java.awt.Color(110, 86, 219));
        jExitSystem.setText("Leave System");
        jExitSystem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jExitSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitSystemMouseClicked(evt);
            }
        });
        jYellowedBackground.add(jExitSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 472, -1, -1));

        getContentPane().add(jYellowedBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(JPanel p) {
        p.setSize(450, 550);
        p.setLocation(0, 0);

        jregistrationMainScreenDarkBackground.removeAll();
        jregistrationMainScreenDarkBackground.add(p, BorderLayout.CENTER);
        jregistrationMainScreenDarkBackground.revalidate();
        jregistrationMainScreenDarkBackground.repaint();
    }

    private void jGoBackToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGoBackToLoginMouseClicked
        // closes the current window
        dispose();
        //closes the system dashboard form, if is open
        new SystemDashBoard().dispose();
        // set visible the system user home screen
        new FamilyManager().setVisible(true);
    }//GEN-LAST:event_jGoBackToLoginMouseClicked

    private void jExitSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitSystemMouseClicked
        // exits the system
        dispose();
    }//GEN-LAST:event_jExitSystemMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // allows the user to moviment the form when dragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // gets the X and Y from the Screen
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        //folder that will contain all files related to the family
        File familyFolder = new File(defaultFamilyFilePath + familyLastname);

        //main directory to save all info files related to the family
        File info = new File(defaultFamilyFilePath + familyLastname + "\\info");

        //file that will contain all information related to registered family
        File familyInformationFile = new File(defaultFamilyFilePath + familyLastname + "\\info" + "\\about.txt");

        //creates a file to hold the password
        File familyPasswordFile = new File(defaultFamilyFilePath + familyLastname + "\\info" + "\\familyPassword.txt");

        //checks if the above file exists
        if (familyFolder.exists()) {

            JOptionPane.showMessageDialog(null, "<html>Canceling Registration Process...</html>", "Registration Canceled", 1);

            //deleting all folders and files
            familyPasswordFile.delete();
            familyInformationFile.delete();
            info.delete();
            familyFolder.delete();

        }

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(RegistrationMainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationMainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationMainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationMainScreen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationMainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jExitSystem;
    private javax.swing.JLabel jExitSystemIcon;
    private javax.swing.JLabel jExitSystemIcon1;
    private javax.swing.JLabel jGoBackToLogin;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel jSystemBrand;
    private javax.swing.JLabel jSystemLogo;
    private javax.swing.JLabel jSystemPhrase;
    private javax.swing.JPanel jYellowedBackground;
    private javax.swing.JPanel jregistrationMainScreenDarkBackground;
    // End of variables declaration//GEN-END:variables
}
