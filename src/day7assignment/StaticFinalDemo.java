
package day7assignment;

public class StaticFinalDemo {

    // Static variable
    static int balance = 0;

    public static void main(String[] args) {

        // Final variable
        final double pi = 3.14;

        System.out.println("Initial static value: " + balance);
        System.out.println("Final value: " + pi);

        // Modifying static variable
        balance = 300;

        System.out.println("Static value after modification: " + balance);

        // Final variable cannot be modified
        // pi = 8.9; // Compilation error

        System.out.println("Final value remains unchanged: " + pi);
    }
}
