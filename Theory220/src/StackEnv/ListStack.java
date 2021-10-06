package StackEnv;
public class ListStack implements Stack {
    Node head;
    int size;
    public ListStack(){
        head = null;
        size = 0;
    }
    @Override
    public void push(Object e){
        Node newNode = new Node(e,null);
        newNode.next = head;
        head=newNode;
    }
    @Override
    public Object pop(){
        if(head == null){
            System.out.println("Stack Under flow");
            return null;
        }
        Node temp = head;
        head=head.next;
        temp.next = null;
        return temp.element;
    }
    @Override
    public Object peak(){
        if(head == null){
            System.out.println("Stack Under flow");
            return null;
        }
        return head.element;
    }
}
class MyList{ 
    Node head;
    //Task 2.1(A)
    MyList(){
        Node head = null; 
    }
    //Task 2.1(B)
    MyList(int[] a){
        head = new Node(a[0],null);
        Node temp = head;
         for (int i = 1; i <a.length; i++) {
            temp.next = new Node(a[i],null);
            temp = temp.next;
         }
    }
    //Task 2.1(C)
    /*MyList(MyList Newlist){
        head = new Node(Newlist.head.element,null);
        Node newhead = head;
        for (Node n = Newlist.head.next; n != null; n = n.next) {
            newhead.next = new Node(n.element,null);
            newhead = newhead.next;
        } 
    }*/
  
    //Task 2.2
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
                else if (n.next == head){
                    System.out.print(n.element+"]");
                    break;
                }
                else if(n.next == null){
                    System.out.print(n.element+"]");
                    break;
                }
                else{
                    System.out.print(n.element+",");
                }
            }
        }
        System.out.println(""); // Just for decoration
    }
    void showList(Node h){ //showList function with parameter 
        
        for (Node n = h; n != null; n = n.next) {
            if(n == h){
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
        System.out.println(""); // Just for decoration
    }
    //Task 2.3
    boolean isEmpty(){
        return head == null;
    }
    //Task 2.4
    void clear(){
        head = null;
    }
    //Task 2.5
    
}
//****************************** Creating Node class
//Task 1(i)
class Node{
    Object element;
    Node next ;
    Node(Object value,Node n){
        element = value;
        next = n;
    }
    public static void main(String[] args) {
        System.out.println("Helo");
    }
}
