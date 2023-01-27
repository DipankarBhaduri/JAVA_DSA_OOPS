package Exception_Handling;

public class Nested_Tryblock {
    public static void main(String[] args) {

        try {
            try {
                int num = Integer.parseInt("Dipankar");
                System.out.println("Number is : " + num);
            } catch (NumberFormatException n) {
                System.out.println("Number Format Exception");
            }

            try {
                int[] arr = new int[5];
                System.out.println(arr[6]);
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("You are trying to access out of range array ");
            }
            System.out.println("Other Statement");
        } catch (Exception e) {
            System.out.println("Handled and recovred");
        }
    }
}
