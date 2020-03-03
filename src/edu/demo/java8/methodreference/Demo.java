package edu.demo.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Juan");
        names.add("Gabriel");
        names.add("Guzman");
        names.add("Guerra");

        printNamesJava7(names);
        System.out.println("==========");
        printNamesJava8(names);
        System.out.println("==========");
        printNamesUpperCaseJava8(names);


    }
    static void printNamesJava7(List<String> names){
        for(String s : names){
            System.out.println(s);
        }
    }

    static void printNamesJava8(List<String> names){
//        names.forEach(s -> System.out.println(s));
        names.forEach(System.out::println);
    }

    static void printNamesUpperCaseJava8(List<String> names){
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
