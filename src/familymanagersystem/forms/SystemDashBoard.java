package familymanagersystem.forms;

import familymanagersystem.Familia;
import static familymanagersystem.forms.RegistrationMainScreen.defaultFamilyFilePath;
import static familymanagersystem.forms.RegistrationMainScreen.familyLastname;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

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
        setBackground(new Color(0, 0, 0, 0));
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
        roundedPanel1 = new components.RoundedPanel();
        jCloseBtn = new javax.swing.JLabel();
        jDashboardTitle = new javax.swing.JLabel();
        jCreateNewFamilyButton = new javax.swing.JLabel();
        roundedPanel2 = new components.RoundedPanel();
        jNumberOfFamilesTitle = new javax.swing.JLabel();
        jNumberOfFamilies = new javax.swing.JLabel();
        jFamilyIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        roundedPanel3 = new components.RoundedPanel();
        jNumberOfFamilesTitle1 = new javax.swing.JLabel();
        jAmountMoney = new javax.swing.JLabel();
        jMoneyIcon = new javax.swing.JLabel();
        roundedPanel4 = new components.RoundedPanel();
        jNumberOfFamilesTitle2 = new javax.swing.JLabel();
        jNumberOfCompanies = new javax.swing.JLabel();
        jCompanyIcon = new javax.swing.JLabel();
        roundedPanel5 = new components.RoundedPanel();
        jRegisterFatherButton = new javax.swing.JLabel();
        jRegisterMotherButton = new javax.swing.JLabel();
        jRegisterSonButton = new javax.swing.JLabel();
        jRegisterDaughterButton = new javax.swing.JLabel();
        jRegisterFamilyDispensesButton = new javax.swing.JLabel();
        jRegisterPersonDispensesButton = new javax.swing.JLabel();
        jRegisterBigCompanyButton = new javax.swing.JLabel();
        jRegisterSmallCompanyButton = new javax.swing.JLabel();
        jFatherIcon1 = new javax.swing.JLabel();
        jMotherIcon = new javax.swing.JLabel();
        jSonIcon = new javax.swing.JLabel();
        jDaughterIcon = new javax.swing.JLabel();
        jDispensesIcon1 = new javax.swing.JLabel();
        jDispensesIcon2 = new javax.swing.JLabel();
        jCompanyIcon1 = new javax.swing.JLabel();
        jCompanyIcon2 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DashBoard - Manage All Families");
        setLocation(new java.awt.Point(330, 90));
        setName("Dasboard"); // NOI18N
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

        roundedPanel1.setBackground(new java.awt.Color(242, 239, 189));

        jCloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_icon.png"))); // NOI18N
        jCloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseBtnMouseClicked(evt);
            }
        });

        jDashboardTitle.setBackground(new java.awt.Color(52, 61, 89));
        jDashboardTitle.setFont(new java.awt.Font("Poppins", 0, 21)); // NOI18N
        jDashboardTitle.setForeground(new java.awt.Color(52, 61, 89));
        jDashboardTitle.setText("dasboard");

        jCreateNewFamilyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_icon.png"))); // NOI18N
        jCreateNewFamilyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCreateNewFamilyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateNewFamilyButtonMouseClicked(evt);
            }
        });

        roundedPanel2.setBackground(new java.awt.Color(52, 61, 89));

        jNumberOfFamilesTitle.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jNumberOfFamilesTitle.setForeground(new java.awt.Color(255, 255, 255));
        jNumberOfFamilesTitle.setText("Famílias");

        jNumberOfFamilies.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jNumberOfFamilies.setForeground(new java.awt.Color(255, 255, 255));
        jNumberOfFamilies.setText(Integer.toString((int)RegistrationMainScreen.numberOfRegisteredFamilies));

        jFamilyIcon.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jFamilyIcon.setForeground(new java.awt.Color(255, 255, 255));
        jFamilyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/family_icon.png"))); // NOI18N

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addComponent(jNumberOfFamilesTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFamilyIcon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addComponent(jNumberOfFamilies)
                        .addGap(20, 20, 20))))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNumberOfFamilesTitle)
                    .addComponent(jFamilyIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNumberOfFamilies)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(52, 61, 89));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        roundedPanel3.setBackground(new java.awt.Color(52, 61, 89));

        jNumberOfFamilesTitle1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jNumberOfFamilesTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jNumberOfFamilesTitle1.setText("Total Amount");

        jAmountMoney.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jAmountMoney.setForeground(new java.awt.Color(255, 255, 255));
        jAmountMoney.setText("0");

        jMoneyIcon.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jMoneyIcon.setForeground(new java.awt.Color(255, 255, 255));
        jMoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money_icon.png"))); // NOI18N

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNumberOfFamilesTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jMoneyIcon)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAmountMoney)
                .addGap(20, 20, 20))
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNumberOfFamilesTitle1)
                    .addComponent(jMoneyIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jAmountMoney)
                .addContainerGap())
        );

        roundedPanel4.setBackground(new java.awt.Color(52, 61, 89));

        jNumberOfFamilesTitle2.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jNumberOfFamilesTitle2.setForeground(new java.awt.Color(255, 255, 255));
        jNumberOfFamilesTitle2.setText("Companies");

        jNumberOfCompanies.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jNumberOfCompanies.setForeground(new java.awt.Color(255, 255, 255));
        jNumberOfCompanies.setText("0");

        jCompanyIcon.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        jCompanyIcon.setForeground(new java.awt.Color(255, 255, 255));
        jCompanyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/company_icon.png"))); // NOI18N

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNumberOfCompanies)
                .addGap(20, 20, 20))
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNumberOfFamilesTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCompanyIcon)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNumberOfFamilesTitle2)
                    .addComponent(jCompanyIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jNumberOfCompanies)
                .addContainerGap())
        );

        roundedPanel5.setBackground(new java.awt.Color(52, 61, 89));

        jRegisterFatherButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterFatherButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterFatherButton.setText("Register a Father");
        jRegisterFatherButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRegisterFatherButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegisterFatherButtonMouseClicked(evt);
            }
        });

        jRegisterMotherButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterMotherButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterMotherButton.setText("Register a Mother");
        jRegisterMotherButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRegisterSonButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterSonButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterSonButton.setText("Register a Son");
        jRegisterSonButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRegisterDaughterButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterDaughterButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterDaughterButton.setText("Register a Daughter");
        jRegisterDaughterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRegisterFamilyDispensesButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterFamilyDispensesButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterFamilyDispensesButton.setText("Register Family's dispenses");
        jRegisterFamilyDispensesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRegisterPersonDispensesButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterPersonDispensesButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterPersonDispensesButton.setText("Register a Person dispenses");
        jRegisterPersonDispensesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRegisterBigCompanyButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterBigCompanyButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterBigCompanyButton.setText("Register a Big Company");
        jRegisterBigCompanyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRegisterSmallCompanyButton.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jRegisterSmallCompanyButton.setForeground(new java.awt.Color(255, 255, 255));
        jRegisterSmallCompanyButton.setText("Register a Small Company");
        jRegisterSmallCompanyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jFatherIcon1.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jFatherIcon1.setForeground(new java.awt.Color(255, 255, 255));
        jFatherIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man_icon.png"))); // NOI18N
        jFatherIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMotherIcon.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jMotherIcon.setForeground(new java.awt.Color(255, 255, 255));
        jMotherIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/women_icon.png"))); // NOI18N
        jMotherIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSonIcon.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jSonIcon.setForeground(new java.awt.Color(255, 255, 255));
        jSonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boy_icon.png"))); // NOI18N
        jSonIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jDaughterIcon.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jDaughterIcon.setForeground(new java.awt.Color(255, 255, 255));
        jDaughterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/girl_icon.png"))); // NOI18N
        jDaughterIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jDispensesIcon1.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jDispensesIcon1.setForeground(new java.awt.Color(255, 255, 255));
        jDispensesIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money_icon.png"))); // NOI18N
        jDispensesIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jDispensesIcon2.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jDispensesIcon2.setForeground(new java.awt.Color(255, 255, 255));
        jDispensesIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money_icon.png"))); // NOI18N
        jDispensesIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCompanyIcon1.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jCompanyIcon1.setForeground(new java.awt.Color(255, 255, 255));
        jCompanyIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/company_icon.png"))); // NOI18N
        jCompanyIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCompanyIcon2.setFont(new java.awt.Font("Poppins Light", 0, 16)); // NOI18N
        jCompanyIcon2.setForeground(new java.awt.Color(255, 255, 255));
        jCompanyIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/company_icon.png"))); // NOI18N
        jCompanyIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundedPanel5Layout = new javax.swing.GroupLayout(roundedPanel5);
        roundedPanel5.setLayout(roundedPanel5Layout);
        roundedPanel5Layout.setHorizontalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterSmallCompanyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCompanyIcon2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterBigCompanyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCompanyIcon1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterPersonDispensesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jDispensesIcon2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterFamilyDispensesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDispensesIcon1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterDaughterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDaughterIcon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterSonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSonIcon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterMotherButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jMotherIcon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel5Layout.createSequentialGroup()
                        .addComponent(jRegisterFatherButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFatherIcon1)))
                .addGap(27, 27, 27))
        );
        roundedPanel5Layout.setVerticalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterFatherButton)
                    .addComponent(jFatherIcon1))
                .addGap(22, 22, 22)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterMotherButton)
                    .addComponent(jMotherIcon))
                .addGap(22, 22, 22)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterSonButton)
                    .addComponent(jSonIcon))
                .addGap(22, 22, 22)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterDaughterButton)
                    .addComponent(jDaughterIcon))
                .addGap(22, 22, 22)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterFamilyDispensesButton)
                    .addComponent(jDispensesIcon1))
                .addGap(22, 22, 22)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterPersonDispensesButton)
                    .addComponent(jDispensesIcon2))
                .addGap(22, 22, 22)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterBigCompanyButton)
                    .addComponent(jCompanyIcon1))
                .addGap(22, 22, 22)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegisterSmallCompanyButton)
                    .addComponent(jCompanyIcon2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jDashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCloseBtn)
                .addGap(22, 22, 22))
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jCreateNewFamilyButton)
                        .addGap(32, 32, 32))))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDashboardTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jCreateNewFamilyButton)
                        .addGap(27, 27, 27))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(roundedPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 500));

        pack();
        setLocationRelativeTo(null);
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

    private void jCloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseBtnMouseClicked
        // exits the system
        System.exit(0);
    }//GEN-LAST:event_jCloseBtnMouseClicked

    private void jCreateNewFamilyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateNewFamilyButtonMouseClicked
        // closes the current window
        dispose();

        //opens the RegistrationMainScreen Form
        new RegistrationMainScreen().setVisible(true);
    }//GEN-LAST:event_jCreateNewFamilyButtonMouseClicked

    private void jRegisterFatherButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterFatherButtonMouseClicked
        //asks in which family would the user like to register the father
        familyToRegister = JOptionPane.showInputDialog(null, "Inform the family lastname", "Father Registration", HEIGHT);

        //searches for the folder with the given lastname
        File familyFolder = new File(defaultFamilyFilePath + familyToRegister);

        //checks if the folder exists
        if (familyFolder.exists()) {

            //holds all information related to the father
            File fatherInformation = new File(RegistrationMainScreen.defaultFamilyFilePath + "\\" + familyToRegister + "\\father.txt");

            //checks if the file already exists(if the family already has a father)
            if (fatherInformation.exists()) {
                JOptionPane.showMessageDialog(null, "<html>This Family already has a father !</html>","Registration Failed",2);
            }else{
                //closes the current window
                dispose();
                
                //calls the FatherRegistration form
                new FatherRegistration().setVisible(true);
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html>This Family wasn't found<br>in our system, <strong>please try again</strong></html>","Error 404: Family Not Found",2);
        }


    }//GEN-LAST:event_jRegisterFatherButtonMouseClicked

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
    private javax.swing.JLabel jAmountMoney;
    private javax.swing.JLabel jCloseBtn;
    private javax.swing.JLabel jCompanyIcon;
    private javax.swing.JLabel jCompanyIcon1;
    private javax.swing.JLabel jCompanyIcon2;
    private javax.swing.JLabel jCreateNewFamilyButton;
    private javax.swing.JLabel jDashboardTitle;
    private javax.swing.JLabel jDaughterIcon;
    private javax.swing.JLabel jDispensesIcon1;
    private javax.swing.JLabel jDispensesIcon2;
    private javax.swing.JLabel jFamilyIcon;
    private javax.swing.JLabel jFatherIcon1;
    private javax.swing.JLabel jMoneyIcon;
    private javax.swing.JLabel jMotherIcon;
    private javax.swing.JLabel jNumberOfCompanies;
    private javax.swing.JLabel jNumberOfFamilesTitle;
    private javax.swing.JLabel jNumberOfFamilesTitle1;
    private javax.swing.JLabel jNumberOfFamilesTitle2;
    private javax.swing.JLabel jNumberOfFamilies;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jRegisterBigCompanyButton;
    private javax.swing.JLabel jRegisterDaughterButton;
    private javax.swing.JLabel jRegisterFamilyDispensesButton;
    private javax.swing.JLabel jRegisterFatherButton;
    private javax.swing.JLabel jRegisterMotherButton;
    private javax.swing.JLabel jRegisterPersonDispensesButton;
    private javax.swing.JLabel jRegisterSmallCompanyButton;
    private javax.swing.JLabel jRegisterSonButton;
    private javax.swing.JLabel jSonIcon;
    private components.RoundedPanel roundedPanel1;
    private components.RoundedPanel roundedPanel2;
    private components.RoundedPanel roundedPanel3;
    private components.RoundedPanel roundedPanel4;
    private components.RoundedPanel roundedPanel5;
    // End of variables declaration//GEN-END:variables
}
