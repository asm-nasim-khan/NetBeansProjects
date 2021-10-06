package Recursion;
public class SortnSearch {
    public static void BubbleSortR(int[] A,int num){
        System.out.println("BubbleSort-call-REcursion");
        if(num == 1){
            return;
        }
        for (int j = 0; j <num-1; j++) {
            System.out.println("BubbleSort-Comparing-REcursion");
             if (A[j]> A[j+1]) {
                 System.out.println("BubbleSort-Swap-REcursion");
                 int temp = A[j];
                 A[j] = A[j+1];
                 A[j+1] = temp;
             }
    }
        BubbleSortR(A,num-1);
}
    public static void InsertationSortR(int[] a,int i){
        System.out.println("Insertation Sort-call-REcursion");
        if(i <=1){
            return;
        }
        InsertationSortR(a,i-1);
        for (int j = i-1; j>=0; j--){
            System.out.println("Insertation Sort-Comparing-REcursion");
            if(a[j]>a[j+1]){
                System.out.println("Insertation Sort-Swap-REcursion");
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            else{
                break;
            }
    }
    }
    public static void SelectionSortR(int[] a,int i){
        System.out.println("SelectionSort-Call-REcursion");
        if(i == 0 ){
            return ;
        }
        else{
            int mx =a[i];
        int mxl = i;
        for (int j = 0; j < i; j++) {
            System.out.println("Selection Sort-Comparing-REcursion");
            if(a[j]>mx){
                mx=a[j];
                mxl=j;
            }
        }
        System.out.println("Selection Sort-Swap-REcursion");
        int temp = a[mxl];
        a[mxl]=a[i];
        a[i]=temp;
        }
        SelectionSortR(a,i-1);
    }
    public static int BinarySearchR(int[] a,int l,int h,int key){
        System.out.println("we need to check Binarry");
        if(l==h){
            if(a[l] == key){
                return l;
            }
            else{
                return -1;
            }
        }
        else{
            int mid = (l+h)/2;
            if(key == a[mid]){
                return mid;
                }
            else{
                if (key < a[mid]){
                return BinarySearchR(a,l,mid-1,key);
            }
            else{
                return BinarySearchR(a,mid+1,h,key);
            }
            }
        }
        }
    public static void main(String[] args) {
        int[] a ={130,1,4,5,67,68,69,72,76,90,120};
//        //BubbleSortR(a,a.length);
        SelectionSortR(a,a.length-1);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ,");
        }
        //InsertationSortR(a,a.length-1);
        //System.out.println(BinarySearchR(a,0,a.length-1,76));
//        int[] B={1,2,3,4,5,6};
//        int[] A={4,2,1,6,3,5};
//        //System.out.println(BinarySearchR(B,0,B.length-1,6));
//        
//        BubbleSortR(A,A.length);
    }
}
