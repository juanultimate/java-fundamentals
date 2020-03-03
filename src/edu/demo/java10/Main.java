package edu.demo.java10;

public class Main {
    public static void main(String[] args) {

        /**
         * LOCAL-VARIABLE TYPE INFERENCE
         * Java 10 will enhance the Java Language to extend type inference to declarations of local variables with initializers and also introduces var to Java, something that is common in other languages.
         */

        System.out.println("INFER TYPES");

        var two = 2f;
        System.out.println(two);

        Foo foo = new Foo();

        var foo2 = new Foo();

        foo.foo();
        foo2.foo();

    }
}



