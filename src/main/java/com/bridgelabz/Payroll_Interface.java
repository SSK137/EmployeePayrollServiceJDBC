package com.bridgelabz;

import java.util.List;

interface Payroll_Interface {
    boolean CreateNewTable();
    boolean InsertRecordInTable();
    List<EmployeeData> ReadAllDataFromTable();
}
