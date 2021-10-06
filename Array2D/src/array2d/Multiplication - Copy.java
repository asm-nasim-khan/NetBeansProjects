package array2d;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] aa = {{1,2,3},{1,2,3}};
        int[][] bb ={{1,2},{1,2},{1,2}};
        int[][] cc = new int[aa.length][bb[1].length];
        for(int row = 0;row < aa.length;row++){
            for(int col = 0;col < aa.length;col++){
                cc[row][col] = 0;
                for(int v =0;v < bb.length;v++){
                    cc[row][col] += aa[row][v]*bb[v][col];
                }
            }
        }
         for(int v = 0;v <cc.length;v++){
             for(int j =0;j<cc[v].length;j++){
                System.out.print(cc[v][j]+" ");
            }
            System.out.println();
        }
    }
    }
