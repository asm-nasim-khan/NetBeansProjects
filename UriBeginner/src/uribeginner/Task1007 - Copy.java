/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uribeginner;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class Task1007 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int A,B,C,D,diff;
    A = scan.nextInt();
    B = scan.nextInt();
    C = scan.nextInt();
    D = scan.nextInt();
    diff = (A * B - C * D);
    System.out.println("DIFERENCA = "+ diff);    
    }
}
