  insert into Appreciation ( IDAPPRECIATE,
						LOGINEMPLOYEAPPRECIATE,
							 LOGINCUSTOMERAPPRECIATE,
								IDORDERLINEAPPRECIATE,
									NUMISBNBOOKAPPRECIATE,
										 COMMENTAPPRECIATE,
											 RATINGAPPRECIATE,
												DATEAPPRECIATE,												
													IPAPPRECIATE)
 values ( '6', null, 'Bob01','1','2253092533','goooood',
				null,'2017-01-11','5.135.158.101')

select * from Appreciation



insert into Appreciation ( IDAPPRECIATE,
						LOGINEMPLOYEAPPRECIATE,
							 LOGINCUSTOMERAPPRECIATE,
								IDORDERLINEAPPRECIATE,
									NUMISBNBOOKAPPRECIATE,
										 COMMENTAPPRECIATE,
											 RATINGAPPRECIATE,
												DATEAPPRECIATE,												
													IPAPPRECIATE)
 values ( '6', null, 'Bob01','6','2253092770','goooood',
				null,'2017-01-11','5.135.158.101')

select * from Appreciation


insert into Appreciation ( IDAPPRECIATE,
						LOGINEMPLOYEAPPRECIATE,
							 LOGINCUSTOMERAPPRECIATE,
								IDORDERLINEAPPRECIATE,
									NUMISBNBOOKAPPRECIATE,
										 COMMENTAPPRECIATE,
											 RATINGAPPRECIATE,
												DATEAPPRECIATE,												
													IPAPPRECIATE)
 values ( '6', null, 'Bob01',null,'2253092533','goooood',
				null,'2017-01-11','5.135.158.101')





--select * from Appreciation
--select * from ORDERLINE
--select * from CUSTOMER


--drop trigger insertionAppreciation



--set @NUMISBNBOOK1 ='2253092533'
--set  @logincustomer='Bob01'

--select COUNT(*) 	
--				From  BOOK bok, CUSTOMER cus,APPRECIATION app
--				Where	bok.NUMISBNBOOK=  app.NUMISBNBOOKAPPRECIATE		
--						and app.LOGINCUSTOMERAPPRECIATE  = cus.logincustomer
--						and app.NUMISBNBOOKAPPRECIATE ='2253092770'
--						and	app.LOGINCUSTOMERAPPRECIATE ='Bob01' 