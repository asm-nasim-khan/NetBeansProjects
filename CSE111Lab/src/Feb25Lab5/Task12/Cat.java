package Feb25Lab5.Task12;
public class Cat{
    public String color = "White"; 
    public String action = "sitting"; 

    public Cat(){
        
    }
    public Cat(String s){
        color = s;
    }
    public Cat(String s,String a){
        color = a;
        action = s;
    }
    public void printCat(){
        System.out.println(color+" cat is "+action);
    }
    public void changeColor(String s){
        color = s;
    }

}
