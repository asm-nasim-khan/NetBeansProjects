package feb5lab3;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        int n;
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter Numbers: ");
            n = sc.nextInt();
            a[n]=a[n]+1;
        }
        for (int i = 2; i <=4; i++) {
            System.out.println(i+" was found "+a[i]+" times.");
            
        }
    }
    
}
