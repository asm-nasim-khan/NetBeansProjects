package Sort;
import java.util.Scanner;
public class SortProgram {
    //Bubble Sort Ascending
   public static int[] BubbleSort(int[] A){
     for(int i = A.length-1;i>=0;i--){
         for (int j = 0; j <i; j++) {
             if (A[j]> A[j+1]) {
                 int temp = A[j];
                 A[j] = A[j+1];
                 A[j+1] = temp;  
             }
             
         }
}
     return A;
   }
 //Selection Sort Ascending
public static int[] SelectionSort(int[] a){
    
    for (int i = a.length-1; i >= 0; i--) {
        int mx =a[i];
        int mxl = i;
        for (int j = 0; j < i; j++) {
            if(a[j]>mx){
                mx=a[j];
                mxl=j;
            }
        }
        int temp = a[mxl];
        a[mxl]=a[i];
        a[i]=temp;
    }
    return a;
}
//Insertion Sort Ascending
public static int[] InsertionSort(int[] a){
    int temp;
    int count=0;
    for (int i = 0; i < a.length; i++) {
        for (int j = i-1; j>=0; j--){
            if(a[j]>a[j+1]){
                temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                count=count+1;
            }
            else{
                break;
            }
            
        }
    }
    System.out.println(count);
    return a;
}
//Linear Search 
static int LinearSearch(int[] a,int value){
    for (int i = 0; i < a.length; i++) {
        if(a[i] == value){
            return i;
        }
    }
    return -1;
}
//Binary Search
static int BinarySearch(int[] a,int value){
    int l =0;
    int r = a.length-1;
    while(l <= r){
        int m =(l+r)/2;
        if(value ==a[m]){
            return m;
        }
        else if(value > a[m]){
            l=m+1;
        }
        else{
            r=m-1;
        }
    }
    return -1;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number of values in array:");
    int len = sc.nextInt();
    int[] a = new int[len] ;
    for (int i = 0; i < len; i++) {
        System.out.println("Enter values of the array:");
        a[i]=sc.nextInt();
    }
    System.out.println("1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort\n4.Linear Search\n5.Binary Search");
    int op = sc.nextInt();
    if(op == 1){
        BubbleSort(a);
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
    else if(op == 2){
        SelectionSort(a);
        for(int ele:a){
        System.out.print(ele+" ");
        }
    }
    else if(op == 3){
        InsertionSort(a);
        for(int ele:a){
            System.out.print(ele+" ");
        }
                        }
    else if(op == 4){
        System.out.println("What value are you looking for?");
        int val =sc.nextInt();
        int index=LinearSearch(a,val);
        if(index<0){
            System.out.println("This Value is not found");
        }
        else{
            System.out.println("This Value is at index"+index); 
        }
    }
    else if(op == 5){
        System.out.println("What value are you looking for?");
        int val =sc.nextInt();
        int index=BinarySearch(a,val);
        if(index<0){
            System.out.println("This Value is not found");
        }
        else{
            System.out.println("This Value is at index"+index); 
        }
    }
            
}
}

     
