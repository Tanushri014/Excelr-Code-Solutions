package day9assignment;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println(t.getState()); // NEW

        t.start();

        System.out.println(t.getState()); // RUNNABLE
    }
}