package feb1lab2v1;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; ) {
            System.out.println("Enter Numbers: ");
            int waiting = sc.nextInt();
            if(waiting >=0 && waiting <=9){
                for (int j = 0; j <= 9; j++) {
                    if(waiting == j){
                    a[j] += 1;
                } 
                }
                i++;
            }
            else{
                System.out.println("Try 0-9.");
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=2 && a[i]<5){
                System.out.print(i+" ,");

        }
    }
    
}

    
}
