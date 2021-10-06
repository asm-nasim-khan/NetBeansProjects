package LinkedList;
public class Tester {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        MyList list1 = new MyList(a);
        list1.showList();
        
    }
    
}
class MyList{
    Node head;
    MyList(){
        Node head = null; 
    }
    MyList(int[] a){
        head  = new Node(a[0],null);
        Node temp = head;
         for (int i = 1; i <a.length; i++) {
            Node n = new Node(a[i],null);
            temp.next = n;
            temp = temp.next;
         }
    }
    MyList(Node n){
        head = n;
    }
    void showList(){
        if(head == null){
            System.out.println("Empty List");
        }
        else{
            for (Node n = head; n != null; n = n.next) {
                System.out.println(n.element+" ,");
            }
        }
    }
    boolean isEmpty(Node head){
        return head == null;
    }
    void clear(Node head){
        if(head != null){
            head = null;
        }
    }
}
class Node{
    int element;
    Node next ;
    Node(int e,Node n){
        element = e;
        next = n;
    } 
}
