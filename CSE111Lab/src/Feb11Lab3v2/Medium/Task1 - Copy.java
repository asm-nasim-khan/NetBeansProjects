package Feb11Lab3v2.Medium;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word: ");
        String word = sc.next();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
                
            }
            System.out.println("");
            
        }
    }
    
}
