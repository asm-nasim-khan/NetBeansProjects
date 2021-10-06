package Recursion;
public class Arko {
    public static int FastestSearch(int[] A,int L,int R,int x){
        if(L==R){
            if(A[L] == x) return 1;
            return -1;
        }
        else{
            int M = (L+R)/2;
            if(x == A[M])return M;
            else{
                if (x < A[M]) return FastestSearch(A,L,M-1,x);
                return FastestSearch(A,M+1,R,x);
            }
        }
        }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(FastestSearch(a,0,a.length-1,4));
    }
}
