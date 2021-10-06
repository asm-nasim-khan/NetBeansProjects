package Sort;
import java.util.Scanner;
public class SortPrograNonRecursive {
    //Bubble Sort Ascending
   public static int[] BubbleSort(int[] A){
       int temp;
       for(int i = A.length-1;i>0;i--){
           for (int j = 0; j <i; j++) {
               if (A[j]> A[j+1]) {
                   temp = A[j];
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
    int left =0;
    int right = a.length-1;
    while(left <= right){
        int m =(left+right)/2;
        if(value ==a[m]){
            return m;
        }
        else if(value > a[m]){
            left=m+1;
        }
        else{
            right=m-1;
        }
    }
    return -1;
}
//CountSort
public static void CountSort(int[] A,int k){
    int[] count =new int[k+1];
    int[] b = new int[A.length];
    for (int i = 0; i < A.length; i++) {
        count[A[i]] = count[A[i]]+1;
    }
    for (int i = 1; i <= k; i++) {
        count[i] = count[i]+count[i-1];
    }
    for (int i = A.length-1; i >= 0; i--) {
        count[A[i]]=count[A[i]] - 1;
        b[count[A[i]]] = A[i];
        
    }
    for(int ele=0;ele<b.length;ele++){
            System.out.print(b[ele]+",");
        }
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
    System.out.println("1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort\n4.Linear Search\n5.Binary Search\n6.Count Sort");
    int op = sc.nextInt();
       switch (op) {
           case 1:
               BubbleSort(a);
               for(int ele:a){
                   System.out.print(ele+" ");
               }      break;
           case 2:
               SelectionSort(a);
               for(int ele:a){
                   System.out.print(ele+" ");
               }      break;
           case 3:
               InsertionSort(a);
               for(int ele:a){
                   System.out.print(ele+" ");
               }      break;
           case 4:
               {
                   System.out.println("What value are you looking for?");
                   int val =sc.nextInt();
                   int index=LinearSearch(a,val);
                   if(index<0){
                       System.out.println("This Value is not found");
                   }
                   else{
                       System.out.println("This Value is at index"+index);
                   }          break;
               }
           case 5:
               {
                   System.out.println("What value are you looking for?");
                   int val =sc.nextInt();
                   int index=BinarySearch(a,val);
                   if(index<0){
                       System.out.println("This Value is not found");
                   }
                   else{
                       System.out.println("This Value is at index"+index);
                   }          break;
               }
           case 6:
               CountSort(a,6);
               break;
           default:
               break;
       }
            
}
}

     
