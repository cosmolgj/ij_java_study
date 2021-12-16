package blog_lecture;

public class ThreadEx {
    public static void main(String[] args) {
        Runnable r = new A();
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);

        thread1.start();
        thread2.start();
    }
}

class Account {
    int balance = 1000;

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) { }
            balance -= money;
        }
    }
}

class A implements Runnable {
    Account acc = new Account();
    public void run() {
        while (acc.balance > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.balance);
        }
    }
}