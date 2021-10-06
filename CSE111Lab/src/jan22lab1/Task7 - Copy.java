package jan22lab1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Height of the rectangle ? ");
        int height = sc.nextInt();
        System.out.println("Width of the rectangle ?  ");
        int width = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            if(i == 1 || i == height ){
             for (int j = 1; j <= width; j++){
                 System.out.print(j);
             }
            }
             else{
 
            }

                
            }
            System.out.println("");
        }
    }
