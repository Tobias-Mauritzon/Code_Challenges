/*
Write a SQL query to find all duplicate emails in a table named Person.

+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
For example, your query should return the following for the above table:

+---------+
| Email   |
+---------+
| a@b.com |
+---------+*/

SELECT email AS Email FROM Person GROUP BY email HAVING count(*)>1;

SELECT distinct p1.email 
FROM person p1 
JOIN person p2
ON p1.id < p2.id and p1.email = p2.email;