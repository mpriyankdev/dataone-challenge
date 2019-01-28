drop table dataone_products;
create table dataone_products(id integer , name varchar2(20) , price number(18,5) , brand varchar2(20) , on_sale varchar2(5));

insert into dataone_products values (1,'SPORTS SHOES',2999.99 , 'NIKE' , true);
insert into dataone_products values (2,'SNEAKERS',1999.99 , 'NIKE' , false);
insert into dataone_products values (3,'T-SHIRT',1599.99 , 'PUMA' , false);
insert into dataone_products values (4,'SPORTS SHOES',1999.99 , 'PUMA' , true);
insert into dataone_products values (5,'SNEAKERS',1799.99 , 'PUMA' , false);
insert into dataone_products values (6,'SNEAKERS',4999.99 , 'CONVERSE' , false);
insert into dataone_products values (7,'SHORT PANTS',999.99 , 'REEBOK' , true);
insert into dataone_products values (8,'TRACK PANTS',1999.99 , 'NIKE' , true);
insert into dataone_products values (9,'LEATHER SHOES',1999.99 , 'NIKE' , false);
insert into dataone_products values (10,'TRACK PANTS',1999.99 , 'PUMA' , true);