package day7assignment;

final class Demo1 {
    // Final class
}

public class FinalDemo {

    public final void display() {
        System.out.println("Final method");
    }

    public static void main(String[] args) {

        final String name = "Rutu";
        final double pi = 3.14;

        System.out.println(name);
        System.out.println(pi);

        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}