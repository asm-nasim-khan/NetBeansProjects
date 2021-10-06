package jan29lab2;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; ) {
            System.out.println("Enter Numbers: ");
            int waiting = sc.nextInt();
            boolean duplicate =false;
            for (int j = 0; j < i;j++ ) {
                if(a[j]==waiting){
                    duplicate = true;
                    break;
                }
                }
            if(duplicate){
                System.out.println("Duplicate. Try another number: ");
                
            }
            else{
                a[i]=waiting;
                i++;
            }
            }
        for(int ele:a){
            System.out.print(ele+" ,");
        }
                
            }
    
}
