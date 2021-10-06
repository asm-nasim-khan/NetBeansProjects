package Recursion;
public class time {
    public static double computeTime(String s,String[] a){
        final long startTime = System.nanoTime(); //Calculationg Excuting time
        BinarySearch(s,a);
        
        final long due = (System.nanoTime()-startTime);
        return due;
    }
    static boolean BinarySearch(String s,String[] a){
        int l =0;
        int r = a.length-1;
        while(l <= r){
            int m =(l+r)/2;
            if(s == a[m]){
                return true;
            }
            else if(Integer.parseInt(s)  > Integer.parseInt(a[m])){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
       return false;
    }
    public static void main(String[] args) {
        String[] a ={"a","b","c","s"};
        String s = "c";
        computeTime(s,a);
    }
    
}
