package day8assignment;

import java.util.Scanner;

public class CustomeExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
				try {
				checkAge(age);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

	}
	private static void checkAge(int age) throws InvalidAgeException{
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new InvalidAgeException("You are not eligible to vote.");
		}
	}

}
