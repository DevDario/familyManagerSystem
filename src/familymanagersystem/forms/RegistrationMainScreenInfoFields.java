package familymanagersystem.forms;

import java.io.File;
import familymanagersystem.Familia;
import familymanagersystem.Localizacao;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class RegistrationMainScreenInfoFields extends javax.swing.JPanel {

    //getting all fields values
    static protected String familyLastname;
    static protected String familyProvince;
    static protected String familyHood;
    static protected String familyCity;
    static protected String familyPhonenumber;
    static protected String defaultFamilyFilePath = "C:\\Users\\Da\\Documents\\NetBeansProjects\\familyManagerSystem\\src\\families\\";
    static protected HashMap<Integer, String> families = new HashMap<>();
    //family password attribute/variable
    static protected String familyPassword;

    /**
     * Creates new form RegistrationMainScreenInfoFields
     */
    public RegistrationMainScreenInfoFields() {
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

        jInfoFieldsScreenBackground = new javax.swing.JPanel();
        jCloseBackground = new javax.swing.JPanel();
        jCloseIcon = new javax.swing.JLabel();
        jLastnameLabel = new javax.swing.JLabel();
        jLastnameField = new javax.swing.JTextField();
        jProvinceLabel = new javax.swing.JLabel();
        jProvinceField = new javax.swing.JTextField();
        jCityLabel = new javax.swing.JLabel();
        jCityField = new javax.swing.JTextField();
        jHoodLabel = new javax.swing.JLabel();
        jHoodField = new javax.swing.JTextField();
        jPhonenumberLabel = new javax.swing.JLabel();
        jPhonenumberField = new javax.swing.JTextField();
        jRegistratiobBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(19, 19, 19));
        setPreferredSize(new java.awt.Dimension(450, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInfoFieldsScreenBackground.setBackground(new java.awt.Color(19, 19, 19));

        jCloseBackground.setBackground(new java.awt.Color(36, 36, 36));
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

        jLastnameLabel.setBackground(new java.awt.Color(255, 255, 255));
        jLastnameLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLastnameLabel.setText("lastname");
        jLastnameLabel.setFocusable(false);

        jLastnameField.setBackground(new java.awt.Color(22, 22, 22));
        jLastnameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLastnameField.setForeground(new java.awt.Color(255, 255, 255));
        jLastnameField.setToolTipText("Please fill out this field");
        jLastnameField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));

        jProvinceLabel.setBackground(new java.awt.Color(255, 255, 255));
        jProvinceLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jProvinceLabel.setForeground(new java.awt.Color(255, 255, 255));
        jProvinceLabel.setText("Province");
        jProvinceLabel.setFocusable(false);

        jProvinceField.setBackground(new java.awt.Color(22, 22, 22));
        jProvinceField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jProvinceField.setForeground(new java.awt.Color(255, 255, 255));
        jProvinceField.setToolTipText("Please fill out this field");
        jProvinceField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));

        jCityLabel.setBackground(new java.awt.Color(255, 255, 255));
        jCityLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jCityLabel.setForeground(new java.awt.Color(255, 255, 255));
        jCityLabel.setText("City");
        jCityLabel.setFocusable(false);

        jCityField.setBackground(new java.awt.Color(22, 22, 22));
        jCityField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jCityField.setForeground(new java.awt.Color(255, 255, 255));
        jCityField.setToolTipText("Please fill out this field");
        jCityField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));

        jHoodLabel.setBackground(new java.awt.Color(255, 255, 255));
        jHoodLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jHoodLabel.setForeground(new java.awt.Color(255, 255, 255));
        jHoodLabel.setText("Hood");
        jHoodLabel.setFocusable(false);

        jHoodField.setBackground(new java.awt.Color(22, 22, 22));
        jHoodField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jHoodField.setForeground(new java.awt.Color(255, 255, 255));
        jHoodField.setToolTipText("Please fill out this field");
        jHoodField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));
        jHoodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoodFieldActionPerformed(evt);
            }
        });

        jPhonenumberLabel.setBackground(new java.awt.Color(255, 255, 255));
        jPhonenumberLabel.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jPhonenumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPhonenumberLabel.setText("Phone Number");
        jPhonenumberLabel.setFocusable(false);

        jPhonenumberField.setBackground(new java.awt.Color(22, 22, 22));
        jPhonenumberField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jPhonenumberField.setForeground(new java.awt.Color(255, 255, 255));
        jPhonenumberField.setToolTipText("Please fill out this field");
        jPhonenumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));
        jPhonenumberField.setDragEnabled(true);

        jRegistratiobBtn.setBackground(new java.awt.Color(42, 42, 42));
        jRegistratiobBtn.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jRegistratiobBtn.setForeground(new java.awt.Color(255, 255, 255));
        jRegistratiobBtn.setText("Complete Registration");
        jRegistratiobBtn.setToolTipText("press to register");
        jRegistratiobBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRegistratiobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistratiobBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInfoFieldsScreenBackgroundLayout = new javax.swing.GroupLayout(jInfoFieldsScreenBackground);
        jInfoFieldsScreenBackground.setLayout(jInfoFieldsScreenBackgroundLayout);
        jInfoFieldsScreenBackgroundLayout.setHorizontalGroup(
            jInfoFieldsScreenBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInfoFieldsScreenBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCloseBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jInfoFieldsScreenBackgroundLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jInfoFieldsScreenBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLastnameLabel)
                    .addComponent(jLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProvinceLabel)
                    .addComponent(jProvinceField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCityLabel)
                    .addComponent(jCityField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHoodLabel)
                    .addComponent(jHoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPhonenumberLabel)
                    .addComponent(jPhonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRegistratiobBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jInfoFieldsScreenBackgroundLayout.setVerticalGroup(
            jInfoFieldsScreenBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInfoFieldsScreenBackgroundLayout.createSequentialGroup()
                .addComponent(jCloseBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLastnameLabel)
                .addGap(6, 6, 6)
                .addComponent(jLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jProvinceLabel)
                .addGap(6, 6, 6)
                .addComponent(jProvinceField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jCityLabel)
                .addGap(6, 6, 6)
                .addComponent(jCityField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jHoodLabel)
                .addGap(6, 6, 6)
                .addComponent(jHoodField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPhonenumberLabel)
                .addGap(11, 11, 11)
                .addComponent(jPhonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jRegistratiobBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        add(jInfoFieldsScreenBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseIconMouseClicked
        // closing the window
        System.exit(0);
    }//GEN-LAST:event_jCloseIconMouseClicked

    private void jHoodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHoodFieldActionPerformed

    private boolean setsFamilyPassword() throws IOException {

        familyPassword = JOptionPane.showInputDialog(null, "Introduce a password", "setting password", HEIGHT);

        if (familyPassword == null || familyPassword.equals(JOptionPane.CANCEL_OPTION)) {
            //go back to familyManager screen
            new RegistrationMainScreen().dispose();
            new RegistrationMainScreenInfoFields().setVisible(false);
            new FamilyManager().setVisible(true);

            return false;
        } else {

            if (familyPassword.length() != 0) {

                if (familyPassword.isBlank()) {
                    JOptionPane.showMessageDialog(null, "You've to set a valid password", "Error: invalid format", 0);
                    setsFamilyPassword();
                } else {
                    //creates a file that olds the password

                    File familyPasswordFile = new File(defaultFamilyFilePath + familyLastname + "\\familyPassword.txt");

                    familyPasswordFile.createNewFile();

                    //checks if the file were created
                    if (familyPasswordFile.exists()) {

                        //creates a writer object for the file
                        try {

                            //writes inside the created file
                            try ( FileWriter familyPasswordWriter = new FileWriter(defaultFamilyFilePath + familyLastname + "\\familyPassword.txt")) {
                                //writes inside the created file
                                familyPasswordWriter.write(familyPassword);
                                //closes the FileWriter object
                                familyPasswordWriter.close();
                                return true;
                            }

                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "<html>We couldn't be able to save<br> the family password.<br><strong>Try again !</strong></html>", "Error while saving the password", 3);
                            return false;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "You've to set a password", "Error: Empty Field", 0);
                setsFamilyPassword();

            }
        }
        return false;
    }

    private void showPanel(JPanel p) {
        p.setSize(450, 550);
        p.setLocation(0, 0);

        jInfoFieldsScreenBackground.removeAll();
        jInfoFieldsScreenBackground.add(p, BorderLayout.CENTER);
        jInfoFieldsScreenBackground.revalidate();
        jInfoFieldsScreenBackground.repaint();

    }

    /**
     * Sets the number of families registered in the system <br>
     * inside the {@code familiesNumber} file <br>
     */
    private void setsTheNumberOfFamilies() throws IOException {

        //file to store the number of registered families
        File familiesNumber = new File("C:\\Users\\Da\\Documents\\NetBeansProjects\\familyManagerSystem\\nbproject\\private\\privateinfo.txt");

        //checks if already exists
        if (familiesNumber.exists()) {
            //creates a writer for the file
            try {
                //writes the number of registered families inside the file
                try ( FileWriter writer = new FileWriter(familiesNumber)) {
                    //writes the number of registered families inside the file
                    writer.write(Integer.toString(families.size()));
                    //closes the writer object
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error while saving number of families", "Error while trying to save info", 1);
            }
        } else {
            //creates the file
            familiesNumber.createNewFile();
            //creates a writer for the file
            try {
                //writes the number of registered families inside the file
                try ( FileWriter writer = new FileWriter(familiesNumber)) {
                    //writes the number of registered families inside the file
                    writer.write(Integer.toString(families.size()));
                    //closes the writer object
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error while saving number of families", "Error while trying to save info", 1);
            }

        }
    }

    /**
     *
     * @return the number of families registered in the system
     * @throws IOException if the file that holds the information doesn't exits
     */
    static protected String getsTheNumberOfFamilies() throws IOException {
        //checks if the file that holds the number of families exists
        File familiesNumber = new File("C:\\Users\\Da\\Documents\\NetBeansProjects\\familyManagerSystem\\nbproject\\private\\privateinfo.txt");
        //holds the number of families
        String numberOfFamilies = "";

        if (familiesNumber.exists()) {
            //creates a reader for the file
            Scanner reader = new Scanner(familiesNumber);

            //reades the content inside the file and store's inside a variable
            while (reader.hasNextLine()) {
                numberOfFamilies = reader.nextLine();
            }

        }
        return numberOfFamilies;
    }

    private void jRegistratiobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistratiobBtnActionPerformed

        //attribuing the form fields values to my attributes
        RegistrationMainScreenInfoFields.familyLastname = jLastnameField.getText();
        RegistrationMainScreenInfoFields.familyProvince = jProvinceField.getText();
        RegistrationMainScreenInfoFields.familyCity = jCityField.getText();
        RegistrationMainScreenInfoFields.familyHood = jHoodField.getText();
        RegistrationMainScreenInfoFields.familyLastname = jLastnameField.getText();
        RegistrationMainScreenInfoFields.familyPhonenumber = jPhonenumberField.getText();

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
                    
                    try {
                        if(setsFamilyPassword()==true){
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
                                                 * * creates a FileWriter Object that
                                                 *
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
                                            Familia.setFamilyId((int) (Math.random() * Math.random() + Math.random()));
                                            
                                            //writtes the given data, by the user, to the file
                                            familyInformationFileWriter.write("ID:" + Familia.getFamilyId() + "\n");
                                            familyInformationFileWriter.write("Lastname:" + Familia.getFamilyLastname() + "\n");
                                            familyInformationFileWriter.write("Province:" + Localizacao.getProvince() + "\n");
                                            familyInformationFileWriter.write("City:" + Localizacao.getCity() + "\n");
                                            familyInformationFileWriter.write("Neighborhood:" + Localizacao.getHood() + "\n");
                                            familyInformationFileWriter.write("Contact:" + Familia.getPhoneNumber());
                                            
                                            //closes the FileWriter Object
                                            familyInformationFileWriter.close();
                                            
                                            //adds the family(lastname) to the hasMap
                                            families.put(families.size() + 1, familyLastname);
                                            
                                            //adds 1 more family
                                            setsTheNumberOfFamilies();
                                            
                                            //success message
                                            JOptionPane.showMessageDialog(null, "The Family " + Familia.getFamilyLastname() + " was successfully registered", "Family Registered", 1);
                                            
                                            //clears all fields
                                            jLastnameField.setText("");
                                            jProvinceField.setText("");
                                            jCityField.setText("");
                                            jHoodField.setText("");
                                            jPhonenumberField.setText("");
                                            
                                            // opens the family registration options screen
                                            RegistrationMainScreenOptionsScreen OptionsScreen = new RegistrationMainScreenOptionsScreen();
                                            showPanel(OptionsScreen);
                                            
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
                        }else{
                            JOptionPane.showMessageDialog(null, "There was an error with the password", "Error: password required", 0);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(RegistrationMainScreenInfoFields.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "<html>Introduce 9 numerical digits for the Phone Number</html>", "Error while storing the Phone Number", 2);
                }

            }
        }
    }//GEN-LAST:event_jRegistratiobBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCityField;
    private javax.swing.JLabel jCityLabel;
    private javax.swing.JPanel jCloseBackground;
    private javax.swing.JLabel jCloseIcon;
    private javax.swing.JTextField jHoodField;
    private javax.swing.JLabel jHoodLabel;
    private javax.swing.JPanel jInfoFieldsScreenBackground;
    private javax.swing.JTextField jLastnameField;
    private javax.swing.JLabel jLastnameLabel;
    private javax.swing.JTextField jPhonenumberField;
    private javax.swing.JLabel jPhonenumberLabel;
    private javax.swing.JTextField jProvinceField;
    private javax.swing.JLabel jProvinceLabel;
    private javax.swing.JButton jRegistratiobBtn;
    // End of variables declaration//GEN-END:variables
}
