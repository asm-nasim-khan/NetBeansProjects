package jan22lab1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Height of triangle? ");
        int height = sc.nextInt();
        for(int v = 1;v<= height;v++){
            for(int j = height - 1;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<= v;k++){
                System.out.print(k);
            }
            System.out.println("");
        }
    }
    
}
