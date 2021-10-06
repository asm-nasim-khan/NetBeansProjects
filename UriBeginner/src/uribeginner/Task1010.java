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
public class Task1010 {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int count1,count2,code1,code2;
    double perurate1,perurate2,total;
    code1 = scan.nextInt();
    count1 = scan.nextInt();
    perurate1 = scan.nextDouble();
    code2 = scan.nextInt();
    count2 = scan.nextInt();
    perurate2 = scan.nextDouble();
    total = ((count1 * perurate1)+(count2 * perurate2));
    System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
    }
}
