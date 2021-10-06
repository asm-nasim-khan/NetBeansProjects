package feb1lab2v1;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (; ;) {
            System.out.println("Enter NUmbers: ");
            int waiting = sc.nextInt();
            for (int j = 0; j <a.length; j++) {
                if(j == waiting){
                    if(a[j]< 4){
                         a[j]+=1;
                    }
                    else{
                        System.out.println("Try another Numbers.");
                    }
                }
            }
           for (int k = 0; k <a.length ; k++) {
               if(a[k]>=2 && a[k]<5 ){
                    System.out.println(k+" Entered "+a[k]+" Times.");
               }
           }
        }
    }
}
