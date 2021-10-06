package Customexc;
public class temp {
    public static void main(String[] args) {
        int[] a = {4,2,1,6,3,5};
        a=BubbleSort(a);
        for  (int el : a){
            System.out.print(el+" ");
        }
    }
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
}
