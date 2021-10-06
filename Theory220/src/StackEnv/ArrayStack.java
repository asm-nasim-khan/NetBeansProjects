package StackEnv;
public class ArrayStack implements Stack {
    Object[] a;
    int size;
    public ArrayStack(){
        a = new Object[5];
        size = 0;
    }
    @Override
    public void push(Object e) {
        if(size == a.length){
            System.out.println("Stack over flow!");
            return;
        }
        a[size] = e;
        size++;
    }
    @Override
    public Object pop(){
        if(size == 0){
            System.out.println("Stack Under flow");
            return null;
        }
        Object temp = a[size -1];
        a[size-1] = null;
        size--;
        return temp;
    }
    @Override
    public Object peak(){
        if(size == 0){
            System.out.println("Stack Under flow");
            return null;
        }
        Object temp = a[size -1];
        return temp;
    }
}
