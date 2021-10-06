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
public class Task1014 {
    
    
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int d;
    double fuel,con;
    d = scan.nextInt();
    fuel = scan.nextDouble();
    con = (d*1.0)/fuel;
    System.out.printf(" %.3f km/l\n",con);
    }
}

