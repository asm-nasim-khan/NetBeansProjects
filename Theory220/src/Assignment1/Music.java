package Assignment1;
import java.util.Random;

public class Music{
    static String[] source = {"A","B","C","D","E","F","G"};
    int size = 7;
    public static void main(String[] args) {
        Music n = new Music();
        n.PlayMusicChair();
    }
    void PlayMusicChair(){
        Random rand = new Random();
        while(size != 1){
            rightRotate();
            int random = rand.nextInt(4);
            if(random == 1){
               remove(size/2);
               
            }
        }
        System.out.println(source[0]);
        
    }
    void rightRotate(){
        int j = 0;
        String temp = source[size-1];
        for (int i = size-1 ; i > 0; i-- ) {
            source[i] = source[i-1];
        }
        source[0]=temp;
    }
    void remove(int index){
        for (int i = index; i < size-1; i++) {
            source[i]= source[i + 1];
        }
        source[size-1] = null;
        size--;
    }
    void print(){
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i]+",");
        }
    }
}
