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
        jLastnameField = new javax.swing.JTextField();
        jLastnameLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up | Sign in");
        setLocation(new java.awt.Point(380, 100));
        setName("Login or Registrate an account"); // NOI18N

        jBackground.setBackground(new java.awt.Color(19, 19, 19));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 86, 219));
        jLabel1.setText("Welcome Back !");

        jLastnameField.setBackground(new java.awt.Color(22, 22, 22));
        jLastnameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLastnameField.setForeground(new java.awt.Color(255, 255, 255));
        jLastnameField.setToolTipText("Please fill out this field");
        jLastnameField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));

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

        jButton1.setBackground(new java.awt.Color(42, 42, 42));
        jButton1.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Complete Registration");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField.setBackground(new java.awt.Color(22, 22, 22));
        jPasswordField.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));

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
                            .addComponent(jLastnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jPasswordLabel)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLastnameLabel)
                .addGap(6, 6, 6)
                .addComponent(jLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String lastname = jLastnameField.getText();
        String familyPassword = jPasswordField.getPassword().toString();

        //tests if both field are empty
        if (lastname.isBlank() && familyPassword.isBlank()) {
            JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
        } else {
            //tests if a field is empty
            if (lastname.isBlank() || familyPassword.isBlank()) {
                JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
            } else {
                //checks if there's a family with the given lastname
                File familyFolder = new File(defaultFamilyFilePath + lastname);

                if (familyFolder.exists()) {
                    //checks if there's a password file inside the directory
                    File familyPasswordFile = new File(defaultFamilyFilePath + lastname + "\\familyPassword.txt");

                    if (familyPasswordFile.exists()) {
                        //reads the content(password) inside the file
                        Scanner passwordReader = new Scanner(defaultFamilyFilePath + lastname + "\\familyPassword.txt");

                        while (passwordReader.hasNextLine()) {
                            String fileData = passwordReader.nextLine();
                            //compares data
                            if(fileData.equals(familyPassword)){
                                //enters the system
                                dispose();
                                new FamilyManager().setVisible(true);
                            }
                            
                        }//else
                        JOptionPane.showMessageDialog(null, "Data provided isn't correct", "Password or Lastname Wrong", 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "Family" + lastname + " it's irregular !", "Error: Irregular family found", 0);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Family" + lastname + " does not exists !", "Error 404: Family NOT found", 0);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jLastnameField;
    private javax.swing.JLabel jLastnameLabel;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel jPasswordLabel;
    // End of variables declaration//GEN-END:variables
}