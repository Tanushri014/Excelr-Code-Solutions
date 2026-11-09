package day9assignment;

class Account {

    static int balance = 500;

    synchronized void withdraw() {

        if (balance >= 100) {

            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing money");

            balance -= 100;

            System.out.println("Remaining balance: " + balance);

        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class MyThread3 extends Thread {

    Account a;

    MyThread3(Account a) {
        this.a = a;
    }

    public void run() {
        a.withdraw();
    }
}

public class Bank {

    public static void main(String[] args) {

        Account a = new Account();

        MyThread3 t1 = new MyThread3(a);
        MyThread3 t2 = new MyThread3(a);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}