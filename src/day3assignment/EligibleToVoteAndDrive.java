package day3assignment;
import java.util.Scanner;
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
