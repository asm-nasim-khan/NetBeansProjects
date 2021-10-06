package CSE220;
public class Tester {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,3,4,5};
        MyList list2 = new MyList(a);
        
        list2.showList();
        list2.clear();
        list2.showList();
    }
}
class MyList{
    Node head;
    MyList(){
        System.out.println("Faka");
    }
    MyList(int[] array){
        head = new Node(array[0],null);
        Node tail = head;
        for (int i = 1; i < array.length; i++) {
            Node add = new Node(array[i],null);
            tail.next = add;
            tail = tail.next;
        }
    }
    MyList(MyList list){
        System.out.println("List");
    }
    void showList(){
        if(head == null){
            System.out.println("Shala gorib");
        }
     for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element+",");
        }
        System.out.println("");
}
    void clear(){
        head = null;
    }
    void reverse(){
        
    }
}
class Node {
    Object element;
    Node next;
    public Node(Object e,Node n){
        element = e;
        next = n;
    }
}
