package jan29lab2;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter numbers: ");
            a[i] = sc.nextInt();
        }
        for (int i = a.length-1; i >= 0; i--) {
            if(a[i]%2 ==0){
                System.out.print(a[i]+" ,");
            }
        }
    }
    
}
