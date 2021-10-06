package jan29lab2;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter numbers: ");
            a[i] = sc.nextInt();
        }
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ,");
        }
    }
    
}
