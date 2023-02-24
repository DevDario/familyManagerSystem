package familymanagersystem.forms;

import familymanagersystem.Familia;
import familymanagersystem.Localizacao;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dário Silva
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

    //getting all fields values
    static protected String familyLastname;
    static protected String familyProvince;
    static protected String familyHood;
    static protected String familyCity;
    static protected String familyPhonenumber;
    static protected String defaultFamilyFilePath = "C:\\Users\\Da\\Documents\\NetBeansProjects\\familyManagerSystem\\src\\families\\";
    static protected ArrayList<String> familiesLastnames = new ArrayList<>();
    static protected long numberOfRegisteredFamilies;

    //variables used to move to screen
    int xMouse;
    int yMouse;

    /**
     * Creates new form SystemLoginScreen
     */
    public RegistrationMainScreen() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jYellowedBackground = new javax.swing.JPanel();
        jSystemLogo = new javax.swing.JLabel();
        jSystemBrand = new javax.swing.JLabel();
        jSystemPhrase = new javax.swing.JLabel();
        jDashboarLink = new javax.swing.JLabel();
        jExitSystemIcon = new javax.swing.JLabel();
        jExitSystemIcon1 = new javax.swing.JLabel();
        jGoBackToLogin = new javax.swing.JLabel();
        jExitSystem = new javax.swing.JLabel();
        jBlueBackground = new javax.swing.JPanel();
        jCloseBackground = new javax.swing.JPanel();
        jCloseIcon = new javax.swing.JLabel();
        jLastnameLabel = new javax.swing.JLabel();
        jLastnameField = new javax.swing.JTextField();
        jProvinceLabel = new javax.swing.JLabel();
        jProvinceField = new javax.swing.JTextField();
        jCityField = new javax.swing.JTextField();
        jCityLabel = new javax.swing.JLabel();
        jRegistratiobBtn = new javax.swing.JButton();
        jPhonenumberLabel = new javax.swing.JLabel();
        jPhonenumberField = new javax.swing.JTextField();
        jHoodLabel = new javax.swing.JLabel();
        jHoodField = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(330, 90));
        setName("Registration"); // NOI18N
        setUndecorated(true);
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

        jYellowedBackground.setBackground(new java.awt.Color(242, 239, 189));
        jYellowedBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSystemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/family_system.png"))); // NOI18N
        jYellowedBackground.add(jSystemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 167, -1, -1));

        jSystemBrand.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jSystemBrand.setForeground(new java.awt.Color(52, 61, 89));
        jSystemBrand.setText("Manager");
        jYellowedBackground.add(jSystemBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 37, -1, -1));

        jSystemPhrase.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        jSystemPhrase.setForeground(new java.awt.Color(52, 61, 89));
        jSystemPhrase.setText("Safely Manage a Family");
        jYellowedBackground.add(jSystemPhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 293, -1, -1));

        jDashboarLink.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jDashboarLink.setForeground(new java.awt.Color(52, 61, 89));
        jDashboarLink.setText("Go To Dashboard");
        jDashboarLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDashboarLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDashboarLinkMouseClicked(evt);
            }
        });
        jYellowedBackground.add(jDashboarLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 505, -1, -1));

        jExitSystemIcon.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jExitSystemIcon.setForeground(new java.awt.Color(52, 61, 89));
        jExitSystemIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_screen.png"))); // NOI18N
        jExitSystemIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jYellowedBackground.add(jExitSystemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 505, -1, -1));

        jExitSystemIcon1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jExitSystemIcon1.setForeground(new java.awt.Color(52, 61, 89));
        jExitSystemIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leave_door.png"))); // NOI18N
        jExitSystemIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jYellowedBackground.add(jExitSystemIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 474, -1, -1));

        jGoBackToLogin.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jGoBackToLogin.setForeground(new java.awt.Color(52, 61, 89));
        jGoBackToLogin.setText("Go Back To Login");
        jGoBackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jGoBackToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGoBackToLoginMouseClicked(evt);
            }
        });
        jYellowedBackground.add(jGoBackToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 505, -1, -1));

        jExitSystem.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jExitSystem.setForeground(new java.awt.Color(52, 61, 89));
        jExitSystem.setText("Leave System");
        jExitSystem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jExitSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitSystemMouseClicked(evt);
            }
        });
        jYellowedBackground.add(jExitSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 472, -1, -1));

        getContentPane().add(jYellowedBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 550));

        jBlueBackground.setBackground(new java.awt.Color(52, 61, 89));
        jBlueBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCloseBackground.setBackground(new java.awt.Color(90, 105, 154));
        jCloseBackground.setForeground(new java.awt.Color(90, 105, 154));

        jCloseIcon.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jCloseIcon.setForeground(new java.awt.Color(255, 255, 255));
        jCloseIcon.setText("  X");
        jCloseIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jCloseBackgroundLayout = new javax.swing.GroupLayout(jCloseBackground);
        jCloseBackground.setLayout(jCloseBackgroundLayout);
        jCloseBackgroundLayout.setHorizontalGroup(
            jCloseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCloseBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCloseIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        jCloseBackgroundLayout.setVerticalGroup(
            jCloseBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCloseBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCloseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBlueBackground.add(jCloseBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 0, 60, -1));

        jLastnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        jLastnameLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLastnameLabel.setLabelFor(jLastnameField);
        jLastnameLabel.setText("lastname");
        jLastnameLabel.setFocusable(false);
        jBlueBackground.add(jLastnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 40, -1, -1));

        jLastnameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLastnameField.setForeground(new java.awt.Color(51, 51, 51));
        jLastnameField.setToolTipText("Dado Obrigatório");
        jBlueBackground.add(jLastnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 63, 325, 50));

        jProvinceLabel.setBackground(new java.awt.Color(255, 255, 255));
        jProvinceLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jProvinceLabel.setForeground(new java.awt.Color(255, 255, 255));
        jProvinceLabel.setLabelFor(jProvinceField);
        jProvinceLabel.setText("Province");
        jProvinceLabel.setFocusable(false);
        jBlueBackground.add(jProvinceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 124, -1, -1));

        jProvinceField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jProvinceField.setForeground(new java.awt.Color(51, 51, 51));
        jProvinceField.setToolTipText("Dado Obrigatório");
        jBlueBackground.add(jProvinceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 147, 325, 51));

        jCityField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jCityField.setForeground(new java.awt.Color(51, 51, 51));
        jCityField.setToolTipText("Dado Obrigatório");
        jBlueBackground.add(jCityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 227, 325, 50));

        jCityLabel.setBackground(new java.awt.Color(255, 255, 255));
        jCityLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jCityLabel.setForeground(new java.awt.Color(255, 255, 255));
        jCityLabel.setLabelFor(jCityField);
        jCityLabel.setText("City");
        jCityLabel.setFocusable(false);
        jBlueBackground.add(jCityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 204, -1, -1));

        jRegistratiobBtn.setBackground(new java.awt.Color(242, 239, 189));
        jRegistratiobBtn.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jRegistratiobBtn.setForeground(new java.awt.Color(51, 51, 51));
        jRegistratiobBtn.setText("Complete Registration");
        jRegistratiobBtn.setToolTipText("press to register");
        jRegistratiobBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRegistratiobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistratiobBtnActionPerformed(evt);
            }
        });
        jBlueBackground.add(jRegistratiobBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 462, 325, 51));

        jPhonenumberLabel.setBackground(new java.awt.Color(255, 255, 255));
        jPhonenumberLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jPhonenumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPhonenumberLabel.setLabelFor(jPhonenumberField);
        jPhonenumberLabel.setText("Phone Number");
        jPhonenumberLabel.setFocusable(false);
        jBlueBackground.add(jPhonenumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 363, -1, -1));

        jPhonenumberField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPhonenumberField.setForeground(new java.awt.Color(51, 51, 51));
        jPhonenumberField.setToolTipText("Dado Obrigatório");
        jPhonenumberField.setDragEnabled(true);
        jBlueBackground.add(jPhonenumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 391, 325, 50));

        jHoodLabel.setBackground(new java.awt.Color(255, 255, 255));
        jHoodLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jHoodLabel.setForeground(new java.awt.Color(255, 255, 255));
        jHoodLabel.setLabelFor(jHoodField);
        jHoodLabel.setText("Hood");
        jHoodLabel.setFocusable(false);
        jBlueBackground.add(jHoodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 283, -1, -1));

        jHoodField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jHoodField.setForeground(new java.awt.Color(51, 51, 51));
        jHoodField.setToolTipText("Dado Obrigatório");
        jHoodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoodFieldActionPerformed(evt);
            }
        });
        jBlueBackground.add(jHoodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 306, 325, 51));

        getContentPane().add(jBlueBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 450, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHoodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHoodFieldActionPerformed

    private void jCloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseIconMouseClicked
        // closing the window
        System.exit(0);
    }//GEN-LAST:event_jCloseIconMouseClicked

    private void jRegistratiobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistratiobBtnActionPerformed

        //attribuing the form fields values to my attributes
        RegistrationMainScreen.familyLastname = jLastnameField.getText();
        RegistrationMainScreen.familyProvince = jProvinceField.getText();
        RegistrationMainScreen.familyCity = jCityField.getText();
        RegistrationMainScreen.familyHood = jHoodField.getText();
        RegistrationMainScreen.familyLastname = jLastnameField.getText();
        RegistrationMainScreen.familyPhonenumber = jPhonenumberField.getText();

        //folder that will contain all files related to the family
        File familyFolder = new File(defaultFamilyFilePath + familyLastname);

        //file that will contain all information related to registered family
        File familyInformationFile = new File(defaultFamilyFilePath + familyLastname + "\\Family_Information.txt");

        //checks if all fields are empty
        if (familyLastname.isBlank() && familyProvince.isBlank() && familyHood.isBlank() && familyCity.isBlank() && familyPhonenumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html>You Need To Fill All The Fields</html>", "Please, Fill Out All Fields", 0);
        } else {
            //checks if a field is empty
            if (familyLastname.isBlank() || familyProvince.isBlank() || familyHood.isBlank() || familyCity.isBlank() || familyPhonenumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
            } else {

                //checks uf in the phonenumber attribute has values from 0 to 9
                Pattern pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(familyPhonenumber);

                //checks if the phone number has 9 digits
                if (familyPhonenumber.length() == 9 && matcher.find()) {
                    //family registration process
                    /**
                     * creating a folder with the family lastname in the
                     * {@code src/} directory
                     */
                    familyFolder.mkdir();
                    //cheks if the folder was created
                    if (familyFolder.exists()) {
                        /**
                         * creates a file containing all info about the family,
                         * using the information given by the user
                         */

                        try {
                            familyInformationFile.createNewFile();

                            //checks if the file exists or if it was created
                            if (familyInformationFile.exists()) {

                                //writtes the given data, by the user, to the file
                                try (
                                        /**
                                         * creates a FileWriter Object that
                                         * allows us to write an information
                                         * inside the created file
                                         */
                                         FileWriter familyInformationFileWriter = new FileWriter(familyInformationFile)) {

                                    //setts all values to the 'Familia' class attributes
                                    Familia.setFamilyLastname(familyLastname);
                                    Localizacao.setCity(familyCity);
                                    Localizacao.setHood(familyHood);
                                    Familia.setPhoneNumber(Integer.parseInt(familyPhonenumber));
                                    Localizacao.setProvince(familyProvince);
                                    Familia.setFamilyId((int) numberOfRegisteredFamilies);

                                    //writtes the given data, by the user, to the file
                                    familyInformationFileWriter.write("ID:" + Familia.getFamilyId() + "\n");
                                    familyInformationFileWriter.write("Lastname:" + Familia.getFamilyLastname() + "\n");
                                    familyInformationFileWriter.write("Province:" + Localizacao.getProvince() + "\n");
                                    familyInformationFileWriter.write("City:" + Localizacao.getCity() + "\n");
                                    familyInformationFileWriter.write("Neighborhood:" + Localizacao.getHood() + "\n");
                                    familyInformationFileWriter.write("Contact:" + Familia.getPhoneNumber());

                                    //closes the FileWriter Object
                                    familyInformationFileWriter.close();

                                    //success message
                                    JOptionPane.showMessageDialog(null, "The Family " + Familia.getFamilyLastname() + " was successfully registered", "Family Registered", 1);

                                    //clears all fields
                                    jLastnameField.setText("");
                                    jProvinceField.setText("");
                                    jCityField.setText("");
                                    jHoodField.setText("");
                                    jPhonenumberField.setText("");

                                    //adds the family lastname to the lastname's array
                                    familiesLastnames.add(familyLastname);

                                    /**
                                     * stores the size of the lastname's array.
                                     * This value will be used in the Dashboard
                                     * Screen as the number of registered
                                     * families
                                     */
                                    numberOfRegisteredFamilies = familiesLastnames.size();

                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Couldn't find " + familyLastname + " Information File", "Error 404: File Not Found", 0);
                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "<html>An error occurred while trying to <br> this family information file</html>", "Error while storing informations", 0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn't find " + familyLastname + " folder", "Error 404: Folder Not Found", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "<html>Introduce 9 numerical digits for the Phone Number</html>", "Error while storing the Phone Number", 2);
                }

            }
        }
    }//GEN-LAST:event_jRegistratiobBtnActionPerformed

    private void jDashboarLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDashboarLinkMouseClicked
        // closes the current window
        dispose();
        // set visible the SystemDashBoard window
        new SystemDashBoard().setVisible(true);
    }//GEN-LAST:event_jDashboarLinkMouseClicked

    private void jGoBackToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGoBackToLoginMouseClicked
        // closes the current window

        // set visible the system login screen
        //I need to create it !
    }//GEN-LAST:event_jGoBackToLoginMouseClicked

    private void jExitSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitSystemMouseClicked
        // exits the system
        System.exit(0);
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
    private javax.swing.JPanel jBlueBackground;
    private javax.swing.JTextField jCityField;
    private javax.swing.JLabel jCityLabel;
    private javax.swing.JPanel jCloseBackground;
    private javax.swing.JLabel jCloseIcon;
    private javax.swing.JLabel jDashboarLink;
    private javax.swing.JLabel jExitSystem;
    private javax.swing.JLabel jExitSystemIcon;
    private javax.swing.JLabel jExitSystemIcon1;
    private javax.swing.JLabel jGoBackToLogin;
    private javax.swing.JTextField jHoodField;
    private javax.swing.JLabel jHoodLabel;
    private javax.swing.JTextField jLastnameField;
    private javax.swing.JLabel jLastnameLabel;
    private javax.swing.JTextField jPhonenumberField;
    private javax.swing.JLabel jPhonenumberLabel;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jProvinceField;
    private javax.swing.JLabel jProvinceLabel;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jRegistratiobBtn;
    private javax.swing.JLabel jSystemBrand;
    private javax.swing.JLabel jSystemLogo;
    private javax.swing.JLabel jSystemPhrase;
    private javax.swing.JPanel jYellowedBackground;
    // End of variables declaration//GEN-END:variables
}
