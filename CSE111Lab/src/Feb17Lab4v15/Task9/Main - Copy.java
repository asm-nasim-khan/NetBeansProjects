package Feb17Lab4v15.Task9;
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        acc1.setName("A");
        acc1.setAccountID("123456");
        acc1.setAddress("Gulshan");
        acc1.setBalance(500000);
        acc1.addInterest();
        acc3.addInterest();
        
    }

}
