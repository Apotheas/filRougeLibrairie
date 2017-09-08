

/*==============================================================*/
/* Table: EDITOR                                                */
/*==============================================================*/
INSERT INTO Editor(
idEditor,
nameEditor,
statusEditor
)
VALUES
('1','Lafond',''),
('2','Hachette',''),
('3','Panini',''),
('4','Eyrolles',''),
('5','Bayard',''),
('6','Atlas',''),
('7','Actes Sud',''),
('8','Belin',''),
('9','Solar',''),
('10','Arthaud','')


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
INSERT INTO Book ( 
        NUMISBNBOOK ,
        IDEDITORBOOK,
        TYPETVABOOK,
        TITREBOOK,
        SUBTITREBOOK,
        UNITCOSTBOOK,
        SYNOPSISBOOK,
        PATHICONBOOK,
        WEIGHTBOOK,
        SIZELARGEBOOK,
        SIZELONGBOOK,
        STOCKBOOK,
        COMMENTBOOK,
        STATUSBOOK )


VALUES 
('2253092533','1',5.5,'Le pi�ge',null, 8.10,'L auteur � succ�s Linda Conrads n a pas quitt� sa maison depuis onze ans. Hant�e par la mort de sa soeur et le visage de son assassin, qu elle a surpris juste avant qu il ne prenne la fuite, elle vit d�sormais recluse.','http://www.gibertjoseph.com/le-piege-8950921.html',null,null,null,15,'interessant',1),
('2253092770','1',5.5, 'Da Vinci Code',null, 5.90,'Robert Langdon, un �minent sp�cialiste de symbologie de Harvard, est convoqu� d urgence au Louvre. On a d�couvert un message cod� sur le cadavre du conservateur en chef, retrouv� assassin� au milieu de la Grande Galerie.','http://www.gibertjoseph.com/da-vinci-code-8869292.html',null,null,null,11,'long et ennuyeux',1),
('2265116491','3',5.5, 'Comme de long �chos',null, 19.90,' Partout, les monstres sont chez eux... � Vincent Dussart est s�r de son coup. Ce break impos� par sa femme va prendre fin aujourd hui. Il n a rien laiss� au hasard. Comme toujours. Confiant, il p�n�tre dans la maison .','http://www.gibertjoseph.com/comme-de-longs-echos-8822343.html',null,null,null,7,null,2),
('2743640707','4',5.5, 'Les Proies',null, 9.00,'Pendant la Guerre de S�cession, un soldat yankee bless� est recueilli dans un pensionnat de jeunes filles du Sud. L intrusion d un homme bouleverse ce milieu f�minin corset� et repli� sur lui-m�me. Objet de tous les fantasmes','http://www.gibertjoseph.com/les-proies-8762857.html',null,null,null,34,'Magnifique livre , je conseille !',1),
('2330081545','6',5.5,'Le d�tective de Freud',null, 9.80,'Paris, 1911. � l issue du congr�s de l Association Psychanalytique Internationale, le jeune docteur Du Barrail est charg� par Sigmund Freud en personne d enqu�ter sur la mort myst�rieuse d un de leurs confr�res, retrouv�.','http://www.gibertjoseph.com/le-detective-de-freud-8762609.html',null,null,null,19,'Chef d oeuvre',1),
('2290147001''4',5.5,'Laisse moi t aimer',null, 7.40,null,'http://www.gibertjoseph.com/laisse-moi-t-aimer-8403762.html',null,null,null,63,null,1);
('2290140961','2',5.5, 'Les ladies de Lantern Street','La femme mystere', 4.52,null,'http://www.gibertjoseph.com/les-ladies-de-lantern-street-la-femme-mystere-8403758.html',null,null,null,25,'Top!',2);
('2290139998','7',5.5, 'Le jeu de la tentation',null, 7.95,'Trouver l amour ? En ce qui la concerne, Kate Seymour y a renonc� depuis une �ternit�. Ironie du sort, elle a h�rit� d un don infaillible : d�tecter l alchimie entre deux �tres. Alors, faisant contre mauvaise fortune','http://www.gibertjoseph.com/le-jeu-de-la-tentation-8403757.html',null,null,null,24,null,1),
('2811222510','2',5.5, 'Wild heart',null, 7.20,'Alors que Menzoberazzan go�te � un semblant de paix, lib�r�e de ses hordes de d�mons, l Outreterre panse ses plaies. Le barbare du Valbise et son compagnon halfelin, seulement d�sireux de profiter de leur nouvelle','http://www.gibertjoseph.com/le-detective-de-freud-8762609.html',null,null,null,19,'Incroyable',2),
('2290139963','3',5.5, 'Gareth',null, 4.07,'GarethGrace Burrowes (Auteur) Depuis neuf ans, Gareth Alexander se conduit en libertin. Pour satisfaire la derni�re volont� d une amie, il est contraint d apprendre � Felicity Worthington, comment diriger une maison close. Mais il ren�cle de plus','http://www.gibertjoseph.com/gareth-8392808.html',null,null,null,39,'Pas terrible',1)


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
INSERT INTO Theme ( NAMETHEME )


Values 
('Policier'),
('Amour')



/*==============================================================*/
/* Table: SUBTHEME                                              */
/*==============================================================*/
INSERT INTO SubTheme (
            NAMESUBTHEME,
            NAMETHEME)

Values 
            ('Americain','Amour'),
            ('Asiatique','Amour'),
            ('18 �me si�cles','Amour'),
            ('Moderne','Amour'),
            ('Australien','Amour'),
            ('Americain','Policier'),
            ('Asiatique','Policier'),
            ('18 �me si�cles','Policier')



/*==============================================================*/
/* Table: SUBTHEMEBOOK                                          */
/*==============================================================*/

INSERT INTO SubThemeBook ( 
            IDSUBTHEMEBOOK,
            NUMISBNBOOK,
            NAMESUBTHEME ) 

Values  ('1','2253092533','Americain');
        ('3','2253092770','Moderne'),
        ('3','2265116491','Moderne'),
        ('1','2743640707','Americain'),
        ('2','2330081545','Asiatique'),
        ('5','2290147001','Americain'),
        ('2','2290140961','Asiatique'),
        ('4','2290139998','18 �me si�cles'),
        ('3','2811222510','18 �me si�cles'),
        ('1','2290139963','Australien')


/*==============================================================*/
/* Table: OCCASION                                                 */
/*==============================================================*/
INSERT INTO Occasion (
        NAMEOCCASION ,
        DATEDEBUTOCCASION ,
        DATEFINOCCASION ,        
        DISCOUNTOCCASION ) 
VALUES 
        ('Le mois de l amour','12/07/2018','12/08/2018',5);


/*==============================================================*/
/* Table: OCCASIONBOOK                                             */
/*==============================================================*/
INSERT INTO OccasionBook (
        IDOCCASIONBOOK,          
        NUMISBNBOOK,         
        NAMEOCCASION )
    Values 
        ('1','2290147001','Le mois de l amour'),
        ('1','2290140961','Le mois de l amour'),
        ('1','2290139998','Le mois de l amour'),
        ('1','2811222510','Le mois de l amour'),
        ('1','2290139963','Le mois de l amour')


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
('1','Raabe','Melanie','à 10 ans elle vendait deja du crack, elle se mis à écrire en centre de désintox',1965-12-09,'',''),
('2','Brown','Dan','expert en communication, Dan à toujours aimé insulter le bas peuple',1945-08-07,'',''),
('3','Piacentini','Elena','Maitresse de zerbib jonathan , elle finis par le tuer et se mis à ecrire des bouquin en prison',1975-04-04,'',''),
('4','Cullinan','Thomas','pere origninel du culliningus , son premier livre fut un best fisteur ',1980-11-02,'',''),
('5','Bande','Olivier','fils de larbre, olivier na jamais supporter ecrire sur du papier  ',1969-02-11,'',''),
('7','Enoch','Susane','susan aime le chocolat et à toujours aimé faire du trampoline',1976-06-01,'',''),
('8','Quick','Amanda','adepte de la partouze, amanda decris dans ses livres ses plus grandes conquetes sexuels',1989-10-11,'',''),
('9','Haine','Lily','contrairement à son nom, lily na jamais ressenti de haine ',1979-11-09,'',''),
('10','Burrows','Grace','anciennement frere de micheal scofield, il est devenu sa soeur apres opérations',1939-11-09,2015-01-04,'')


/*==============================================================*/
/* Table: AUTHORBOOK                                            */
/*==============================================================*/
INSERT INTO AuthorBook(
idAuthorBook,
numISBNBook,
idAuthor,
)
VALUES
('1','2253092533','1'),
('2','2253092770','2'),
('3','2265116491','3'),
('4','2743640707','4'),
('5','2330081545','5'),
('6','2290147001','6'),
('7','2290140961','7'),
('8','2290139998','8'),
('9','2811222510','9'),
('10','2290139963','10')

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

VALUES  ('processing',1),
        ('shipping',2) ,
	('received',3) ,
        ('canceled',4) 
	  
 


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
INSERT INTO InfoCompagny (		
		typeInfoCompany,
		descriptionInfoCompany
		) 

VALUES ('AdressCompany','id_1 dans la table Adress'),
       ('Status1-9','Concerne Order'),
       ('Status10-19','Concerne Customer'),
       ('Status20-29','Concerne Employe'),
		 

/*==============================================================*/
/* Table: PACKAGESHIPPER                                        */
/*==============================================================*/
INSERT INTO PackageShipper(
idPackageShipper,
nameShipper,
costPackageShipper
)
VALUES
('1','DHL',8.20),
('2','DHL',4.70),
('3','DHL',0.00)


/*==============================================================*/
/* Table: ADRESS                                                */
/*==============================================================*/
INSERT INTO Adress (
			idAdress,			
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

VALUES 
('1','Bob01','Bob01','livraison','152','rue de la fontaine  ','75001','Paris','France','Marley', NULL), 

('2','Bob01','Bob01','livraison','152','rue de la fontaine  ','75001','Paris','France','Marley', NULL), 
		------------------------------------------	
('3','zidane02','zidane02','livraison','3','avenue de la republique  ','93350','le Bourget','France',NULL,NULL), 
		------------------------------------------	
('4','marc03','marc03','livraison','17','avenue charle de gaule','13001','marseille','France',NULL,NULL),
	------------------------------------------	
('5','Nicole04','Nicole04','livraison','45','rue de vincennes ','93100','Montreuil','France','Nicole',NULL ), 
	------------------------------------------			
('6','Angelina05','Angolina05','livraison','114','avenue de la division leclerc ','78100','Sartrouville','France','Angelina', NULL) 

/*==============================================================*/
/* Table: "ORDERS"                                               */
/*==============================================================*/
INSERT INTO Orders(
        idOrder,
        nameStatusOrder,
        idAdressShippingOrder,
        loginCustomerOrder,
        idAdressBillingOrder,
        InternalNumOrder,
        DateOrder,
        PaymentSystemOrder,
        ipOrder,
        datePackageShipperOrder
        )
        VALUES
        ('1',1,'2','Bob01','2','201',2017-08-09,'cb','5.135.158.101',''),
        ('2',1,'3','Zidane02','3','202',2017-04-10,'cb','37.59.119.196',''),
        ('3',2,'4','marc03','4','203',2017-08-14,'cb','46.19.137.221',2017-08-15),
        ('4',1,'5','nicole04','5','204',2017-08-21,'cb','51.15.34.210',''),
        ('5',1,'6','Angelina05','6','205',2017-08-24,'cb','24.62.155.244','')

/*==============================================================*/
/* Table: ORDERLINE                                             */
/*==============================================================*/
   INSERT INTO OrderLine (
                IDORDERLINE          
                IDAPPRECIATE        
                NUMISBNBOOK         
                IDORDER              
                QUANTITYORDERLINE    
                DISCOUNTORDERLINE    
                UNITCOSTORDERLINE    
                RATETVAORDERLINE 
                )
          Values('1',null,'2330081545','1',3,5,9.80,5.5),   
                ('2',null,'2290147001','1',1,5,7.40,5.5),    
                ('3','5','2290140961','2',1,5,4.52,5.5),   
                ('4','2','2811222510','5',2,5,7.20,5.5),    
                ('5',null,'2290139963','5',1,5,4.07,5.5),    
                ('6',null,'2253092770','4',1,5,5.90,5.5),    
                ('7',null,'2265116491','1',2,5,19.90,5.5),   
                ('8','4','2743640707','1',1,5,9.00,5.5),    
                ('8','3','2330081545','2',1,5,9.80,5.5),    
                ('9',null,'2290147001','3',2,5,7.40,5.5),    
                ('10','1','2290140961','3',1,5,4.52,5.5),
                ('11',null,'2290139998','4',1,5,7.9,5.5)


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

VALUES ('1','employe01','Bob01','1' ,'2253092533','VERY GOOD (APPRECIATION 1)',5,2017-01-11 ),
		 
	------------------------------------------	
	 ('2','employe02','zidane02','2' ,'2253092770','VERY GOOD  (APPRECIATION2)',4,2017-02-12  ), 
	-----------------------------------------	
	 ('3','employe03','marc03','3' ,'2265116491','GOOD  (APPRECIATION 3)',3,2017-03-13  ), 
	------------------------------------------
         ('4','employe01','Nicole04','3' ,'2743640707','BUFFFFF   (APPRECIATION 4)', 2,2017-04-14  ), 
------------------------------------------
	 ('5','employe02','Angelina05','4' ,'2330081545','NULLLL !!! (APPRECIATION 5)', 1,2017-05-15   )




