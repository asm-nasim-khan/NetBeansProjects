package Spring2018;
public class Tester {
    public static void main(String[] args) {
        int[] x = {100};
        A c1 = new A();
        c1.printInfo();
        A c2 = new A(c1);
        c2.printInfo(x);
        A c3 = new A(c2);
        c3.printInfo(x);
        
    }

}
