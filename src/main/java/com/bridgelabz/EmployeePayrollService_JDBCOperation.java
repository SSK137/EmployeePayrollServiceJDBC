package com.bridgelabz;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
            String sql = "INSERT INTO employee_payroll VALUES(1,'SSK',45000,'2022-02-02')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
