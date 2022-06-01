package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    @Test
    public void GivenSqlQuery_ShowDataFromTable_ShouldReturnTrue() {
        EmployeePayrollService_JDBCOperation employeePayrollService = new EmployeePayrollService_JDBCOperation();
        List<EmployeeData> employeeData = employeePayrollService.ReadAllDataFromTable();
        for (EmployeeData employeeData1 : employeeData) {
            System.out.println(employeeData1);
        }
        Assertions.assertEquals(3, employeeData.size());
    }
}
