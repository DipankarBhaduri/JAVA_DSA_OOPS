package Exception_Handling;

public class Sample_Exception {
    public static void main(String[] args) {
        try {
            int a = 30;
            int b = 0;
            int c = a / b;
            System.out.println("Result : " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't devide a number by zero");
        }

        try {
            int num = Integer.parseInt("123456");
            System.out.println("The Number is : " + num);
        } catch (NumberFormatException n) {
            System.out.println("Number Format Exception");
        }

        try {
            int[] arr = new int[5];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("You are trying to access out of range array ");
        }

    }
}
