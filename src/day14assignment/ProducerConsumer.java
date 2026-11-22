package day14assignment;

class SharedBuffer {

    int data;
    boolean available = false;

    synchronized void produce(int value) {

        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        System.out.println("Produced: " + data);

        available = true;
        notify();
    }

    synchronized void consume() {

        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);

        available = false;
        notify();
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        // Producer Thread
        Thread producer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
            }

        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                buffer.consume();
            }

        });

        producer.start();
        consumer.start();
    }
}