package Lab04;
import java.util.Scanner;
public class Lab04_19101623{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 ---> By Array \n 2 ---> By Linked list ");
        int eqn = sc.nextInt();
        String en1 = "1+2*(3/4)";
        String en2 = "1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
        String en3 = "1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14";
        char[] arr1 = en1.toCharArray();
        char[] arr2 = en2.toCharArray();
        char[] arr3 = en3.toCharArray();
        if(eqn == 1){ // using an array based stack.
            MySuperClass Array1 = new ArrayStack();
            MySuperClass loc1 = new ArrayStack();
            checkEqn(arr1,Array1,loc1);
            System.out.println("=======================");
            MySuperClass Array2 = new ArrayStack();
            MySuperClass loc2 = new ArrayStack();
            checkEqn(arr2,Array2,loc2);
            System.out.println("=======================");
            MySuperClass Array3 = new ArrayStack();
            MySuperClass loc3 = new ArrayStack();
            checkEqn(arr3,Array3,loc3);
        }
        else if(eqn == 2){ // using a linked list based stack.
            //for Equation 1
            MySuperClass mylist1 = new ListStack();
            MySuperClass trace1 = new ListStack();
            checkEqn(arr1,mylist1,trace1);
            System.out.println("=======================");
            //for Equation 2
            MySuperClass mylist2 = new ListStack();
            MySuperClass trace2 = new ListStack();
            checkEqn(arr2,mylist2,trace2);
            System.out.println("=======================");
            //for Equation 3
            MySuperClass mylist3 = new ListStack();
            MySuperClass trace3 = new ListStack();
            checkEqn(arr3,mylist3,trace3);
        }
        else{
            System.out.println("Input 1 or 2");
        }
    }
    static void checkEqn(char[] a,MySuperClass li,MySuperClass tra){
        boolean result = false;
        int i = 0;
        try{
            for (; i < a.length  ; i++) {
                if(a[i] == '{' || a[i] == '(' || a[i] == '['){
                    try{
                        li.push(a[i]);
                        tra.push(i);
                    }
                    catch(overflow exc){
                    }
                }
                else if(a[i] == ')' || a[i] == '}' || a[i] == ']'){
                    if(a[i] == ')'){
                        if((char)li.peak() != '('){
                            result = true;
                            System.out.println("This expression is NOT correct.");
                            System.out.println("Error at character # "+ ((int)tra.peak() + 1)+ ". ‘"+li.pop()+"‘- not Closed.");
                            return;
                        }
                        else{
                            li.pop();
                            tra.pop();
                        }
                    }
                    else if(a[i] == '}'){
                        if((char)li.peak() != '{'){
                            result = true;
                            System.out.println("This expression is NOT correct.");
                            System.out.println("Error at character # "+ ((int)tra.peak() + 1)+ ". ‘"+li.pop()+"‘- not Closed.");
                            return;
                        }
                        else{
                            li.pop();
                            tra.pop();
                        }
                    }
                    else if(a[i] == ']'){
                        if((char)li.peak() != '['){
                            result = true;
                            System.out.println("This expression is NOT correct.");
                            System.out.println("Error at character # "+ ((int)tra.peak() + 1)+ ". ‘"+li.pop()+"‘- not Closed.");
                            return;
                        }
                        else{
                            li.pop();
                            tra.pop();
                        }
                    }
                }
            }
            if(!li.isEmpty()){
                result = true;
                System.out.println("This expression is NOT correct");
                System.out.println("Error at character # "+ ((int)tra.peak() + 1)+ ". ‘"+li.pop()+"‘- not Closed.");
            }
            if(!result){
                System.out.println("This expression is correct.");
            }
        }
        catch(underflow e){
            System.out.println("This expression is NOT correct.");
            System.out.println("Error at character # "+ (i+1) + ". ‘"+a[i]+"‘- not opened.");
        }
    }
}
class ListStack extends MySuperClass implements Stack {
    Node head;
    public ListStack(){
        head = null;
    }
    @Override
    public void push(Object e){
        Node newNode = new Node(e,null);
        newNode.next = head;
        head = newNode;
    }
    @Override
    public Object pop()throws underflow{
        if(head == null){
            throw new underflow();
        }
        Node temp = head;
        head=head.next;
        temp.next = null;
        return temp.element;
    }
    @Override
    public Object peak() throws underflow{
        if(head == null){
            throw new underflow();
        }
        return head.element;
    }
    boolean isEmpty(){
        return head == null;
    }
}
// Stack with array===========================================================
class ArrayStack extends MySuperClass implements Stack {
    Object[] a;
    int size;
    public ArrayStack(){
        a = new Object[5];
        size = 0;
    }
    @Override
    public void push(Object e)throws overflow {
        if(size == a.length){
            throw new overflow();
        }
        a[size] = e;
        size++;
    }
    @Override
    public Object pop()throws underflow{
        if(size == 0){
            throw new underflow();
        }
        Object temp = a[size -1];
        a[size-1] = null;
        size--;
        return temp;
    }
    @Override
    public Object peak()throws underflow{
        if(size == 0){
            throw new underflow();
        }
        Object temp = a[size -1];
        return temp;
    }
    boolean isEmpty(){
        return size == 0;
    }
}
//****************************** Creating Node class
class Node{
    Object element;
    Node next ;
    Node(Object value,Node n){
        element = value;
        next = n;
    }
}
interface Stack {
    public void push(Object e)throws overflow;
    public Object pop()throws underflow;
    public Object peak() throws underflow;  
}
class underflow extends Exception {
    public underflow(){
    }
}
class overflow extends Exception{
    public overflow(){
    }
}
abstract class MySuperClass {
   abstract void push(Object e)throws overflow;
   abstract Object pop()throws underflow;
   abstract Object peak()throws underflow;
   abstract boolean isEmpty();
}