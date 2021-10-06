package jan29lab2;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter numbers: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(i%2 ==0){
                System.out.print(a[i]+" , ");
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(i%2 !=0){
                System.out.print(a[i]+" , ");
            }
        }
    }
}
