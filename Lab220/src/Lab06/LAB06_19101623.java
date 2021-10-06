package Lab06;
public class LAB06_19101623 extends MySinglyList{
    public static void main(String[] args) {
        int[] a = {5,6,8,3,2,1};
        MySinglyList List1 = new MySinglyList(a);
        //task 1
        SelectionSortR(a,a.length-1);
        printA(a);
        //task 2
        InsertationSortR(a,a.length-1);
        printA(a);
        //task 3
        Bubble_Sort(List1.head);
        List1.showList();
        //Task 4
        selectionSort(List1.head);
        List1.showList();
        //Task 5
        MyDoublyList List2 = new MyDoublyList(a);
        List2.DinsertationSort();
        List2.DshowList();
        //task 6
        System.out.println(BinarySearchR(a,0,a.length-1,8));
        //task 7
        int[] fib = new int[100];
        System.out.println(Fibo_Memo(fib,3));   
    }
    //Task 1
    public static void SelectionSortR(int[] a,int i){
        if(i == 0 ){
            return ;
        }
        else{
            int mx =a[i];
            int mxl = i;
            for (int j = 0; j < i; j++) {
                if(a[j]>mx){
                    mx=a[j];
                    mxl=j;
                }
            }
            int temp = a[mxl];
            a[mxl]=a[i];
            a[i]=temp;
        }
        SelectionSortR(a,i-1);
    }
    //Task 2
    public static void InsertationSortR(int[] a,int i){
        if(i <=1){
            return;
        }
        InsertationSortR(a,i-1);
        for (int j = i-1; j>=0; j--){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            else{
                break;
            }
        }
    }
    //Task 3
    static void Bubble_Sort(Node head){
        int size = listSize(head);
        for (int count = 0;count<size;count++) {
            Node n = head;
            Node front = n.next;
            for (int index = 0;index < size-1;index++) {
                if(n.element > front.element){
                    int temp = n.element;
                    n.element = front.element;
                    front.element = temp;
                    n=n.next;
                    front=front.next;
                }
                else{
                    n=n.next;
                    front=front.next;
                }
            }
            
        }
    }
    //Task 4
    static void selectionSort(Node head){
        for (Node i = head; i != null; i=i.next) {
            int min = i.element;
            Node minNode = i;
            for (Node j = i; j!= null; j=j.next) {
                if(j.element < min){
                    min=j.element;
                    minNode = j;
                }
            }
            int temp = minNode.element;
            minNode.element = i.element;
            i.element = temp;
        }
    }
    //task 6
    public static int BinarySearchR(int[] a,int l,int h,int key){
        if(l==h){
            if(a[l] == key){
                return l;
            }
            else{
                return -1;
            }
        }
        else{
            int mid = (l+h)/2;
            if(key == a[mid]){
                return mid;
            }
            else{
                if (key < a[mid]){
                return BinarySearchR(a,l,mid-1,key);
                }
                else{
                    return BinarySearchR(a,mid+1,h,key);
                }
            }
        }
    }
    //Task 7
    static int Fibo_Memo(int[] a,int n){
        if(a[n] > 0) return a[n];
        if(n==1 || n== 2){
            a[n] = 1;
            return a[n];
        }
        else{
            a[n] = Fibo_Memo(a,n-2) + Fibo_Memo(a,n-1);
            return a[n];
        }
    }
    //======================================My methods========================
    static void printA(int[] a){
    for(int el : a){
        System.out.print(el+" ");
    }
    System.out.println("");
    }
}
class MySinglyList{
    Node head;
    MySinglyList(){
        
    }
    MySinglyList(int[] a){
        head  = new Node(a[0],null);
        Node temp = head;
        for (int i = 1; i <a.length; i++) {
            temp.next = new Node(a[i],null);
            temp = temp.next;
        }
    }
            //========My mathod====
    void showList(){
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            for (Node n = head; n != null; n = n.next) {
                if(n == head){
                    if(n.next == null){
                        System.out.print("["+n.element+"]"); //when the list has only one element
                    }
                    else{
                        System.out.print("["+n.element+",");
                    }
                }
                else if (n.next == null){
                    System.out.print(n.element+"]");
                }
                else{
                    System.out.print(n.element+",");
                }
            }
        }
        System.out.println(""); // Just for decoration
    }
    static int listSize(Node head){ //return the size of the node
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;
        }
        return count;
    }
    public static int len(int[] a){ // return the length of an array
        int count = 0;
        for (int elements:a ){
            count++;
        }
        return count;
    }
}
class MyDoublyList extends MySinglyList{
    DNode head;
    MyDoublyList(int[] a){
        int size = len(a);
        DNode reserve = null;
        head = new DNode(0,null,null);
        DNode temp = head;
        for (int i = 0; i < size; i++) {
            reserve = temp;
            temp.next= new DNode(a[i],null,null);
            temp = temp.next;
            temp.prev = reserve;
        }
        temp.next = head;
        head.prev = temp;
    }
    //Task5
    void DinsertationSort(){
        for(DNode index = head.next ; index != head; index = index.next){
            int temp = index.element;
            DNode j = index;
            for(; (j.prev != head) && (j.prev.element>  temp);j = j.prev){
                j.element = j.prev.element;
            }
            j.element = temp;
        }
    }
    void DshowList(){
        if(head.next == null){
            System.out.println("Empty List");
        }
        else{
            for (DNode n = head.next; n != head; n = n.next) {
                if(n == head.next){ //for the 1st element
                    if(n.next == null){
                        System.out.print("["+n.element+"]"); //when the list has only one element
                    }
                    else{
                        System.out.print("["+n.element+","); //for the 1st element
                    }
                }
                else if (n.next == head){ //for the Last element
                    System.out.print(n.element+"]");
                }
                else{ //for the middle elements
                    System.out.print(n.element+",");
                }
            }
        }
        System.out.println(""); // Just for decoration
    }
}
class Node{
    int element;
    Node next ;
    Node(int value,Node n){
        element = value;
        next = n;
    }
}
class DNode{
    int element;
    DNode next ;
    DNode prev;
    DNode(int value,DNode n,DNode p){
        element = value;
        next = n;
        prev = p;
    }
}
