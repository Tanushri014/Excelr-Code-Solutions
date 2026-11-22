package day14assignment;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println(add(10, 20));

        System.out.println(add(10, 20, 30));

        System.out.println(add(10.5, 20.5));
	}
private static int add(int a,int b) {
	return a+b;
}
private static int add(int a,int b,int c) {
	return a+b+c;
}
private static double add(double a,double b) {
	return a+b;
}
}
