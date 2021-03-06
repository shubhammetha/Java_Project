/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SuperAdmin;
import Business.Stakeholders.Patients;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Stakeholders.PatientsDirectory;
import java.awt.Component;
import java.text.DateFormat;
import java.util.Date;
/**
 *
 * @author harish
 */
public class SuperAdminAddPatientPanel extends javax.swing.JPanel {

//    /**
//     * Creates new form SuperAdminAddPatientPanel
//     */
//    public SuperAdminAddPatientPanel() {
//        initComponents();
//    }
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
     
   private PatientsDirectory patientsDirectory;

    public SuperAdminAddPatientPanel(JPanel container, Enterprise enterprise,PatientsDirectory patientsDirectory) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = container;
        this.patientsDirectory = patientsDirectory;
        jLabel1.setText(enterprise.getName());

//        popOrganizationComboBox();
//       // employeeJComboBox.removeAllItems();
//        popData();
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
        jLabel2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMRN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        viewStatusCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        activityStatusCombo = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        createdDateChooser = new com.toedter.calendar.JDateChooser();
        dobDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("B&W Super Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Patient Name ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 160, 26));

        txtPatientName.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 183, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("MRN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 60, 26));

        txtMRN.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        add(txtMRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 183, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("DOB");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 138, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Created Date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 150, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Vital Status");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 138, 26));

        viewStatusCombo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewStatusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dead", "Alive", "Withdrawn", " " }));
        add(viewStatusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 183, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Activity Status");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 150, 26));

        activityStatusCombo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        activityStatusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "Closed", "Disabled", " " }));
        add(activityStatusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 183, 26));

        btnSubmit.setBackground(new java.awt.Color(18, 51, 105));
        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 140, 50));

        backJButton.setBackground(new java.awt.Color(18, 51, 105));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));
        add(createdDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 180, 30));
        add(dobDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 180, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jLabel8.setMinimumSize(new java.awt.Dimension(2000, 1000));
        jLabel8.setPreferredSize(new java.awt.Dimension(2000, 1000));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SuperAdminManagePatientPanel superAdminManagePatientPanel = (SuperAdminManagePatientPanel) component;
        superAdminManagePatientPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
             
try{
        
        if(txtPatientName.getText().isEmpty() || txtMRN.getText().isEmpty() || dobDateChooser.getDate() == null || createdDateChooser.getDate() == null){
          
        JLabel label = new JLabel("Patient Name and MRN No Cannot be Empty!");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null,label,"Message",JOptionPane.INFORMATION_MESSAGE);

      }else{
          
          
          Patients patients = patientsDirectory.addPatient();
          patients.setPatientName(txtPatientName.getText());
          patients.setMrn(txtMRN.getText());
          
          
         Date datedob = dobDateChooser.getDate();
         
//        String strDate = DateFormat.getDateInstance().format(date);
        patients.setPatientDOB(datedob);
        
        Date createdDate = createdDateChooser.getDate();
        patients.setpCreatedDate(createdDate);
        
         String vitalStatus = (String)viewStatusCombo.getSelectedItem();
         patients.setViewStatus(vitalStatus);
         
         String ActivityStatus = (String)activityStatusCombo.getSelectedItem();
         patients.setActivityStatus(ActivityStatus);
          
         JLabel label = new JLabel("Patient Successfully Added");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(null,label,"Message",JOptionPane.INFORMATION_MESSAGE);
        txtPatientName.setText("");
        txtPatientName.setText("");
          
      }
        
     }catch(Exception e){
       //JOptionPane.showMessageDialog(null, "Please enter All Details"); 
         System.out.println(""+e);
         
//         JLabel label = new JLabel("Please Enter valid  Details!");
//        label.setFont(new Font("Arial", Font.PLAIN, 18));
//        JOptionPane.showMessageDialog(null,label,"Message",JOptionPane.INFORMATION_MESSAGE);

     }
        
        
        
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox activityStatusCombo;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmit;
    private com.toedter.calendar.JDateChooser createdDateChooser;
    private com.toedter.calendar.JDateChooser dobDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtMRN;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JComboBox viewStatusCombo;
    // End of variables declaration//GEN-END:variables
}
