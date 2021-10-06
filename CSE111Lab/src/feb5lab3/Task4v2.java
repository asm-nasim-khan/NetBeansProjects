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
public class Task4v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Magic Word: ");
        String word = sc.next();
        int[] a = new int[256];
        int asci;
        for (int i = 0; i < word.length(); i++) {
            asci = word.codePointAt(i);
            a[asci] += 1;
        }
        for (int i = 65; i <=90; i++) {
            System.out.println((char)i+" WHich is "+i+" Was dound "+a[i]+" Times.");
            
        }
        
    }
    
}
