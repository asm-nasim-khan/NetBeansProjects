/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb11Lab3v2.Easy;
import java.util.Scanner;

/**
 *
 * @author Piplu
 */
public class EasyTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Word: ");
        String word = sc.next();
        int len = word.length();
        for (int i = 0; i <len; i++) {
            System.out.print((char)(word.codePointAt(i) - 1)); 
        }
    }
    
}
