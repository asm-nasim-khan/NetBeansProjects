package QueueEnv;
public class ListQueue implements Queue{
    Node head;
    int size;
    public ListQueue(){
        head = null;
        size = 0;
    }
    @Override
    public void Enqueue(Object e) {
        Node newnode = new Node(e,null,null);
        head.prev.next=newnode;
        newnode.prev = head.prev;
        newnode.next = head;
        head.prev = newnode;
        
    }

    @Override
    public Object Dequeue() {
        if(head.next == null){
            System.out.println("Empty List");
            return null;
        }
        Node temp = head.next;
        head.next = temp.next;
        temp.next.prev = head;
        temp.next = null;
        return temp;
    }

    @Override
    public Object peak() {
        if(head.next == null){
            System.out.println("Empty List");
            return null;
        }
        return head.next.element;
    }

}
class DoublyList {
    Node head;
    //Task 2.1 Constructor creating
    DoublyList(int[] a){
        int size =len(a);
        Node reserve=null;
        head = new Node(null,null,null);
        Node temp = head;
         for (int i = 0; i <size; i++) {
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
                if(n == head.next){
                    if(n.next == null){
                        System.out.print("["+n.element+"]"); //when the list has only one element
                    }
                    else{
                        System.out.print("["+n.element+",");
                    }
                }
                else if (n.next == head){
                    System.out.print(n.element+"]");
                }
                else{
                    System.out.print(n.element+",");
                }
            }
        }
        System.out.println(""); // Just for decoration
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
        for (Node n = head; n != null; n = n.next) {
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
