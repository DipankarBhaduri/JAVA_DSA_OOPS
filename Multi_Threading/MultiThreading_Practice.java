package Multi_Threading;

class hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("Hi");
            try {
                Thread.sleep(200);
            } catch (Exception e) {

            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("Hello");
            try {
                Thread.sleep(200);
            } catch (Exception e) {

            }
        }
    }
}

public class MultiThreading_Practice {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();

        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        hello.start();
    }
}
