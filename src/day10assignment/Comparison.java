package day10assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Comparison {

    public static void main(String[] args) {

        int size = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Insertion in ArrayList
        long start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        long end = System.nanoTime();

        System.out.println("ArrayList Insertion Time: " + (end - start) + " ns");


        // Insertion in LinkedList
        start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        end = System.nanoTime();

        System.out.println("LinkedList Insertion Time: " + (end - start) + " ns");


        // Deletion from ArrayList
        start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            arrayList.remove(0);
        }

        end = System.nanoTime();

        System.out.println("ArrayList Deletion Time: " + (end - start) + " ns");


        // Deletion from LinkedList
        start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            linkedList.remove(0);
        }

        end = System.nanoTime();

        System.out.println("LinkedList Deletion Time: " + (end - start) + " ns");
    }
}