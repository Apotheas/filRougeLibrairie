/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.client.ui.swing;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.common.exception.ObjectNotFoundException;


import com.cdi.g3.server.domain.company.Employe;
import com.cdi.g3.server.domain.customers.Appreciation;


import com.cdi.g3.server.service.company.EmployeService;
import com.cdi.g3.server.service.customers.AppreciationService;
import com.cdi.g3.server.service.publishing.PublishingService;

import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apotheas
 */
public class JPanelFormEmploye extends javax.swing.JPanel {

    DefaultTableModel myModel = new DefaultTableModel();
    PublishingService publishingService = new PublishingService();
    AppreciationService appreciationService = new AppreciationService();
    Vector appreciationList = new Vector();

    public JPanelFormEmploye() {
        initComponents();
        
        myModel.addColumn("LOGINEMPLOYEAPPRECIATE");
        myModel.addColumn("MODERATEAPPRECIATE");
        myModel.addColumn("DATEMODERATEAPPRECIATE");
        myModel.addColumn("COMMENTAPPRECIATE");
        myModel.addColumn("IPEAPPRECIATE");
        jTableModeration.setModel(myModel);
        
    }

   private void clearTab() {
        int lignes = myModel.getRowCount();
        for (int i = lignes - 1; i >= 0; i--) {
            myModel.removeRow(i);
        }
        appreciationList.removeAllElements();
        
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAccounts = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jPanelManage = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextSearchEmploye = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButtonEmployeSearch = new javax.swing.JButton();
        jPanelAccount = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelRights = new javax.swing.JLabel();
        jComboBoxRights = new javax.swing.JComboBox<String>();
        jTextFirstName = new javax.swing.JTextField();
        jTextLogin = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jTextLastName = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<String>();
        jTextPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModeration = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jTree2.setBorder(javax.swing.BorderFactory.createTitledBorder("Profils"));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Rights");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Admin");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Manager");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree2.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jTree2);

        jPanelManage.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage"));

        jLabel18.setText("pseudo/email  :");

        jTextSearchEmploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchEmployeActionPerformed(evt);
            }
        });

        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Delete");

        jButtonEmployeSearch.setText("search");
        jButtonEmployeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageLayout = new javax.swing.GroupLayout(jPanelManage);
        jPanelManage.setLayout(jPanelManageLayout);
        jPanelManageLayout.setHorizontalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jTextSearchEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEmployeSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addGap(22, 22, 22))
        );
        jPanelManageLayout.setVerticalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextSearchEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButtonEmployeSearch))
                .addGap(35, 35, 35))
        );

        jPanelAccount.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        jLabelEmail.setText("Password");

        jLabelLogin.setText("Login  : ");

        jLabelRights.setText("Rights  :");

        jComboBoxRights.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Manager", "Item 3", "Item 4" }));
        jComboBoxRights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRightsActionPerformed(evt);
            }
        });

        jButton17.setText("Create");

        jLabelFirstName.setText("First name :");

        jLabelLastName.setText("Last  name :");

        jLabelStatus.setText("Status  :");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "Item 3", "Item 4" }));

        jLabel2.setText("Email");

        javax.swing.GroupLayout jPanelAccountLayout = new javax.swing.GroupLayout(jPanelAccount);
        jPanelAccount.setLayout(jPanelAccountLayout);
        jPanelAccountLayout.setHorizontalGroup(
            jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccountLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelAccountLayout.createSequentialGroup()
                        .addComponent(jLabelFirstName)
                        .addGap(21, 21, 21)
                        .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAccountLayout.createSequentialGroup()
                        .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogin)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAccountLayout.createSequentialGroup()
                        .addComponent(jLabelLastName)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAccountLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccountLayout.createSequentialGroup()
                        .addComponent(jLabelRights)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxRights, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccountLayout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47))
        );
        jPanelAccountLayout.setVerticalGroup(
            jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAccountLayout.createSequentialGroup()
                        .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRights)
                            .addComponent(jComboBoxRights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelStatus)
                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLogin)
                        .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName))
                .addGap(18, 18, 18)
                .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addGap(18, 18, 18)
                .addGroup(jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(210, 210, 210))
        );

        jTableModeration.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableModeration.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableModeration);

        javax.swing.GroupLayout jPanelAccountsLayout = new javax.swing.GroupLayout(jPanelAccounts);
        jPanelAccounts.setLayout(jPanelAccountsLayout);
        jPanelAccountsLayout.setHorizontalGroup(
            jPanelAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelAccountsLayout.setVerticalGroup(
            jPanelAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addGroup(jPanelAccountsLayout.createSequentialGroup()
                        .addComponent(jPanelManage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(jPanelAccounts, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEmployeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmployeSearchActionPerformed
           
        
        clearTab();
        
        try {                                             
            Employe employe= null;
            
            
            try {
                EmployeService employeService = new EmployeService();
                employe = employeService.findEmploye(jTextSearchEmploye.getText());
            } catch (FinderException ex) {
                Logger.getLogger(JPanelFormEmploye.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            
            jTextLogin.setText(employe.getId());
            jTextEmail.setText(String.valueOf(employe.getEmailEmploye()));
            jTextFirstName.setText(employe.getFirstNameEmploye());
            jTextLastName.setText(employe.getFirstNameEmploye());
            jTextPassword.setText(employe.getPasswordEmploye());
            jTextEmail.setText(employe.getEmailEmploye());
            
         
        
        }
             
           catch (CheckException ex) {
                Logger.getLogger(JPanelFormEmploye.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            try{
            Vector v = null;
            
            for (Iterator itarator =appreciationService.FindAppreciationByEmployee("loginEmployeAppreciate", jTextSearchEmploye.getText()).iterator() ; itarator.hasNext();){
               Appreciation appreciation = (Appreciation)itarator.next();
                v = new Vector();
                v.add(appreciation.getId());
                v.add(appreciation.getModerateAppreciate());
                v.add(appreciation.getDateModerateAppreciate());
                v.add(appreciation.getCommentAppreciate());
                v.add(appreciation.getIpAppreciate());
                
                appreciationList.addAll(v);
            }            
            myModel.addRow(appreciationList);
        } catch (ObjectNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erreur insertion tableau");
        }
                                                     
    }//GEN-LAST:event_jButtonEmployeSearchActionPerformed

    private void jTextSearchEmployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchEmployeActionPerformed
        
    }//GEN-LAST:event_jTextSearchEmployeActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBoxRightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRightsActionPerformed
        
       
        
        
    }//GEN-LAST:event_jComboBoxRightsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButtonEmployeSearch;
    private javax.swing.JComboBox<String> jComboBoxRights;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelRights;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanelAccount;
    private javax.swing.JPanel jPanelAccounts;
    private javax.swing.JPanel jPanelManage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableModeration;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextSearchEmploye;
    private javax.swing.JTree jTree2;
    // End of variables declaration//GEN-END:variables
}
