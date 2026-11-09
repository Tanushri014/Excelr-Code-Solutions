package day8assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your first integer:");
            int num1 = sc.nextInt();

            System.out.println("Enter your second integer:");
            int num2 = sc.nextInt();

            System.out.println("Processing....");

            int num3 = num1 / num2;

            System.out.println("Division is: " + num3);
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter integers only!");
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        finally {
            sc.close();
        }
    }
}