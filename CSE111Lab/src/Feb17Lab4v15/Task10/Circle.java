/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task10;

/**
 *
 * @author Piplu
 */
public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){
        
    }
    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
}
    public double getArea(){
        double area = 3.1416 * radius*radius;
        return area;
    }
    
}
