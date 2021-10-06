package PriorityQueueEnv;
public class ListQueueP implements Queue{
    Node head;
    int size;
    public ListQueueP(){
        head = new Node(-1,null,null,null);
        size = 0;
    }
    @Override
    public void Enqueue(int s,Object e) {
        Node newnode = new Node(s,e,null,null);
        if(head.next == null){ // if the list is empty then New value inserted after head
            head.next = newnode;
            head.prev = newnode;
            newnode.next = head;
            newnode.prev = head;
        }
        else{
            boolean check = false; // to  check either the value is inserted
            for (Node n = head.next; n != head; n = n.next) {
                if(s<n.priority){
                    InsertBefore(n,newnode);
                    check = true;
                    break;
                }
            }
            if(!check){ // if false; it means the priority is the lowest,So it will insert after the queue
                InsertBefore(head,newnode);
            }
        }
    }
    void InsertBefore(Node n,Node add){ //Adding "add" node before n Node
        Node before = n.prev;
        add.next = n;
        n.prev = add;
        before.next = add;
        add.prev = before;
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
        return temp.element;
    }

    @Override
    public Object peak() {
        if(head.next == null){
            System.out.println("Empty List");
            return null;
        }
        return head.next.element;
    }
    public static void main(String[] args) {
        System.out.println("All right");
        ListQueueP Li = new ListQueueP();
        Li.Enqueue(3, 30);
        Li.Enqueue(2, 20);
        Li.Enqueue(1, 10);
        Li.Enqueue(2, 22);
        Li.Enqueue(4, 110);
        System.out.println(Li.Dequeue());
        System.out.println(Li.Dequeue());
        System.out.println(Li.Dequeue());
        System.out.println(Li.Dequeue());
        System.out.println(Li.Dequeue());
    }

}
class DoublyList {
    Node head;
    //Task 2.1 Constructor creating
    DoublyList(int[] a){
        int size =len(a);
        Node reserve=null;
        head = new Node(0,null,null,null);
        Node temp = head;
         for (int i = 0; i <size; i++) {
             reserve = temp;
            temp.next= new Node(0,a[i],null,null);
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
    int priority;
    Object element;
    Node next ;
    Node prev;
    Node(int serial,Object value,Node n,Node p){
        priority = serial;
        element = value;
        next = n;
        prev = p;
    }
}

