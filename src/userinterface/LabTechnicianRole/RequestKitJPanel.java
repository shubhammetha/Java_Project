/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabTechnicianRole;

import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.MaterialAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import javax.swing.JOptionPane;
//import Business.Organization.MaterialAdminOrganization;
        

/**
 *
 * @author harish
 */
public class RequestKitJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestKitJPanel
     */
//    public RequestKitJPanel() {
//        initComponents();
//    }
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
   private EnterpriseType enterpriseType;


    RequestKitJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          initComponents();
            this.userProcessContainer = userProcessContainer;
            this.account=account;
            this.enterprise = enterprise;
            this.business = business;
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        messageJTextField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 180, -1));

        requestTestJButton.setBackground(new java.awt.Color(18, 51, 105));
        requestTestJButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Kit");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        backJButton.setBackground(new java.awt.Color(18, 51, 105));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        if (messageJTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter missing field");
        }
        else{
        String message = messageJTextField.getText();

        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof MaterialAdminOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
        
        
        
        
        
        
//                Enterprise ent = null;
//
//         for (Network network : business.getNetworkList()) {
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                if(enterprise.getEnterpriseType()== enterpriseType.MaterialsDepartment){
//                    ent = enterprise;
////                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
////                    Object[] row = new Object[3];
////                    row[0] = enterprise.getName();
////                    row[1] = network.getName();
////                    row[2] = userAccount.getUsername();
////
////                    model.addRow(row);
//                }
//            }
//        }
//         if (ent!=null){
//            ent.getWorkQueue().getWorkRequestList().add(request);
//            account.getWorkQueue().getWorkRequestList().add(request);
//        }
    
        
        
        
        
        
//           Organization org = null;
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof DoctorOrganization){
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            org.getWorkQueue().getWorkRequestList().add(request);
//            account.getWorkQueue().getWorkRequestList().add(request);
//        }
        
        }
        JOptionPane.showMessageDialog(null, "Kit Requested Successfully");
        

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageKitRequestJPanel manageKitRequestJPanel = (ManageKitRequestJPanel) component;
        manageKitRequestJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}