/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.lms.view;

import edu.lms.dto.MemberDto;
import edu.lms.controller.MemberController;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author USER
 */
public class MemberView extends javax.swing.JFrame {
        private final  MemberController memberController;
        
        private final Random random= new Random();
        private Set <String> idSet = new HashSet<>();
    /**
     * Creates new form AddMembrView
     */
    public MemberView() {
        
        super("Member Details Editing");
        
        initComponents();
        memberController= new MemberController();
        loadTable();
        GeneratingMemberId();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUpdateMember = new javax.swing.JButton();
        btnDeleteMember = new javax.swing.JButton();
        btnSaveMember = new javax.swing.JButton();
        lblMemberId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblMemberdate = new javax.swing.JLabel();
        jdcMemberdate = new com.toedter.calendar.JDateChooser();
        jdcDob = new com.toedter.calendar.JDateChooser();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMemberId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        lblUserId = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 102), 3, true), "Member Information Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 102, 204))); // NOI18N

        btnUpdateMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateMember.setText("Update");
        btnUpdateMember.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMemberActionPerformed(evt);
            }
        });

        btnDeleteMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteMember.setText("Delete");
        btnDeleteMember.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });

        btnSaveMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaveMember.setText("Save");
        btnSaveMember.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));
        btnSaveMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMemberActionPerformed(evt);
            }
        });

        lblMemberId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMemberId.setText("Member Id ");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblDob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDob.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDob.setText("DOB");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddress.setText("Address");

        lblContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContact.setText("Contact");

        lblMemberdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMemberdate.setText("Membership Date");

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMember);

        lblUserId.setText("User Id");

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblDob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUserId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcDob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addComponent(lblMemberdate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcMemberdate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnDeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdateMember)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveMember, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMemberdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDob, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcDob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcMemberdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeleteMember)
                        .addComponent(btnUpdateMember)
                        .addComponent(btnSaveMember)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMemberActionPerformed
        // TODO add your handling code here:
        saveMember();
    }//GEN-LAST:event_btnSaveMemberActionPerformed

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        // TODO add your handling code here:
        deleteMember();
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void tblMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberMouseClicked
            try {
                // TODO add your handling code here:
                searchMember();
            } catch (Exception ex) {
                Logger.getLogger(MemberView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_tblMemberMouseClicked

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed
        // TODO add your handling code here:
        updateMember();
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new MemberDashboard().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
             java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new MemberView().setVisible(true);
             }
         });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnSaveMember;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcDob;
    private com.toedter.calendar.JDateChooser jdcMemberdate;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblMemberId;
    private javax.swing.JLabel lblMemberdate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JTable tblMember;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private void GeneratingMemberId(){       
        String uniqueId;
        do{
            uniqueId =String.valueOf(random.nextInt(1000)+1);
        }while(idSet.contains(uniqueId));
        
        idSet.add(uniqueId);
        txtMemberId.setText(uniqueId);
  
    }  
    
    private void saveMember() {
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
         //   String dob = sdf.format(jdcDob.getDate());
           // String memberDate = sdf.format(jdcMemberdate.getDate());
           Date dobDate = jdcDob.getDate();
           Date memberDate = jdcMemberdate.getDate();
        
            java.sql.Date sqlDobDate = new java.sql.Date(dobDate.getTime());
            java.sql.Date sqlMemberDateValue = new java.sql.Date(memberDate.getTime());

        
            MemberDto dto = new MemberDto(txtMemberId.getText(),txtName.getText(),sqlDobDate,
            txtAddress.getText(), txtContact.getText(), sqlMemberDateValue, txtUserId.getText());

            String resp = memberController.save(dto);

            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving member");
            clearForm();
        }

    }

    private void loadTable() {

    try{
        String columns[] = {"Id", "Name", "DOB", "Address", "Contact", "MemberShip", "User Id"};
        DefaultTableModel dtm= new DefaultTableModel(columns,0){
         @Override
         public boolean isCellEditable(int row,int column){
            return false;
        }
    };

    tblMember.setModel(dtm);
    ArrayList <MemberDto> memberDtos = memberController.getAll();
    
    System.out.println("Number of members retrieved: " + memberDtos.size());
    
        for(MemberDto memberDto : memberDtos){
                    
            Object rowData[] = {memberDto.getMemberId(),memberDto.getName(),memberDto.getDob(),memberDto.getAddress(),
                memberDto.getContact(),memberDto.getMembershipDate(),memberDto.getUserId()};
            dtm.addRow(rowData);
         }
      }catch(Exception e){
           e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error loading member");
        }
    }

private void clearForm(){
    txtMemberId.setText("");
    txtName.setText("");
  ((JTextField) jdcDob.getDateEditor().getUiComponent()).setText("");
     txtAddress.setText("");
   txtContact.setText("");
   ((JTextField) jdcMemberdate.getDateEditor().getUiComponent()).setText("");
   txtUserId.setText("");
}
    
private void searchMember() throws Exception  {
    try {
       String memberId = tblMember.getValueAt(tblMember.getSelectedRow(), 0).toString();
        MemberDto dto = memberController.get(memberId);

        if (dto != null) {
            txtMemberId.setText(dto.getMemberId());
            txtName.setText(dto.getName());                
            jdcDob.setDate(dto.getDob());           
            txtAddress.setText(dto.getAddress());
            txtContact.setText(dto.getContact());            
            jdcMemberdate.setDate(dto.getMembershipDate());
            txtUserId.setText(dto.getUserId());
           

        } else {
            JOptionPane.showMessageDialog(this, "Member Not Found");
        }
    } catch (HeadlessException e) {
        
        JOptionPane.showMessageDialog(this, "Error at loading members to fields: " + e.getMessage());
    }
}
private void deleteMember(){
     try{
         String memberId = txtMemberId.getText();
         String resp = memberController.delete(memberId);
            JOptionPane.showMessageDialog(this,resp);            
            loadTable();
            clearForm();
            }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error at Delete Member");
        }
    }

 private void updateMember(){
        try{
       Date dobDate = jdcDob.getDate();
           Date memberDate = jdcMemberdate.getDate();
        
            java.sql.Date sqlDobDate = new java.sql.Date(dobDate.getTime());
            java.sql.Date sqlMemberDateValue = new java.sql.Date(memberDate.getTime());

        
            MemberDto dto = new MemberDto(txtMemberId.getText(),txtName.getText(),sqlDobDate,
            txtAddress.getText(), txtContact.getText(), sqlMemberDateValue, txtUserId.getText());
            
            String resp = memberController.update(dto);
            
        JOptionPane.showMessageDialog(this,resp);            
        loadTable();
        clearForm();      
       
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error at Update Member");

        }
 }
}
