package Multi_Threading;

class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(200);
            } catch (Exception e) {

            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch (Exception e) {

            }
        }
    }
}

public class Example_Of_Thread_class {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        try {
            Thread.sleep(50);
        } catch (Exception e) {
        }
        obj2.start();
    }
}
