package Mar17Lab8.Task1;
public class TestStudents {
    public static void printName(Student s){
    System.out.println(s.toString());
  }
  public static void main(String [] args){
    printName(new BBAStudent());
    printName(new BBAStudent("Humty Dumty"));
    printName(new BBAStudent("Little Bo Peep"));    
  }
}