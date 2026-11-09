package day7assignment;

public class AnimalDemo2 {

    public static void main(String[] args) {

        // Upcasting
        Animal2 a = new Dog2();
        a.sound();

        // Downcasting with runtime checking
        if (a instanceof Dog2) {
            Dog2 d = (Dog2) a;
            d.sound();
        } else {
            System.out.println("Invalid casting");
        }

        // Invalid downcasting example
        Animal2 a2 = new Animal2();

        if (a2 instanceof Dog2) {
            Dog2 d2 = (Dog2) a2;
            d2.sound();
        } else {
            System.out.println("Cannot downcast to Dog2");
        }
    }
}