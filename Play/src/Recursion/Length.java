package Recursion;
public class Length {
    //Length of a string
    public static int Len(String s){
        if(s.equals("")){
            return 0;
        }
        return 1+Len(s.substring(1));

    }
    //sum upto n
    public static int Sum(int n){
        if(n == 0){ return 0;}
        return n+Sum(n-1);
    }
    //len of linked list
    public static int ListLen(Node n){
        if(n == null){
            return 0;
        }
        return 1+ListLen(n.next);
    }
    //Exponentiation
    public static int Expo(int a,int n){
        if (n == 0){
            return 1;
        }
        int x = Expo(a,n/2);
        if(n%2 == 0){
            return x*x;
        }
        else{
            return x*x*a;
        }
    }
    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }
    //Binary to Decimal
    /*public static int Decimal(String s,int i,int num){
        if(s.length() ==i ){
            return num;
        }
        if(s.charAt(i)== "0"){
            num = 2* num;
        }
        else{
            num =  2*num+1;
        }
        return Decimal(s,i+1,num);
}*/
    public static int what(int a,int b){
        if(b == 0){
            return a;
        }
        return what(b,a%b);
    }
    public static int X(int a,int b){
        if(b==0){
            return 0;
        }
        else{
            return a+X(a,b-1);
        }
    }

    public static void main(String[] args) {
        //String s="ABCDEFGHIJ";
        //System.out.println(Len(s));
        //System.out.println(Sum(3));
        //System.out.println(what(965242142,11654694));
        //System.out.println(fac(329)%9907);
        System.out.println(X(4746,6575));
    }

}
