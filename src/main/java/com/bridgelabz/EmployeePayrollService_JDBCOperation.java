package com.bridgelabz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService_JDBCOperation implements Payroll_Interface{
    //Method to Create New Table in Database
    public boolean CreateNewTable() {
        try(Connection conn = DB_Connection.getConnection();
            Statement statement = conn.createStatement();
        ) {
            String sql = "CREATE TABLE employee_payroll(id int,name varchar(50),salary double,Start_Date DATE)";
            statement.executeUpdate(sql);
            System.out.println("Table Created Successfully !!!!");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //Method to Insert Records in Table
    public boolean InsertRecordInTable() {
        try(Connection conn = DB_Connection.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            String sql = "INSERT INTO employee_payroll VALUES(5,'Sohan',65000,'2017-01-01')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //Retrive all the data from Table
    public List<EmployeeData> ReadAllDataFromTable(){
        String sql="SELECT * FROM employee_payroll";
        List<EmployeeData> employeeDataList=new ArrayList<>();
        try{
            Connection connection=DB_Connection.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                double salary=resultSet.getDouble("salary");
                String Start_Date=resultSet.getString("Start_Date");
                employeeDataList.add(new EmployeeData(id,name,salary,Start_Date));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeDataList;
    }
    //Display Particular record from Table
    public boolean DisplayParticularData(){
        String sql="SELECT salary FROM employee_payroll WHERE name = 'SSK' or  Start_Date BETWEEN CAST('2018-01-01' AS DATE) AND DATE(NOW());";
        try{
            Connection connection=DB_Connection.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getString("salary"));
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
