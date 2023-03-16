package familymanagersystem.forms;

import familymanagersystem.Mae;
import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.JPanel;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class RegistrationMainScreenMotherRegistration extends javax.swing.JPanel {

    public RegistrationMainScreenMotherRegistration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMotherNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBornDateField = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jformHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jback = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(450, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBackground.setBackground(new java.awt.Color(19, 19, 19));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 86, 219));
        jLabel1.setText("Name");

        jMotherNameField.setBackground(new java.awt.Color(22, 22, 22));
        jMotherNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jMotherNameField.setForeground(new java.awt.Color(255, 255, 255));
        jMotherNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jMotherNameField.setToolTipText("Introduce the name");
        jMotherNameField.setAutoscrolls(false);
        jMotherNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));
        jMotherNameField.setCaretColor(new java.awt.Color(102, 102, 102));
        jMotherNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jMotherNameField.setMargin(new java.awt.Insets(2, 5, 2, 2));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 86, 219));
        jLabel2.setText("Born Date");

        jBornDateField.setBackground(new java.awt.Color(22, 22, 22));
        jBornDateField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));
        jBornDateField.setForeground(new java.awt.Color(255, 255, 255));
        jBornDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jBornDateField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jBornDateField.setToolTipText("Introduce the born date");
        jBornDateField.setAutoscrolls(false);
        jBornDateField.setCaretColor(new java.awt.Color(102, 102, 102));
        jBornDateField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jBornDateField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBornDateField.setMargin(new java.awt.Insets(2, 4, 2, 2));

        jButton1.setBackground(new java.awt.Color(42, 42, 42));
        jButton1.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Complete Registration");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jformHeader.setBackground(new java.awt.Color(22, 22, 22));
        jformHeader.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(110, 86, 219)));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mother Registration");

        jback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go_back_icon.png"))); // NOI18N
        jback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jformHeaderLayout = new javax.swing.GroupLayout(jformHeader);
        jformHeader.setLayout(jformHeaderLayout);
        jformHeaderLayout.setHorizontalGroup(
            jformHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jformHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jback)
                .addGap(124, 124, 124)
                .addComponent(jLabel3)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jformHeaderLayout.setVerticalGroup(
            jformHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jformHeaderLayout.createSequentialGroup()
                .addGroup(jformHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jformHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jback))
                    .addGroup(jformHeaderLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jBackgroundLayout = new javax.swing.GroupLayout(jBackground);
        jBackground.setLayout(jBackgroundLayout);
        jBackgroundLayout.setHorizontalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMotherNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBornDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jformHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addComponent(jformHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jMotherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBornDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        add(jBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Registrates a new Mother to the Family
        String motherName = jMotherNameField.getText();
        String bornDate = jBornDateField.getText();

        //tests if both field are empty
        if (motherName.isBlank() && bornDate.isBlank()) {
            JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
        } else {
            //tests if a field is empty
            if (motherName.isBlank() || bornDate.isBlank()) {
                JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
            } else {
                //holds all information related to the mother
                File motherInformation = new File(RegistrationMainScreenInfoFields.defaultFamilyFilePath + RegistrationMainScreenInfoFields.familyLastname + "\\" + "mother" + "\\about.txt");

                //main directory for all the files related to registrated son
                File info = new File(RegistrationMainScreenInfoFields.defaultFamilyFilePath + RegistrationMainScreenInfoFields.familyLastname + "\\" + "mother");

                //checks if the family already has a mother
                if (motherInformation.exists()) {
                    //shows an error message
                    JOptionPane.showMessageDialog(null, "<html>This Family Already Has Mother</html>", "Registration Failed", 1);
                    //clears all the form fields
                    jMotherNameField.setText("");
                    jBornDateField.setText("");

                } else {

                    //creates the main directory
                    info.mkdir();

                    //creates the file inside the given family folder
                    try {
                        if (motherInformation.createNewFile()) {

                            //setts all values to the mother class
                            try ( //creates a writer for the file
                                     FileWriter motherInformationFileWriter = new FileWriter(motherInformation)) {
                                //setts all values to the mother class
                                Mae.setBornDate(bornDate);
                                Mae.setGender("Female");
                                Mae.setName(motherName);
                                //writes all info in the file
                                motherInformationFileWriter.write("Name:" + Mae.getName() + "\n");
                                motherInformationFileWriter.write("Gender:" + Mae.getGender() + "\n");
                                motherInformationFileWriter.write("Born Date:" + Mae.getBornDate() + "\n");
                                //closes the writer object
                            }

                            //shows a success message
                            JOptionPane.showMessageDialog(null, "<html>The mother Was Successfully Registered !</html>", "Registration Complete", 2);
                            //clears all the form fields
                            jMotherNameField.setText("");
                            jBornDateField.setText("");
                        }
                    } catch (IOException e) {
                        //shows an error message
                        JOptionPane.showMessageDialog(null, "<html>There's been a error while <br> <strong>trying to save the info</strong> about<br>the mother</html>", "Registration Failed", 1);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showPanel(JPanel p) {
        p.setSize(450, 550);
        p.setLocation(0, 0);

        jBackground.removeAll();
        jBackground.add(p, BorderLayout.CENTER);
        jBackground.revalidate();
        jBackground.repaint();

    }

    private void jbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbackMouseClicked
        // returns to the option screen
        RegistrationMainScreenOptionsScreen OptionsScreen = new RegistrationMainScreenOptionsScreen();
        showPanel(OptionsScreen);
    }//GEN-LAST:event_jbackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBackground;
    private javax.swing.JFormattedTextField jBornDateField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jMotherNameField;
    private javax.swing.JLabel jback;
    private javax.swing.JPanel jformHeader;
    // End of variables declaration//GEN-END:variables
}
