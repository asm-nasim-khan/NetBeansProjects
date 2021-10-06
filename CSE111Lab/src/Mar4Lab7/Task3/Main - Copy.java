package Mar4Lab7.Task3;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word:");
        String words = sc.nextLine();
        System.out.println("Enter Your another Magic Word:");
        String words1 = sc.nextLine();
        Design m2 = new Design(words);
        System.out.println(m2.StartsWith(words1));
    }

}
