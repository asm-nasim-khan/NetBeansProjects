package Test;
public class PopQuiz {
    static int BinarySearch( int A[],int value){
        int L = 0;
        int R = A.length;
        int M;
        while(L<=R){
            System.out.println("BinarySearch");
            M = (L+R)/2;
            if(A[M] == value) return M;
            else if(A[M] < value) L = M + 1;
            else R=M-1;
        }
            return -1;
    }
    static int def(int x){
        System.out.println("Elo");
        if(x==1 || x== 0){
            System.out.println("Stop");
            return 0;
        }
        else{
            System.out.println(x);
            return def(x%2);
        }
    }
    static int func(int x){
        System.out.println("Func");
        return x+func(x-1);
    }
    static void priya(int x){
        if(x<5){
            System.out.println(x*2);
            priya(x+1);
            System.out.println(x*2);
        }
    }
    static int nafis(int x,int y){
        if(x<0 || x>=y){
            System.out.println("Stop");
            return -1;        }
        else{
            System.out.println(y);
            return nafis(x+1,y);
        }
    }
    static void me(int x){
        if(x>0){
            x=x-1;
            me(x);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
//        int[] B={1,2,3,4,5,6};
//        System.out.println(BinarySearch(B,6));
//System.out.println(func(15));'
//priya(2);
//int x = 4;
//int y = x*2;
//        System.out.println(nafis(x,y));
me(4);
    }
}
