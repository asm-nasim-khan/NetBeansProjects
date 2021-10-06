package Lab05;
public class recursive_LinkedList extends Recursion{
    static Node head;
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
//        Node n4 = new Node(4,null);
//        Node n3 = new Node(3,n4);
//        Node n2 = new Node(2,n3);
//        Node n1 = new Node(1,n2);
        //PrintArray(a,a.length-1);
        //System.out.println(Printlist(n1));
        CreatList(a);
        Printlist(head);
        System.out.println("");
        System.out.println(PrintListSum(head));
    }
    static void CreatList(int[] a){
        head  = new Node(a[0],null);
        Node temp = head;
         for (int i = 1; i <a.length; i++) {
            temp.next = new Node(a[i],null);
            temp = temp.next;
         }
    }
    static int ListLen(Node n){
        if(n == null){
            return 0;
        }
        return 1+ListLen(n.next);
    }
    static void Printlist(Node n){
        if(n == null) return;
        System.out.print(n.element+",");
        Printlist(n.next);
    }
    static int PrintListSum(Node n){
        if(n==null) return 0;
        return n.element + PrintListSum(n.next);
    }
    static class Node{
        int element;
        Node next;
        public Node(int el,Node n){
            element = el;
            next = n;
        }
    }

}
