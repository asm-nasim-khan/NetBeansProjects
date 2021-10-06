package Mar4Lab7.Task1;
public class Backend {
    String ori;
    char[] a;
    public Backend(String o){
        ori = o;
    }
    public void length1(){
        a = ori.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.println("Length is :"+count);
    }
}
