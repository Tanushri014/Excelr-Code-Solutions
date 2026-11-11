package day11assignment;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Creating TreeMap
        TreeMap<Integer, String> products = new TreeMap<>();

        // 1. Insert operation
        products.put(104, "Laptop");
        products.put(102, "Mobile");
        products.put(105, "Keyboard");
        products.put(101, "Mouse");
        products.put(103, "Monitor");

        // 2. Display in ascending order
        System.out.println("Products in Ascending Order:");

        for (Map.Entry<Integer, String> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 3. Display in descending order
        System.out.println("\nProducts in Descending Order:");

        for (Map.Entry<Integer, String> entry : products.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}