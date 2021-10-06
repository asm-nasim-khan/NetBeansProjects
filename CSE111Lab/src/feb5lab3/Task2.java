package feb5lab3;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word: ");
        String word = sc.next();
        for (int i = 0; i <word.length(); i++) {
            System.out.println(word.charAt(i));
            
        }
    }
    
}
