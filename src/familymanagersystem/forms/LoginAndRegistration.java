package familymanagersystem.forms;

import static familymanagersystem.forms.RegistrationMainScreenInfoFields.defaultFamilyFilePath;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class LoginAndRegistration extends javax.swing.JFrame {
    
    private static String familyLastname;
    private static String familyPassword;

    /**
     * Creates new form LoginAndRegistration
     */
    public LoginAndRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JTextField();
        jLastnameLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jSigninButton = new javax.swing.JButton();
        jCreateFamilyButton = new javax.swing.JLabel();
        jLastnameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up | Sign in");
        setLocation(new java.awt.Point(380, 100));
        setName("Login or Registrate an account"); // NOI18N

        jBackground.setBackground(new java.awt.Color(19, 19, 19));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 86, 219));
        jLabel1.setText("Welcome Back !");

        jPasswordField.setBackground(new java.awt.Color(22, 22, 22));
        jPasswordField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField.setToolTipText("Please fill out this field");
        jPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));

        jLastnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        jLastnameLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLastnameLabel.setText("lastname");
        jLastnameLabel.setFocusable(false);

        jPasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordLabel.setText("Family Password");
        jPasswordLabel.setFocusable(false);

        jSigninButton.setBackground(new java.awt.Color(42, 42, 42));
        jSigninButton.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jSigninButton.setForeground(new java.awt.Color(255, 255, 255));
        jSigninButton.setText("Sign In");
        jSigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSigninButtonActionPerformed(evt);
            }
        });

        jCreateFamilyButton.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jCreateFamilyButton.setForeground(new java.awt.Color(255, 255, 255));
        jCreateFamilyButton.setText("create family");
        jCreateFamilyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCreateFamilyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateFamilyButtonMouseClicked(evt);
            }
        });

        jLastnameField.setBackground(new java.awt.Color(22, 22, 22));
        jLastnameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLastnameField.setForeground(new java.awt.Color(255, 255, 255));
        jLastnameField.setToolTipText("Please fill out this field");
        jLastnameField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));

        javax.swing.GroupLayout jBackgroundLayout = new javax.swing.GroupLayout(jBackground);
        jBackground.setLayout(jBackgroundLayout);
        jBackgroundLayout.setHorizontalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLastnameLabel)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jPasswordLabel)
                            .addComponent(jSigninButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLastnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)))
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jCreateFamilyButton)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLastnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jSigninButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jCreateFamilyButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //checks if the the account exists
    private void jSigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSigninButtonActionPerformed

        familyLastname = jLastnameField.getText().trim();
        familyPassword = jPasswordField.getText().trim();

        //tests if both field are empty
        if (familyLastname.isBlank() && familyPassword.isBlank()) {
            JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
        } else {
            //tests if a field is empty
            if (familyLastname.isBlank() || familyPassword.isBlank()) {
                JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
            } else {
                //test if the password has 8 digits
                if (familyPassword.length() == 8) {
                    //gets the family folder
                    File familyFolder = new File(defaultFamilyFilePath + familyLastname);

                    //test if the folder exists
                    if (familyFolder.exists()) {
                        //gets the familyPassword file inside the `info` directory
                        File familyPasswordFile = new File(defaultFamilyFilePath + familyLastname + "\\info" + "\\familyPassword.txt");

                        //reads inside the file
                        Scanner passwordReader = null;
                        try {
                            passwordReader = new Scanner(familyPasswordFile);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(LoginAndRegistration.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        while (passwordReader.hasNextLine()) {
                            String passwordFromFile = passwordReader.nextLine();

                            //tests if the `passwordFromFile` matches the given one from the user
                            if(passwordFromFile.equalsIgnoreCase(familyPassword)){
                                //enters the system
                                dispose();
                                new FamilyManager().setVisible(true);
                            }else{
                                //shows a error message
                                JOptionPane.showMessageDialog(null,"Your password is incorrect !","Wrong Password",0);
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "This Family Doesn't exists", "Family Not found", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "It's missing " + (8 - familyPassword.length()) + "digits", "Password must have 8 digits", 0);
                }
            }
        }
    }//GEN-LAST:event_jSigninButtonActionPerformed

    private void jCreateFamilyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateFamilyButtonMouseClicked
        //opens Registration Main Screen
        dispose();
        new RegistrationMainScreen().setVisible(true);
    }//GEN-LAST:event_jCreateFamilyButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginAndRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAndRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAndRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBackground;
    private javax.swing.JLabel jCreateFamilyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jLastnameField;
    private javax.swing.JLabel jLastnameLabel;
    private javax.swing.JTextField jPasswordField;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JButton jSigninButton;
    // End of variables declaration//GEN-END:variables
}
