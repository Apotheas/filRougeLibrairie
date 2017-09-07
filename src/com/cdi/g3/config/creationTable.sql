
/*==============================================================*/
/* Table: EDITOR                                                */
/*==============================================================*/
create table EDITOR 
(
   IDEDITOR             integer                        not null ,
   NAMEEDITOR           char(50)                       not null,
   STATUSEDITOR         integer                        null,
   constraint PK_EDITOR primary key (IDEDITOR)
);

/*==============================================================*/
/* Table: CODETVA                                             */
/*==============================================================*/
create table CODETVA 
(
   TYPETVA              varchar(50)                    not null,
   RATECODETVA          float(3)                       not null,
   constraint PK_CODETVA primary key (TYPETVA)
);
/*==============================================================*/
/* Table: KEYWORD                                               */
/*==============================================================*/
create table KEYWORD 
(
   NAMEKEYWORD          varchar(50)                    not null,
   constraint PK_KEYWORD primary key (NAMEKEYWORD)
);

/*==============================================================*/
/* Table: BOOK                                                  */
/*==============================================================*/
create table BOOK 
(
   NUMISBNBOOK          varchar(13)                    not null,
   IDEDITORBOOK         integer                        not null,
   TYPETVABOOK          varchar(50)                    not null,
   TITREBOOK            varchar(50)                    not null,
   SUBTITREBOOK         varchar(50)                    null,
   UNITCOSTBOOK         float                          not null,
   SYNOPSISBOOK         varchar(1000)                  null,
   PATHICONBOOK         varchar(50)                    null,
   WEIGHTBOOK           float                          null,
   SIZELARGEBOOK        float                          null,
   SIZELONGBOOK         float                          null,
   STOCKBOOK            integer                        not null,
   COMMENTBOOK          varchar(250)                   null,
   STATUSBOOK           integer                        not null,
   constraint PK_BOOK primary key (NUMISBNBOOK)
);

/*==============================================================*/
/* Table: KEYWORDBOOK                                           */
/*==============================================================*/
create table KEYWORDBOOK 
(
   IDKEYWORDBOOK        integer                        not null,
   NUMISBNBOOK          varchar(13)                    not null,
   NAMEKEYWORD          varchar(50)                    not null,
   constraint PK_KEYWORDBOOK primary key clustered (IDKEYWORDBOOK)
);
/*==============================================================*/
/* Table: THEME                                                 */
/*==============================================================*/
create table THEME 
(
   NAMETHEME            varchar(50)                    not null,
   constraint PK_THEME primary key (NAMETHEME)
);


/*==============================================================*/
/* Table: SUBTHEME                                              */
/*==============================================================*/
create table SUBTHEME 
(
   NAMESUBTHEME         varchar(50)                    not null,
   NAMETHEME            varchar(50)                    not null,
   constraint PK_SUBTHEME primary key (NAMESUBTHEME)
);

/*==============================================================*/
/* Table: SUBTHEMEBOOK                                          */
/*==============================================================*/
create table SUBTHEMEBOOK 
(
   IDSUBTHEMEBOOK       integer                        not null,
   NUMISBNBOOK          varchar(13)                    not null,
   NAMESUBTHEME         varchar(50)                    not null,
   constraint PK_SUBTHEMEBOOK primary key clustered (IDSUBTHEMEBOOK)
);
/*==============================================================*/
/* Table: OCCASION                                                 */
/*==============================================================*/
create table OCCASION 
(
   IDOCCASION              char(10)                       not null,
   DATEDEBUTOCCASION       date                           not null,
   DATEFINOCCASION        date                           not null,
   NAMEOCCASION           varchar(50)                    not null,
   DISCOUNTOCCASION        float                          null,
   constraint PK_OCCASION primary key (IDOCCASION)
);
/*==============================================================*/
/* Table: EVENTBOOK                                             */
/*==============================================================*/
create table OCCASIONBOOK 
(
   IDOCCASIONBOOK          integer                        not null,
   NUMISBNBOOK          varchar(13)                    not null,
   IDOCCASION              char(10)                       not null,
   constraint PK_OCCASIONBOOK primary key clustered (IDOCCASIONBOOK)
);

/*==============================================================*/
/* Table: EMPLOYERIGHT                                         */
/*==============================================================*/
create table EMPLOYERIGHT 
(
   IDEMPLOYERIGHT       integer                        not null ,
   TYPEEMPLOYERIGHT     integer                        not null,
   constraint PK_EMPLOYERIGHT primary key (IDEMPLOYERIGHT)
);
/*==============================================================*/
/* Table: EMPLOYE                                               */
/*==============================================================*/
create table EMPLOYE 
(
   LOGINEMPLOYE         varchar(50)                    not null,
   IDEMPLOYERIGHT       integer                        not null,
   FIRSTNAMEEMPLOYE     varchar(50)                    null,
   LASTNAMEEMPLOYE      varchar(50)                    null,
   EMAILEMPLOYE         varchar(50)                    null,
   PASSWORDEMPLOYE      varchar(50)                    null,
   STATUSEMPLOYE        integer                        null,
   constraint PK_EMPLOYE primary key (LOGINEMPLOYE)
);


/*==============================================================*/
/* Table: CUSTOMER                                              */
/*==============================================================*/
create table CUSTOMER 
(
   LOGINCUSTOMER        varchar(50)                    not null,
   LASTNAMECUSTOMER     char(50)                       not null,
   FIRSTNAMECUSTOMER    char(50)                       not null,
   EMAILCUSTOMER        varchar(50)                    not null,
   PASSWORDCUSTOMER     varchar(50)                    not null,
   NAMECOMPANYCUSTOMER  varchar(50)                    null,
   COMMENTCUSTOMER      varchar(250)                   null,
   STATUSCUSTOMER       integer                        null,
   constraint PK_CUSTOMER primary key (LOGINCUSTOMER)
);

/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/
create table AUTHOR 
(
   IDAUTHOR             integer                        not null,
   FIRSTNAMEAUTHOR      char(50)                       null,
   LASTNAMEAUTHOR       char(50)                       not null,
   BIOGRAPHYAUTHOR           char(250)                      null,
   BIRTHDATEAUTHOR      date                           not null,
   DIEDATEAUTHOR        date                           null,
   COMMENTAUTHOR        varchar(250)                   null,
   constraint PK_AUTHOR primary key (IDAUTHOR)
);

/*==============================================================*/
/* Table: AUTHORBOOK                                            */
/*==============================================================*/
create table AUTHORBOOK 
(
   IDAUTHORBOOK         integer                        not null,
   NUMISBNBOOK          varchar(13)                    not null,
   IDAUTHOR             integer                        not null,
   constraint PK_AUTHORBOOK primary key clustered (IDAUTHORBOOK)
);

/*==============================================================*/
/* Table: SHIPPER                                               */
/*==============================================================*/
create table SHIPPER 
(
   NAMESHIPPER          varchar(50)                    not null,
   COMMENTSHIPPER       varchar(250)                   null,
   constraint PK_SHIPPER primary key (NAMESHIPPER)
);

/*==============================================================*/
/* Table: INFOSTATUS                                                */
/*==============================================================*/
create table INFOSTATUS 
(
   NAMEINFOSTATUS           varchar(50)                    not null,
   VALUEINFOSTATUS         integer                        not null,
   constraint PK_INFOSTATUS primary key (NAMEINFOSTATUS)
);

/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
create table COMPANY 
(
   SIRETCOMPANY                varchar(14)                    not null,
   NAMECOMPANY          varchar(50)                    not null,
   LOGOCOMPANY          varchar(100)                   not null,
   TELEPHONECOMPANY     varchar(12)                    null,
   FAXCOMPANY           varchar(12)                    null,
   MAILCOMPANY          varchar(30)                    null,
   constraint PK_COMPANY primary key (SIRETCOMPANY)
);

/*==============================================================*/
/* Table: INFOCOMPANY                                           */
/*==============================================================*/
create table INFOCOMPANY 
(
   IDINFOCOMPANY        integer                        not null ,
   SIRETCOMPANY     varchar(14)                    not null,
   TYPEINFOCOMPANY      varchar(50)                    not null,
   DESCRIPTIONINFOCOMPANY varchar(250)                   not null,
   constraint PK_INFOCOMPANY primary key (IDINFOCOMPANY)
);

/*==============================================================*/
/* Table: PACKAGESHIPPER                                        */
/*==============================================================*/
create table PACKAGESHIPPER 
(
   IDPACKAGESHIPPER     integer                        not null ,
   NAMESHIPPER          varchar(50)                    not null,
   COSTPACKAGESHIPPER   float                          null,
   constraint PK_PACKAGESHIPPER primary key (IDPACKAGESHIPPER)
);

/*==============================================================*/
/* Table: ADRESS                                                */
/*==============================================================*/
create table ADRESS 
(
   IDADRESS             integer                        not null ,
   SIRETCOMPANYADRESS          varchar(14)                    not null,
   LOGINCUSTOMERSHIPADRESS varchar(50)                 not null,
   LOGINCUSTOMERBILLADRESS varchar(50)                 not null,
   TYPESTREETADRESS     varchar(30)                    null,
   NUMADRESS            varchar(10)                    not null,
   NAMESTREETADRESS     varchar(50)                    not null,
   NAMESTEET2ADRESS     varchar                   null,
   ZIPCODEADRESS        varchar(5)                     not null,
   CITYADRESS           varchar(40)                    not null,
   COUNTRYADRESS        varchar(50)                    not null,
   NAMERECEIVERADRESS   varchar(50)                    not null,
   NAMECOMPANYRECEIVERADRESS varchar(50)                    null,
   constraint PK_ADRESS primary key (IDADRESS)
);

/*==============================================================*/
/* Table: "ORDERS"                                               */
/*==============================================================*/
create table "ORDERS" 
(
   IDORDER              integer                        not null,
   NAMEINFOSTATUSORDER      varchar(50)                    not null,
   IDADRESSSHIPPINGORDER integer                        not null,
   LOGINCUSTOMERORDER   varchar(50)                    not null,
   IDADRESSBILLINGORDER integer                        not null,
   IDPACKAGESHIPPERORDER integer                        not null,
   INTERNALNUMORDER     integer                        null,
   DATEORDER            date                           not null,
   PAYMENTSYSTEMORDER   varchar(50)                    not null,
   IPORDER              varchar(45)                    not null,
   DATEPACKAGESHIPPERORDER date                           null,
   constraint PK_ORDER primary key (IDORDER)
);
/*==============================================================*/
/* Table: ORDERLINE                                             */
/*==============================================================*/
create table ORDERLINE 
(
   IDORDERLINE          integer                        not null,
   IDAPPRECIATE         integer                        not null,
   NUMISBNBOOK          varchar(13)                    not null,
   IDORDER              integer                        not null,
   QUANTITYORDERLINE    smallint                       not null,
   DISCOUNTORDERLINE    numeric(8)                     null,
   UNITCOSTORDERLINE    float                          not null,
   RATETVAORDERLINE     float                          not null,
   constraint PK_ORDERLINE primary key (IDORDERLINE)
);

/*==============================================================*/
/* Table: APPRECIATION                                          */
/*==============================================================*/
create table APPRECIATION 
(
   IDAPPRECIATE         integer                        not null ,
   LOGINEMPLOYEAPPRECIATE varchar(50)                    not null,
   LOGINCUSTOMERAPPRECIATE varchar(50)                    not null,
   IDORDERLINEAPPRECIATE integer                        not null,
   NUMISBNBOOKAPPRECIATE varchar(13)                    not null,
   COMMENTAPPRECIATE    varchar(500)                   null,
   RATINGAPPRECIATE     smallint                       null,
   DATEAPPRECIATE       date                           not null,
   IPAPPRECIATE         varchar(45)                    not null,
   constraint PK_APPRECIATION primary key (IDAPPRECIATE)
);
