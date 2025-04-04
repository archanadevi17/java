package encapsulation;

public class bankaccount {
    int acc_no, balance;
    String name;

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getACC_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }
}