package day3assignment;

import java.util.Scanner;

public class DegreeToFahrenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your temp in celcius:");
		int degree=sc.nextInt();
		int fahrenheit=(degree*9/5)+32;
		System.out.println("Your temp in fahrenheit:");
		System.out.println(fahrenheit);		

	}

}
