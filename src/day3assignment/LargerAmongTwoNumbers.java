package day3assignment;

import java.util.Scanner;

public class LargerAmongTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number 1:");
		int number1=sc.nextInt();
		
		System.out.println("Enter your number 2:");
		int number2=sc.nextInt();
		int larger=(number1>number2)?number1:number2;
		System.out.println("Larger:"+larger);
	}

}
