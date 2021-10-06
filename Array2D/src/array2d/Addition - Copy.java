package array2d;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        int[][] brr = new int[2][3];
        int[][] crr = new int[2][3];
        for(int row = 0;row<arr.length;row++){
            System.out.println("Input int row:"+row);
            for(int col = 0;col < arr[row].length;col++){
                System.out.println("Enter numbers");
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("2nd Matrix");
        for(int row = 0;row<brr.length;row++){
            System.out.println("Input int row:"+row);
            for(int col = 0;col < brr[row].length;col++){
                System.out.println("Enter numbers");
                brr[row][col] = sc.nextInt();
            }
        }
        for(int row = 0;row<crr.length;row++){
            System.out.println("Input int row:"+row);
            for(int col = 0;col < crr[row].length;col++){
                crr[row][col] = arr[row][col]+brr[row][col];
            }
        }
        for(int v = 0;v <crr.length;v++){
            for(int j =0;j<crr[v].length;j++){
                System.out.print(crr[v][j]+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
