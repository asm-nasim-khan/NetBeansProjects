package feb5lab3;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word: ");
        String word = sc.next();
        int asci;
        for (int i = 0; i < word.length(); i++) {
            asci = word.codePointAt(i);
            System.out.println("Ascii Code this Lette this "+word.charAt(i)+" : "+asci);
            
        }
        
    }
    
}
