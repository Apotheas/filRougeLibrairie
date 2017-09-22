/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.client.ui.swing;

import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.common.exception.ObjectNotFoundException;
import com.cdi.g3.server.domain.catalog.Book;
import com.cdi.g3.server.domain.company.Employe;
import com.cdi.g3.server.domain.customers.Appreciation;
import com.cdi.g3.server.domain.customers.Customer;
import com.cdi.g3.server.service.catalog.CatalogService;
import com.cdi.g3.server.service.company.EmployeService;
import com.cdi.g3.server.service.customers.AppreciationService;
import com.cdi.g3.server.service.customers.CustomerService;
import com.cdi.g3.server.service.other.AppreciationService2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apotheas
 */
public class JPanelFormAppreciations extends javax.swing.JPanel {

    private DefaultTableModel tabModelWait = new DefaultTableModel();
    private DefaultTableModel tabModelSearch = new DefaultTableModel();
    private AppreciationService2 appreciationService = new AppreciationService2();
    private AppreciationService appreciationService2 = new AppreciationService();
    private final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    private Vector comments = new Vector();
    private Vector oldComments = new Vector();

    public JPanelFormAppreciations() throws ObjectNotFoundException {
        initComponents();
        jComboBoxSearchBy.setModel(initSearchByModel());
        intTabWaiting();
        tabModelSearch.addColumn("DATE");
        tabModelSearch.addColumn("MODERATOR");
        tabModelSearch.addColumn("ISBN");
        tabModelSearch.addColumn("CUSTOMER");
        tabModelSearch.addColumn("COMMENT");
        tabModelSearch.addColumn("RATE /5");
        tabModelSearch.addColumn("IP CUSTOMER");

        jTableWaiting.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                selectLineWaiting(evt);
            }
        });
        jTableView.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                selectLineSearch(evt);
            }
        });

    }

    //___________SEARCH-BY COMBOBOX MODEL_______________//
    private DefaultComboBoxModel initSearchByModel() {
        return new DefaultComboBoxModel(initSearchVector());
    }

    private Vector initSearchVector() {
        Vector searchList = new Vector();
        searchList.add("Title");
        searchList.add("Customer");
        searchList.add("Moderator");

        return searchList;
    }

    //______________________________________________________//
    //___________SelectedSearch COMBOBOX MODEL_______________//
    private DefaultComboBoxModel initSelectedModel(Vector queryList) {
        return new DefaultComboBoxModel(initSeLectedVector(queryList));
    }

    private Vector initSeLectedVector(Vector queryList) {

        return queryList;
        
    }

    //______________________________________________________//
    private void intTabWaiting() throws ObjectNotFoundException {
        tabModelWait.addColumn("DATE");
        tabModelWait.addColumn("ISBN");
        tabModelWait.addColumn("CUSTOMER");
        tabModelWait.addColumn("COMMENT");
        tabModelWait.addColumn("RATE /5");
        tabModelWait.addColumn("IP CUSTOMER");
        Vector rowAttributes = null;

        for (Iterator it = appreciationService.findWaitingAppreciate().iterator(); it.hasNext();) {
            Appreciation comment = (Appreciation) it.next();
            rowAttributes = new Vector();
            rowAttributes.add(comment.getDateAppreciate());
            rowAttributes.add(comment.getNumIsbnBookAppreciate());
            rowAttributes.add(comment.getLoginCustomerAppreciate().getLoginCustomer());
            rowAttributes.add(comment.getCommentAppreciate());
            rowAttributes.add(comment.getRatingAppreciate());
            rowAttributes.add(comment.getId());
            comments.add(comment);
            tabModelWait.addRow(rowAttributes);
        }
        jTableWaiting.setModel(tabModelWait);
    }

    private void intTabSearch(Collection queryList) throws ObjectNotFoundException {
        refreshTabSearch();
        
        

        Vector rowAttributes = null;

        for (Iterator it = queryList.iterator(); it.hasNext();) {
            Appreciation comment = (Appreciation) it.next();
            rowAttributes = new Vector();
            rowAttributes.add(comment.getDateAppreciate());
            rowAttributes.add(comment.getLoginEmployeAppreciate().getLoginEmploye());
            rowAttributes.add(comment.getNumIsbnBookAppreciate());
            rowAttributes.add(comment.getLoginCustomerAppreciate().getLoginCustomer());
            rowAttributes.add(comment.getCommentAppreciate());
            rowAttributes.add(comment.getRatingAppreciate());
            rowAttributes.add(comment.getId());
            comments.add(comment);
            tabModelSearch.addRow(rowAttributes);
        }
        jTableView.setModel(tabModelSearch);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroundAppreciation = new javax.swing.JPanel();
        jPanelSearchBook = new javax.swing.JPanel();
        jLabelTitleISBN = new javax.swing.JLabel();
        jTextTitleISBN = new javax.swing.JTextField();
        jButtonSearchBook = new javax.swing.JButton();
        jPanelSearchAppreciation = new javax.swing.JPanel();
        jScrollPaneShowAppreciations = new javax.swing.JScrollPane();
        jTableView = new javax.swing.JTable();
        jButtonClear = new javax.swing.JButton();
        jComboBoxSearchBy = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBoxSelected = new javax.swing.JComboBox<>();
        jPanelTraitment = new javax.swing.JPanel();
        jScrollPaneAppreciationsWaiting = new javax.swing.JScrollPane();
        jTableWaiting = new javax.swing.JTable();
        jPanelManager = new javax.swing.JPanel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButtonSetStatus = new javax.swing.JButton();
        jLabelAppreciationStatus = new javax.swing.JLabel();
        jLabelAppreciation = new javax.swing.JLabel();
        jScrollPaneAppreciation = new javax.swing.JScrollPane();
        jTextAppreciation = new javax.swing.JTextArea();
        jLabelCustomerLogin = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jTextDate = new javax.swing.JLabel();
        jLabelIp = new javax.swing.JLabel();
        jTextIp = new javax.swing.JLabel();
        jLabelDate1 = new javax.swing.JLabel();
        jTextModerator = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanelBackgroundAppreciation.setLayout(new java.awt.BorderLayout());

        jPanelSearchBook.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Book's Appreciations"));

        jLabelTitleISBN.setText("Search by  : ");

        jTextTitleISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTitleISBNActionPerformed(evt);
            }
        });

        jButtonSearchBook.setText("Search");

        jPanelSearchAppreciation.setBorder(javax.swing.BorderFactory.createTitledBorder("Appreciations"));

        jTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "idAppreciate", "loginCustomer", "Appreciation", "Rate", "Status", "Moderator"
            }
        ));
        jScrollPaneShowAppreciations.setViewportView(jTableView);

        javax.swing.GroupLayout jPanelSearchAppreciationLayout = new javax.swing.GroupLayout(jPanelSearchAppreciation);
        jPanelSearchAppreciation.setLayout(jPanelSearchAppreciationLayout);
        jPanelSearchAppreciationLayout.setHorizontalGroup(
            jPanelSearchAppreciationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneShowAppreciations, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        jPanelSearchAppreciationLayout.setVerticalGroup(
            jPanelSearchAppreciationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchAppreciationLayout.createSequentialGroup()
                .addComponent(jScrollPaneShowAppreciations, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonClear.setText("clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jComboBoxSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSearchBy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSearchByMouseClicked(evt);
            }
        });
        jComboBoxSearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchByActionPerformed(evt);
            }
        });

        jButton1.setText("View All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSelectedMouseClicked(evt);
            }
        });
        jComboBoxSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchBookLayout = new javax.swing.GroupLayout(jPanelSearchBook);
        jPanelSearchBook.setLayout(jPanelSearchBookLayout);
        jPanelSearchBookLayout.setHorizontalGroup(
            jPanelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchBookLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelTitleISBN)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jComboBoxSelected, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(jTextTitleISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearchBook)
                .addGap(69, 69, 69)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButtonClear)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSearchAppreciation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSearchBookLayout.setVerticalGroup(
            jPanelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchBookLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitleISBN)
                    .addComponent(jTextTitleISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchBook)
                    .addComponent(jButtonClear)
                    .addComponent(jComboBoxSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBoxSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelSearchAppreciation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBackgroundAppreciation.add(jPanelSearchBook, java.awt.BorderLayout.CENTER);

        jPanelTraitment.setBorder(javax.swing.BorderFactory.createTitledBorder("Appreciations waiting for Traitment"));

        jTableWaiting.setAutoCreateRowSorter(true);
        jTableWaiting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idAppreciate", "ISBN ", "loginCustomer", "Appreciation"
            }
        ));
        jTableWaiting.setRowSelectionAllowed(true);
        jTableWaiting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableWaitingMouseClicked(evt);
            }
        });
        jScrollPaneAppreciationsWaiting.setViewportView(jTableWaiting);

        javax.swing.GroupLayout jPanelTraitmentLayout = new javax.swing.GroupLayout(jPanelTraitment);
        jPanelTraitment.setLayout(jPanelTraitmentLayout);
        jPanelTraitmentLayout.setHorizontalGroup(
            jPanelTraitmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTraitmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAppreciationsWaiting, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTraitmentLayout.setVerticalGroup(
            jPanelTraitmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTraitmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAppreciationsWaiting, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBackgroundAppreciation.add(jPanelTraitment, java.awt.BorderLayout.PAGE_START);

        jPanelManager.setBorder(javax.swing.BorderFactory.createTitledBorder("Apreciations Management"));

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", " ", "Item 3", "Item 4" }));

        jButtonSetStatus.setText("Set");
        jButtonSetStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetStatusActionPerformed(evt);
            }
        });

        jLabelAppreciationStatus.setText(" Appreciation Status  :");

        jLabelAppreciation.setText("Appreciation :");

        jTextAppreciation.setColumns(20);
        jTextAppreciation.setRows(5);
        jScrollPaneAppreciation.setViewportView(jTextAppreciation);

        jLabelCustomerLogin.setText("Customer Login  :");

        jLabelDate.setText("Date  :");

        jLabelIp.setText("Customer IP   :");

        jLabelDate1.setText("Moderator  :");

        javax.swing.GroupLayout jPanelManagerLayout = new javax.swing.GroupLayout(jPanelManager);
        jPanelManager.setLayout(jPanelManagerLayout);
        jPanelManagerLayout.setHorizontalGroup(
            jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManagerLayout.createSequentialGroup()
                        .addComponent(jLabelAppreciationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSetStatus)
                        .addGap(51, 51, 51)
                        .addComponent(jLabelAppreciation))
                    .addGroup(jPanelManagerLayout.createSequentialGroup()
                        .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagerLayout.createSequentialGroup()
                                .addComponent(jLabelIp)
                                .addGap(18, 18, 18)
                                .addComponent(jTextIp, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelManagerLayout.createSequentialGroup()
                                .addComponent(jLabelCustomerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelManagerLayout.createSequentialGroup()
                                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelManagerLayout.createSequentialGroup()
                                .addComponent(jLabelDate1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextModerator, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneAppreciation, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelManagerLayout.setVerticalGroup(
            jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneAppreciation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelManagerLayout.createSequentialGroup()
                        .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAppreciationStatus)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSetStatus)
                            .addComponent(jLabelAppreciation))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDate)
                            .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCustomerLogin)
                            .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelIp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextIp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelDate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextModerator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanelBackgroundAppreciation.add(jPanelManager, java.awt.BorderLayout.PAGE_END);

        add(jPanelBackgroundAppreciation, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTitleISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTitleISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTitleISBNActionPerformed

    private void jTableWaitingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableWaitingMouseClicked


    }//GEN-LAST:event_jTableWaitingMouseClicked

    private void jButtonSetStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetStatusActionPerformed
        try {
            refreshTabWaiting();
        } catch (ObjectNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "NO MORE COMMENTS TO MODERATE ");
        }
    }//GEN-LAST:event_jButtonSetStatusActionPerformed

    private void jComboBoxSearchByMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSearchByMouseClicked
       

    }//GEN-LAST:event_jComboBoxSearchByMouseClicked

    private void jComboBoxSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSelectedMouseClicked
         
    }//GEN-LAST:event_jComboBoxSelectedMouseClicked

    private void jComboBoxSearchByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchByActionPerformed
        if (jComboBoxSearchBy.getSelectedItem().equals("Title")) {
            CatalogService catalogService = new CatalogService();
            Vector bookList = new Vector();
            try {
                for (Iterator it = catalogService.FindAllBooks().iterator(); it.hasNext();) {
                    Book book = (Book) it.next();
                    bookList.add(book);

                }
            } catch (ObjectNotFoundException ex) {
                JOptionPane.showMessageDialog(this, " NO BOOKS FOUND ");
            }

            jComboBoxSelected.setModel(initSelectedModel(bookList));
        }
        if (jComboBoxSearchBy.getSelectedItem().equals("Moderator")) {
            EmployeService employeService = new EmployeService();
            Vector modoList = new Vector();
            try {
                for (Iterator it = employeService.FindEmployeByRight("TYPEEMPLOYERIGHT","11").iterator(); it.hasNext();) {
                    Employe employe = (Employe) it.next();
                    modoList.add(employe);
                }
            } catch (ObjectNotFoundException ex) {
                JOptionPane.showMessageDialog(this, " NO MODERATORS FOUND ");
            } catch (FinderException ex) {
                Logger.getLogger(JPanelFormAppreciations.class.getName()).log(Level.SEVERE, null, ex);
            }
            initSelectedModel(modoList);
        }
        if (jComboBoxSearchBy.getSelectedItem().equals("Customer")) {
            CustomerService customerService = new CustomerService();
            Vector customerList = new Vector();
            try {
                for (Iterator it = customerService.findCustomers().iterator(); it.hasNext();) {
                    Customer customer = (Customer) it.next();
                    customerList.add(customer);
                }
            } catch (ObjectNotFoundException ex) {
                JOptionPane.showMessageDialog(this, " NO Customers FOUNDS ");
            } catch (FinderException ex) {
                Logger.getLogger(JPanelFormAppreciations.class.getName()).log(Level.SEVERE, null, ex);
            }

            jComboBoxSelected.setModel(initSelectedModel(customerList));
        }
    }//GEN-LAST:event_jComboBoxSearchByActionPerformed

    private void jComboBoxSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectedActionPerformed
         if (jComboBoxSearchBy.getSelectedItem().equals("Title")){
              Book book = (Book)jComboBoxSelected.getSelectedItem();
              try {
                  intTabSearch(appreciationService2.FindAppreciationByChamp("TITREBOOK", book.getTitleBook()));
              } catch (ObjectNotFoundException ex) {
                  JOptionPane.showMessageDialog(this, "NO COMMENT FOUND FOR THIS BOOK");
              }
          }
    }//GEN-LAST:event_jComboBoxSelectedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            intTabSearch(appreciationService2.findAppreciation());
        } catch (FinderException ex) {
            JOptionPane.showMessageDialog(this, "DATABASE ERROR NO APPRECIATIONS FOUND FOR ANY BOOKS");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        try {
            refreshTabSearch();
        } catch (ObjectNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "DATABASE ERROR NO APPRECIATIONS FOUND FOR ANY BOOKS");
        }
    }//GEN-LAST:event_jButtonClearActionPerformed
    private void selectLineWaiting(ListSelectionEvent evt) {

        ListSelectionModel lsm = (ListSelectionModel) evt.getSource();

        if (lsm.isSelectionEmpty()) {
            System.out.println("No rows selected");
        } else {
            int selectedRow = lsm.getMinSelectionIndex();
            Appreciation comment = (Appreciation) comments.get(selectedRow);
            jTextAppreciation.setText(comment.getCommentAppreciate());
            jLabelLogin.setText(comment.getLoginCustomerAppreciate().getLoginCustomer());
            jTextDate.setText(comment.getDateAppreciate());
            jTextIp.setText(comment.getId());
            jTextModerator.setText(comment.getLoginEmployeAppreciate().getLoginEmploye());

        }
    }
    private void selectLineSearch(ListSelectionEvent evt) {

        ListSelectionModel lsm = (ListSelectionModel) evt.getSource();

        if (lsm.isSelectionEmpty()) {
            System.out.println("No rows selected");
        } else {
            int selectedRow = lsm.getMinSelectionIndex();
            Appreciation comment = (Appreciation) comments.get(selectedRow);
            jTextAppreciation.setText(comment.getCommentAppreciate());
            jLabelLogin.setText(comment.getLoginCustomerAppreciate().getLoginCustomer());
            jTextDate.setText(comment.getDateAppreciate());
            jTextIp.setText(comment.getId());
            jTextModerator.setText(comment.getLoginEmployeAppreciate().toString());

        }
    }
    

    private void refreshTabWaiting() throws ObjectNotFoundException {
        comments.removeAllElements();
        int lignes = tabModelWait.getRowCount();
        for (int i = lignes - 1; i >= 0; i--) {
            tabModelWait.removeRow(i);
        }
        intTabWaiting();
    }
    private void refreshTabSearch() throws ObjectNotFoundException {
        oldComments.removeAllElements();
        int lignes = tabModelSearch.getRowCount();
        for (int i = lignes - 1; i >= 0; i--) {
            tabModelSearch.removeRow(i);
        }
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSearchBook;
    private javax.swing.JButton jButtonSetStatus;
    private javax.swing.JComboBox<String> jComboBoxSearchBy;
    private javax.swing.JComboBox<String> jComboBoxSelected;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabelAppreciation;
    private javax.swing.JLabel jLabelAppreciationStatus;
    private javax.swing.JLabel jLabelCustomerLogin;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDate1;
    private javax.swing.JLabel jLabelIp;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelTitleISBN;
    private javax.swing.JPanel jPanelBackgroundAppreciation;
    private javax.swing.JPanel jPanelManager;
    private javax.swing.JPanel jPanelSearchAppreciation;
    private javax.swing.JPanel jPanelSearchBook;
    private javax.swing.JPanel jPanelTraitment;
    private javax.swing.JScrollPane jScrollPaneAppreciation;
    private javax.swing.JScrollPane jScrollPaneAppreciationsWaiting;
    private javax.swing.JScrollPane jScrollPaneShowAppreciations;
    private javax.swing.JTable jTableView;
    private javax.swing.JTable jTableWaiting;
    private javax.swing.JTextArea jTextAppreciation;
    private javax.swing.JLabel jTextDate;
    private javax.swing.JLabel jTextIp;
    private javax.swing.JLabel jTextModerator;
    private javax.swing.JTextField jTextTitleISBN;
    // End of variables declaration//GEN-END:variables
}
