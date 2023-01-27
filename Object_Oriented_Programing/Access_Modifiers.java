package Object_Oriented_Programing;

public class Access_Modifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Dipankar Bhaduri";
        myAcc.setPassword("123456");
        System.out.println(myAcc.name);
        // System.out.println(myAcc.password);
    }
}

class BankAccount {
    public String name;
    private String password;

    void setPassword(String pwd) {
        password = pwd;
    }
}