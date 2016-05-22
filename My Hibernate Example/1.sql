
create table CONTACT(FIRSTNAME varchar(30),LASTNAME varchar(30), EMAIL varchar(60), ID int primary key)

insert into CONTACT (FIRSTNAME, LASTNAME, EMAIL, ID) values ('Manish', 'Indudhar', 'manish.indudhar@gmail.com', 6)

select * from CONTACT

delete from CONTACT where ID=6

truncate table CONTACT

drop table CONTACT