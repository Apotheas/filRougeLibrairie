/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.client.ui.swing;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.server.domain.catalog.Author;
import com.cdi.g3.server.domain.catalog.Book;
import com.cdi.g3.server.domain.catalog.Editor;
import com.cdi.g3.server.service.catalog.CatalogService;
import com.cdi.g3.server.service.publishing.PublishingService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Apotheas
 */
public class JPanelFormBooks extends javax.swing.JPanel {

    /**
     * Creates new form JPanelFromBooks
     */
    public JPanelFormBooks() {
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

        jTabbedPaneStock = new javax.swing.JTabbedPane();
        jPanelConsult = new javax.swing.JPanel();
        jScrollPaneConsult = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelSearch = new javax.swing.JLabel();
        jTextSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jPanelManage = new javax.swing.JPanel();
        jScrollPaneTree = new javax.swing.JScrollPane();
        jTreeAuthor = new javax.swing.JTree();
        jPanelBook = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelISBN = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelEditor = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelWeight = new javax.swing.JLabel();
        jLabelLargeSize = new javax.swing.JLabel();
        jTextISBN = new javax.swing.JTextField();
        jTextStock = new javax.swing.JTextField();
        jTextWeight = new javax.swing.JTextField();
        jLabelFrontCover = new javax.swing.JLabel();
        jTextImageUrl = new javax.swing.JTextField();
        jTextAuthor = new javax.swing.JTextField();
        jTextTitle = new javax.swing.JTextField();
        jTextLargeSize = new javax.swing.JTextField();
        jLabelStock = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jToggleButtonCreate = new javax.swing.JToggleButton();
        jLabelSynopsis = new javax.swing.JLabel();
        jLabelImageUrl = new javax.swing.JLabel();
        jTextEditor = new javax.swing.JTextField();
        jLabelLongSize = new javax.swing.JLabel();
        jTextLongSize = new javax.swing.JTextField();
        jScrollPaneComment = new javax.swing.JScrollPane();
        jTextComment = new javax.swing.JTextArea();
        jLabelComment = new javax.swing.JLabel();
        jComboBoxEvent = new javax.swing.JComboBox<String>();
        jLabelEvent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox();
        jLabelEvent1 = new javax.swing.JLabel();
        jPanelUpdate = new javax.swing.JPanel();
        jLabelUpdateBook = new javax.swing.JLabel();
        jTextUpdateBook = new javax.swing.JTextField();
        jButtonSearchBook = new javax.swing.JButton();
        jButtonUpdateBook = new javax.swing.JToggleButton();
        jButtonDeleteBook = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanelConsult.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock Finder", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Author", "Publisher", "Price", "Stock"
            }
        ));
        jScrollPaneConsult.setViewportView(jTable1);

        jLabelSearch.setText("Author/Title/Isbn/....  :");

        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");

        javax.swing.GroupLayout jPanelConsultLayout = new javax.swing.GroupLayout(jPanelConsult);
        jPanelConsult.setLayout(jPanelConsultLayout);
        jPanelConsultLayout.setHorizontalGroup(
            jPanelConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneConsult)
                .addContainerGap())
            .addGroup(jPanelConsultLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButtonSearch)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanelConsultLayout.setVerticalGroup(
            jPanelConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultLayout.createSequentialGroup()
                .addGroup(jPanelConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneStock.addTab("Consult", jPanelConsult);

        jTreeAuthor.setBorder(javax.swing.BorderFactory.createTitledBorder("Select"));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Author");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cremades Bruno");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Rolando Izet");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Zerbib Jonathan");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ravioli");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("bananas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTreeAuthor.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPaneTree.setViewportView(jTreeAuthor);

        jPanelBook.setBorder(javax.swing.BorderFactory.createTitledBorder("book"));

        jLabelTitle.setText("Title  :");

        jLabelISBN.setText("Isbn  :");

        jLabelAuthor.setText("Author  :");

        jLabelEditor.setText("Editor  :");

        jLabelPrice.setText("Price  :");

        jLabelWeight.setText("Weight  :");

        jLabelLargeSize.setText("Large size :");

        jLabelFrontCover.setText("           Front Cover");

        jLabelStock.setText("Stock  :");

        jToggleButtonCreate.setText("Create");

        jLabelSynopsis.setText("Synopsis  :");

        jLabelImageUrl.setText("Image url   :");

        jLabelLongSize.setText("Long size  :");

        jTextComment.setColumns(20);
        jTextComment.setRows(5);
        jScrollPaneComment.setViewportView(jTextComment);

        jLabelComment.setText("Comment :");

        jComboBoxEvent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "none", "Item 2", "Item 3", "Item 4" }));

        jLabelEvent.setText("Event   :");

        jScrollPane1.setViewportView(jTextPane1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "general", "Item 2", "Item 3", "Item 4" }));

        jLabelEvent1.setText("Tva : ");

        javax.swing.GroupLayout jPanelBookLayout = new javax.swing.GroupLayout(jPanelBook);
        jPanelBook.setLayout(jPanelBookLayout);
        jPanelBookLayout.setHorizontalGroup(
            jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBookLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBookLayout.createSequentialGroup()
                            .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelWeight)
                                .addComponent(jLabelLargeSize, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelLongSize, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextLongSize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextLargeSize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelBookLayout.createSequentialGroup()
                            .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTitle)
                                .addGroup(jPanelBookLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelISBN)
                                        .addComponent(jLabelAuthor)
                                        .addComponent(jLabelEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(16, 16, 16)
                            .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74)
                            .addComponent(jLabelEvent)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)))
                    .addGroup(jPanelBookLayout.createSequentialGroup()
                        .addComponent(jLabelImageUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextImageUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelBookLayout.createSequentialGroup()
                            .addComponent(jLabelComment)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPaneComment, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelBookLayout.createSequentialGroup()
                            .addComponent(jLabelSynopsis)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookLayout.createSequentialGroup()
                        .addComponent(jToggleButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookLayout.createSequentialGroup()
                        .addComponent(jLabelFrontCover, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBookLayout.createSequentialGroup()
                        .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrice)
                            .addComponent(jLabelStock)
                            .addComponent(jLabelEvent1))
                        .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        jPanelBookLayout.setVerticalGroup(
            jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBookLayout.createSequentialGroup()
                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBookLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addComponent(jLabelISBN)
                                .addGap(24, 24, 24)
                                .addComponent(jLabelTitle)
                                .addGap(24, 24, 24)
                                .addComponent(jLabelAuthor)
                                .addGap(26, 26, 26)
                                .addComponent(jLabelEditor))
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addComponent(jTextISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jTextAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabelFrontCover, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBookLayout.createSequentialGroup()
                        .addComponent(jTextWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addComponent(jTextLargeSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jTextLongSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBookLayout.createSequentialGroup()
                                        .addComponent(jLabelComment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))
                                    .addComponent(jScrollPaneComment, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(156, 156, 156)
                                .addComponent(jToggleButtonCreate))))
                    .addGroup(jPanelBookLayout.createSequentialGroup()
                        .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelEvent1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelBookLayout.createSequentialGroup()
                                .addComponent(jLabelWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelLargeSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelLongSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelImageUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextImageUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addComponent(jLabelSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        jPanelUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Update"));

        jLabelUpdateBook.setText("Isbn/Title  : ");

        jTextUpdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUpdateBookActionPerformed(evt);
            }
        });

        jButtonSearchBook.setText("Search");
        jButtonSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchBookActionPerformed(evt);
            }
        });

        jButtonUpdateBook.setText("Update ");

        jButtonDeleteBook.setText("Delete");

        javax.swing.GroupLayout jPanelUpdateLayout = new javax.swing.GroupLayout(jPanelUpdate);
        jPanelUpdate.setLayout(jPanelUpdateLayout);
        jPanelUpdateLayout.setHorizontalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelUpdateBook)
                .addGap(18, 18, 18)
                .addComponent(jTextUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonSearchBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteBook)
                .addGap(19, 19, 19))
        );
        jPanelUpdateLayout.setVerticalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUpdateBook)
                    .addComponent(jTextUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchBook)
                    .addComponent(jButtonUpdateBook)
                    .addComponent(jButtonDeleteBook))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelManageLayout = new javax.swing.GroupLayout(jPanelManage);
        jPanelManage.setLayout(jPanelManageLayout);
        jPanelManageLayout.setHorizontalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPaneTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelManageLayout.setVerticalGroup(
            jPanelManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageLayout.createSequentialGroup()
                .addComponent(jPanelBook, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelManageLayout.createSequentialGroup()
                .addComponent(jScrollPaneTree)
                .addContainerGap())
        );

        jTabbedPaneStock.addTab("Manage", jPanelManage);

        add(jTabbedPaneStock, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchActionPerformed

    private void jButtonSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchBookActionPerformed
        try {                                                  
            Book book= null;
            try {
                CatalogService bookService = new CatalogService();
                book = bookService.findBook(jTextUpdateBook.getText());
            } catch (FinderException ex) {
                Logger.getLogger(JPanelFormBooks.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CheckException ex) {
                Logger.getLogger(JPanelFormBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            jTextISBN.setText(book.getId());
            jTextPrice.setText(String.valueOf(book.getUnitCostBook()));
            jTextTitle.setText(book.getTitleBook());
            jTextImageUrl.setText(book.getPathIconBook());
            jTextPane1.setText(book.getSynopsisBook());
            
            jTextComment.setText(book.getCommentBook());
            jTextWeight.setText(String.valueOf(book.getWeightBook()));
            jTextLargeSize.setText(String.valueOf(book.getSizeLargeBook()));
            jTextLongSize.setText(String.valueOf(book.getSizeLongBook()));
            jTextStock.setText(String.valueOf(book.getStockBook()));
            
            PublishingService service = new PublishingService();            
            Collection<Author> listAuthor = new ArrayList();
            
            listAuthor = service.findAuthorByISBN(book.getId());
            for (Author author : listAuthor){
                jTextAuthor.setText(author.getLastNameAuthor());
            }
            
            Editor editor = (Editor)service.findEditorByISBN(book.getId());
            jTextEditor.setText(editor.getNameEditor());
        } catch (ObjectNotFoundException ex) {
            Logger.getLogger(JPanelFormBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
    }//GEN-LAST:event_jButtonSearchBookActionPerformed

    private void jTextUpdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUpdateBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUpdateBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteBook;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearchBook;
    private javax.swing.JToggleButton jButtonUpdateBook;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEvent;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelComment;
    private javax.swing.JLabel jLabelEditor;
    private javax.swing.JLabel jLabelEvent;
    private javax.swing.JLabel jLabelEvent1;
    private javax.swing.JLabel jLabelFrontCover;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelImageUrl;
    private javax.swing.JLabel jLabelLargeSize;
    private javax.swing.JLabel jLabelLongSize;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelSynopsis;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUpdateBook;
    private javax.swing.JLabel jLabelWeight;
    private javax.swing.JPanel jPanelBook;
    private javax.swing.JPanel jPanelConsult;
    private javax.swing.JPanel jPanelManage;
    private javax.swing.JPanel jPanelUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneComment;
    private javax.swing.JScrollPane jScrollPaneConsult;
    private javax.swing.JScrollPane jScrollPaneTree;
    private javax.swing.JTabbedPane jTabbedPaneStock;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAuthor;
    private javax.swing.JTextArea jTextComment;
    private javax.swing.JTextField jTextEditor;
    private javax.swing.JTextField jTextISBN;
    private javax.swing.JTextField jTextImageUrl;
    private javax.swing.JTextField jTextLargeSize;
    private javax.swing.JTextField jTextLongSize;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JTextField jTextStock;
    private javax.swing.JTextField jTextTitle;
    private javax.swing.JTextField jTextUpdateBook;
    private javax.swing.JTextField jTextWeight;
    private javax.swing.JToggleButton jToggleButtonCreate;
    private javax.swing.JTree jTreeAuthor;
    // End of variables declaration//GEN-END:variables
}
