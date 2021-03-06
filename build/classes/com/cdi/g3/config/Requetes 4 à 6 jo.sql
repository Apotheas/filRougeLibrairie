----------4) Afficher les livres par sous-themes-----------------

SELECT nameSubTheme 'Subtheme', TitreBook'Title' ,  StockBook ' Stock ' 
FROM subThemeBook subB
JOIN subTheme sub
ON subB.idSubTheme = sub.idSubTheme
JOIN Book boo
on SubB.numISBNBook = boo.numISBNBook

Where nameSubTheme = 'Americain'


----------5) Afficher les sous-themes par themes-----------------

SELECT nameTheme 'theme', nameSubTheme 'Subtheme' 
FROM subTheme
Where nameTheme = 'Amour'
ORDER BY nameSubTheme


----------6) Afficher les Appreciations d'un livre---------------

SELECT numISBNBookAppreciate 'ISBN', titreBook 'Title',CommentAppreciate 'Appreciation',
	   RatingAppreciate 'Rate',LoginCustomerAppreciate 'CustomerLogin', LoginEmployeAppreciate 'Moderate by', 
	   dateAppreciate 'Date'
From Book boo 
JOIN Appreciation app
on boo.numISbNBook = boo.NumIsbnBook

Where numISBNBook = '2253092533'
ORDER BY  dateAppreciate