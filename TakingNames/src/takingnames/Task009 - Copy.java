
package takingnames;
import java.util.Scanner;
public class Task009 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double totalMark = 0,average,mark;
     System.out.println("Please enter Quantity");
     int quantity = sc.nextInt();
     String[] a = new String[quantity];
      int[] b = new int[quantity];
     for(int index = 0; index< a.length;++index){
        System.out.println("Please enter Your ID:");
        b[index] = sc.nextInt();
        System.out.println("Please enter Name:");
        sc.nextLine();
        a[index] = sc.nextLine();
        System.out.println("Please enter Your mark:");
        mark = sc.nextDouble();
        totalMark += mark;

     }
     average = 1.0*totalMark/a.length;
     System.out.println("Average:"+average);
     for(int index = 0; index< a.length;++index){
        System.out.println(a[index]+" : "+b[index]);
     }
  }
}
        
     
     
        
        
        
        
        


