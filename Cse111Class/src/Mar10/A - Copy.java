package Mar10;
public class A {
    protected int x = 100;
    protected int y = 200;
    protected A(){
        System.out.println("Dp");
        x-=8;
        System.out.println("parent x:"+x);
    }
    protected A(int m){
        //System.out.println("AP");
        x=11;
        System.out.println("M x:"+x);
    }
    public void m1(){
        System.out.println("M1");
    }
   
}
