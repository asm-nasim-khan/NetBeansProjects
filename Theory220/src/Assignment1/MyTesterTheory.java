package Assignment1;
//######################### Tester class that contains Main method
import java.util.Scanner;
public class MyTesterTheory {
    public static void main(String[] args) {
        int[] a = {4,5,3};
        int[] b = {9,5,2};
        //MyList l = new MyList(c);
        //l.printDuplicate(l.head);
        //l.remove_multiple_of_five(l.head);
        //l.InsertInCirc(100,5);
        //l.remove_multiple_of_five(l.head);
      // l.showList(l.head);
      MyList list2 = new MyList(a);
      MyList list3 = new MyList(b);
      list2.SumToList(list2,list3);
    }
}
//============================Creating Linked list Abstract Data Type
// Task 1(ii)
class MyList{ 
    Node head;
    //Task 2.1(A)
    MyList(){
        Node head = null; 
    }
    //Task 2.1(B)
    MyList(int[] a){
        head = new Node(0,null);
        Node temp = head;
         for (int i = 0; i <len(a); i++) {
            temp.next = new Node(a[i],null);
            temp = temp.next;
         }
    }
    //Task 2.1(C)
    MyList(MyList Newlist){
        head = new Node(Newlist.head.element,null);
        Node newhead = head;
        for (Node n = Newlist.head.next; n != null; n = n.next) {
            newhead.next = new Node(n.element,null);
            newhead = newhead.next;
        }
    }
  
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
    
    //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Theory
    //Task 4
    public void printDuplicate (Node head){
        boolean duplicate = false;
        for (Node n = head; n != null; n = n.next) {
            for (Node index = n.next; index != null; index = index.next) {
                if(n.element == index.element){
                    System.out.println(n.element);
                    duplicate=true;
                    break;
                }
            }
            if(duplicate){
                break;
            }
        }
    }
    //Task 5
    void remove_multiple_of_five(Node head){
        Node front = null;
        Node prev = null;
        for (Node n = head; n != null;) {
            if((int)n.element % 5 == 0){
                if(n== head){
                    head = head.next;
                }
                else if(n.next == null){
                    prev.next = null;
                }
                else{
                    prev.next = front;
                }
                n = n.next;
            }
            else{
                prev = n;
                n = n.next;
                
            }
            if(n!= null){
                    front = n.next;
                }
        }
        showList(head);
    }
    //Task 7
    void InsertInCirc(int newElement,int index){
        Node newNode = new Node(newElement,null);
        for (Node n = head; n != null; n = n.next) {
            if(n.next == null){
                n.next = head;
                break;
            }
        }
        int count = 0;
        Node prev = head;
        for (Node n = head; ; n = n.next,count++) {
            if(index == count){
                if(index == 0){
                    newNode.next = head;
                    for (Node i = head.next; ; i = i.next) {
                        if(i.next == head){
                            i.next = newNode;
                            head = newNode;
                            break;
                        }
                    }
                }
                else{
                    newNode.next = n;
                    prev.next = newNode;
                }
                break;
            }
            else{
                prev = n;
            }
        }
        
    }
    //Task 6
    void SumToList(MyList n1,MyList n2){
        int num1 = 0;
        int num2 = 0;
        Node head1 = reverse(n1.head);
        Node head2 = reverse(n2.head);
        int m = 1;
        for (Node n = head1.next; n != null; n = n.next,m=m*10) {
            num1 = num1 + m *(int)n.element;
        }
        int s = 1;
        for (Node n = head2.next; n != null; n = n.next,s=s*10) {
            num2 = num2 + s *(int)n.element;
        }
        System.out.println(num1);
        System.out.println(num2);
        int sum = num1 + num2;
        System.out.println(sum);
        Node newList = new Node(0,null);
        Node temp = newList;
        while(sum>0){
            temp.next =
            temp.next = new Node(sum%10,null);
            temp = temp.next;
            sum = sum/10;
        }
        Node newhead = reverse(newList);
        for (Node n = newhead.next; n != null; n = n.next) {
            System.out.print(n.element+"->");
        }
    }
    Node reverse(Node head){
        int size  = listSize(head.next);
        Node prev = null;
        Node current = head.next;
        Node front = current.next;
        for(int index = 0; index < size; index++) {
            current.next = prev;
            prev = current;
            current = front;
            if(front.next!= null){
                front = front.next;
            }
        }
        head.next = prev;
        return head;
    }
    //Task 8
    /*
    void InsertBefore(Node n,Node add){ //Adding "add" node before n Node
        Node before = n.prev;
        add.next = n;
        n.prev = add;
        before.next = add;
        add.prev = before;
    }*/
    //+++++++++++++++ My methods section +++++++++++++
    int NodeAt(Node check){ // return the index of a given Node
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            if(n.element == check.element){
                return count;
            }
            count++;
        }
        return -1;
    }
    Node NodeOfIndex(int index){ // return the node of given index
        if(index < 0 || index>=listSize(head)){
            throw new IndexOutOfBoundsException();
        }
        int count =0;
        for (Node n = this.head; n != null; n = n.next) {
            if(index == count){
                return n;
            }
            count++;
        }
        return null;
    }
    Node NodeOfKey(int key){ // return the node of given Key
        for (Node n = head; n != null; n = n.next) {
            if((int)n.element == key){
                return n;
            }
        }
        return null;
    }
    int listSize(Node head){ //return the size of the node
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
//****************************** Creating Node class
//Task 1(i)
class Node{
    int element;
    Node next ;
    Node(int value,Node n){
        element = value;
        next = n;
    }
}