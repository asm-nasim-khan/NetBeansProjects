package Feb25Lab5.Task7;
public class Student {
    public String name;
    public static int numberOfStudents = 0;
    public Student(){
        name = "default name";
        numberOfStudents++;   
    }
    public Student(String s){
        name = s;
        numberOfStudents++;
    }
    public String getName(){
        return name;
    }

}
