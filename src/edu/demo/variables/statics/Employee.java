package edu.demo.variables.statics;

public class Employee {

    // salary  variable is a private static variable
    private static double salary=1000;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        System.out.println(DEPARTMENT + "average salary:" + salary);
        salary=2000;
        System.out.println(DEPARTMENT + "new average salary:" + salary);



    }
}