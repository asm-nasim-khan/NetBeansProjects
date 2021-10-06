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
public class Task1011 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    double r,vol;
    r = scan.nextDouble();
    vol = (4.0/3)*3.14159 *(r*r*r);
    System.out.printf("VOLUME = %.3f\n" , vol);
    }
}
