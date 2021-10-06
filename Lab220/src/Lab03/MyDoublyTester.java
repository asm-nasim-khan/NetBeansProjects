package Lab03;
public class MyDoublyTester{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        DoublyList l = new DoublyList(a);
        //task 2.2
        l.showList();
        //task 2.3
        Node n = new Node(100,null,null);
        l.insert(n);
        l.showList();
        //task 2.4
        l.insert(100,2);
        l.showList();
        //task 2.5
        l.showList();
        l.remove(4);
        l.showList();
        //task 2.6
        l.showList();
        System.out.println(l.removeKey(4));
        l.showList();
    }
}
//Task 1(ii) Create a Dummy Headed Doubly Circular Linked list Abstract Data Type (ADT)named DoublyList
class DoublyList {
    Node head;
    //Task 2.1 Constructor creating
    DoublyList(int[] a){
        int size = len(a);
        Node reserve = null;
        head = new Node(null,null,null);
        Node temp = head;
         for (int i = 0; i < size; i++) {
            reserve = temp;
            temp.next= new Node(a[i],null,null);
            temp = temp.next;
            temp.prev = reserve;
         }
         temp.next = head;
         head.prev = temp;
    }
    //Task 2.2
    void showList(){
        if(head.next == null){
            System.out.println("Empty List");
        }
        else{
            for (Node n = head.next; n != head; n = n.next) {
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
    //Task 2.3
    void insert (Node newElement){
        boolean duplicate = false;
        for (Node n = head.next; n != head; n = n.next) {
            if(n.element == newElement.element){
                duplicate = true;
                break;
            }
        }
        if(duplicate){
            System.out.println("the key already exists");
        }
        else{
            Node tail = head.prev;
            tail.next = newElement;
            newElement.prev = tail;
            newElement.next = head;
            head.prev = newElement;
        }
    }
    //Task 2.4
    void insert (int newElement, int index){
        if(index < 0 || index >= listSize(head)){
            throw new IndexOutOfBoundsException();
        }
        boolean duplicate = false;
        for (Node n = head.next; n != head; n = n.next) {
            if((int)n.element == newElement){
                duplicate = true;
                break;
            }
        }
        if(duplicate){
            System.out.println("the key already exists");
        }
        else{
            Node add = new Node(newElement,null,null);
            int count = 0;
            Node before = head;
            for (Node n = head.next; n != head; n = n.next,before=before.next,count++) {
                if(count == index){
                    add.next = n;
                    n.prev = add;
                    add.prev = before;
                    before.next = add;
                    break;
                }
            }
        }
        
    }
    //task 2.5
    void remove (int index){
        if(index < 0 || index >= listSize(head)){
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node before = head;
        Node After = null;
        for (Node n = head.next; n != head; n = n.next,count++,before=before.next) {
            After = n.next;
            if(count == index){
                before.next = After;
                After.prev = before;
                n.prev = null;
                n.next = null;
                n.element = null;
                break;
            }
        }
    }
    int removeKey(int deleteKey){
        Node before = head;
        Node After = null;
        int temp = -1;
        for (Node n = head.next; n != head; n = n.next,before=before.next) {
            After = n.next;
            if((int)n.element == deleteKey){
                temp = (int)n.element;
                before.next = After;
                After.prev = before;
                n.prev = null;
                n.next = null;
                n.element = null;
                return temp;
            }
        }
        System.out.println("the key doesn't exists on the list");
        return temp;
    }
     //+++++++++++++++ My methods section +++++++++++++
    public static int len(int[] a){ // return the length of an array
        int count = 0;
        for (int elements:a ){
           count++;
        }
        return count;
    }
    int listSize(Node head){ //return the size of the node
        int count = 0;
        for (Node n = head.next; n != head; n = n.next) {
            count++;
        }
        return count;
    }
}
//Task 1(i) Create a Node class which will hold three fields
class Node{
    Object element;
    Node next ;
    Node prev;
    Node(Object value,Node n,Node p){
        element = value;
        next = n;
        prev = p;
    }
}