package encapsulation;

public class bank_main {
    public static void main(String[] args) {
        bankaccount b = new bankaccount();

        // Before setting the values
       
       
        System.out.println("name: " + b.getName());
        b.setName("Kruthika");
        System.out.println("name: " + b.getName());

        b.setAcc_no(2024);
        System.out.println("Acc_no: " + b.getACC_no());

        b.setBalance(700000);
        System.out.println("Balance: " + b.getACC_no());
    }
}
