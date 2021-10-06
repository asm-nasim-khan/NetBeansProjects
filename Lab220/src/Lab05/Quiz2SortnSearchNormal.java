package Lab05;
public class Quiz2SortnSearchNormal {
    //Bubble Sort Ascending
   public static int[] BubbleSort(int[] A){
       int temp;
       int count =0;
       int swap = 0;
       for(int i = A.length-1;i>0;i--){
           for (int j = 0; j <i; j++) {
               count++;
               if (A[j]> A[j+1]) {
                   swap++;
                   temp = A[j];
                   A[j] = A[j+1];
                   A[j+1] = temp;
               }
             
           }
       }
       System.out.println(count+" Compares");
       System.out.println(swap+" Swap");
     return A;
   }
 //Selection Sort Ascending
public static int[] SelectionSort(int[] a){
    int count =0;
    int swap = 0;
    for (int i = a.length-1; i >= 0; i--) {
        int mx =a[i];
        int mxl = i;
        for (int j = 0; j < i; j++) {
            count++;
            if(a[j]>mx){
                swap++;
                mx=a[j];
                mxl=j;
            }
        }
        int temp = a[mxl];
        a[mxl]=a[i];
        a[i]=temp;
    }
    System.out.println(count+" Compares");
    System.out.println(swap+" Swap");
    return a;
}
//Insertion Sort Ascending
public static int[] InsertionSort(int[] a){
    int temp;
    int count=0;
    int swap = 0;
    for (int i = 0; i < a.length; i++) {
        for (int j = i-1; j>=0; j--){
            count++;
            if(a[j]>a[j+1]){
                swap++;
                temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            else{
                break;
            }
        }
    }
    System.out.println(count+" Compares");
    System.out.println(swap+" Swap");
    return a;
}
//Linear Search 
static int LinearSearch(int[] a,int value){
    for (int i = 0; i < a.length; i++) {
        System.out.println("LinearSearch");
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
        System.out.println("BinarySearch");
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
static void printA(int[] a){
    for  (int el : a){
            System.out.print(el+" ");
        }
}
    public static void main(String[] args) {
        int[] a = {4,2,1,6,3,5};
        a=BubbleSort(a);
        printA(a);
//        a=SelectionSort(a);
//        printA(a);
//        a=InsertionSort(a);
//        printA(a);
//        System.out.println(BinarySearch(a,6));
//        System.out.println(LinearSearch(a,6));
    }
}
