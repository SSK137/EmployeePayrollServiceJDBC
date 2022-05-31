package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeePayrollService_JDBCTest {
    @Test
    public void GivenSqlQuery_CreateTable_ShouldReturnTrue(){
        EmployeePayrollService_JDBCOperation employeePayrollService_jdbcOperation=new EmployeePayrollService_JDBCOperation();
        Assertions.assertTrue(employeePayrollService_jdbcOperation.CreateNewTable());
    }
    @Test
    public void GivenSqlQuery_InsertRecordProper_ShouldReturnTrue(){
        EmployeePayrollService_JDBCOperation employeePayrollService_jdbcOperation=new EmployeePayrollService_JDBCOperation();
        Assertions.assertTrue(employeePayrollService_jdbcOperation.InsertRecordInTable());
    }
}
