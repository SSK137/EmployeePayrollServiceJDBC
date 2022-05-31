======================UC1==============================
//Using MySQL Client use create database
  query to create a payroll_service
  database
mysql> create database employee_payroll;
Query OK, 1 row affected (0.02 sec)

//Also you can see the DB created by
  using show database query
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| AddressBook        |
| AddressBookService |
| Address_Book_DB    |
| Employee_Payroll   |
| Payroll_Service    |
| Sample             |
| employee_payroll   |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
11 rows in set (0.01 sec)

//And go to the database created by using
  use payroll_service query
mysql> use employee_payroll;
Database changed

======================UC2==============================
//Use Create Table employee_payroll Query
  to create employee payroll table with columns id,
  name, salary and start date as column. Note Id is set to
  auto increment.
//Before execute query
mysql> show tables;
Empty set (0.00 sec)
//After execute query
mysql> show tables;
+----------------------------+
| Tables_in_employee_payroll |
+----------------------------+
| employee_payroll           |
+----------------------------+
1 row in set (0.01 sec)

======================UC3==============================
//Use INSERT INTO employee_payroll
  Query to create employees payroll
  data into the employee_payroll table
//After execute query
mysql> select * from employee_payroll
    -> ;
+------+------+--------+------------+
| id   | name | salary | Start_Date |
+------+------+--------+------------+
|    1 | SSK  |  45000 | 2022-02-02 |
+------+------+--------+------------+
1 row in set (0.00 sec)