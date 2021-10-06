/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task8;

/**
 *
 * @author Piplu
 */
public class Main{
    public static void main(String[] args) {
        Student jhon = new Student();
        Student mike = new Student();
        Student carol = new Student();
        jhon.setName("Jhon");
        jhon.setAddress("Gulshan");
        jhon.setID("1234");
        jhon.setCGPA(3.33);
        System.out.println(jhon.getName());
        System.out.println(jhon.getID());
        System.out.println(jhon.getAddress());
        System.out.println(jhon.getCGPA());
        
    }
    
}
