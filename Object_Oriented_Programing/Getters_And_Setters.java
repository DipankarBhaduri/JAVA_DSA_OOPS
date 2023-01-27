package Object_Oriented_Programing;

public class Getters_And_Setters {
    public static void main(String[] args) {
        PnbBankAccount myAcc = new PnbBankAccount();
        myAcc.setName("Dipankar");
        myAcc.setPassword("Dipu");

        System.out.println(myAcc.getName());
        System.out.println(myAcc.getPassword());
    }
}

class PnbBankAccount {
    private String name;
    private String password;

    String getName() {
        return this.name;
    }

    String getPassword() {
        return this.password;
    }

    void setName(String newName) {
        name = newName;
    }

    void setPassword(String newPass) {
        password = newPass;
    }
}