package jan29lab2;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter numbers: ");
            a[i] = sc.nextInt();
            System.out.println("Entered so far: ");
            for (int j = 0; j <= i; j++) {
                System.out.print(a[j]+" , ");
            }
            System.out.println();
        }
    }
    
}
