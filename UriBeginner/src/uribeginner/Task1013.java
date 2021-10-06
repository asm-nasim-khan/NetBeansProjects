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
public class Task1013 {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int a,b,c;
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    if(a>b && a>c){
        System.out.println(a+" eh o maior");
    }
    else if(b>a && b>c){
        System.out.println(b+" eh o maior");
    }
    else{
        System.out.println(c+" eh o maior");
    }
    }
}
