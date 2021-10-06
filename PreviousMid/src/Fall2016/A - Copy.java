package Fall2016;
class A{
    public int x = 10;
    public int y = 100;
    public A(){
        int x = 100;
        y = y - x;
        x = x + y;
    }
    public A(A k){
        int y = 11;
        x = x + y + k.y;
    }
    public A(int[] p){
        int y = 11;
        this.y = this.y - 20 + p[0];
        x = x + p[0] + y;
        p[0] = p[0] - 100;
    }
    public void printInfo(){
        System.out.println(x + " " + y);
    }
}

