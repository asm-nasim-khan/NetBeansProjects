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
public class Task1015 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double x1,x2,y1,y2,distance;
    x1 = scan.nextDouble();
    y1 = scan.nextDouble();
    x2 = scan.nextDouble();
    y2 = scan.nextDouble();
    distance = Math.pow((x2-x1),2)+ Math.pow((y2-y1),2);
    System.out.printf("%.4f\n",Math.sqrt(distance));
    
    }
}
