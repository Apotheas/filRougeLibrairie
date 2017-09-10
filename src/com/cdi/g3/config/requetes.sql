
--10----------- Afficher les livres achet� d'un client---------------
Declare @loginCustomer as varchar(50)
set @loginCustomer ='bob01' 

Select loginCustomer 'login', lastnameCustomer 'Name', FirstNameCustomer 'FirstName', b.NUMISBNBOOK 'book', titrebook 'titre'
From Book b
Join ORDERLINE ordl
on b.NUMISBNBOOK=ordl.NUMISBNBOOK
Join ORDERS ord
on ordl.idorder=ord.IDORDER
Join CUSTOMER cus
on ord.LOGINCUSTOMERORDER=cus.@loginCustomer
order by LOGINCUSTOMER



--11-------------Afficher les Appreciations non mod�r�s d'un livre---------------
Declare @numisbnbook as varchar(13)
set @numisbnbook ='2253092533'

Select IdAppreciate 'Appreciation' , numisbnBookappreciate ' Isbn' , titrebook 'titre'
from book b
join APPRECIATION app
on b.NUMISBNBOOK=app.NUMISBNBOOKAPPRECIATE
join Employe emp
on app.LOGINEMPLOYEAPPRECIATE=emp.LOGINEMPLOYE

where    app.moderateAPPRECIATE <> 1 
         and numisbnbookappreciate=@numisbnbook





---12---------- Afficher toutes les Appreciations non mod�r�s--------------------

Select IdAppreciate 'Appreciation' , numisbnBookappreciate ' Isbn' , titrebook 'titre'
from book b
join APPRECIATION app
on b.NUMISBNBOOK=app.NUMISBNBOOKAPPRECIATE
join Employe emp
on app.LOGINEMPLOYEAPPRECIATE=emp.LOGINEMPLOYE

where app.moderateAPPRECIATE <> 1 

-- where LOGINEMPLOYEAPPRECIATE='' and  numisbnbookappreciate='2253092533'
 


----13------------ Afficher les commandes par Statues-------------

Select  IDORDER 'numero commande',nameInfoStatusOrder 'status' , dateOrder 'date de la commande'
From INFOSTATUS sta
Join Orders ord
On sta.NAMEINFOSTATUS = ord.NAMEINFOSTATUSORDER
Order by nameInfoStatusOrder
-- Order by IdOrder