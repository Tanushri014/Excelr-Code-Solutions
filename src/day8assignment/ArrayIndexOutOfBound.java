package day8assignment;

import java.util.Scanner;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter the index you want to print:");

        int idx = sc.nextInt();

        try {
            System.out.println("Element at index " + idx + " is: " + arr[idx]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}