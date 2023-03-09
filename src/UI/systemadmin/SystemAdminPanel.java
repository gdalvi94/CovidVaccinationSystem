/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.systemadmin;

import UI.vaccinemanufacturer.VaccineManufacturerListPanel;
import UI.medicalcenter.MedicalCenterListPanel;
import UI.covidcharity.CovidCharityListPanel;
import UI.city.CityAdminPanel;
import javax.swing.JSplitPane;
import javax.swing.JOptionPane;
import model.config.DbConnector;
import model.vaccinationsystem.CovidVaccinationSystem;


/**
 *
 * @author gayat
 */
public class SystemAdminPanel extends javax.swing.JPanel {
        private javax.swing.JSplitPane splitPane;
        private CovidVaccinationSystem covidVaccinationSystem;
        private DbConnector dbConnector = DbConnector.getInstance();




    /**
     * Creates new form SystemAdmin
     */
    public SystemAdminPanel(JSplitPane splitPane, CovidVaccinationSystem covidVaccinationSystem) {
        initComponents();
        this.splitPane = splitPane;
        this.covidVaccinationSystem = covidVaccinationSystem;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        tbnCommunityList = new javax.swing.JButton();
        btnCovidCharity = new javax.swing.JButton();
        btnVaccineProviderList = new javax.swing.JButton();
        btnMedCenterList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("System Admin");

        tbnCommunityList.setBackground(new java.awt.Color(51, 204, 255));
        tbnCommunityList.setText("City Admin List");
        tbnCommunityList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbnCommunityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCommunityListActionPerformed(evt);
            }
        });

        btnCovidCharity.setBackground(new java.awt.Color(51, 204, 255));
        btnCovidCharity.setText("Covid Charity Admin List");
        btnCovidCharity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCovidCharity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCovidCharityActionPerformed(evt);
            }
        });

        btnVaccineProviderList.setBackground(new java.awt.Color(51, 204, 255));
        btnVaccineProviderList.setText("Vaccine Provider List");
        btnVaccineProviderList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVaccineProviderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaccineProviderListActionPerformed(evt);
            }
        });

        btnMedCenterList.setBackground(new java.awt.Color(51, 204, 255));
        btnMedCenterList.setText("Medical Center List");
        btnMedCenterList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMedCenterList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedCenterListActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sysadmin.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(lblTitle)
                .addContainerGap(575, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVaccineProviderList, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMedCenterList, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbnCommunityList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCovidCharity, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCovidCharity, btnMedCenterList, btnVaccineProviderList, tbnCommunityList});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnVaccineProviderList)
                        .addGap(35, 35, 35)
                        .addComponent(btnMedCenterList)
                        .addGap(31, 31, 31)
                        .addComponent(tbnCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCovidCharity))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCovidCharity, btnMedCenterList, btnVaccineProviderList, tbnCommunityList});

    }// </editor-fold>//GEN-END:initComponents

    private void tbnCommunityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCommunityListActionPerformed
        // TODO add your handling code here:
        CityAdminPanel communityPanel = new CityAdminPanel(splitPane,covidVaccinationSystem);
        this.splitPane.setRightComponent(communityPanel);


        
    }//GEN-LAST:event_tbnCommunityListActionPerformed

    private void btnMedCenterListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedCenterListActionPerformed
        // TODO add your handling code here:
        MedicalCenterListPanel medicalCenterPanel = new MedicalCenterListPanel(splitPane,covidVaccinationSystem);
        this.splitPane.setRightComponent(medicalCenterPanel);


    }//GEN-LAST:event_btnMedCenterListActionPerformed

    private void btnVaccineProviderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaccineProviderListActionPerformed
        // TODO add your handling code here:
        VaccineManufacturerListPanel vaccinationManufacturerPanel = new VaccineManufacturerListPanel(splitPane,covidVaccinationSystem);
        this.splitPane.setRightComponent(vaccinationManufacturerPanel);
    }//GEN-LAST:event_btnVaccineProviderListActionPerformed

    private void btnCovidCharityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCovidCharityActionPerformed
        // TODO add your handling code here:
        CovidCharityListPanel covidCharityPanel = new CovidCharityListPanel(splitPane,covidVaccinationSystem);
        this.splitPane.setRightComponent(covidCharityPanel);

        
        

    }//GEN-LAST:event_btnCovidCharityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCovidCharity;
    private javax.swing.JButton btnMedCenterList;
    private javax.swing.JButton btnVaccineProviderList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton tbnCommunityList;
    // End of variables declaration//GEN-END:variables
}
