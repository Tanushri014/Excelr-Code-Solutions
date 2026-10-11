package day3assignment;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int number=sc.nextInt();
		int rem=0;
		int sum=0;
		while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number/=10;
		}
		System.out.println("sum of digits of your number is:"+sum);
	}

}
