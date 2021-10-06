package Recursion;
public class SinglySortBubble {
    public static void main(String[] args) {
        int[] A = {50 , 52, 2, 69, 15, 6, 3};
        Node head = new Node(A[0],null);
        Node tail = head;
        for(int i = 1 ; i<A.length ; i++){
        Node temp = new Node (A[i], null);
        tail.next = temp;
        tail = tail.next;
        }
        for(Node a = head ; a!=null ; a = a.next){
            for(Node b = head ; b.next!=null ; b = b.next){
                if((int)b.elements>(int)b.next.elements){
                    Object t = b.elements;
                    b.elements = b.next.elements;
                    b.next.elements = t;
                }
            }
        }
        for(Node c = head ; c!=null ; c = c.next){
            System.out.print(c.elements+",");
        }
    }
}