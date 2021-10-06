package feb1lab2v1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        int y = 0,sign=1;
        for (int i = 1; i <= n; i++) {
            y+=sign*(i*i);
           sign=(sign*-1);
        }
        System.out.println("Value of Y is: "+y);
    }
    
}
