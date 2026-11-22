package day14assignment;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=123456789;
		System.out.println("Before reverse order:"+number);
		System.out.println("after:");

		while(number>0) {
			int div=number%10;
			System.out.print(div);
			number=number/10;
		}
		
	}

}
