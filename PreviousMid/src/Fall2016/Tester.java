package Fall2016;
public class Tester {
    public static void main(String[] args) {
        int[] x = {200};
A c1 = new A();
c1.printInfo();
A c2 = new A(c1);
c2.printInfo();
A c3 = new A(x);                
c3.printInfo();
A c4 = new A(x);                
c4.printInfo(); 
A c5 = new A(c4);
c2.printInfo();//this is c2, NOT c5

    }

}
