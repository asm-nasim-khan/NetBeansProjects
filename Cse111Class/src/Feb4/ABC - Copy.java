/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb4;
/**
 *
 * @author Piplu
 */
public class ABC { 
    public int x = 10;
    private int y = 100;
    private void m1(int a,int b){
        x = a;
        y = b;
    }
    
    public void m2(int[]a,int b){
        a[0]= 100;
        b = 200;
    }
    public void m3(ABC m){
        m.x = 1;
        m.y = 2;
    }
    public void m4(){
        m5();
    }
    private void m5(){
        
    }
    public void setX(int a){
        x = a;
    }
    public int getX(){
        return x;
    }
    
}
