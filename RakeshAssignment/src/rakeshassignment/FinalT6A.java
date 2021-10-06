/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakeshassignment;
public class FinalT6A{
  public int temp = 1;
  private int sum;
  private int y = 2;
  public FinalT6A(int x, int p){
    temp+=1;
    y = temp - p;
    sum = temp + x;
      System.out.println("Baaaaaal");
    System.out.println(x + " " + y+ " " + sum);
  }
  public void methodA(){   
      System.out.println("aGHHAAA");
    int x=0, y =0;
      System.out.println("This y in a 0"+this.y);
    y = y + this.y; 
      System.out.println("This y in a "+y); // y= -4
    x = this.y + 3 + temp;
      System.out.println(" X IN A"+x); // x = 1
      System.out.println("Temp in A"+temp);
      System.out.println("Y in A"+y);
      System.out.println("x in a"+x);
    sum = x + y + methodB(temp, y); // temp = 2, y = -4
    // 1-4+6
    System.out.println(x + " " + y+ " " + sum);
  }
  private int methodB(int temp, int n){ // temp = 2, n = -4
    int x = 0;
      System.out.println(" Value oF N "+n);
      System.out.println("e y"+y);
    y = y + (++temp); // y=  -1
      System.out.println("Y in B "+y); // y = -1
      System.out.println("X in b "+ x); // x = 0
      System.out.println("Temp "+temp);
    x = x + 4 +  n; // x= 0
    sum = sum + x + y; // 7-1 +0
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }
}
