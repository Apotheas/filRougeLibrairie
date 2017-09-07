

/*==============================================================*/
/* Table: EDITOR                                                */
/*==============================================================*/
INSERT INTO Editor(
idEditor,
nameEditor,
statusEditor
)
VALUES
(1,'Lafond',''),
(2,'Hachette',''),
(3,'Panini',''),
(4,'Eyrolles',''),
(5,'Bayard',''),
(6,'Atlas',''),
(7,'Actes Sud',''),
(8,'Belin',''),
(9,'Solar',''),
(10,'Arthaud','')


/*==============================================================*/
/* Table: CODETVA                                             */
/*==============================================================*/
INSERT INTO CodeTVA(
typeTVA,
rateCodeTVA
)
VALUES 
('normal' , 20),
('intermediate' , 10),
('reduced' , 5.5),
('particular' , 2.1)



/*==============================================================*/
/* Table: KEYWORD                                               */
/*==============================================================*/
INSERT INTO KeyWord(
nameKeyWord)
VALUES
('Rebel'),
('Sexiste'),
('Old'),
('rare'),
('pocket')


/*==============================================================*/
/* Table: BOOK                                                  */
/*==============================================================*/


/*==============================================================*/
/* Table: KEYWORDBOOK                                           */
/*==============================================================*/
INSERT INTO KeyWordBook(
numISBNBook,
nameKeyWord
)
VALUES
('2253092533','Rebel'),
('2811222510','Sexiste'),
('2265116491','Old'),
('2290139963','rare'),
('2330081545','pocket')


/*==============================================================*/
/* Table: THEME                                                 */
/*==============================================================*/



/*==============================================================*/
/* Table: SUBTHEME                                              */
/*==============================================================*/


/*==============================================================*/
/* Table: SUBTHEMEBOOK                                          */
/*==============================================================*/

/*==============================================================*/
/* Table: OCCASION                                                 */
/*==============================================================*/



/*==============================================================*/
/* Table: OCCASIONBOOK                                             */
/*==============================================================*/

/*==============================================================*/
/* Table: EMPLOYERIGHT                                          */
/*==============================================================*/
INSERT INTO EMPLOYERIGHT 
	(idRIGHTEmploye,TypeRIGHTEmploye)
VALUES  (1,11) ,
        (2,22) , 
	(3,33)


/*==============================================================*/
/* Table: EMPLOYE                                               */
/*==============================================================*/
INSERT INTO Employe (
		 loginEmploye,
		 idEMPLOYERIGHT,
		 firstNameEmploye,
		 lastNameEmploye,
		 emailEmploye,
		 passwordEmploye ,
		 statusEmploye) 

VALUES  ('employe01',1,'George','michel', 'george.michel@compagny.com','georgePassword','') , 
        ('employe02',2,'Nina','Marie', 'nina.marie@compagny.com','ninaPassword','') ,
	('employe03',3,'marion','dupont','marion.dupont@compagny.com','marionPassword','') , 


/*==============================================================*/
/* Table: CUSTOMER                                              */
/*==============================================================*/
INSERT INTO Customer (
loginCustomer,
lastNameCustomer,
firstNameCustomer,
emailCustomer,
passwordCustomer,
nameCompanyCustomer,
commentCustomer,
statusCustomer) 

VALUES 
('Bob01','Bob',	'Marley','bob.marley@yahoo.fr',	'bobmarley01','','',''),
	  ------------------------------------------	
('zidane02','Zinedine','Zidane','zinedine.zidane@yahoo.fr','zinedinezidane02','','',''),
	------------------------------------------	
('marc03','Marc','Lewis','marc.lewis@yahoo.fr','marclewis03','','',''),
	------------------------------------------	
('Nicole04','Nicole','Kidman','nicole.kidman@yahoo.fr','nicolekidman04','','',''),
	------------------------------------------	
('Angelina05','ANgelina','jolie','angelina.jolie@yahoo.fr','angelinajolie05','Hollywood','','')


/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/

INSERT INTO Author(
idAuthor, 
firstNameAuthor,
lastNameAuthor,
biographyAuthor,
birthDateAuthor,
dieDateAuthor,
commentAuthor 
) 
VALUES
(1,'Raabe','Melanie','à 10 ans elle vendait deja du crack, elle se mis à écrire en centre de désintox',1965-12-09,'',''),
(2,'Brown','Dan','expert en communication, Dan à toujours aimé insulter le bas peuple',1945-08-07,'',''),
(3,'Piacentini','Elena','Maitresse de zerbib jonathan , elle finis par le tuer et se mis à ecrire des bouquin en prison',1975-04-04,'',''),
(4,'Cullinan','Thomas','pere origninel du culliningus , son premier livre fut un best fisteur ',1980-11-02,'',''),
(5,'Bande','Olivier','fils de larbre, olivier na jamais supporter ecrire sur du papier  ',1969-02-11,'',''),
(7,'Enoch','Susane','susan aime le chocolat et à toujours aimé faire du trampoline',1976-06-01,'',''),
(8,'Quick','Amanda','adepte de la partouze, amanda decris dans ses livres ses plus grandes conquetes sexuels',1989-10-11,'',''),
(9,'Haine','Lily','contrairement à son nom, lily na jamais ressenti de haine ',1979-11-09,'',''),
(10,'Burrows','Grace','anciennement frere de micheal scofield, il est devenu sa soeur apres opérations',1939-11-09,2015-01-04,'')


/*==============================================================*/
/* Table: AUTHORBOOK                                            */
/*==============================================================*/
INSERT INTO AuthorBook(
idAuthorBook,
numISBNBook,
idAuthor,
)
VALUES
(1,'2253092533',1),
(2,'2253092770',2),
(3,'2265116491',3),
(4,'2743640707',4),
(5,'2330081545',5),
(6,'2290147001',6),
(7,'2290140961',7),
(8,'2290139998',8),
(9,'2811222510',9),
(10,'2290139963',10)

/*==============================================================*/
/* Table: SHIPPER                                               */
/*==============================================================*/
INSERT INTO Shipper(
nameShipper,
commentShipper
) 
VALUES 
('la Poste',''),
('DHL',''),
('Ups','beaucoup trop cher')


/*==============================================================*/
/* Table: INFOSTATUS                                                */
/*==============================================================*/
INSERT INTO InfoStatus
	 (nameInfoStatus,valueInfoStatus) 

VALUES  ('in delivery',1) ,
	('deliver',2) ,
	  
 


/*==============================================================*/
/* Table: COMPANY                                               */
/*==============================================================*/
INSERT INTO Company (
siretCompany,
nameCompany,
logoCompany,
telephoneCompany,
faxCompany,
mailCompany)

VALUES (
'33458219400018',
'Librairie Compagnie',
'logoLibrairie Compagnie' ,
'0143263814',
'0146346337',
'info@librairie-compagnie.fr')
/*another compagny-- ('57219879400024', 'Librairie Le Divan',
'logo Librairie Le Divan' ,'0153689068','0153689069','ledivan@ledivan.com'),*/

/*==============================================================*/
/* Table: INFOCOMPANY                                           */
/*==============================================================*/


/*==============================================================*/
/* Table: PACKAGESHIPPER                                        */
/*==============================================================*/
INSERT INTO PackageShipper(
idPackageShipper,
nameShipper,
costPackageShipper
)
VALUES
(1,'DHL',8.20),
(2,'DHL',4.70),
(3,'DHL',0.00)


/*==============================================================*/
/* Table: ADRESS                                                */
/*==============================================================*/
INSERT INTO Adress (
			idAdress,
			siretCompanyAdress,
			loginCustomerShipAdress,
			loginCustomerBillAdress,
			typeStreetAdress,
			numAdress,
			nameStreetAdress,
			nameSteet2Adress,
			zipCodeAdress,
			cityAdress,
			countryAdress,
			nameReceiverAdress ,
			nameCompanyReceiverAdress
			 ) 

VALUES (1,'57219879400024','Bob01','Bob01','livraison','152','rue de la fontaine  ','75001','Paris','France','Marley', NULL), 
		------------------------------------------	
(2,'57219879400024','zidane02','zidane02','livraison','3','avenue de la republique  ','93350','le Bourget','France',NULL,NULL), 
		------------------------------------------	
(3,'57219879400024','marc03','marc03','livraison','17','avenue charle de gaule','13001','marseille','France',NULL,NULL),
	------------------------------------------	
(4,'57219879400024','Nicole04','Nicole04','livraison','45','rue de vincennes ','93100','Montreuil','France','Nicole',NULL ), 
	------------------------------------------			
(5,'57219879400024','Angelina05','Angolina05','livraison','114','avenue de la division leclerc ','78100','Sartrouville','France','Angelina', NULL) 

/*==============================================================*/
/* Table: "ORDERS"                                               */
/*==============================================================*/


/*==============================================================*/
/* Table: ORDERLINE                                             */
/*==============================================================*/


/*==============================================================*/
/* Table: APPRECIATION                                          */
/*==============================================================*/
INSERT INTO Appreciation 
		(
		idAppreciate,
		loginEmployeAppreciate,
		loginCustomerAppreciate,
		idOrderLineAppreciate ,
		numISBNBookAppreciate,
		commentAppreciate,
		ratingAppreciate,
		dateAppreciate
		) 

VALUES (1,'employe01','Bob01',1 ,'2253092533','VERY GOOD (APPRECIATION 1)',5,'20170111 16:00:00'),
		 
	------------------------------------------	
	 (2,'employe02','zidane02',2 ,'2253092770','VERY GOOD  (APPRECIATION2)',4,'20170212 17:00:00' ), 
	-----------------------------------------	
	 (3,'employe03','marc03',3 ,'2265116491','GOOD  (APPRECIATION 3)',3,'20170313 17:00:00' ), 
	------------------------------------------
         (4,'employe01','Nicole04',3 ,'2743640707','BUFFFFF   (APPRECIATION 4)', 2,'20170414 17:00:00' ), 
------------------------------------------
	 (5,'employe02','Angelina05',4 ,'2330081545','NULLLL !!! (APPRECIATION 5)', 1,'20170515 17:00:00'  )

-- InfoCompagny -------------------------------------------------------------------------------------

INSERT INTO InfoCompagny (		
		typeInfoCompany,
		descriptionInfoCompany
		) 

VALUES ('AdressCompany','id_1 dans la table Adress'),
       ('Status1-9','Concerne Order'),
       ('Status10-19','Concerne Customer'),
       ('Status20-29','Concerne Employe'),
		 
