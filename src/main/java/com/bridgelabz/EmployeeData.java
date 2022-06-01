package com.bridgelabz;

public class EmployeeData {
    public int id;
    public String name;
    public double salary;
    public String Start_Date;

    public EmployeeData(int id,String  name,double salary,String Start_Date){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.Start_Date=Start_Date;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public String getStart_Date(){
        return Start_Date;
    }
    public String toString(){
        return "Employee Payroll Data]      Id :"+id+" Name :"+name+" Salary : "+salary+" Salary : "+Start_Date;
    }
}