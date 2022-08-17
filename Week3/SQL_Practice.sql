-- Querying Practice
select * from "Employee";

select * from "Employee" where "LastName" = 'King';

select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" is null;

select * from "Album" order by "Title" desc;

select "FirstName" from "Customer" order by "City";

select * from "Invoice" where "BillingAddress" like 'T%';

select * from "Invoice" where "Total" between 15 and 50;

select * from "Employee" where "HireDate" between '2003-06-01' and '2004-03-01';

-- Insert practice
insert into "Genre" ("GenreId", "Name") values (26, 'AnotherGenre');
insert into "Genre" ("GenreId", "Name") values (27, 'YetAnotherGenre');

insert into "Employee"
("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email")
VALUES(9, 'Sanchez', 'Rick', 'Leader of the Citadel', NULL, '1952-04-10 00:00:00.000', '1952-04-11 00:00:00.000', 'Somewhere', 'on', 'the', 'Milkyway', 'Galaxy', '+1 (111) 111-1111', '+1 (222) 222-2222', 'rick@chinookcorp.com');

insert into "Employee"
("EmployeeId", "LastName", "FirstName", "Title", "ReportsTo", "BirthDate", "HireDate", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email")
VALUES(10, 'Smith', 'Morty', 'Student', 9, '2002-09-19 00:00:00.000', '2002-09-20 00:00:00.000', 'Somewhere', 'on', 'the', 'Moon', 'maybe', '+1 (222) 222-2222', '+1 (111) 111-1111', 'morty@chinookcorp.com');

insert into "Customer"
("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId")
VALUES(60, 'Edward', 'Elric', NULL, 'Resembool', 'Edinburgh', NULL, 'UK', 'EEE', '+1 092 223 028422', NULL, 'edward_elric@something.com', 4);

insert into "Customer"
("CustomerId", "FirstName", "LastName", "Company", "Address", "City", "State", "Country", "PostalCode", "Phone", "Fax", "Email", "SupportRepId")
VALUES(61, 'Alphonse', 'Elric', NULL, 'Resembool', 'Edinburgh', NULL, 'UK', 'FFF', '+1 322 123 756321', NULL, 'alphonse_elric@anotherthing.com', 3);

--Update Practice
update "Customer" set "FirstName" = 'Robert', "LastName"='Walter' where "CustomerId" = 32;

update "Artist" set "Name"='CCR' where "Name" ='Creedence Clearwater Revival';