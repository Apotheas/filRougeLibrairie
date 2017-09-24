/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.g3.server.service;

import com.cdi.g3.common.exception.CheckException;
import com.cdi.g3.common.exception.FinderException;
import com.cdi.g3.server.domain.Invoice;
import com.cdi.g3.server.domain.customers.Adress;
import com.cdi.g3.server.domain.customers.Customer;
import com.cdi.g3.server.domain.orders.OrderLine;
import com.cdi.g3.server.domain.orders.Orders;
import com.cdi.g3.server.service.customers.AdressService;
import com.cdi.g3.server.service.customers.CustomerService;
import com.cdi.g3.server.service.orders.OrderService;
import com.lowagie.text.BadElementException;

import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Table;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 * @author youssef
 */
public class GeneratorInvoice {

    private String carteSosienté;
    private static AdressService serviceAdresse = new AdressService();
    private static CustomerService serviceCustomer= new CustomerService();

    public static  void printInvoce(Orders order) {
        
        Document document = new Document(PageSize.A4);
        try {
            try {
                PdfWriter.getInstance(document,
                        new FileOutputStream("D:\\Afpa_2017\\Projet_NetBeans\\filRougeLibrairie\\documents/test.pdf"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.addTitle("Hello World");
            document.addAuthor("YM");
            document.addSubject("Exemple de génération de PDF.");
            document.addKeywords("iText, test");
            document.open();
            document.add(new Paragraph("Facture Client"));
            document.add(generateAdressesHeader(order));           
            document.add(generateOrderLine(order));
        } catch (DocumentException de) {
            de.printStackTrace();
        }

        document.close();
        
        

    }


public static Table generateOrderLine(Orders order) {
        Table tableau = null;
        try {
            tableau = new Table(4, order.getListOrderLines().size()+1);
            tableau.addCell("Désignation");
            tableau.addCell("Quantity");
            tableau.addCell("PU HT");
            tableau.addCell("TOTAL HT");

            for (Iterator iterator = order.getListOrderLines().iterator(); iterator.hasNext();) {
               
                OrderLine orderLine = (OrderLine) iterator.next();
                String isbn = orderLine.getBook().getId();
                String titre = orderLine.getBook().getTitleBook();
                tableau.addCell("N° ISBN : "+isbn + " Titre : "+ titre);
                int quantity = orderLine.getQuantityOrderLine();
                tableau.addCell(String.valueOf(quantity));
                float prixUT =orderLine.getUnitCostOrderLine();
                tableau.addCell(String.valueOf(prixUT));                
                float totalHT = prixUT * quantity;
                tableau.addCell(String.valueOf(totalHT));
            }
        } catch (DocumentException de) {
            de.printStackTrace();
        }

        return tableau;

 }

public static   Table generateAdressesHeader(Orders oeder) {
    
    Table tableau =null;
        try {
            tableau = new Table(3, 2);
            tableau.addCell("Information Company");
            tableau.addCell("Client");
            tableau.addCell("Adresse de Facturation");
            tableau.addCell(generateCartCompany());
            tableau.addCell(generateCartCustomer(oeder));
            tableau.addCell(generateCartAdressShoppingCustomer(oeder));
            
        } catch (BadElementException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
          return tableau;  
}

    public static  String generateCartCompany() {
        Adress adress = null;
        try {

            adress = serviceAdresse.findAdress("1");
        } catch (CheckException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FinderException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        String strAdress = adress.getNameReceiverAdress() + "\n"
                + adress.getNumAdress() + " " + adress.getTypeStreetAdress() + " " + adress.getNameStreetAdress() + "\n"
                + adress.getNameStreet2Adress() + "\n"
                + adress.getZipcodeAdress() + " " + adress.getCountryAdress() + "\n";

        return strAdress;
    }

    public static String generateCartCustomer(Orders order) {
        
        Customer customer =null;
        try {
         customer = serviceCustomer.findCustomer(order.getCustomer().getId());
        } catch (FinderException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CheckException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String strCustomer = customer.getLastNameCustomer() + " "
                + customer.getFirstNameCustomer() + " " + customer.getNameCompanyCustomer() + "\n";
          
        
        Adress adress =null;
        try {
         adress = serviceAdresse.findAdress(order.getAdressBilling().getId());
        } catch (FinderException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CheckException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               strCustomer+= adress.getNameReceiverAdress() + "\n"
                +adress.getNumAdress() + " " + adress.getTypeStreetAdress() + " " + adress.getNameStreetAdress() + "\n"
                + adress.getNameStreet2Adress() + "\n"
                + adress.getZipcodeAdress() + " " + adress.getCountryAdress() + "\n";

        return strCustomer;
    }

    public static String generateCartAdressShoppingCustomer(Orders order) {
        Adress adress =null;
        try {
         adress = serviceAdresse.findAdress(order.getAdressShipping().getId());
        } catch (FinderException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CheckException ex) {
            Logger.getLogger(GeneratorInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String strAdress = adress.getNameReceiverAdress() + "\n"
                + adress.getNumAdress() + " " + adress.getTypeStreetAdress() + " " + adress.getNameStreetAdress() + "\n"
                + adress.getNameStreet2Adress() + "\n"
                + adress.getZipcodeAdress() + " " + adress.getCountryAdress() + "\n";

        return strAdress;
    }

}
