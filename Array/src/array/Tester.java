package array;
import java.util.Scanner;
public class Tester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength;
        int choice = 0;
        int[] a = new int[1];
        while(choice <= 6){
        System.out.println("1 : Create an array ");
        System.out.println("2 : Print that array ");
        System.out.println("3 : Print reverse array ");
        System.out.println("4 : Reverse that array ");
        System.out.println("5 : Searching value in the array ");
        System.out.println("6 : Ascending sort ");
        System.out.println("Enter you choice: ");
        choice = sc.nextInt();
        if(choice == 1){  //take sizeOfArray as input and then store that many numbers in the array arr.
            System.out.println("How Many numbers ?");
            arrayLength = sc.nextInt();
            a = new int[arrayLength];
            for(int i = 0;i < a.length ;i++){
                System.out.println("Enter number: ");
                a[i] = sc.nextInt();
            }
        }
        else if(choice == 2){ //print the array          
            for(int v = 0; v < a.length ; v++){
                System.out.println(a[v]);
            }
        }
        else if(choice == 3) //reverse print the array
        {    
            for(int v =a.length-1 ; v >= 0 ; v--){
                System.out.println(a[v]);
            }
        }
        else if(choice == 4) // reverse the array
        {  
            for(int j = a.length -1 ,v = 0; v < j ; v++,j--){
                int temp = a[v];
                a[v] = a[j];
                a[j] = temp;
        }
            for(int v:a){
                System.out.println(v);
            }
            }
        else if(choice == 5) // take an input and search that value in the array
        {
            System.out.println("Enter number to check Duplicate: ");
            int checker = sc.nextInt();
            boolean duplicate = false;
            for(int v = 0;v < a.length ;v++){
                if(a[v] == checker){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else if(choice == 6)
        {
                    int index,min,minLocation,temp,v =0;
                    while(v <= a.length - 2){
                        min = a[v];
                        minLocation = v;
                        index = minLocation + 1;
                        while(index < a.length){
                            if(a[index]< min){
                                min = a[index];
                                minLocation = index;
                            }
                            index++;
                        }
                        temp = a[v];
                        a[v] = min;
                        a[minLocation] = temp;
                        v++;
                    }
                    for(int elements:a){
                        System.out.println(elements +" ");
                    }
        }
        }
        System.out.println("The program is Finished");
    }
}