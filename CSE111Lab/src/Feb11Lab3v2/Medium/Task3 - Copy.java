package Feb11Lab3v2.Medium;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word,word1;
        System.out.println("Enter a word: ");
        word = sc.next();
        System.out.println("Enter another word: ");
        word1 = sc.next();
        String lastWord= word.concat(word1);
        System.out.println(lastWord);
    }
    
}
