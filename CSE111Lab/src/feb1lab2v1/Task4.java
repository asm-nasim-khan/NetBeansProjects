package feb1lab2v1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length;) {
            System.out.println("Enter NUmbers: ");
            int waiting = sc.nextInt();
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if(a[j] == waiting){
                    duplicate = true;
                    break;
                } 
            }
            if(!duplicate){
                a[i]=waiting;
                i++;
            }
            else{
                System.out.println("Duplicate Found.Try another Numbers.");
            }
            
        }
        for (int element : a) {
            System.out.print(element+" ,");
            
        }
        
    }
    
}
