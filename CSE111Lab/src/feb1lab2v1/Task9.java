package feb1lab2v1;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enters Number: ");
            a[i]=sc.nextInt();
        }
        System.out.println("a) only numbers at odd positions.");
        System.out.println("b) only numbers at even positions.");
        System.out.println("c) all numbers (means numbers at all positions)");
        System.out.println("Enter your Choice: ");
        char choice = sc.next().charAt(0);
        choice = Character.toUpperCase(choice);
        int max,maxLocation,index,temp;
        if(choice == 'A'){
            for (int i = 0; i <= a.length-2; i++) {
                if(i%2 != 0){
                    max=a[i];
                    maxLocation = i;
                    index = maxLocation + 1;
                    for(;index< a.length;){
                        if(index%2 != 0){
                            if(a[index]>max){
                            max= a[index];
                            maxLocation = index;
                            }
                        }
                        ++index;
                    }
                    temp = a[i];
                    a[i]= max;
                    a[maxLocation] = temp;
                }
            }
                for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ,");
            }
        }
        else if(choice == 'B'){
            for (int i = 0; i <= a.length-2; i++) {
                if(i%2 == 0){
                    max=a[i];
                    maxLocation = i;
                    index = maxLocation + 1;
                    for(;index< a.length;){
                        if(index%2 == 0){
                            if(a[index]>max){
                            max= a[index];
                            maxLocation = index;
                            }
                        }
                        ++index;
                    }
                    temp = a[i];
                    a[i]= max;
                    a[maxLocation] = temp;
                }
            }
                for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ,");
            }
            
            
        }
        else if(choice == 'C'){
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
}