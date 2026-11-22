package day14assignment;

public class SwappingUsingThirdNumber {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 8;

        System.out.println("Before swapping: Num1: " + num1 + " and Num2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: Num1: " + num1 + " and Num2: " + num2);
    }
}