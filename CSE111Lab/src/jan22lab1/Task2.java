package jan22lab1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Rows? ");
        int row = sc.nextInt();
        System.out.println("How many Coloum? ");
        int col = sc.nextInt();
        for(int v = 0;v < row;v++){
            for(int j = 1;j<= col;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
