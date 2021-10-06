package jan29lab2;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter numbers: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Which number you want to check: ");
        int check = sc.nextInt();
        boolean duplicate = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==check){
                duplicate = true;
                break;
            }
        }
        if(duplicate){
            System.out.println("Yes. ");
        }
        else{
            System.out.println("No. ");
        }
        
    }
    
}
