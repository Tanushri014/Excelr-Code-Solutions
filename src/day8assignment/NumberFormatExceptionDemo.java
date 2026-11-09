package day8assignment;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your numeric value:");

        String str = sc.nextLine();

        try {
            System.out.println("Before conversion: " + str.getClass().getSimpleName());

            int new_str = Integer.parseInt(str);

            System.out.println("After conversion: " + ((Object)new_str).getClass().getSimpleName());

            System.out.println("Converted integer: " + new_str);
        }

        catch(NumberFormatException e) {
            System.out.println("Please enter a valid numeric value!");
        }

        sc.close();
    }
}