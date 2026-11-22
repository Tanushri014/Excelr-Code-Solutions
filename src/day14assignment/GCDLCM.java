package day14assignment;

public class GCDLCM {

    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 8;

        int gcd = 0;
        int lcm;

        for (int i = 1; i <= Math.min(num1, num2); i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        lcm = (num1 * num2) / gcd;

        System.out.println("GCD of " + num1 + " & " + num2 + " is: " + gcd);

        System.out.println("LCM of " + num1 + " & " + num2 + " is: " + lcm);
    }
}