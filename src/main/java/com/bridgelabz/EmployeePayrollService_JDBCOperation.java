package com.bridgelabz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService_JDBCOperation implements Payroll_Interface{
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
    public boolean InsertRecordInTable() {

        try(Connection conn = DB_Connection.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            String sql = "INSERT INTO employee_payroll VALUES(3,'Sneha',50000,'2022-03-17')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
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
}
