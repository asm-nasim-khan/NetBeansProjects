package feb1lab2v1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length;) {
            System.out.println("Enter NUmbers: ");
            int waiting = sc.nextInt();
            int count =0 ;
            for (int j = 0; j < i; j++) {
                if(a[j] == waiting){
                    count+=1;
                } 
            }
            if(count< 4){
                a[i]=waiting;
                i++;
            }
            else{
                System.out.println("Try another Numbers.");
            }
            
        }
        for (int element : a) {
            System.out.print(element+" ,");
            
        }
    }
    
}
