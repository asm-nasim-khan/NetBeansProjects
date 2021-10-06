package array2d;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int row = 0;row<arr.length;row++){
            System.out.println("Input int row:"+row);
            for(int col = 0;col < arr[row].length;col++){
                System.out.println("Enter numbers");
                arr[row][col] = sc.nextInt();
            }
        }
        for(int v = 0;v <arr.length;v++){
            for(int j =0;j<arr[v].length;j++){
                System.out.print(arr[v][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
