package day3assignment;
import java.util.Scanner;


//2)Read a person's age. Print "Eligible to vote and drive" only if the age is 18 or
//above AND a boolean variable hasLicense is true; otherwise print "Not eligible".
//Use a single compound condition with &&.

public class EligibleToVoteAndDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Do you have a license? (true/false):");
		boolean hasLicense = sc.nextBoolean();
		if(age>=18 && hasLicense) {
			System.out.println("Eligible to vote and drive");
		}
		else {
			System.out.println("Not eligible");
		}
	}
	

}
