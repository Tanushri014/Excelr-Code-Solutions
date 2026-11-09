package day9assignment;

class MeraThread extends Thread {

    public void run() {

        for (int i = 1; i <= 50; i++) {

            System.out.println(Thread.currentThread().getName() + " : " + i);

            // Demonstrating yield()
            if (i == 2) {
                Thread.yield();
            }

            // Demonstrating sleep()
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Difference {

    public static void main(String[] args) {

        MeraThread t1 = new MeraThread();
        MeraThread t2 = new MeraThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        // Demonstrating join()
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread completed");
    }
}