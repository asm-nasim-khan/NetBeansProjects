/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task13;

/**
 *
 * @author Piplu
 */
public class ClockDemo {
    public static void main(String[] args) {
        Clock firstClock = new Clock(5000);
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println();  
        }
        Clock secondClock =new Clock(3,45,45);
        secondClock.toString();
    firstClock.setClock(60000);
        System.out.println("H :"+firstClock.getHours());
    }
    
}
