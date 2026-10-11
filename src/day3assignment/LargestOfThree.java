package day3assignment;
import java.util.Scanner;
public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = sc.nextInt();
		System.out.println("Enter number 2:");
		int b = sc.nextInt();
		System.out.println("Enter number 3:");
		int c = sc.nextInt();
		if (a >= b) {
			if (a >= c) {
				System.out.println("Largest is: " + a);
			} else {
				System.out.println("Largest is: " + c);
			}
		} else {
			if (b >= c) {
				System.out.println("Largest is: " + b);
			} else {
				System.out.println("Largest is: " + c);
			}
		}
		sc.close();
	}
}
