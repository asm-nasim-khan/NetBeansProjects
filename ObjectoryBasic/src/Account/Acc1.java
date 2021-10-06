package Account;

/**
 *
 * @author Piplu
 */
public class Acc1 {
    public static void main(String[] args) {
        CreateAcc acc1 = new CreateAcc();
        acc1.Create("Tushar","6969696969", 150000.0,"01771225223");
        acc1.printinfo();
        System.out.println("NEW balance: "+acc1.deposite(8000));
        if(acc1.withdrawal(1500000)){
            System.out.println("Withdrawal Successful.New Balance: "+acc1.balance);
        }
        else{
            System.out.println("Withdraw Unsuccessful! Insufficient balance!");
        }
    }
    
}
