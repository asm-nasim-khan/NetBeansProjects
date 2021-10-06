package Recursion;
public class DoublySortInsertation {
    public static void main(String[] args) {
        int[] A = {52, 45, 2 ,0, -8 , 36, 28,20};
        Node head = new Node (A[0] , null , null);
        Node tail = head;
        for(int i = 1 ; i<A.length ; i++){
            Node temp = new Node (A[i] , null , null);
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
        }
        for(Node i = head ; i!=null ; i = i.next){
            Object temp = i.elements;
            Node j = i;
            while(j.prev!=null && (int) j.prev.elements> (int)temp){
                j.elements = j.prev.elements;
                j = j.prev;
            }
            j.elements = temp;
        }
        for(Node b = head ; b!=null ; b = b.next){
            System.out.println(b.elements);
        }
    }
}
