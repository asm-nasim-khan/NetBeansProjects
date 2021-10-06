/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb4;

/** 
 * Adresss passing v/s value passing in objector
 *
 * @author Piplu
 */
public class Tester {
    public static void main(String[] args) {
        ABC obj = new ABC();
        int a = 100,b= 500;
        int[] arr = {10,20,30,40};
       // obj.m1(a,b);
        //obj.setX(190);
        //obj.setX(200);
        System.out.println(obj.getX()+" ");
        
        //System.out.println(obj.x);
        System.out.println(a+" =a , b= "+b);
       // System.out.println(obj.x+" =x , y ="+obj.y);
        
        
        
        obj.m2(arr,arr[2]);
        ABC obj1 = new ABC();
        obj.m3(obj1);
       // System.out.println(obj.x+" ,"+obj.y);
       // System.out.println(obj1.x+" ,"+obj1.y);
    }
    
}
