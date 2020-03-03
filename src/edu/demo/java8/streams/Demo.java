package edu.demo.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Using Java 7: ");

        // Count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        System.out.println("List: " +strings);
        long count = getCountEmptyStringUsingJava7(strings);
        System.out.println("Empty Strings: " + count);

        //Eliminate empty string
        List<String> filtered = deleteEmptyStringsUsingJava7(strings);
        System.out.println("Filtered List: " + filtered);
        System.out.println("=========================");

        System.out.println("Using Java 8: ");
        System.out.println("List: " +strings);

        count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);

        filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
    }

    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;
        for(String string: strings) {
            if(string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<String>();

        for(String string: strings) {
            if(!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }
}
