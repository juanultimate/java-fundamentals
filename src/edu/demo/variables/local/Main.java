package edu.demo.variables.local;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRIMITIVES");

        int a, b, c;         // Declares three ints, a, b, and c.
        int anInt = 10, anotherInt = 10;  // Example of initialization
        double pi = 3.14159; // declares and assigns a value of PI.
        char f = 'f';        // the char variable a iis initialized with value 'a'
        float aFloatValue = 123456789000000000f;
        float anotherFloatValue = 123456789000000000f;


//        System.out.println(String.valueOf(a));

        System.out.println("anInt => " + String.valueOf(anInt));
        System.out.println("pi => " + String.valueOf(pi));
        System.out.println("f => " + String.valueOf(f));
        System.out.println("aFloatValue => " + String.valueOf(aFloatValue));


        System.out.println("SOME CLASSES");
        String aString= "E&Y";
        String anotherString= "E&Y";

        Integer twoAsInteger = Integer.valueOf(2);
        Integer anotherTwoAsInteger = new Integer(2);  //constructor de Integer deprecado


        System.out.println("COMPARISON");
        System.out.println(anInt == anotherInt);
        System.out.println(aFloatValue==anotherFloatValue);


        System.out.println(twoAsInteger==anotherTwoAsInteger);

        System.out.println(aString==anotherString);













    }
}
