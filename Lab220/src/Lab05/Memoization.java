package Lab05;
public class Memoization {
    static int Fibo_Memo(int[] a,int n){
        System.out.println("Hello1");
        if(a[n] > 0) return a[n];
        if(n==1 || n== 2){
            a[n] = 1;
            return a[n];
        }
        else{
            a[n] = Fibo_Memo(a,n-2) + Fibo_Memo(a,n-1);
            return a[n];
        }
            
    }
}
