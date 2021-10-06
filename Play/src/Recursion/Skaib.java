package Recursion;
public class Skaib {
    public static void SelectionSort(int[] a,int i){
        if(i == 1 ){
            return ;
        }
        else{
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
        SelectionSort(a,i-1);
    }
    
    public static void main(String[] args) {
        int[] a={7,15,12,13};
        SelectionSort(a,a.length-1);
        //CountSort(a,15);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ,");
        }
        
    }
    

}
