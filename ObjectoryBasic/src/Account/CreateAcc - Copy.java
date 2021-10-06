package Account;
public class CreateAcc {
    public String accName;
    public String accNo;
    public double balance;
    public String phone;
    public void Create(String name,String accno,double bal,String mob){
        accName = name;
        accNo = accno;
        balance = bal;
        phone = mob;
    }
    public void printinfo(){
    System.out.println("Name: "+accName);
    System.out.println("A/c: "+accNo);
    System.out.println("Balance: "+balance+" Taka");
    System.out.println("Phone: "+phone);
        
    }
    public double deposite(double ammount){
        balance += ammount;
        //System.out.println("Deposite Scessfull.New Balance: "+balance);
        return balance;  
    }
    public boolean withdrawal(double ammount){
        if(balance-ammount >= 500)
        {
            balance-=ammount;
            return true;
        }
        return false;
    }
}
