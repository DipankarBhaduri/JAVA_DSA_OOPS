package Exception_Handling;

public class Finally_block {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("Dipankar");
            System.out.println("Number is : " + num);
        } finally {
            System.out.println("Number_Format_Exception");
        }
    }
}
