package jan22lab1;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Height of triangle? ");
        int height = sc.nextInt();
        for(int v = 1; v <= height ;v++){
            for(int j = 1 ; j <= height - v ; j++ ){
                System.out.print(" ");
            }
            for(int k = 1 ;k <= v+(v-1) ;k++){
                if(k==1|| k== v+(v-1)){
                    System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println("");
        }
        for(int v = height - 1; v >= 1;v--){
            for(int j = v ;j <= height - 1 ; j++ ){
                System.out.print(" ");
            }
            for(int k = 1 ;k <= v+(v-1) ;k++){
                if(k==1|| k== v+(v-1)){
                    System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
        }
            System.out.println("");
    }
    }
    
}
