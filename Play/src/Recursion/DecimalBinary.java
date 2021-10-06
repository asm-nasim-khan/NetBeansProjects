package Recursion;
public class DecimalBinary {
    public static String Binary(int n,String s){
        if(n == 0){
           return s; 
        }
        else{
            s=s + n%2;
            return Binary(n/2,s); 
        }
    }
    public static void Binary2(int n){
        if(n>0){
            Binary2(n/2);
        }
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        //System.out.println(Binary(5,""));
        Binary2(5);
    }

}
