Use librairieDB
go

---- Ce trigger se declenche lors d'une insertion ou d'une mise à jour
---- dans la table Appreciation

CREATE TRIGGER insertionAppreciation
ON APPRECIATION 
--INSTEAD  OF INSERT
FOR INSERT,UPDATE 
AS


DECLARE 
@orderLine AS INT,
@appreciation AS INT,
@ErrComment AS Varchar(255),
@ErrBuy AS Varchar(255)
--set @NUMISBNBOOK1 ='2253092533'
--set  @logincustomer='Bob01'


set  @appreciation= (	select COUNT(*) 	
				From  BOOK bok, CUSTOMER cus,APPRECIATION app, inserted ins
				Where	bok.NUMISBNBOOK=  app.NUMISBNBOOKAPPRECIATE		
						and app.LOGINCUSTOMERAPPRECIATE  = cus.logincustomer
						and app.NUMISBNBOOKAPPRECIATE =ins.NUMISBNBOOKAPPRECIATE
						and	app.LOGINCUSTOMERAPPRECIATE = ins.LOGINCUSTOMERAPPRECIATE )
 
 
 set  @orderLine= (	select COUNT(*) 		
				From ORDERLINE ordl, CUSTOMER cus, BOOK bok,ORDERS ord, inserted ins
				Where	bok.NUMISBNBOOK=  ordl.NUMISBNBOOK  		
						and ordl.IDORDER  = ord.IDORDER	
						and ord.LOGINCUSTOMERORDER = cus.logincustomer		
						and ordl.NUMISBNBOOK =ins.NUMISBNBOOKAPPRECIATE
						and	ord.LOGINCUSTOMERORDER = ins.LOGINCUSTOMERAPPRECIATE )

IF @appreciation <> 0
	BEGIN
	SET @ErrComment = 'ERROR, le livre est déjà commenté.' 
    RAISERROR (@ErrComment, 16, 1)
	rollback		
	END

ELSE IF @orderLine = 0
		BEGIN
		SET @ErrBuy = 'ERROR, le livre devrait étre acheter pour étre commenté.'
        RAISERROR (@ErrBuy, 16, 1)	
		rollback		
		END
	else
	BEGIN
	INSERT INTO Appreciation SELECT * FROM INSERTED
	END
