/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.client.ui.swing;

import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.server.domain.catalog.Author;
import com.cdi.g3.server.domain.catalog.Book;
import com.cdi.g3.server.service.catalog.CatalogService;
import com.cdi.g3.server.service.publishing.PublishingService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
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
public class JPanelFormAuthor extends javax.swing.JPanel {

    DefaultTableModel myModel = new DefaultTableModel();
    PublishingService publishingService = new PublishingService();
    CatalogService catalogService = new CatalogService();
    Vector bookCollection = new Vector();

    public JPanelFormAuthor() {
        initComponents();

        myModel.addColumn("ISBN");
        myModel.addColumn("TITLE");
        myModel.addColumn("SUB-TITLE");
        myModel.addColumn("EDITOR");
        myModel.addColumn("STOCK");
        myModel.addColumn("COST");
        jTable.setModel(myModel);
        
    }

    private void clear() {
        int lignes = myModel.getRowCount();
        for (int i = lignes - 1; i >= 0; i--) {
            myModel.removeRow(i);
        }
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
        jLabelFirstName = new javax.swing.JLabel();
        jTextFirstName = new javax.swing.JTextField();
        jButtonNewAuthor = new javax.swing.JButton();
        jLabelLastName = new javax.swing.JLabel();
        jTextLastName = new javax.swing.JTextField();
        jLabelBirthDate = new javax.swing.JLabel();
        jTextBirthDate = new javax.swing.JTextField();
        jLabelDeathDate = new javax.swing.JLabel();
        jTextDeathDate = new javax.swing.JTextField();
        jLabelComment = new javax.swing.JLabel();
        jLabelBiography = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextBiography = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextComment = new javax.swing.JTextPane();
        jPanelManageEvents = new javax.swing.JPanel();
        jScrollPaneManageEvents = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelSelectedAuthor = new javax.swing.JLabel();
        jComboBoxSelectedAuthor = new javax.swing.JComboBox<String>();
        jLabelTitleISBN = new javax.swing.JLabel();
        jTextTitleISBN = new javax.swing.JTextField();
        jButtonAddBook = new javax.swing.JButton();
        jButtonUpdateAuthor = new javax.swing.JButton();
        jButtonDeleteBook = new javax.swing.JButton();
        jButtonDeleteAuthor = new javax.swing.JButton();
        jLabelSearchAuthor = new javax.swing.JLabel();
        jTextSearchAuthor = new javax.swing.JTextField();
        jButtonSearchAuthor = new javax.swing.JButton();

        jPanelNewEvent.setBorder(javax.swing.BorderFactory.createTitledBorder("New"));

        jLabelFirstName.setText("First Name  :");

        jTextFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFirstNameActionPerformed(evt);
            }
        });

        jButtonNewAuthor.setText("Add");

        jLabelLastName.setText("Last Name  :");

        jTextLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLastNameActionPerformed(evt);
            }
        });

        jLabelBirthDate.setText("Birth Date  :");

        jTextBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBirthDateActionPerformed(evt);
            }
        });

        jLabelDeathDate.setText("Death Date  :");

        jTextDeathDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDeathDateActionPerformed(evt);
            }
        });

        jLabelComment.setText("Comment :");

        jLabelBiography.setText("Biography  :");

        jScrollPane1.setViewportView(jTextBiography);

        jScrollPane2.setViewportView(jTextComment);

        javax.swing.GroupLayout jPanelNewEventLayout = new javax.swing.GroupLayout(jPanelNewEvent);
        jPanelNewEvent.setLayout(jPanelNewEventLayout);
        jPanelNewEventLayout.setHorizontalGroup(
            jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewEventLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addComponent(jLabelBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addComponent(jLabelComment, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addGap(77, 77, 77)
                .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDeathDate, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBiography, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextDeathDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNewAuthor)
                .addGap(15, 15, 15))
        );
        jPanelNewEventLayout.setVerticalGroup(
            jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewEventLayout.createSequentialGroup()
                .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFirstName)
                            .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBirthDate)
                            .addComponent(jTextBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLastName)
                            .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDeathDate)
                            .addComponent(jTextDeathDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewEventLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNewAuthor)
                        .addGap(15, 15, 15))
                    .addGroup(jPanelNewEventLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNewEventLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                            .addGroup(jPanelNewEventLayout.createSequentialGroup()
                                .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelNewEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewEventLayout.createSequentialGroup()
                                            .addComponent(jLabelComment)
                                            .addGap(37, 37, 37))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelBiography))
                                .addGap(0, 37, Short.MAX_VALUE))))))
        );

        jPanelManageEvents.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage"));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneManageEvents.setViewportView(jTable);

        jLabelSelectedAuthor.setText("Selected Author  :");

        jComboBoxSelectedAuthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Collector", "Item 2", "Item 3", "Item 4" }));

        jLabelTitleISBN.setText(" Isbn/Title :");

        jButtonAddBook.setText("Add");

        jButtonUpdateAuthor.setText("Update");

        jButtonDeleteBook.setText("Delete");
        jButtonDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteBookActionPerformed(evt);
            }
        });

        jButtonDeleteAuthor.setText("Delete ");

        jLabelSearchAuthor.setText(" Author  :");

        jTextSearchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchAuthorActionPerformed(evt);
            }
        });

        jButtonSearchAuthor.setText("Search");
        jButtonSearchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchAuthorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManageEventsLayout = new javax.swing.GroupLayout(jPanelManageEvents);
        jPanelManageEvents.setLayout(jPanelManageEventsLayout);
        jPanelManageEventsLayout.setHorizontalGroup(
            jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageEventsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSearchAuthor)
                .addGap(18, 18, 18)
                .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageEventsLayout.createSequentialGroup()
                        .addComponent(jButtonUpdateAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelManageEventsLayout.createSequentialGroup()
                        .addComponent(jTextSearchAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearchAuthor)))
                .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageEventsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAddBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeleteBook))
                    .addGroup(jPanelManageEventsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabelSelectedAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSelectedAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabelTitleISBN)
                        .addGap(18, 18, 18)
                        .addComponent(jTextTitleISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageEventsLayout.createSequentialGroup()
                .addComponent(jScrollPaneManageEvents)
                .addContainerGap())
        );
        jPanelManageEventsLayout.setVerticalGroup(
            jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageEventsLayout.createSequentialGroup()
                .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageEventsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSelectedAuthor)
                            .addComponent(jComboBoxSelectedAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTitleISBN)
                            .addComponent(jTextTitleISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSearchAuthor))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManageEventsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSearchAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearchAuthor))
                        .addGap(18, 18, 18)))
                .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddBook)
                        .addComponent(jButtonDeleteBook))
                    .addGroup(jPanelManageEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonUpdateAuthor)
                        .addComponent(jButtonDeleteAuthor)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneManageEvents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelKeyWordsLayout = new javax.swing.GroupLayout(jPanelKeyWords);
        jPanelKeyWords.setLayout(jPanelKeyWordsLayout);
        jPanelKeyWordsLayout.setHorizontalGroup(
            jPanelKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKeyWordsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelManageEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelNewEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelKeyWordsLayout.setVerticalGroup(
            jPanelKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeyWordsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNewEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(0, 40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFirstNameActionPerformed

    private void jButtonDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteBookActionPerformed

    private void jTextLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLastNameActionPerformed

    private void jTextBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBirthDateActionPerformed

    private void jTextDeathDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDeathDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDeathDateActionPerformed

    private void jTextSearchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchAuthorActionPerformed

    private void jButtonSearchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchAuthorActionPerformed
        clear();
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        
        Collection<Author> listAuthor = new ArrayList();
        try {

            listAuthor = publishingService.findAuthorByChamp("lastnameAuthor", jTextSearchAuthor.getText());
            for (Author author : listAuthor) {
                jTextLastName.setText(author.getLastNameAuthor());
                jTextFirstName.setText(author.getFirstNameAuthor());
                jTextBirthDate.setText(df.format(author.getBirthDateAuthor()));
                if (author.getDieDateAuthor() != null) {
                    jTextDeathDate.setText(df.format(author.getDieDateAuthor()));
                }
                jTextBiography.setText(author.getBiographyAuthor());
                jTextComment.setText(author.getCommentAuthor());
            }
            
        } catch (ObjectNotFoundException ex) {
            Logger.getLogger(JPanelFormAuthor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Vector v = null;
            for (Iterator itarator =catalogService.FindBooksByChamp("lastNameAuthor", jTextSearchAuthor.getText()).iterator() ; itarator.hasNext();){
                Book book = (Book)itarator.next();
                v = new Vector();
                v.add(book.getNumISBNBook());
                v.add(book.getTitleBook());
                v.add(book.getSubTitleBook());
                v.add(book.getEditor());
                v.add(book.getStockBook());
                v.add(book.getUnitCostBook());
                bookCollection.addAll(v);
            }            
            myModel.addRow(bookCollection);
        } catch (ObjectNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erreur insertion tableau");
        }
    }//GEN-LAST:event_jButtonSearchAuthorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddBook;
    private javax.swing.JButton jButtonDeleteAuthor;
    private javax.swing.JButton jButtonDeleteBook;
    private javax.swing.JButton jButtonNewAuthor;
    private javax.swing.JButton jButtonSearchAuthor;
    private javax.swing.JButton jButtonUpdateAuthor;
    private javax.swing.JComboBox<String> jComboBoxSelectedAuthor;
    private javax.swing.JLabel jLabelBiography;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelComment;
    private javax.swing.JLabel jLabelDeathDate;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelSearchAuthor;
    private javax.swing.JLabel jLabelSelectedAuthor;
    private javax.swing.JLabel jLabelTitleISBN;
    private javax.swing.JPanel jPanelKeyWords;
    private javax.swing.JPanel jPanelManageEvents;
    private javax.swing.JPanel jPanelNewEvent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneManageEvents;
    private javax.swing.JTable jTable;
    private javax.swing.JTextPane jTextBiography;
    private javax.swing.JTextField jTextBirthDate;
    private javax.swing.JTextPane jTextComment;
    private javax.swing.JTextField jTextDeathDate;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextSearchAuthor;
    private javax.swing.JTextField jTextTitleISBN;
    // End of variables declaration//GEN-END:variables
}
