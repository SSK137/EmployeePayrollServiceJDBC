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
mysql> select * from employee_payroll;
+------+---------+--------+------------+
| id   | name    | salary | Start_Date |
+------+---------+--------+------------+
|    1 | SSK     |  45000 | 2022-02-02 |
|    2 | Saurabh |  40000 | 2022-05-12 |
|    3 | Sneha   |  50000 | 2022-03-17 |
+------+---------+--------+------------+
3 rows in set (0.00 sec)

======================UC4==============================
//Use SELECT * FROM employee_payroll to
retrieve all the data from the
employee_payroll table
mysql> select * from employee_payroll;
+------+---------+--------+------------+
| id   | name    | salary | Start_Date |
+------+---------+--------+------------+
|    1 | SSK     |  45000 | 2022-02-02 |
|    2 | Saurabh |  40000 | 2022-05-12 |
|    3 | Sneha   |  50000 | 2022-03-17 |
|    4 | Adesh   |  55000 | 2018-01-01 |
|    5 | Sohan   |  65000 | 2017-01-01 |
+------+---------+--------+------------+
5 rows in set (0.00 sec)
======================UC5==============================
//Use SELECT salary FROM employee_payroll
WHERE name = 'Bill’ Query to View Bill’s salary
- Use Select query with Where condition View employees
between start dates
- Query: WHERE start BETWEEN CAST('2018-01-01'AS DATE) AND DATE(NOW());
mysql> SELECT salary FROM employee_payroll WHERE name = 'SSK' or  Start_Date BETWEEN CAST('2018-01-01' AS DATE) AND DATE(NOW());
+--------+
| salary |
+--------+
|  45000 |
|  40000 |
|  50000 |
|  55000 |
+--------+
