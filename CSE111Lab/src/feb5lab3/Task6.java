/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feb5lab3;
import java.util.Scanner;
/**
 *
 * @author 19101623
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word: ");
        String word = sc.next();
        String b ="==THE END==";
        System.out.println(word);
        System.out.println(word.concat(b));
        System.out.println(word);
    }
    
}
