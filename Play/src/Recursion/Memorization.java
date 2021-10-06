package Recursion;

import static Recursion.Length.fac;

public class Memorization {
    public static int[] a = new int[100];
    // Fibonacci Number
    public static int Fibo(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    
    //Non-Memorization
    public static int FiboM(int n){
        if(a[n] > 0){
            return a[n];
        }
        if(n == 0 || n == 1){
            return a[n] = 1;
        }
        else{
            return a[n]= FiboM(n-1)+FiboM(n-2);
        }
    }
    public static void main(String[] args) {
        final long startTime = System.nanoTime(); //Calculationg Excuting time
        System.out.println(Fibo(45));
        final long due = (System.nanoTime()-startTime);
        System.out.println(due);
        final long startTime2 = System.nanoTime();
        System.out.println(FiboM(45));
        final long due2 = (System.nanoTime()-startTime2);
        System.out.println(due2);
    }

}
