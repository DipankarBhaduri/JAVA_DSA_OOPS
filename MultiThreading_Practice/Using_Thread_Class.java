package MultiThreading_Practice;

//<------------------------USING_RUNNABLE_INTERFACE---------------------------->

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 25; i++) {
            System.out.println("A :-->" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 25; i++) {
            System.out.println("B :-->" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

public class Using_Thread_Class {
    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }
        t2.start();
    }
}

// <---------------------USING_THREAD_CLASS------------------------------>

/*
 * class Hi extends Thread {
 * public void run() {
 * for (int i = 1; i <= 500; i++) {
 * System.out.println("Hi->" + i);
 * try {
 * Thread.sleep(20);
 * } catch (Exception e) {
 * 
 * }
 * }
 * }
 * }
 * 
 * class Hello extends Thread {
 * public void run() {
 * for (int i = 1; i <= 500; i++) {
 * System.out.println("Hello->" + i);
 * try {
 * Thread.sleep(20);
 * } catch (Exception e) {
 * 
 * }
 * }
 * }
 * }
 * 
 * public class Using_Thread_Class {
 * public static void main(String[] args) {
 * Hi hi = new Hi();
 * Hello hello = new Hello();
 * hi.start();
 * try {
 * Thread.sleep(200);
 * } catch (Exception e) {
 * 
 * }
 * hello.start();
 * }
 * }
 */
