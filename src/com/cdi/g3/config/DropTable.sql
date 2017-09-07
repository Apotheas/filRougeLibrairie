/*==============================================================*/
/* Table: APPRECIATION                                          */
/*==============================================================*/


ALTER TABLE APPRECIATION 
DROP CONSTRAINT FK_APPRECIA_APPRECIAT_CUSTOMER 

ALTER TABLE APPRECIATION 
DROP CONSTRAINT FK_APPRECIA_BEAPPRECI_BOOK 

ALTER TABLE APPRECIATION 
DROP CONSTRAINT FK_APPRECIA_MODERATE_EMPLOYE 

ALTER TABLE APPRECIATION 
DROP CONSTRAINT FK_APPRECIA_RECUPERAT_ORDERLIN 

drop index if exists APPRECIATION.MODERATE_FK;

drop index if exists APPRECIATION.BEAPPRECIATE_FK;

drop index if exists APPRECIATION.APPRECIATE_FK;

drop index if exists APPRECIATION.RECUPERATE_FK;

drop index if exists APPRECIATION.APPRECIATION_PK;

drop table if exists APPRECIATION;


/*==============================================================*/
/* Table: ORDERLINE                                             */
/*==============================================================*/
drop index if exists ORDERLINE.RECUPERATE2_FK;

drop index if exists ORDERLINE.REPRESENT_FK;

drop index if exists ORDERLINE.PUT_FK;

drop index if exists ORDERLINE.ORDERLINE_PK;

drop table if exists ORDERLINE;


/*==============================================================*/
/* Table: "ORDER"                                               */
/*==============================================================*/
drop index if exists "ORDER".STATUATE_FK;

drop index if exists "ORDER".PREPARED_FK;

drop index if exists "ORDER".SHIP_FK;

drop index if exists "ORDER".BILL_FK;

drop index if exists "ORDER".BUY_FK;

drop index if exists "ORDER".ORDER_PK;

drop table if exists "ORDER";

/*==============================================================*/
/* Table: ADRESS                                                */
/*==============================================================*/
drop index if exists ADRESS.HAVE_FK;

drop index if exists ADRESS.DEFAULTBILL_FK;

drop index if exists ADRESS.DEFAULTSHIP_FK;

drop index if exists ADRESS.ADRESS_PK;

drop table if exists ADRESS;

/*==============================================================*/
/* Table: PACKAGESHIPPER                                        */
/*==============================================================*/
drop index if exists PACKAGESHIPPER.SHIPPED_FK;

drop index if exists PACKAGESHIPPER.PACKAGESHIPPER_PK;

drop table if exists PACKAGESHIPPER;

/*==============================================================*/
/* Table: INFOCOMPANY                                           */
/*==============================================================*/
drop index if exists INFOCOMPANY.PRECISE_FK;

drop index if exists INFOCOMPANY.INFOCOMPANY_PK;

drop table if exists INFOCOMPANY;

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
drop index if exists COMPANY.COMPANY_PK;

drop table if exists COMPANY;

/*==============================================================*/
/* Table: INFOSTATUS                                                */
/*==============================================================*/
drop index if exists INFOSTATUS.STATUS_PK;

drop table if exists INFOSTATUS;

/*==============================================================*/
/* Table: SHIPPER                                               */
/*==============================================================*/
drop index if exists SHIPPER.SHIPPER_PK;

drop table if exists SHIPPER;

/*==============================================================*/
/* Table: AUTHORBOOK                                            */
/*==============================================================*/
drop index if exists AUTHORBOOK.WRITE2_FK;

drop index if exists AUTHORBOOK.WRITE_FK;

drop index if exists AUTHORBOOK.WRITE_PK;

drop table if exists AUTHORBOOK;

/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/
drop index if exists AUTHOR.AUTHOR_PK;

drop table if exists AUTHOR;

/*==============================================================*/
/* Table: CUSTOMER                                              */
/*==============================================================*/
drop index if exists CUSTOMER.CUSTOMER_PK;

drop table if exists CUSTOMER;

/*==============================================================*/
/* Table: EMPLOYE                                               */
/*==============================================================*/
drop index if exists EMPLOYE.OWN_FK;

drop index if exists EMPLOYE.EMPLOYE_PK;

drop table if exists EMPLOYE;

/*==============================================================*/
/* Table: EMPLOYERIGHT                                          */
/*==============================================================*/
drop index if exists EMPLOYERIGHT.EMPLOYERIGHT_PK;


drop table if exists EMPLOYERIGHT;

/*==============================================================*/
/* Table: EVENTBOOK                                             */
/*==============================================================*/
drop index if exists OCCATIONBOOK.PARTICIPATE2_FK;

drop index if exists OCCATIONBOOK.PARTICIPATE_FK;

drop index if exists OCCATIONBOOK.PARTICIPATE_PK;

drop table if exists OCCATIONBOOK;

/*==============================================================*/
/* Table: EVENT                                                 */
/*==============================================================*/
drop index if exists OCCATION.OCCATION_PK;

drop table if exists OCCATION;

/*==============================================================*/
/* Table: SUBTHEMEBOOK                                          */
/*==============================================================*/
drop index if exists SUBTHEMEBOOK.BELONG2_FK;

drop index if exists SUBTHEMEBOOK.BELONG_FK;

drop index if exists SUBTHEMEBOOK.BELONG_PK;

drop table if exists SUBTHEMEBOOK;

/*==============================================================*/
/* Table: SUBTHEME                                              */
/*==============================================================*/
drop index if exists SUBTHEME.BEGETS_FK;

drop index if exists SUBTHEME.SUBTHEME_PK;

drop table if exists SUBTHEME;

/*==============================================================*/
/* Table: THEME                                                 */
/*==============================================================*/
drop index if exists THEME.THEME_PK;

drop table if exists THEME;

/*==============================================================*/
/* Table: KEYWORDBOOK                                           */
/*==============================================================*/
drop index if exists KEYWORDBOOK.FOUND2_FK;

drop index if exists KEYWORDBOOK.FOUND_FK;

drop index if exists KEYWORDBOOK.FOUND_PK;

drop table if exists KEYWORDBOOK;

/*==============================================================*/
/* Table: BOOK                                                  */
/*==============================================================*/
drop index if exists BOOK.ASSOCIATE_FK;

drop index if exists BOOK.APPEAR_FK;

drop index if exists BOOK.BOOK_PK;

drop table if exists BOOK;

/*==============================================================*/
/* Table: KEYWORD                                               */
/*==============================================================*/
drop index if exists KEYWORD.KEYWORD_PK;

drop table if exists KEYWORD;

/*==============================================================*/
/* Table: CODETVA                                             */
/*==============================================================*/
drop index if exists CODETVA.CODETVA_PK;

drop table if exists CODETVA;


/*==============================================================*/
/* Table: EDITOR                                                */
/*==============================================================*/
drop index if exists EDITOR.EDITOR_PK;

drop table if exists EDITOR;




















































































