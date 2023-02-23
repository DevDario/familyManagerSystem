package familymanagersystem.forms;

import familymanagersystem.Filhos;
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
public class RegistrationMainScreenDaughterRegistration extends javax.swing.JPanel {

    public RegistrationMainScreenDaughterRegistration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDaughterNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBornDateField = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jformHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jclose = new javax.swing.JLabel();
        jback = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(450, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBackground.setBackground(new java.awt.Color(19, 19, 19));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 86, 219));
        jLabel1.setText("Name");

        jDaughterNameField.setBackground(new java.awt.Color(22, 22, 22));
        jDaughterNameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jDaughterNameField.setForeground(new java.awt.Color(255, 255, 255));
        jDaughterNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jDaughterNameField.setToolTipText("Introduce the name");
        jDaughterNameField.setAutoscrolls(false);
        jDaughterNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));
        jDaughterNameField.setCaretColor(new java.awt.Color(102, 102, 102));
        jDaughterNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jDaughterNameField.setMargin(new java.awt.Insets(2, 5, 2, 2));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 86, 219));
        jLabel2.setText("Born Date");

        jBornDateField.setBackground(new java.awt.Color(22, 22, 22));
        jBornDateField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(37, 37, 37)));
        jBornDateField.setForeground(new java.awt.Color(255, 255, 255));
        jBornDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
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
        jLabel3.setText("Daughter Registration");

        jclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_icon.png"))); // NOI18N
        jclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcloseMouseClicked(evt);
            }
        });

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
                .addGap(117, 117, 117)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jclose)
                .addContainerGap())
        );
        jformHeaderLayout.setVerticalGroup(
            jformHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jformHeaderLayout.createSequentialGroup()
                .addGroup(jformHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jformHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jformHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jback)
                            .addComponent(jclose)))
                    .addGroup(jformHeaderLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)))
                .addContainerGap(31, Short.MAX_VALUE))
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
                    .addComponent(jDaughterNameField, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addComponent(jDaughterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // Registrates a new Daughter to the Family
        String DaughterName = jDaughterNameField.getText();
        String bornDate = jBornDateField.getText();

        //tests if both field are empty
        if (DaughterName.isBlank() && bornDate.isBlank()) {
            JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
        } else {
            //tests if a field is empty
            if (DaughterName.isBlank() || bornDate.isBlank()) {
                JOptionPane.showMessageDialog(null, "You Need To Fill All The Fields", "Please, Fill Out All Fields", 0);
            } else {
                //holds all information related to the daughter
                File sonInformation = new File(RegistrationMainScreenInfoFields.defaultFamilyFilePath + "\\" + RegistrationMainScreenInfoFields.familyLastname + "\\" + DaughterName);

                //checks if there's already a registered daughter with the same given name
                if (sonInformation.exists()) {
                    //shows an error message
                    JOptionPane.showMessageDialog(null, "<html>You already registered a </html>" + DaughterName, "Registration Failed", 1);
                    //clears all the form fields
                    jDaughterNameField.setText("");
                    jBornDateField.setText("");
                } else {

                    //creates the file inside the given family folder
                    try {
                        if (sonInformation.createNewFile()) {

                            //setts all values to the daughter(child) class
                            try ( //creates a writer for the file
                                    FileWriter daughterInformationFileWriter = new FileWriter(sonInformation)) {
                                //setts all values to the daughter class
                                Filhos.setBornDate(bornDate);
                                Filhos.setGender("Female");
                                Filhos.setName(DaughterName);
                                //writes all info in the file
                                daughterInformationFileWriter.write("Name:" + Filhos.getName() + "\n");
                                daughterInformationFileWriter.write("Gender:" + Filhos.getGender() + "\n");
                                daughterInformationFileWriter.write("Born Date:" + Filhos.getBornDate() + "\n");
                                //closes the writer object
                            }

                            //shows a success message
                            JOptionPane.showMessageDialog(null, DaughterName + " Was Successfully Registered !", "Registration Complete", 2);

                            //clears the input fields
                            jDaughterNameField.setText("");
                            jBornDateField.setText("");
                        }
                    } catch (IOException e) {
                        //shows an error message
                        JOptionPane.showMessageDialog(null, "<html>There's been a error while <br> <strong>trying to save the info</strong> about<br>the daughter</html>", "Registration Failed", 1);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        // closes the system
        System.exit(0);
    }//GEN-LAST:event_jcloseMouseClicked

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
    private javax.swing.JTextField jDaughterNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jback;
    private javax.swing.JLabel jclose;
    private javax.swing.JPanel jformHeader;
    // End of variables declaration//GEN-END:variables
}
