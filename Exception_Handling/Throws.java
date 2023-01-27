package Exception_Handling;

public class Throws {
    static void avg() throws ArithmeticException {
        System.out.println(" Inside avg function");
        throw new ArithmeticException("Demo");
    }

    public static void main(String[] args) {
        try {
            avg();
        } catch (ArithmeticException e) {
            System.out.println("Everything handled");
        } finally {
            System.out.println("Caught");
        }
    }
}
