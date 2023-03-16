package familymanagersystem.forms;

import familymanagersystem.Familia;
import familymanagersystem.Localizacao;
import static familymanagersystem.forms.RegistrationMainScreenInfoFields.defaultFamilyFilePath;
import static familymanagersystem.forms.RegistrationMainScreenInfoFields.familyLastname;
import java.io.File;
import familymanagersystem.Pai;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dário Silva & Délcio Morais
 * @since 2023
 * @version 1.0
 */
public class FamilyManager extends javax.swing.JFrame {

    /**
     * Creates new form FamilyManager
     */
    //screen moviments attributes
    int yMouse;
    int xMouse;

    public FamilyManager() {
        initComponents();
        new SystemDashBoard().dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jBackground = new javax.swing.JPanel();
        jSystemLogo = new javax.swing.JLabel();
        jRegistratePanel = new javax.swing.JPanel();
        jfamilyIcon = new javax.swing.JLabel();
        jRegisterFamilyTitle = new javax.swing.JLabel();
        jRegistratePanel1 = new javax.swing.JPanel();
        jRegisterCompanyTitle1 = new javax.swing.JLabel();
        jCompanyIcon = new javax.swing.JLabel();
        jRegistratePanel2 = new javax.swing.JPanel();
        jAdminIcon = new javax.swing.JLabel();
        jAdminTitle = new javax.swing.JLabel();
        jEditDataPanel = new javax.swing.JPanel();
        jfamilyIcon1 = new javax.swing.JLabel();
        jRegisterFamilyTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home | Manage your Family");
        setBackground(new java.awt.Color(19, 19, 19));
        setLocation(new java.awt.Point(320, 90));
        setName("Home"); // NOI18N
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

        jBackground.setBackground(new java.awt.Color(19, 19, 19));

        jSystemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/system_logo.png"))); // NOI18N

        jRegistratePanel.setBackground(new java.awt.Color(45, 45, 45));
        jRegistratePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(110, 86, 219)));
        jRegistratePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRegistratePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegistratePanelMouseClicked(evt);
            }
        });

        jfamilyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/family_purple_icon.png"))); // NOI18N

        jRegisterFamilyTitle.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jRegisterFamilyTitle.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterFamilyTitle.setText("Register a Family");

        javax.swing.GroupLayout jRegistratePanelLayout = new javax.swing.GroupLayout(jRegistratePanel);
        jRegistratePanel.setLayout(jRegistratePanelLayout);
        jRegistratePanelLayout.setHorizontalGroup(
            jRegistratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRegistratePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jfamilyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jRegistratePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jRegisterFamilyTitle)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jRegistratePanelLayout.setVerticalGroup(
            jRegistratePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegistratePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jfamilyIcon)
                .addGap(18, 18, 18)
                .addComponent(jRegisterFamilyTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRegistratePanel1.setBackground(new java.awt.Color(45, 45, 45));
        jRegistratePanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(110, 86, 219)));
        jRegistratePanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRegisterCompanyTitle1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jRegisterCompanyTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterCompanyTitle1.setText("Register a Company");

        jCompanyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/company_purple_icon.png"))); // NOI18N

        javax.swing.GroupLayout jRegistratePanel1Layout = new javax.swing.GroupLayout(jRegistratePanel1);
        jRegistratePanel1.setLayout(jRegistratePanel1Layout);
        jRegistratePanel1Layout.setHorizontalGroup(
            jRegistratePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegistratePanel1Layout.createSequentialGroup()
                .addGroup(jRegistratePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRegistratePanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jRegisterCompanyTitle1))
                    .addGroup(jRegistratePanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jCompanyIcon)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jRegistratePanel1Layout.setVerticalGroup(
            jRegistratePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegistratePanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jCompanyIcon)
                .addGap(18, 18, 18)
                .addComponent(jRegisterCompanyTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRegistratePanel2.setBackground(new java.awt.Color(45, 45, 45));
        jRegistratePanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(110, 86, 219)));
        jRegistratePanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRegistratePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegistratePanel2MouseClicked(evt);
            }
        });

        jAdminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin_logo.png"))); // NOI18N

        jAdminTitle.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jAdminTitle.setForeground(new java.awt.Color(255, 255, 255));
        jAdminTitle.setText("Admin Area");

        javax.swing.GroupLayout jRegistratePanel2Layout = new javax.swing.GroupLayout(jRegistratePanel2);
        jRegistratePanel2.setLayout(jRegistratePanel2Layout);
        jRegistratePanel2Layout.setHorizontalGroup(
            jRegistratePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRegistratePanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jAdminTitle)
                .addGap(58, 58, 58))
            .addGroup(jRegistratePanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jAdminIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRegistratePanel2Layout.setVerticalGroup(
            jRegistratePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegistratePanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAdminIcon)
                .addGap(18, 18, 18)
                .addComponent(jAdminTitle)
                .addContainerGap())
        );

        jEditDataPanel.setBackground(new java.awt.Color(45, 45, 45));
        jEditDataPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(110, 86, 219)));
        jEditDataPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEditDataPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEditDataPanelMouseClicked(evt);
            }
        });

        jfamilyIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_family_icon.png"))); // NOI18N

        jRegisterFamilyTitle1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jRegisterFamilyTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterFamilyTitle1.setText("Edit Family Data");

        javax.swing.GroupLayout jEditDataPanelLayout = new javax.swing.GroupLayout(jEditDataPanel);
        jEditDataPanel.setLayout(jEditDataPanelLayout);
        jEditDataPanelLayout.setHorizontalGroup(
            jEditDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEditDataPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jfamilyIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jEditDataPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jRegisterFamilyTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jEditDataPanelLayout.setVerticalGroup(
            jEditDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditDataPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jfamilyIcon1)
                .addGap(18, 18, 18)
                .addComponent(jRegisterFamilyTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jBackgroundLayout = new javax.swing.GroupLayout(jBackground);
        jBackground.setLayout(jBackgroundLayout);
        jBackgroundLayout.setHorizontalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jEditDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRegistratePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jRegistratePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRegistratePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jSystemLogo)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSystemLogo)
                .addGap(46, 46, 46)
                .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addGroup(jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRegistratePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRegistratePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jBackgroundLayout.createSequentialGroup()
                        .addComponent(jRegistratePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEditDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );

        getContentPane().add(jBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

        getAccessibleContext().setAccessibleName("Home");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jRegistratePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegistratePanelMouseClicked
        //closes the current window
        dispose();

        //opens the registrationMainScreen form
        new RegistrationMainScreen().setVisible(true);
    }//GEN-LAST:event_jRegistratePanelMouseClicked

    private void jRegistratePanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegistratePanel2MouseClicked
        //closes the current window
        dispose();
        //opens the admin login form
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_jRegistratePanel2MouseClicked

    static void editFamilyLastname() throws IOException {
        //gets the family directory
        File familyFolder = new File(defaultFamilyFilePath + familyLastname);

        //gets the new last name
        String newFamilyLastname = JOptionPane.showInputDialog(null, "Inform the new lastname", "Renaming last name process", 1);

        //editing the last name
        File UpdatedfamilyFolder = new File(defaultFamilyFilePath + newFamilyLastname);

        //renaming the folder
        familyFolder.renameTo(UpdatedfamilyFolder);

        //gets the familyInformation file with the path already updated
        File familyInformationFile = new File(defaultFamilyFilePath + newFamilyLastname + "\\info" + "\\about.txt");

        /*Writes all info related to the family inside the file*/
        try (
                /**
                 * * creates a FileWriter Object that allows us to write an
                 * information inside the created file
                 */
                 FileWriter familyInformationFileWriter = new FileWriter(familyInformationFile)) {

            //setts the new last name into the class
            Familia.setFamilyLastname(newFamilyLastname);

            //writtes the given data, by the user, to the file
            familyInformationFileWriter.write("ID:" + Familia.getFamilyId() + "\n");
            familyInformationFileWriter.write("Lastname:" + Familia.getFamilyLastname() + "\n");
            familyInformationFileWriter.write("Province:" + Localizacao.getProvince() + "\n");
            familyInformationFileWriter.write("City:" + Localizacao.getCity() + "\n");
            familyInformationFileWriter.write("Neighborhood:" + Localizacao.getHood() + "\n");
            familyInformationFileWriter.write("Contact:" + Familia.getPhoneNumber());

            //closes the FileWriter Object
            familyInformationFileWriter.close();
        }

        //shows a success message
        JOptionPane.showMessageDialog(null, "Update Complete !", "Family Lastname update process", 1);
    }

    static void editFatherName() throws IOException {
        //gets the father file
        File fatherInformation = new File(RegistrationMainScreenInfoFields.defaultFamilyFilePath + RegistrationMainScreenInfoFields.familyLastname + "\\" + "father" + "\\about.txt");

        //gets the new name
        String newName = JOptionPane.showInputDialog(null, "Inform the new name", "Renaming father process", 2);

        //verifies if the father already has the name that the user introduced
        if (Pai.getName().equalsIgnoreCase(newName)) {
            JOptionPane.showMessageDialog(null, "The father already calls " + newName, "Process Canceled", 3);
        } else {

            //deleting old file
            fatherInformation.delete();

            /*creating another file*/
            File updatedFatherInformation = new File(RegistrationMainScreenInfoFields.defaultFamilyFilePath + RegistrationMainScreenInfoFields.familyLastname + "\\" + "father" + "\\about.txt");

            //creates a file writer object for the file
            FileWriter fatherInformationFileWriter = new FileWriter(updatedFatherInformation);

            //writes inside the file
            Pai.setName(newName);
            //writes all info in the file
            fatherInformationFileWriter.write("Name:" + Pai.getName() + "\n");
            fatherInformationFileWriter.write("Gender:" + Pai.getGender() + "\n");
            fatherInformationFileWriter.write("Born Date:" + Pai.getBornDate() + "\n");

            //shows a sucess message
        }
    }

    private void jEditDataPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditDataPanelMouseClicked
        // opens a jDialog asking to the user wich option would he like to edit
        String userEditOption = JOptionPane.showInputDialog(null, "<html>Wich item would you like to edit ?<br><ol><li>Edit Family's info</li><li>Edit a Father data</li><li>Edit a Mother Data</li><li>Edit a son's data</li></ol></html>", "Choose a option", 2);

        switch (userEditOption) {
            case "1":
                //edits all info related to the family
                String familyEditOption = JOptionPane.showInputDialog(null, "<html>Wich family data would you like to edit ?<br><ol><li>Edit Last name</li><li>Edit Localization</li><li>Edit Phone Number</li></ol></html>", "Choose a option", 2);
                switch (familyEditOption) {
                    case "1" -> {
                        try {
                            editFamilyLastname();
                        } catch (IOException ex) {
                            Logger.getLogger(FamilyManager.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    case "2" -> new UpdateLocalization().setVisible(true);
                    default -> {
                }

                }
            //edit last name
            //edit localization
                break;

            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Present a valid option !", "Option not found", 2);
                break;
        }
    }//GEN-LAST:event_jEditDataPanelMouseClicked

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
            java.util.logging.Logger.getLogger(FamilyManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FamilyManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FamilyManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FamilyManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FamilyManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdminIcon;
    private javax.swing.JLabel jAdminTitle;
    private javax.swing.JPanel jBackground;
    private javax.swing.JLabel jCompanyIcon;
    private javax.swing.JPanel jEditDataPanel;
    private javax.swing.JLabel jRegisterCompanyTitle1;
    private javax.swing.JLabel jRegisterFamilyTitle;
    private javax.swing.JLabel jRegisterFamilyTitle1;
    private javax.swing.JPanel jRegistratePanel;
    private javax.swing.JPanel jRegistratePanel1;
    private javax.swing.JPanel jRegistratePanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSystemLogo;
    private javax.swing.JLabel jfamilyIcon;
    private javax.swing.JLabel jfamilyIcon1;
    // End of variables declaration//GEN-END:variables
}
