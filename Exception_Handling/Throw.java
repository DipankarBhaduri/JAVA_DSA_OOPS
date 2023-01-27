package Exception_Handling;

public class Throw {
    public static void main(String[] args) {
        avg();
    }

    static void avg() {
        try {
            int a = 30;
            int b = 0;
            throw new ArithmeticException("Demo");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
    }
}
