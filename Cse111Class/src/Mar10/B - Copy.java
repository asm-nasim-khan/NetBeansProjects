package Mar10;
public class B extends A {
    private int z = 300;
    //int x = 10;
    B(){
        System.out.println("Dc");
       // System.out.println(x);
        System.out.println(super.x);
    }
    B(int z){
        //super(z);
        //System.out.println("Ac");
    }
}
