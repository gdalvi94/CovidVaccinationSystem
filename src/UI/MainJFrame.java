/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import UI.publicdonor.DonateFunds;
import UI.systemadmin.SystemAdminPanel;
import UI.vaccinemanufacturer.VaccinesPanel;
import UI.employee.ReceptionistPatientAppointmentPanel;
import UI.employee.NursePatientAppointmentAction;
import UI.medicalcenter.MedicalCenterEmployeesPanel;
import UI.covidcharity.CovidCharityDonorListPanel;
import UI.city.CityAreaPanel;
import javax.swing.JOptionPane;
import model.users.CityAdmin;
import model.users.CovidCharity;
import model.config.DbConnector;
import model.users.Employee;
import model.users.MedicalCenter;
import model.users.PublicDonor;
import model.role.Role;
import model.users.VaccineManufacturer;
import model.vaccinationsystem.CovidVaccinationSystem;


/**
 *
 * @author gayat
 */
public class MainJFrame extends javax.swing.JFrame {
    private CovidVaccinationSystem covidVaccinationSystem;
    private DbConnector dbConnector = DbConnector.getInstance();

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        covidVaccinationSystem = dbConnector.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workAreaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();
        loginBtnPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Covid Vaccination Management System");
        jLabel2.setToolTipText("");
        jLabel2.setVerifyInputWhenFocusTarget(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/illustration-people-login.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Password :");

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaPanelLayout = new javax.swing.GroupLayout(workAreaPanel);
        workAreaPanel.setLayout(workAreaPanelLayout);
        workAreaPanelLayout.setHorizontalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameText)
                            .addGroup(workAreaPanelLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jButton2))
                            .addComponent(passwordText)))
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        workAreaPanelLayout.setVerticalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(workAreaPanel);

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginBtnPanelLayout = new javax.swing.GroupLayout(loginBtnPanel);
        loginBtnPanel.setLayout(loginBtnPanelLayout);
        loginBtnPanelLayout.setHorizontalGroup(
            loginBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(loginBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        loginBtnPanelLayout.setVerticalGroup(
            loginBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnPanelLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(loginBtnPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addGap(169, 169, 169))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(workAreaPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String username = usernameText.getText();
        String password = String.valueOf(passwordText.getPassword());
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter username or password");
            return;

        }
        if (username.equals("admin") && password.equals("admin@1234")) {
            SystemAdminPanel systemAdminPanel = new SystemAdminPanel(jSplitPane1, covidVaccinationSystem);
            jSplitPane1.setRightComponent(systemAdminPanel);
        } 
        else{
            
            int ans = checkLogins(username, password);
            if(ans == 0){            
                JOptionPane.showMessageDialog(this, "Invalid username or password");
                return;

                
            }
            

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(workAreaPanel);
        usernameText.setText("");
        passwordText.setText("");

        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private int checkLogins(String username, String password) {
        try{
        // Login for VaccineManufacturer
        for (VaccineManufacturer vaccineManufacturer: covidVaccinationSystem
                .getVaccineManufacturerDirectory().getVaccineManufacturers()) {
            if (vaccineManufacturer.getUsername().equals(username) 
                    && vaccineManufacturer.getPassword().equals(password)) {
                VaccinesPanel vaccinesPanel = new VaccinesPanel(
                        jSplitPane1, covidVaccinationSystem, vaccineManufacturer);
                jSplitPane1.setRightComponent(vaccinesPanel);
                return 1;
            }
        }
        // Login for Medical Center
        for (MedicalCenter medicalCenter: covidVaccinationSystem.getMedicalCenterDirectory().getMedicalCenters()) {
            if (medicalCenter.getUsername().equals(username) 
                    && medicalCenter.getPassword().equals(password)) {
                MedicalCenterEmployeesPanel medicalCenterEmployeesPanel = new MedicalCenterEmployeesPanel(
                        jSplitPane1, covidVaccinationSystem, medicalCenter);
                jSplitPane1.setRightComponent(medicalCenterEmployeesPanel);
                return 1;
            }
        }

       // Login for Covid Charity
        for (CovidCharity covidCharity: covidVaccinationSystem.getCovidCharityDirectory().getCovidCharities()) {
            if (covidCharity.getUsername().equals(username) 
                    && covidCharity.getPassword().equals(password)) {
                CovidCharityDonorListPanel covidCharityPanel = new CovidCharityDonorListPanel(
                        jSplitPane1, covidVaccinationSystem, covidCharity);
                jSplitPane1.setRightComponent(covidCharityPanel);
                return 1;
            }
        }

        for (CityAdmin communityAdmin: covidVaccinationSystem.getCommunityDirectory().getCommunities()) {
            if (communityAdmin.getUsername().equals(username) 
                    && communityAdmin.getPassword().equals(password)) {
                CityAreaPanel communityPanel = new CityAreaPanel(
                        jSplitPane1, covidVaccinationSystem, communityAdmin);
                jSplitPane1.setRightComponent(communityPanel);
                return 1;
            }
        }
        
        for (CovidCharity covidCharity: covidVaccinationSystem.getCovidCharityDirectory().getCovidCharities()) {
            for (PublicDonor publicDonor: covidCharity.getPublicDonors()) {
                if (publicDonor.getUsername().equals(username) 
                        && publicDonor.getPassword().equals(password)) {
                    DonateFunds publicFund = new DonateFunds(
                            jSplitPane1, covidVaccinationSystem, publicDonor);
                    jSplitPane1.setRightComponent(publicFund);
                    return 1;
                }
           }
        }
        
        for (MedicalCenter medicalCenter: covidVaccinationSystem.getMedicalCenterDirectory().getMedicalCenters()) {
            for (Employee employee: medicalCenter.getEmployeeDirectory().getEmployees()) {
                if (employee.getUsername().equals(username) 
                        && employee.getPassword().equals(password)) {
                    if (employee.getRole().equals(Role.NURSE)) {
                        NursePatientAppointmentAction nursePatientAppointmentAction = new NursePatientAppointmentAction(
                                jSplitPane1, covidVaccinationSystem, employee, medicalCenter);
                        jSplitPane1.setRightComponent(nursePatientAppointmentAction);
                        return 1;
                    } else {
                        ReceptionistPatientAppointmentPanel receptionistPatientAppointmentPanel = new ReceptionistPatientAppointmentPanel(
                                jSplitPane1, covidVaccinationSystem, employee, medicalCenter);
                        jSplitPane1.setRightComponent(receptionistPatientAppointmentPanel);
                        return 1;
                    }
                }

            }
        }
        }
        catch(Exception  e){
            JOptionPane.showMessageDialog(this, "Invalid order");
            return -1;
            
        }
        return 0;
        
        
    }
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel loginBtnPanel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField usernameText;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables
}
