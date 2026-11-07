package day6assignment;

public class Calculator {

    // Addition of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Addition of two floating-point numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Addition of elements of an integer array
    public int add(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}