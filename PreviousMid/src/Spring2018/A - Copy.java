package Spring2018;
class A{
  public int x = 100;
  private int y = 10;
  public A(){
    int x = 20;
    y = y - this.x;
    x = this.x + y;
  }
  public A(A k){
    int y = 11;
    this.x = x + y + k.y;
  }
  public void printInfo(){
    System.out.println(x + " " + y);
  }
  public void printInfo(int[] p){
    int y = 11;
    this.y = this.y - 30 + p[0];
    printInfo();
    x = x + p[0] + y;
    p[0] = p[0] - 40;      
    System.out.println(x + " " + y);
  }
}

