package Lab05;
public class Recursion extends Memoization {
    public static void main(String[] args) {
//        System.out.println(fibo(3));
//        System.out.println(fac(6));
        int[] b = {5,4,3,2,1};
//        PrintArray(b,b.length-1);
//        System.out.println("");
        Selection_Sort(b,b.length-1,b.length-1);
        printA(b);
        System.out.println("");
        PrintArray(b,b.length-1);
//        System.out.println(fibo(5));
//        System.out.println(Fibo_Memo(b,3));
//        System.out.println("Done");
//        System.out.println(Fibo_Memo(b,3));
    }
    static int fac(int n){
//        System.out.println("Alo");
        if(n == 1){
            return 1;
        }
        return n* fac(n-1);
    }
    static int fibo(int n){
//        System.out.println("Oi");
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static int power(int m,int n){
        if(n==0){
            return 1;
        }
        return m * power(m,n-1);
    }
    static void PrintArray(int[] a,int n){
        if(n != -1){
            PrintArray(a,n-1);
            System.out.print(a[n]+" ");
        }
    }
    static void Selection_Sort(int[] a,int n,int p){
        if(n == -1){
            return;
        }
        int l = a.length-1;
        Selection_Sort(a,n-1,l-1);
        int maxLoc = 0;
        int max = a[maxLoc];
        for (int jindex = 0; jindex <= l; jindex++) {
            if(a[jindex] > max){
            max = a[jindex];
            maxLoc = jindex;
                }
            }
        int temp = a[maxLoc];
        a[maxLoc] = a[l];
        a[l] = temp;
    }
    static int sumN(int n){
        if(n==0) return n;
        return n + sumN(n-1);
    }
    static int Expo(int base,int n){
        System.out.println("Count");
        if(n==0) return 1;
        int temp = Expo(base,n/2);
        if(n % 2 ==0) return temp * temp;
        return temp* temp * base;
    }
    static void printA(int[] a){
    for  (int el : a){
            System.out.print(el+" ");
        }
}
}
