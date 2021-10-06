package Recursion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the array:");
        int len = sc.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter Values of the array:");
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 0; i < len; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum is:"+min);
    }

}
