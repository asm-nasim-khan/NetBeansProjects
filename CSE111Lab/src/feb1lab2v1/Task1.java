package feb1lab2v1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enters Number: ");
            a[i]=sc.nextInt();
        }
        for (int i = a.length-1; i>=0 ; i--) {
            System.out.print(a[i]+" ,");
            
        }
    }
    
}
