package jan22lab1;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Height of triangle? ");
        int height = sc.nextInt();
        for(int v = 1; v <= height ;v++){
            for(int j = 1 ; j <= height - v ; j++ ){
                System.out.print(" ");
            }
            for(int k = 1 ;k <= v+(v-1) ;k++){
                if(k== v+(v-1) || v == height || k==1){
                System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}