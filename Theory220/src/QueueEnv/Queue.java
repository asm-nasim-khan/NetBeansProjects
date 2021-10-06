package QueueEnv;
public interface Queue {
    public void Enqueue(Object e);
    public Object Dequeue();
    public Object peak();  
}
