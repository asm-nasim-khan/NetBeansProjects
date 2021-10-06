/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REverseCode;

/**
 *
 * @author Piplu
 */

public class Car{
    public static int count=0;
    public static int year;
    public static int getObjectCount(){
        
        return count;
    }
    public Car(int year){
        
        count++;
        
    }
        public  void getYear(){
            System.out.println("Year: "+ year);
            
        }
        
    }
