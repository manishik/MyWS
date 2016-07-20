--DDL (Data Definition Language)
CREATE TABLE Employee
(
empID int primary key,
LastName varchar(255),
FirstName varchar(255),
Address varchar(255),
City varchar(255),
DeptID int 
);

ALTER TABLE Employee ADD Salary int;

ALTER TABLE Employee MODIFY (Salary varchar(2) not null);

ALTER TABLE Employee DROP COLUMN Salary;

ALTER TABLE Employee RENAME COLUMN Salary TO SAL;

CREATE TABLE Department
(
DeptID int primary key,
DeptName varchar(255) 
);

--DML (Data Manupulation Language) 
INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID)
VALUES ('1','Keshav','Manish','RockCove Ter','Ashburn','1');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID)
VALUES ('2','Sal','Sandesh','Indiranagar','BLR','2');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID)
VALUES ('3','Raj','Ritu','Noida','Delhi','1');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID)
VALUES ('4','David','Jashua','Ter','Den','9');

INSERT INTO Employee(empID, LastName, FirstName, Address, City, DeptID)
VALUES ('5','Sri','Shreyas','Somewhere in Boston','Boston','9');

INSERT INTO Department(DeptID, DeptName)
VALUES ('1','Software');

INSERT INTO Department(DeptID, DeptName)
VALUES ('2','Operations');

INSERT INTO Department(DeptID, DeptName)
VALUES ('3','HR');

INSERT INTO Department(DeptID, DeptName)
VALUES ('4','Finance');

INSERT INTO Department(DeptID, DeptName)
VALUES ('5','Security');

INSERT INTO Department(DeptID, DeptName)
VALUES ('9','Info Security');

UPDATE EMPLOYEE Set SALARY = '10000' where EMPID = '3';

DELETE from EMPLOYEE where empID = '2';

--Querying
select * from Employee;
select * from Department;

select * from Employee, Department;

--UNION
select DeptID from Employee UNION select DeptID from Department;
select DeptID from Employee UNION ALL select DeptID from Department;

--INNER JOINS
select empID, Firstname from Employee e, Department d
where e.DEPTID = d.DEPTID;
--OR
select empID, Firstname 
from Employee 
inner join Department 
on Employee.DEPTID = Department.DEPTID;

--LEFT OUTER JOIN
SELECT Employee.FirstName, Department.DeptName
FROM Employee
LEFT JOIN Department
ON Employee.DeptID=Department.DeptID
ORDER BY Employee.EmpID;

--RIGHT OUTER JOIN
SELECT Employee.FirstName, Department.DeptName
FROM Employee
RIGHT JOIN Department
ON Employee.DeptID=Department.DeptID
ORDER BY Employee.EmpID;

--FULL OUTER JOIN
SELECT * 
FROM Employee
FULL OUTER JOIN Department
ON Employee.DeptID=Department.DeptID
ORDER BY Employee.EmpID;

--NUMBER OF PEOPLE IN EACH DEPARTMENT 
select count(e.deptid) as NoOfPeopleInEachDept 
from employee e, department d
where e.DeptID = d.DeptID
group by e.deptid;
