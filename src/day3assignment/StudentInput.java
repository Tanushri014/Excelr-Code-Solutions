package day3assignment;

import java.util.Scanner;

public class StudentInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your roll number:");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter your cgpa:");
		double cgpa=sc.nextDouble();
		
		
		System.out.println("NAME------------ROLLNO----------CGPA");
		System.out.println(name+"------------"+rollNumber+"-----------------"+cgpa);

	}

}
