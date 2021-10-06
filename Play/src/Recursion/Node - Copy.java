package Recursion;
public class Node {
    public Object elements;
    public Node next;
    public Node prev;
    public Node(Object e,Node n){
        this.elements = e;
        this.next = n;
    }
    public Node(Object a, Node b, Node c){
        this.elements = a ;
        this.next = b;
        this.prev = c;
    }
}
