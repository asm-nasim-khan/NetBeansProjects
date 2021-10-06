package Feb11Lab3v2.Easy;
import java.util.Scanner;
/**
 *
 * @author Piplu
 */
public class EasyTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Word: ");
        String word = sc.next();
        int len = word.length();
        int[] a = new int[len];
        for (int i = 0; i <len; i++) {
            a[i] = word.codePointAt(i);   
        }
        int index, min, minLocation, temp, i;
        for(i=0;i <a.length-1;i++) {
            min = a[i];
            minLocation = i;
            index = minLocation+1;
            for(;index < a.length;index++){
                if(a[index] < min){
                    min = a[index];
                    minLocation = index;
                }
            }
            temp = a[i];
            a[i] = min;
            a[minLocation] = temp;
        }
        for (int j = 0; j <a.length; j++) {
            System.out.print((char)a[j]+" ");
        }
    }
    
}
