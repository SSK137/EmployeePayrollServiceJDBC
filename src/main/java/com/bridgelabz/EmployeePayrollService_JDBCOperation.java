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
}
