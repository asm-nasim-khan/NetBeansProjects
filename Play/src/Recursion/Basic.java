package Recursion;
public class Basic{
    public static void main(String[] args) {
        
    }
    static int StringLen(String s){
        if(s.equals("")) return 0;
        return 1 + StringLen(s.substring(1));
    }
    static int SumToN(int n){
        if(n == 0) return 0;
        return n + SumToN(n-1);
    }
    
}
