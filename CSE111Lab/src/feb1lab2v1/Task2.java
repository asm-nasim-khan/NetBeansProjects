package feb1lab2v1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enters Number: ");
            a[i]=sc.nextInt();
            System.out.print("You have entered ");
            for (int j = 0; j <= i; j++) {
                System.out.print(a[j]+" ,"); 
            }
            System.out.println("");
        }
    }
    
}
