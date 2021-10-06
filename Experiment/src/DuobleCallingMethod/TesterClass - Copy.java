package DuobleCallingMethod;
public class TesterClass {
    public static void main(String[] args) {
       UserClass t = new UserClass();
        t.methodA(); 
        t.methodA();
        UserClass t1 = new UserClass();
        System.out.println("==================");
        t1.methodA();
        t1.methodA();
        
        
    }
    

}
