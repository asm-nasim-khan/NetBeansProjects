package Recursion;
public class Hash {
    public static void CreateHash(int[] a){ 
        int[] b = new int[a.length+1];
        
        for (int i = 0; i < a.length; i++) {
            int mod = a[i] % 6;
            for (int j = mod ; j < a.length; j++) {
                if(b[j] == 0 ){
                    b[j] = a[i];
                    break;
                }
                
            }
            
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]+",");
            
        }
    }
    public static void main(String[] args) {
        int[] a ={10111,00101,10001,11111,00000,11110};
        CreateHash(a);
        
    }

}
