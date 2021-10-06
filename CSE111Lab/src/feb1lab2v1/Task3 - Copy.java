package feb1lab2v1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enters Number: ");
            a[i]=sc.nextInt();
        }
        int max,maxLocation,index,temp;
        for (int i = 0; i <= a.length-2; i++) {
            max=a[i];
            maxLocation = i;
            index = maxLocation + 1;
            for(;index< a.length;){
                if(a[index]>max){
                    max= a[index];
                    maxLocation = index;
                }
                ++index;
            }
            temp = a[i];
            a[i]= max;
            a[maxLocation] = temp; 
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ,");
            
        }
    }
    
}
