package day9assignment;

import java.util.Random;

class NumberGenerator {
    int number;
    boolean available = false;

    synchronized void generateNumber() {
        Random r = new Random();

        number = r.nextInt(100);
        System.out.println("Generated number: " + number);

        available = true;
        notify();
    }

    synchronized void printSquare() {
        try {
            while (!available) {
                wait();
            }

            System.out.println("Square: " + (number * number));

            available = false;

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class InterThreadCommunication {

    public static void main(String[] args) {

        NumberGenerator obj = new NumberGenerator();

        Thread t1 = new Thread(() -> {
            obj.generateNumber();
        });

        Thread t2 = new Thread(() -> {
            obj.printSquare();
        });

        t2.start();
        t1.start();
    }
}