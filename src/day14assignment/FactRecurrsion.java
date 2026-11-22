package day14assignment;

public class FactRecurrsion {

	public static void main(String[] args) {
		int num=8;
		int result=factorial(num);
System.out.println("Factorial of :"+num +"is :"+result);
	}
	public static int factorial(int   num) {
		int fact=1;
		if(num<1) {
			return fact;
		}
		fact=num*factorial(num-1);
		return fact;
	}

}
