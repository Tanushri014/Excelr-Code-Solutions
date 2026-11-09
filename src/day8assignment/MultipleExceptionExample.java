package day8assignment;

import java.util.Scanner;

public class MultipleExceptionExample {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		    int arr[] = {10, 20, 30, 40, 50};

		    try {
		        System.out.println("Enter first integer:");
		        int num1 = Integer.parseInt(sc.nextLine());

		        System.out.println("Enter second integer:");
		        int num2 = Integer.parseInt(sc.nextLine());

		        System.out.println("Division is: " + (num1 / num2));

		        System.out.println("\nEnter array index:");
		        int idx = Integer.parseInt(sc.nextLine());

		        System.out.println("Element at index " + idx + " is: " + arr[idx]);
		    }

		    catch (ArithmeticException e) {
		        System.out.println("Cannot divide by zero!");
		    }

		    catch (ArrayIndexOutOfBoundsException e) {
		        System.out.println("Invalid array index!");
		    }

		    catch (NumberFormatException e) {
		        System.out.println("Please enter valid integers only!");
		    }

		    finally {
		        sc.close();
		    }

	}

}
