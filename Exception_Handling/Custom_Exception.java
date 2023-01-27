package Exception_Handling;

public class Custom_Exception {
    public static void main(String[] args) {
        try {
            throw new TestException("This is only test exception");
        } catch (TestException t) {
            System.out.println(t.getMessage());
        }
    }
}

class TestException extends Exception {
    TestException(String str) {
        super(str);
    }
}
