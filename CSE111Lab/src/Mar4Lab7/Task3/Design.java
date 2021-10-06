package Mar4Lab7.Task3;
public class Design {
    String ori;
    char[] a;
    char[] b;
    public Design(String s){
        ori = s;
    }
    public int length1(String s){
        a = s.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        return count;
    }
    
    public Boolean StartsWith(String o1){
        int l = length1(o1);
        b = o1.toCharArray();
        Boolean y = false;
        if(length1(ori) < l){
            return false;
        }
        else{
            for (int i = 0; i < b.length;i++ ) {
                if(a[i] == b[i]){ 
                   y = true;
                }
                else{
                    return false;
                }
            }
        }
        return y;
    }
}
