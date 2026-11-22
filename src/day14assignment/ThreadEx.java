package day14assignment;

public class ThreadEx {

    static int num = 1;

    public static void main(String[] args) {

        // Odd thread
        Thread t1 = new Thread(() -> {

            for (int i = 1; i <= 100; i++) {

                synchronized (ThreadEx.class) {

                    while (num % 2 == 0) {
                        try {
                            ThreadEx.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(num);
                    num++;

                    ThreadEx.class.notify();
                }
            }
        });

        // Even thread
        Thread t2 = new Thread(() -> {

            for (int i = 1; i <= 100; i++) {

                synchronized (ThreadEx.class) {

                    while (num % 2 != 0) {
                        try {
                            ThreadEx.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(num);
                    num++;

                    ThreadEx.class.notify();
                }
            }
        });

        t1.start();
        t2.start();
    }
}