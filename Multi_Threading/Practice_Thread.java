package Multi_Threading;

// // Extending the Thread class :-->>
// class Hi extends Thread {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(500);
//             } catch (Exception e) {
//             }
//         }
//     }
// }

// class Hello extends Thread {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(500);
//             } catch (Exception e) {
//             }
//         }
//     }
// }

// public class Practice_Thread {
//     public static void main(String[] args) {
//         Hi obj1 = new Hi();
//         Hello obj2 = new Hello();
//         obj1.start();
//         try {
//             Thread.sleep(300);
//         } catch (Exception e) {
//         }
//         obj2.start();
//     }
// }

// Using Runnable interface:-->>
class Hi implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }

    public void start() {
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}

public class Practice_Thread {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(300);
        } catch (Exception e) {

        }
        t2.start();
    }
}