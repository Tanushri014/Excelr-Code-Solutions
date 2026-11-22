package day14assignment;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		int number=123456789;
		int count=0;
		while(number>0) {
			int div=number%10;
			count++;
			
			number=number/10;
		}
		System.out.print(count);

	}

}
