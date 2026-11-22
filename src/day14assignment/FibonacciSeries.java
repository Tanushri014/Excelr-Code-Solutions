package day14assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0;int num2=1;int range=5;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for(int i=1;i<range;i++) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
			
			
		}

	}

}
