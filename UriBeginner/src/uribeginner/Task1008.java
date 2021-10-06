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
public class Task1008 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int num,etime;
    double perhrate,salary;
    num = scan.nextInt();
    etime = scan.nextInt();
    perhrate = scan.nextDouble();
    salary = (etime * perhrate);
    System.out.println("NUMBER = "+ num);    
    System.out.printf("SALARY = U$ %.2f\n" , salary);
    }
}
