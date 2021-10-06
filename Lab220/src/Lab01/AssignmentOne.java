package Lab01;
import java.util.Random;
public class AssignmentOne {
    public static void main(String[] args) {
       /* //Task 1
       int[] source = {10,20,30,40,50,60,70};
       shiftLeft(source,3);
       PrintArray(source);
       //Task 2
       int[] source1 = {10,20,30,40,50,60};
       rotateLeft(source1,3);
       PrintArray(source1);
       //task 3
        int[] source3 ={10,20,30,40,50,0,0};
       remove(source3,5,2);
       PrintArray(source3); 
       //Task 4
       int[] source4 ={10,2,30,2,50,2,2,0,0};
       removeAll(source4,7,2);
       PrintArray(source4);
       //Task 5
       int[] So = {2,1,1,2,1};
       SplittingArray(So); 
       //Task 6
       int[] arr = Arrayseries(4);
       PrintArray(arr);
       //Task 7
       int[] N = {1,1,2,2,2,2,2,1,1,1,1,1,1};
       Maxbunch(N); 
       //Task8
       int[] Task8 = {3,4,6,3,4,7,4,6,8,6,6};
       Repetition(Task8); 
       //=============================
       //Circular Array
       
       //Task 1
       int[] pa = {20,10,0,0,0,10,20,30};
       Palindrome(pa,5,5);
       
       //Task 2
       int[] Carray1 = {40,50,0,0,0,10,20,30};
       int[] Carray2 = {10,20,5,0,0,0,0,0,5,40,15,25};
       int [] re = Intersection(Carray1,5,5,Carray2,8,7);
       PrintArray(re);*/
       AssignmentOne n = new AssignmentOne();
       n.PlayMusicChair();

    }
    //Array length generator
    public static int len(int[] a){
        int count = 0;
        for (int elements:a ){
           count++;
        }
        return count;
    }
    
    // printing Arrays
    public static void PrintArray(int[] source){
        for (int i = 0; i < len(source); i++) {
            if(i==0){
                System.out.print("["+source[i]+",");
            }
            else if(i == len(source)-1){
                System.out.print(source[i]+"]");
            }
            else{
                System.out.print(source[i]+",");
            }
        }
        System.out.println("");
        System.out.println("=========================");
    }
    
    //=========================================================================
    //Task 1 Method
    public static void shiftLeft(int[] s,int k){
        for (int i = k,j = 0; i < len(s); i++,j++) {
            s[j] = s[i];
            s[i]=0;
        }
    }
    
    //task 2 method
    public static void rotateLeft(int[] s, int k){
        int[] temp = new int[k];
        for(int i = 0; i < k ; i++) {
            temp[i] = s[i];
        }
        for (int i = k,j = 0; i < len(s); i++,j++) {
            s[j] = s[i];
            s[i]=0;
        }
        for (int i = (len(s) - k),j=0; i < len(s); i++,j++) {
            s[i] = temp[j];
        }   
}
    
    //task 3 method
    public static void remove(int[] source,int size, int index){
        for (int i = index; i < size; i++){
            source[i] = source[i+1];
        }
    }
    
    //Task 4
    public static void removeAll( int[] source, int size, int element) {
        for (int i = 0; i < size; i++) {
            if(source[i] == element){
                for (int j = i; j < size - i; j++) {
                    source[j] = source[j+1];
                    source[j+1] = 0;
                }
                i--;
            }
        }
    }
    //Task 5
    public static void SplittingArray(int[] a){
        boolean result = true;
        for (int i = 1; i < len(a)-1; i++) {
            int lBeam = 0;
            int rBeam = 0;
            for (int j = 0; j < i; j++) {
                lBeam += a[j];
            }
            for (int k = i; k < len(a); k++) {
                rBeam+=a[k];
            }
            if(lBeam == rBeam){
               result = true;
               break;
            }
        }
        System.out.println(result); 
    }
    //Task 6
    public static int[] Arrayseries(int n){
        int[] Myarr = new int[n*n];
        for (int i = 0; i < n; i++) { // for n times temp array creating
            int[] tarr = new int[n];
            for (int k = 0,j=n; k < n; k++,j--) {  //Create a temporary array in reverse order [3,2,1]
            tarr[k]=j;
            }
            for (int p = 0; p < n-(i+1); p++) { // inserting zeros
                tarr[p] = 0; 
            }
            for(int m=0;m<len(tarr);m++){ //Copying temporary array into Main array
                Myarr[(i*n)+m] = tarr[m];
            }
        }
        return Myarr;
    }
    //Task 7
    //int[] N = {1,1,2,2,1,1,1,1};
    public static void Maxbunch(int[] n){
        int MaxCount = 0;
        for (int i = 0; i < len(n);i++) {
            int count = 1;
            for (int j = i+1; j < len(n); j++) {
                if(n[i] == n[j]){
                    i=j;
                    count++;
                }
                else{
                   break; 
                }
            }
            if(count>MaxCount){
                    MaxCount = count;
                }
        }
        System.out.println(MaxCount);
    }
    //Task 8 {4,5,6,6,4,3,6,4}
    public static void Repetition(int[] r){
        int[] counter = new int[len(r)];
        int[] elements = new int[len(r)];
        int indexEle = 0;
        for (int i = 0; i < len(r);i++) { // Main loop for main array iteration
            boolean skip = false;
            for (int checker = 0; checker < len(elements); checker++) { // to check if current value is already counted
                if(r[i] == elements[checker]){
                    skip = true;
                    break;
                }
            }
            if(skip){  //skip to next iteration if counted
                continue;
            }
            int count = 1;
            for (int k = i+1; k <len(r); k++) { // count Repetition
                if(r[i] == r[k]){
                    count++;
                }
            }
            counter[indexEle] = count; 
            elements[indexEle] = r[i];
            indexEle++;
            }
        boolean result = false;
        for (int index = 0; index < len(counter); index++) { //checking if 2 or more variable has same and greater than 1 value
            for (int i = index+1; i < len(counter); i++) {
                if(counter[index]>1 && counter[index] == counter[i]){
                    result = true;
                    break;
                }
                if(result){
                    break;
                }
            }
        }
        if(result){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
    //=======================================
    //Circular Array
    //Task 1
    public static void Palindrome(int[] p,int start,int size){
        int j= start;
        int lastIndex = (start+size-1)%len(p);
        boolean checker = true;
        for (int i = 0; i < size; i++) {
            if(p[j] != p[lastIndex]){
                checker = false;
                break;
            }
            j=(j+1)%len(p);
            lastIndex -=1;
            if(lastIndex < 0){
                lastIndex = len(p)-1;
            }
        }
        if(checker){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
    //Task 2
    public static int[] Intersection(int[] a,int Start1,int Size1,int[] b,int Start2,int Size2){
        int index1 = Start1;
        int k = 0;
        int[] temp = new int[Size1];
        for (int i = 0; i < Size1; i++) {
            int index2 = Start2;
            for (int j = 0; j < Size2; j++) {
                if(a[index1]== b[index2]){
                temp[k] = a[index1];
                k++;
                }
                index2 = (index2 + 1)%len(b);
            }
            index1 = (index1 + 1)%len(a);
        }
        return temp;
    }
    void PlayMusicChair(){
        String[] source = {"A","B","C","D","E","F","G"};
        Random rand = new Random();
        int size = 7;
        while(true){
            int random = rand.nextInt(4);
            //System.out.println(size/2);
            if(random == 1){
               remove(source,size/2);
            }
            if(size == 1){
                break;
            }
            break;
        }
        
    }
    void remove(String[] s,int index){
        
    }
    void rightRotate(String a,int start){
        for (int i = start; i < 10; i++) {
            
        }
    }
 
}
