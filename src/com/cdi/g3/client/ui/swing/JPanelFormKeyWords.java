/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.client.ui.swing;

/**
 *
 * @author Apotheas
 */
public class JPanelFormKeyWords extends javax.swing.JPanel {

    /**
     * Creates new form JPanelFormKeyWords
     */
    public JPanelFormKeyWords() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelKeyWords = new javax.swing.JPanel();
        jPanelNewEvent = new javax.swing.JPanel();
        jLabelKeyWord = new javax.swing.JLabel();
        jTextKeyWord = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jPanelManageEvents = new javax.swing.JPanel();
        jScrollPaneManageEvents = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelSelectedKeyWord = new javax.swing.JLabel();
        jComboBoxSelectedKeyWord = new javax.swing.JComboBox<>();
        jLabelInsert = new javax.swing.JLabel();
        jTextInsert = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonDeleteInsert = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        jPanelNewEvent.setBorder(javax.swing.BorderFactory.createTitledBorder("New"));

        jLabelKeyWord.setText("Key word   :");

        jTextKeyWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextKeyWordActionPerformed(evt);
            }
        });

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNewEventLayout = new javax.swing.GroupLayout(jPanelNewEvent);
        jPanelNewEvent.setLayout(jPanelNewEventLayout);
        jPanelNewEventLayout.setHorizontalGroup(
            jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewEventLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelKeyWord)
                .addGap(18, 18, 18)
                .addComponent(jTextKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCreate)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelNewEventLayout.setVerticalGroup(
            jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewEventLayout.createSequentialGroup()
                .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKeyWord)
                    .addComponent(jTextKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreate))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanelManageEvents.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Author", "Publisher", "Stock"
            }
        ));
        jScrollPaneManageEvents.setViewportView(jTable2);

        jLabelSelectedKeyWord.setText("Selected KeyWord  :");

        jComboBoxSelectedKeyWord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Collector", "Item 2", "Item 3", "Item 4" }));

        jLabelInsert.setText(" Isbn/Title/Author/Cat  :");

        jButtonAdd.setText("Add");

        jButtonDeleteInsert.setText("Delete");
        jButtonDeleteInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteInsertActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete ");

        javax.swing.GroupLayout jPanelManageEventsLayout = new javax.swing.GroupLayout(jPanelManageEvents);
        jPanelManageEvents.setLayout(jPanelManageEventsLayout);
        jPanelManageEventsLayout.setHorizontalGroup(
            jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSelectedKeyWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageEventsLayout.createSequentialGroup()
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeleteInsert))
                    .addGroup(jPanelManageEventsLayout.createSequentialGroup()
                        .addComponent(jComboBoxSelectedKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                        .addComponent(jLabelInsert)
                        .addGap(18, 18, 18)
                        .addComponent(jTextInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageEventsLayout.createSequentialGroup()
                .addComponent(jScrollPaneManageEvents)
                .addContainerGap())
        );
        jPanelManageEventsLayout.setVerticalGroup(
            jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageEventsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelectedKeyWord)
                    .addComponent(jComboBoxSelectedKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInsert)
                    .addComponent(jTextInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonDeleteInsert)
                    .addComponent(jButtonDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneManageEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelKeyWordsLayout = new javax.swing.GroupLayout(jPanelKeyWords);
        jPanelKeyWords.setLayout(jPanelKeyWordsLayout);
        jPanelKeyWordsLayout.setHorizontalGroup(
            jPanelKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKeyWordsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKeyWordsLayout.createSequentialGroup()
                        .addComponent(jPanelManageEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanelKeyWordsLayout.createSequentialGroup()
                        .addComponent(jPanelNewEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelKeyWordsLayout.setVerticalGroup(
            jPanelKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeyWordsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNewEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelManageEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelKeyWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextKeyWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextKeyWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextKeyWordActionPerformed

    private void jButtonDeleteInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteInsertActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDeleteInsert;
    private javax.swing.JComboBox<String> jComboBoxSelectedKeyWord;
    private javax.swing.JLabel jLabelInsert;
    private javax.swing.JLabel jLabelKeyWord;
    private javax.swing.JLabel jLabelSelectedKeyWord;
    private javax.swing.JPanel jPanelKeyWords;
    private javax.swing.JPanel jPanelManageEvents;
    private javax.swing.JPanel jPanelNewEvent;
    private javax.swing.JScrollPane jScrollPaneManageEvents;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextInsert;
    private javax.swing.JTextField jTextKeyWord;
    // End of variables declaration//GEN-END:variables
}
