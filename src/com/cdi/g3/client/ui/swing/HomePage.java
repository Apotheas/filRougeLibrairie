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
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        JPanelFormOrders panelOrders = new JPanelFormOrders();
        JPanelFormBooks panelBooks = new JPanelFormBooks();
        JPanelFormCustomers panelAccounts = new JPanelFormCustomers();
        JPanelFormEvents panelEvents = new JPanelFormEvents();
        JPanelFormThemes panelThemes = new JPanelFormThemes();
        JPanelFormAuthor panelAuthors = new JPanelFormAuthor();
        JPanelFormEmployees panelEmployees  = new JPanelFormEmployees();
        JPanelFormKeyWords panelKeyWords = new JPanelFormKeyWords();
        JPanelFormAppreciations panelAppreciations = new JPanelFormAppreciations();
        
        jInternalFrameOrders.setContentPane(panelOrders);
        jInternalFrameBooks.setContentPane(panelBooks);
        jInternalFrameCustomers.setContentPane(panelAccounts);
        jInternalFrameEvents.setContentPane(panelEvents);
        jInternalFrameThemes.setContentPane(panelThemes);
        jInternalFrameAuthors.setContentPane(panelAuthors);
        jInternalFrameEmployees.setContentPane(panelEmployees);
        jInternalFrameAppreciations.setContentPane(panelAppreciations);
        jInternalFrameKeyWords.setContentPane(panelKeyWords);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneHomePage = new javax.swing.JTabbedPane();
        jInternalFrameOrders = new javax.swing.JInternalFrame();
        jInternalFrameCustomers = new javax.swing.JInternalFrame();
        jInternalFrameEmployees = new javax.swing.JInternalFrame();
        jInternalFrameBooks = new javax.swing.JInternalFrame();
        jInternalFrameEvents = new javax.swing.JInternalFrame();
        jInternalFrameThemes = new javax.swing.JInternalFrame();
        jInternalFrameAuthors = new javax.swing.JInternalFrame();
        jInternalFrameKeyWords = new javax.swing.JInternalFrame();
        jInternalFrameAppreciations = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jTabbedPaneHomePage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Management System", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jInternalFrameOrders.setVisible(true);

        javax.swing.GroupLayout jInternalFrameOrdersLayout = new javax.swing.GroupLayout(jInternalFrameOrders.getContentPane());
        jInternalFrameOrders.getContentPane().setLayout(jInternalFrameOrdersLayout);
        jInternalFrameOrdersLayout.setHorizontalGroup(
            jInternalFrameOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jInternalFrameOrdersLayout.setVerticalGroup(
            jInternalFrameOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("Orders", jInternalFrameOrders);

        jInternalFrameCustomers.setBorder(null);
        jInternalFrameCustomers.setVisible(true);

        javax.swing.GroupLayout jInternalFrameCustomersLayout = new javax.swing.GroupLayout(jInternalFrameCustomers.getContentPane());
        jInternalFrameCustomers.getContentPane().setLayout(jInternalFrameCustomersLayout);
        jInternalFrameCustomersLayout.setHorizontalGroup(
            jInternalFrameCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        jInternalFrameCustomersLayout.setVerticalGroup(
            jInternalFrameCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("Customers", jInternalFrameCustomers);

        jInternalFrameEmployees.setVisible(true);

        javax.swing.GroupLayout jInternalFrameEmployeesLayout = new javax.swing.GroupLayout(jInternalFrameEmployees.getContentPane());
        jInternalFrameEmployees.getContentPane().setLayout(jInternalFrameEmployeesLayout);
        jInternalFrameEmployeesLayout.setHorizontalGroup(
            jInternalFrameEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jInternalFrameEmployeesLayout.setVerticalGroup(
            jInternalFrameEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("Employees", jInternalFrameEmployees);

        jInternalFrameBooks.setVisible(true);

        javax.swing.GroupLayout jInternalFrameBooksLayout = new javax.swing.GroupLayout(jInternalFrameBooks.getContentPane());
        jInternalFrameBooks.getContentPane().setLayout(jInternalFrameBooksLayout);
        jInternalFrameBooksLayout.setHorizontalGroup(
            jInternalFrameBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jInternalFrameBooksLayout.setVerticalGroup(
            jInternalFrameBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("Books", jInternalFrameBooks);

        jInternalFrameEvents.setVisible(true);
        jInternalFrameEvents.getContentPane().setLayout(new javax.swing.OverlayLayout(jInternalFrameEvents.getContentPane()));
        jTabbedPaneHomePage.addTab("Events", jInternalFrameEvents);

        jInternalFrameThemes.setVisible(true);

        javax.swing.GroupLayout jInternalFrameThemesLayout = new javax.swing.GroupLayout(jInternalFrameThemes.getContentPane());
        jInternalFrameThemes.getContentPane().setLayout(jInternalFrameThemesLayout);
        jInternalFrameThemesLayout.setHorizontalGroup(
            jInternalFrameThemesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jInternalFrameThemesLayout.setVerticalGroup(
            jInternalFrameThemesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("Themes", jInternalFrameThemes);

        jInternalFrameAuthors.setVisible(true);

        javax.swing.GroupLayout jInternalFrameAuthorsLayout = new javax.swing.GroupLayout(jInternalFrameAuthors.getContentPane());
        jInternalFrameAuthors.getContentPane().setLayout(jInternalFrameAuthorsLayout);
        jInternalFrameAuthorsLayout.setHorizontalGroup(
            jInternalFrameAuthorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jInternalFrameAuthorsLayout.setVerticalGroup(
            jInternalFrameAuthorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("Authors", jInternalFrameAuthors);

        jInternalFrameKeyWords.setVisible(true);

        javax.swing.GroupLayout jInternalFrameKeyWordsLayout = new javax.swing.GroupLayout(jInternalFrameKeyWords.getContentPane());
        jInternalFrameKeyWords.getContentPane().setLayout(jInternalFrameKeyWordsLayout);
        jInternalFrameKeyWordsLayout.setHorizontalGroup(
            jInternalFrameKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jInternalFrameKeyWordsLayout.setVerticalGroup(
            jInternalFrameKeyWordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("KeyWords", jInternalFrameKeyWords);

        jInternalFrameAppreciations.setVisible(true);

        javax.swing.GroupLayout jInternalFrameAppreciationsLayout = new javax.swing.GroupLayout(jInternalFrameAppreciations.getContentPane());
        jInternalFrameAppreciations.getContentPane().setLayout(jInternalFrameAppreciationsLayout);
        jInternalFrameAppreciationsLayout.setHorizontalGroup(
            jInternalFrameAppreciationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jInternalFrameAppreciationsLayout.setVerticalGroup(
            jInternalFrameAppreciationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jTabbedPaneHomePage.addTab("Appreciations", jInternalFrameAppreciations);

        getContentPane().add(jTabbedPaneHomePage);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrameAppreciations;
    private javax.swing.JInternalFrame jInternalFrameAuthors;
    private javax.swing.JInternalFrame jInternalFrameBooks;
    private javax.swing.JInternalFrame jInternalFrameCustomers;
    private javax.swing.JInternalFrame jInternalFrameEmployees;
    private javax.swing.JInternalFrame jInternalFrameEvents;
    private javax.swing.JInternalFrame jInternalFrameKeyWords;
    private javax.swing.JInternalFrame jInternalFrameOrders;
    private javax.swing.JInternalFrame jInternalFrameThemes;
    private javax.swing.JTabbedPane jTabbedPaneHomePage;
    // End of variables declaration//GEN-END:variables
}
