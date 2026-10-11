package day3assignment;

import java.util.Scanner;

public class StudentMarksGrade {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks between 1 -100:");
		int marks=sc.nextInt();
		if(marks<0 || marks>100) {
			System.out.println("Enter valid marks");
		}
		else {
			if(marks>=90) {
				System.out.println("Grade A+");
			}
			else if(marks>=80) {
				System.out.println("Grade B");
			}
			else if(marks>=70) {
				System.out.println("Grade C");
			}
			else if(marks>=60) {
				System.out.println("Grade D");
			}
			else {
					System.out.println("F");
			}
		}
	}

}
