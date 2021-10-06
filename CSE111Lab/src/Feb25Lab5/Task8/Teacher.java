package Feb25Lab5.Task8;

import java.util.Arrays;

public class Teacher {
    public String name;
    public String dpt;
    public int courseCount=0;
    String[] a = new String[10];
    public Teacher(String s,String a){
        name = s;
        dpt = a;
    }
    public void addCourse(Course c){
        a[courseCount] = c.co;
        courseCount++;
    }
    public void printDetail(){
        System.out.println("========================");
        System.out.println("Name: "+name);
        System.out.println("Department: "+dpt);
        System.out.println("List of courses");
        System.out.println("========================");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(a[i]);
        }
        //System.out.println(Arrays.toString(a));
        System.out.println("========================");
    }
}
