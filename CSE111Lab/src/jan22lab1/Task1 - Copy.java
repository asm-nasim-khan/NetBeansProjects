package jan22lab1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is last number?");
        int limit = sc.nextInt();
        for(int v = 1;v <= limit ; v++){
            System.out.print(v);
        }
        
    }
    
}
