package day14assignment;

public class ArmStrong {

	public static void main(String[] args) {
		int number = 153;
        int original = number;
        int sum = 0;

        int digits = String.valueOf(number).length();

        while (number > 0) {

            int rem = number % 10;

            sum = sum + (int) Math.pow(rem, digits);

            number = number / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        }
        else {
            System.out.println(original + " is not an Armstrong number");
        }

	}

}
