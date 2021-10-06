package Basic;
import java.util.Scanner;
public class Task1{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number");
    int num=sc.nextInt();
     System.out.println("Input power");
     int pow=sc.nextInt();
     System.out.println("powerN("+num+","+pow+")="+power(num,pow));
  }
    //task 1
  public static int power(int n, int p)
  {
    if(p==0){
      return 1;}
    else
    {
     return n*power(n,p-1);
    }
  }
}