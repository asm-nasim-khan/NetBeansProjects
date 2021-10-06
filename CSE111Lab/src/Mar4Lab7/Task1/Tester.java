package Mar4Lab7.Task1;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word:");
        String words = sc.nextLine();
        Backend m = new Backend(words);
        m.length1();
    }
}
