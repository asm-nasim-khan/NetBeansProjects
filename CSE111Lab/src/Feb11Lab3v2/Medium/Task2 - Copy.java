package Feb11Lab3v2.Medium;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len=0;
        int[] a = new int[0];
        boolean duplicate = false;
        for (int i = 1; i < 2 ; ) {
            System.out.println("Enter Your Magic Word: ");
            String waiting = sc.next();
            len = waiting.length();
             a =new int[len];
             int asci;
            for (int j = 0; j < len; j++) {
                asci =waiting.codePointAt(j);
                for (int k =0 ; k < a.length; k++) {
                    if(a[k] == asci){
                        duplicate = true;
                    }
                }
                    if(!duplicate){
                        a[j] = asci;
                    }
                    else{
                        System.out.println("Enter a word with unique alphabets: ");
                        break;
                    }
                } 
            if(!duplicate){
                for (int j = 0; j < len; j++) {
                    System.out.print((char)a[j]);
                    i++;
                }
            }
            }
        }
        
    }
