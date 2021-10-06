package Mar17Lab8.Task8;
public class CheckingAccount extends Account{
    public static int numberOfAccount = 0;

    public CheckingAccount(double balance) {
        super(balance);
        numberOfAccount++;
    }

    CheckingAccount() {
        super(0.00);
        numberOfAccount++;
    }
    

}
