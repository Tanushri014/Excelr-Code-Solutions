package day6assignment;

public class CalDemo {

	public static void main(String[] args) {
		Calculator c = new Calculator();

	    // Addition of two integers
	    System.out.println("Addition of integers: " + c.add(10, 20));

	    // Addition of two floating-point numbers
	    System.out.println("Addition of floating-point numbers: " + c.add(10.5, 20.5));

	    // Addition of array elements
	    int arr[] = {10, 20, 30, 40, 50};

	    System.out.println("Addition of array elements: " + c.add(arr));

	}

}
