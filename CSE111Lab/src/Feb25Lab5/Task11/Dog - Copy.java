package Feb25Lab5.Task11;
public class Dog {
    public String color;
    public Dog(String c){
        color = c;
    }
    public void bark(){
        System.out.println(color+" dog is barking");
    }
    public void changeColor(String c){
        color = c;
    }

}
