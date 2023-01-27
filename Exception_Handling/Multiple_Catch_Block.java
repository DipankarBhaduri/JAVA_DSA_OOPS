package Exception_Handling;

public class Multiple_Catch_Block {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("Dipankar");
            System.out.println("Number is : " + num);
        } catch (NumberFormatException n) {
            System.out.println("Number Format Exception");
        } catch (Exception e) {
            System.out.println("Handeled");
        }

        System.out.println("Others Statement");
    }
}
