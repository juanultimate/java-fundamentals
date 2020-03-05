package edu.demo.java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollection {
    public static void main(String args[]) {

        List<String> names1 = new ArrayList<String>();
        names1.add("Juan Gabriel ");
        names1.add("Joseph ");
        names1.add("Jessica ");
        names1.add("Diego ");
        names1.add("Vero ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Juan Gabriel ");
        names2.add("Joseph ");
        names2.add("Jessica ");
        names2.add("Diego ");
        names2.add("Vero ");

        System.out.println("Sort using Java 7 syntax: ");

        sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using Java 8 syntax: ");

        sortUsingJava8(names2);
        System.out.println(names2);
    }

    //sort using java 7
    private static void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private static void sortUsingJava8(List<String> names) {

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}