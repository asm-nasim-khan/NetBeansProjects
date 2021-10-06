package QueueEnv;
public class ArrayQueue implements Queue {
    Object[] Arr;
    int size;
    int start;
    
    public ArrayQueue(){
        Arr = new Object[5];
        size = 0;
        start = 0;
    }
    @Override
    public void Enqueue(Object e) {
        if(size == Arr.length){
            System.out.println("NO space");
            return;
        }
        int lastopen = (start+size)%Arr.length;
        Arr[lastopen] = e;
        size++;
    }

    @Override
    public Object Dequeue() {
        if(size == -1){
            System.out.println("Empty Queue");
            return null;
        }
        Object temp = Arr[start];
        Arr[start]=null;
        start = (start+1)% Arr.length;
        size--;
        return temp;
    }

    @Override
    public Object peak() {
        if(size == -1){
            System.out.println("Empty Queue");
            return null;
        }
        return Arr[size];
    }

}
