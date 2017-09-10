USE LibrairieDB  
/* ==========================================================================================================*/
-- REQUETES 1 - 2  - 3   FOUAD 
/* ==========================================================================================================*/
-- 1) Afficher les commandes d'un client : 
/* ==========================================================================================================*/

DECLARE @LOGINCUSTOMER VARCHAR (200) ,
		@FIRSTNAMEAUTHOR VARCHAR (50) 
SET @LOGINCUSTOMER = 'bob01'  --  LOGINCUSTOMER 
Set	@FIRSTNAMEAUTHOR  = 'Raabe' -- FIRSTNAMEAUTHOR



SELECT 
 
		CUSTOMER.LASTNAMECUSTOMER ' Prenom ' , 
		CUSTOMER.FIRSTNAMECUSTOMER ' nom' , 
		
		BOOK.TITREBOOK 'titre' ,
		ORDERLINE.NUMISBNBOOK 'numero ISBN' ,
		ORDERLINE.QUANTITYORDERLINE 'quantit�',
		ORDERLINE.UNITCOSTORDERLINE'prix unitaire',
		
		
		CAST((ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE ) AS DECIMAL(20, 2)) AS 'Montant HT',
		
		ORDERLINE.RATETVAORDERLINE 'TVA' ,
		
		

		CAST((ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * (1 + ORDERLINE.RATETVAORDERLINE / 100)) AS DECIMAL(20, 2)) AS 'Montant TTC',
	 
	     
		 ORDERLINE.DISCOUNTORDERLINE 'remise ', 
		 
		CAST((ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((1 + ORDERLINE.RATETVAORDERLINE / 100)))
		  - (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((ORDERLINE.DISCOUNTORDERLINE / 100))) AS DECIMAL(20, 2)) AS 'Montant Apres Remise',
		
		ORDERS.IDORDER 'numero de commande', 
		ORDERS.DATEORDER 'date commande ' ,
		ORDERS.DATEPACKAGESHIPPERORDER 'date envoi'

	--	CAST((sum (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((1 + ORDERLINE.RATETVAORDERLINE / 100))) -
	--	   (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((ORDERLINE.DISCOUNTORDERLINE / 100)))) AS DECIMAL(20, 2)) AS 'Montant Apres Remise'
from CUSTOMER 
JOIN ORDERS 
ON CUSTOMER.LOGINCUSTOMER = ORDERS.LOGINCUSTOMERORDER 
JOIN ORDERLINE 
ON ORDERS.IDORDER = ORDERLINE.IDORDER
JOIN BOOK 
ON BOOK.NUMISBNBOOK = ORDERLINE.NUMISBNBOOK

WHERE (CUSTOMER.LOGINCUSTOMER = @LOGINCUSTOMER)

-- Calcul le total de la commande 		
	SELECT 
	
	CAST(SUM(  (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((1 + ORDERLINE.RATETVAORDERLINE / 100)))
		  - (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((ORDERLINE.DISCOUNTORDERLINE / 100)))  ) AS DECIMAL(20, 2)) AS 'Total TTC '


from CUSTOMER 
JOIN ORDERS 
ON CUSTOMER.LOGINCUSTOMER = ORDERS.LOGINCUSTOMERORDER 
JOIN ORDERLINE 
ON ORDERS.IDORDER = ORDERLINE.IDORDER
JOIN BOOK 
ON BOOK.NUMISBNBOOK = ORDERLINE.NUMISBNBOOK 
group by CUSTOMER.LOGINCUSTOMER 
having (CUSTOMER.LOGINCUSTOMER = @LOGINCUSTOMER)



/* ==========================================================================================================*/
-- 2) Afficher le panier d un client :  --------------------------------------------------------------------
/* ==========================================================================================================*/
SELECT
		CUSTOMER.LASTNAMECUSTOMER ' Prenom ' , 
		CUSTOMER.FIRSTNAMECUSTOMER ' nom' , 
		BOOK.TITREBOOK 'titre' ,
		ORDERLINE.NUMISBNBOOK 'numero ISBN' ,
		ORDERLINE.QUANTITYORDERLINE 'quantit�',
		ORDERLINE.UNITCOSTORDERLINE'prix unitaire',

		CAST((ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE ) AS DECIMAL(20, 2)) AS 'Montant HT' , 
		ORDERLINE.RATETVAORDERLINE 'TVA' ,

		CAST((ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * (1 + ORDERLINE.RATETVAORDERLINE / 100)) AS DECIMAL(20, 2)) AS 'Montant TTC',
		ORDERLINE.DISCOUNTORDERLINE 'remise ', 
	     
		CAST((ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((1 + ORDERLINE.RATETVAORDERLINE / 100)))
		  - (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((ORDERLINE.DISCOUNTORDERLINE / 100))) AS DECIMAL(20, 2)) AS 'Montant Apres Remise'


from CUSTOMER 
JOIN ORDERS 
ON CUSTOMER.LOGINCUSTOMER = ORDERS.LOGINCUSTOMERORDER 
JOIN ORDERLINE 
ON ORDERS.IDORDER = ORDERLINE.IDORDER
JOIN BOOK 
ON BOOK.NUMISBNBOOK = ORDERLINE.NUMISBNBOOK

where (CUSTOMER.LOGINCUSTOMER = @LOGINCUSTOMER)  

-- Calcul le total panier 
SELECT 
	
	CAST(SUM(  (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((1 + ORDERLINE.RATETVAORDERLINE / 100)))
		  - (ORDERLINE.UNITCOSTORDERLINE * ORDERLINE.QUANTITYORDERLINE * ((ORDERLINE.DISCOUNTORDERLINE / 100)))  ) AS DECIMAL(20, 2)) AS 'Total TTC PANIER '


from CUSTOMER 
JOIN ORDERS 
ON CUSTOMER.LOGINCUSTOMER = ORDERS.LOGINCUSTOMERORDER 
JOIN ORDERLINE 
ON ORDERS.IDORDER = ORDERLINE.IDORDER
JOIN BOOK 
ON BOOK.NUMISBNBOOK = ORDERLINE.NUMISBNBOOK 
group by CUSTOMER.LOGINCUSTOMER 
having (CUSTOMER.LOGINCUSTOMER = @LOGINCUSTOMER)

/* ==========================================================================================================*/
-- 3) Afficher les livres par Author : 
/* ==========================================================================================================*/
SELECT 
BOOK.NUMISBNBOOK 'ISBN ' ,
BOOK.TITREBOOK 'titre du livre ' ,
BOOK.SUBTITREBOOK 'sous_titre', 
BOOK.SYNOPSISBOOK 'resum� ',
AUTHOR.LASTNAMEAUTHOR 'nom ',
AUTHOR.FIRSTNAMEAUTHOR 'prenom'

from BOOK 
JOIN AUTHORBOOK 
ON BOOK.NUMISBNBOOK = AUTHORBOOK.NUMISBNBOOK 
JOIN AUTHOR 
ON AUTHORBOOK.IDAUTHOR = AUTHOR.IDAUTHOR 
WHERE (AUTHOR.FIRSTNAMEAUTHOR = @FIRSTNAMEAUTHOR) 
 
