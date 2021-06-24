/*
Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId is the primary key column for this table.
Table: Address

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId is the primary key column for this table.*/

-- Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:

SELECT Person.FirstName, Person.LastName, Address.City, Address.State FROM Person INNER JOIN Address ON Address.PersonId = Person.PersonId; -- only returns if person has things in Address
SELECT Person.FirstName, Person.LastName, Address.City, Address.State FROM Person LEFT JOIN Address ON Address.PersonId = Person.PersonId;  -- returns null for person that doesn't have adress corrrect solution

SELECT FirstName, LastName, City, State FROM Person LEFT JOIN Address ON Address.PersonId = Person.PersonId;  -- Guess this is faster beacuse I don't specify things in the select