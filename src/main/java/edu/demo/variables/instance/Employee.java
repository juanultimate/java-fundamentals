package edu.demo.variables.instance;

public class Employee {

    // this instance variable is visible for any class.
    public String name;

    // this instance variable is visible for children classes.
    protected Integer age;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name and age variables are assigned in the constructor.
    public Employee (String empName, int age) {
        this.name = empName;
        this.age = age;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
        System.out.println("age :" + age);
    }

    public static void main(String args[]) {
        Employee empOne = new Employee("Rolando", 20 );
        empOne.setSalary(400);
        empOne.printEmp();
    }
}