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
public class Task1002 {
    public static void main(String[] args){
        double R,A;
        Scanner sc = new Scanner(System.in);
        R = sc.nextDouble();
        A = 3.14159 * R * R;
        System.out.printf("A=%.4f\n", A);
}  
}
