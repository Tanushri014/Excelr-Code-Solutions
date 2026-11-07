package day7assignment;

class Animal {
    Animal() {
        this("Dog");
        System.out.println("Default constructor");
    }

    Animal(String name) {
        System.out.println("Parameterized constructor: " + name);
    }
}