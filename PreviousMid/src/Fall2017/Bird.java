package Fall2017;
public class Bird {
    public String size;
    public String color;
    public Bird(){
    
    }
    public Bird(String s,String c){
        size = s;
        color = c;
    }
    public Bird(String s){
        size = s;
    }
    public void fly(){
            if(size==null && color == (null)){
            System.out.println("Bird*is*flying");
        }
        else if(color == (null)&& size!=null){
            System.out.println(size+"*Bird*is*flying");
        }
        else{
            System.out.println(size+"*"+color+"*Bird*is*flying");
            
        }
    }
}
