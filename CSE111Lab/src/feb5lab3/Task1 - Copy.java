package feb5lab3;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word: ");
        String word = sc.next();
        int len = word.length();
        System.out.println("Word length is: "+len);
    }
    
}
