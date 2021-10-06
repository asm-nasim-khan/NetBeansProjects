package Feb25Lab5.Task9;
public class Account {
    public String name;
    public double balance;
    public static double interestRate = 6.0;
    public Account(){
        name = "Default Account";
    }
    public Account(String s,double i){
        name = s;
        balance = i;
    }
    public void nameBoshao(String s){
        name = s;
    }
    public void balanceBoshao(double i){
        balance += i;
    }
    public void withdraw(double m){
        if(balance - m >100){
            balance -= m;
            System.out.println("Withdraw successful! New balance is: "+balance);
        }
        else{
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
    }
    public String nameKi(){
        return name;   
    }
    public double balanceKi(){
        return balance;
    }
}
