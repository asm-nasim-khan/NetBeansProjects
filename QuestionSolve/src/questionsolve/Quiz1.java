package questionsolve;
import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers: ");
        int[] a= new int[sc.nextInt()];
        int[] b = new int[a.length];
        int[] c = new int[a.length+b.length];
        for(int j= a.length-1;j>=0;j--){
                System.out.println("Input into A array");
                a[j]=sc.nextInt();
            }
        for(int v = a.length-1 ; v>=0;v--){
            System.out.println("input into b Array: ");
            b[v]=sc.nextInt();
        }
        for(int v = 0;v<c.length;v+=2){
            c[v]=a[v];
            c[v+1]= b[v];
        }
    }
    
}
