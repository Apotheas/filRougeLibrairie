

/*==============================================================*/
/* Table: EDITOR                                                */
/*==============================================================*/


/*==============================================================*/
/* Table: CODETVA                                             */
/*==============================================================*/



/*==============================================================*/
/* Table: KEYWORD                                               */
/*==============================================================*/


/*==============================================================*/
/* Table: BOOK                                                  */
/*==============================================================*/
alter table BOOK
   add constraint FK_BOOK_APPEAR_EDITOR foreign key (IDEDITORBOOK)
      references EDITOR (IDEDITOR)
      on update restrict
      on delete restrict;

alter table BOOK
   add constraint FK_BOOK_ASSOCIATE_CODETVA foreign key (TYPETVABOOK)
      references CODETVA (TYPETVA)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: KEYWORDBOOK                                           */
/*==============================================================*/
alter table KEYWORDBOOK
   add constraint FK_KEYWORDB_FOUND_BOOK foreign key (NUMISBNBOOK)
      references BOOK (NUMISBNBOOK)
      on update restrict
      on delete restrict;

alter table KEYWORDBOOK
   add constraint FK_KEYWORDB_FOUND2_KEYWORD foreign key (NAMEKEYWORD)
      references KEYWORD (NAMEKEYWORD)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: THEME                                                 */
/*==============================================================*/



/*==============================================================*/
/* Table: SUBTHEME                                              */
/*==============================================================*/
alter table SUBTHEME
   add constraint FK_SUBTHEME_BEGETS_THEME foreign key (NAMETHEME)
      references THEME (NAMETHEME)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: SUBTHEMEBOOK                                          */
/*==============================================================*/
alter table SUBTHEMEBOOK
   add constraint FK_SUBTHEME_BELONG_BOOK foreign key (NUMISBNBOOK)
      references BOOK (NUMISBNBOOK)
      on update restrict
      on delete restrict;

alter table SUBTHEMEBOOK
   add constraint FK_SUBTHEME_BELONG2_SUBTHEME foreign key (NAMESUBTHEME)
      references SUBTHEME (NAMESUBTHEME)
      on update restrict
      on delete restrict;
/*==============================================================*/
/* Table: OCCATION                                                 */
/*==============================================================*/



/*==============================================================*/
/* Table: OCCATIONBOOK                                             */
/*==============================================================*/
alter table OCCATIONBOOK
   add constraint FK_OCCATIONBOO_PARTICIPA_BOOK foreign key (NUMISBNBOOK)
      references BOOK (NUMISBNBOOK)
      on update restrict
      on delete restrict;

alter table OCCATIONBOOK
   add constraint FK_OCCATIONBOO_PARTICIPA_OCCATION foreign key (IDOCCATION)
      references OCCATION (IDOCCATION)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: EMPLOYERIGHT                                          */
/*==============================================================*/



/*==============================================================*/
/* Table: EMPLOYE                                               */
/*==============================================================*/
alter table EMPLOYE
   add constraint FK_EMPLOYE_OWN_DROITEMP foreign key (IDEMPLOYERIGHT)
      references EMPLOYERIGHT (IDEMPLOYERIGHT)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: CUSTOMER                                              */
/*==============================================================*/

/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/

/*==============================================================*/
/* Table: AUTHORBOOK                                            */
/*==============================================================*/
alter table AUTHORBOOK
   add constraint FK_AUTHORBO_WRITE_BOOK foreign key (NUMISBNBOOK)
      references BOOK (NUMISBNBOOK)
      on update restrict
      on delete restrict;

alter table AUTHORBOOK
   add constraint FK_AUTHORBO_WRITE2_AUTHOR foreign key (IDAUTHOR)
      references AUTHOR (IDAUTHOR)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: SHIPPER                                               */
/*==============================================================*/


/*==============================================================*/
/* Table: STATUS                                                */
/*==============================================================*/


/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/


/*==============================================================*/
/* Table: INFOCOMPANY                                           */
/*==============================================================*/
alter table INFOCOMPANY
   add constraint FK_INFOCOMP_PRECISE_COMPANY foreign key (SIRETINFOCOMPANY)
      references COMPANY (SIRET)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: PACKAGESHIPPER                                        */
/*==============================================================*/
alter table PACKAGESHIPPER
   add constraint FK_PACKAGES_APPLICATE_SHIPPER foreign key (NAMESHIPPER)
      references SHIPPER (NAMESHIPPER)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: ADRESS                                                */
/*==============================================================*/
alter table ADRESS
   add constraint FK_ADRESS_DEFAULTBI_CUSTOMER foreign key (LOGINCUSTOMERBILLADRESS)
      references CUSTOMER (LOGINCUSTOMER)
      on update restrict
      on delete restrict;

alter table ADRESS
   add constraint FK_ADRESS_DEFAULTSH_CUSTOMER foreign key (LOGINCUSTOMERSHIPADRESS)
      references CUSTOMER (LOGINCUSTOMER)
      on update restrict
      on delete restrict;

alter table ADRESS
   add constraint FK_ADRESS_HAVE_COMPANY foreign key (SIRETADRESS)
      references COMPANY (SIRET)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: "ORDER"                                               */
/*==============================================================*/
alter table "ORDER"
   add constraint FK_ORDER_BILL_ADRESS foreign key (IDADRESSSHIPPINGORDER)
      references ADRESS (IDADRESS)
      on update restrict
      on delete restrict;

alter table "ORDER"
   add constraint FK_ORDER_BUY_CUSTOMER foreign key (LOGINCUSTOMERORDER)
      references CUSTOMER (LOGINCUSTOMER)
      on update restrict
      on delete restrict;

alter table "ORDER"
   add constraint FK_ORDER_SHIP_ADRESS foreign key (IDADRESSBILLINGORDER)
      references ADRESS (IDADRESS)
      on update restrict
      on delete restrict;

alter table "ORDER"
   add constraint FK_ORDER_SHIPPED_PACKAGES foreign key (IDPACKAGESHIPPERORDER)
      references PACKAGESHIPPER (IDPACKAGESHIPPER)
      on update restrict
      on delete restrict;

alter table "ORDER"
   add constraint FK_ORDER_STATUATE_STATUS foreign key (NAMESTATUSORDER)
      references INFSTATUS (NAMESTATUS)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: ORDERLINE                                             */
/*==============================================================*/
alter table ORDERLINE
   add constraint FK_ORDERLIN_PUT_ORDER foreign key (IDORDER)
      references "ORDER" (IDORDER)
      on update restrict
      on delete restrict;

alter table ORDERLINE
   add constraint FK_ORDERLIN_RECUPERAT_APPRECIA foreign key (IDAPPRECIATE)
      references APPRECIATION (IDAPPRECIATE)
      on update restrict
      on delete restrict;

alter table ORDERLINE
   add constraint FK_ORDERLIN_REPRESENT_BOOK foreign key (NUMISBNBOOK)
      references BOOK (NUMISBNBOOK)
      on update restrict
      on delete restrict;

/*==============================================================*/
/* Table: APPRECIATION                                          */
/*==============================================================*/

alter table APPRECIATION
   add constraint FK_APPRECIA_APPRECIAT_CUSTOMER foreign key (LOGINCUSTOMERAPPRECIATE)
      references CUSTOMER (LOGINCUSTOMER)
      on update restrict
      on delete restrict;

alter table APPRECIATION
   add constraint FK_APPRECIA_BEAPPRECI_BOOK foreign key (NUMISBNBOOKAPPRECIATE)
      references BOOK (NUMISBNBOOK)
      on update restrict
      on delete restrict;

alter table APPRECIATION
   add constraint FK_APPRECIA_MODERATE_EMPLOYE foreign key (LOGINEMPLOYEAPPRECIATE)
      references EMPLOYE (LOGINEMPLOYE)
      on update restrict
      on delete restrict;

alter table APPRECIATION
   add constraint FK_APPRECIA_RECUPERAT_ORDERLIN foreign key (IDORDERLINEAPPRECIATE)
      references ORDERLINE (IDORDERLINE)
      on update restrict
      on delete restrict;


































