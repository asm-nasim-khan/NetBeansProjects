package Assignment2;
public class Assignment_2_19101623 {
    public static void main(String[] args) {
//        System.out.println(powerN(3,2));
//        System.out.println(hocBuilder(3));
//        triangleS(3);
//ReverseTriangle(3,3);

    }
    //Task 1
    static int powerN(int base,int n){
        if(n==0){
            return 1;
        }
        return base * powerN(base,n-1);
    }
    //task 3
    public static int hocBuilder (int height){
        if(height == 0) return 0;
        else if(height == 1) return 8;
        else return 5 + hocBuilder(height - 1);
}
    //task 5(a)
    static void triangleS(int n){
        if(n==0) return;
        else{
            triangleS(n-1);
            print(n);
            System.out.println("");
        }
    } 
    static void print(int index){
        if(index == 0) {
            return;
        }
        else{
            print(index -1);
            System.out.print(index+" ");
        }
    }
    //Task 5(b)
    static void ReverseTriangle(int height,int n){
        if(height == 0) return;
        else{
            spaceF(height-1);
        print(n-height+1);
            System.out.println("");
            ReverseTriangle(height -1,n);
        }
    }
    static void spaceF(int index){
        if(index == 0){ return;}
        else{
            System.out.print(" "+" ");
            spaceF(index -1);
        }
    }
}
