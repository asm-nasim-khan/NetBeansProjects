package Lab07;
public class Lab07_19101623 {
    public static void main(String[] args) {
        int[] a = {4,53,2,42,2};
        KeyIndex Li = new KeyIndex(a);
        System.out.println(Li.search(54));
        a = Li.sort(a);
        Li.PrintSorted(a);
        
    }
}
class KeyIndex {
    int[] k;
    KeyIndex(int[] a){
        k = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            k[i] = a[i];
        }
    }
    boolean search (int val){
        int[] temp = sort(k);
        if(val<temp.length && temp[val] > 0) return true;
        return false;
    }
    int[] sort (int[] a){
        int max = max_finder(a);
        int[] key = new int[max + 1 ];
        for (int i = 0;i<a.length ;i++ ) {
            key[a[i]] ++;
        }
        return key;
    }
    int max_finder(int[] a){
        int max = a[0];
        for (int index = 0; index < a.length ;index++ ) {
            if(a[index] > max){
                max = a[index];
            }
        }
        return max;
    }
    void PrintSorted(int[] key){
        for (int j = 0;j<key.length ;j++ ) {
            if(key[j] >0){
                for(int k = 0;k<key[j];k++){
                    System.out.print(j+" ");
                }
            }
        }
        System.out.println("");
    }
}