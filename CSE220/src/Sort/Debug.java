package Sort;
public class Debug {
    public static void main(String[] args) {
        int[] A = {3,2,2,1}; //{1,2,2,3}
        //System.out.println(A.length+"lrn");
        int[] count =new int[4];
        int[] b = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            count[A[i]] = count[A[i]] + 1;
        }
        for (int i = 1; i <= 3; i++) {
            count[i] = count[i] + count[i - 1];
        }
        
       for (int i = A.length-1; i >= 0; i--) {
            count[A[i]]=count[A[i]] - 1;
            b[count[A[i]]] = A[i];
        }
       
        for(int ele = 0;ele<b.length;ele++){
            System.out.print(b[ele]+",");
        }
    }
}

