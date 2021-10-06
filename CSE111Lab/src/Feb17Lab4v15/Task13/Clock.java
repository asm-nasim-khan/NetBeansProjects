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
public class Clock {
    public int hours;
    public int minutes;
    public int seconds;
    public Clock(){
        hours = 12;
        minutes = 0;
        seconds = 0;
        
    }
    public Clock( int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }
    public Clock(int sec){
        hours = sec/3600;
        minutes = (sec%3600)/60;
        sec = (sec%3600)%60;
        
    }
    public void setClock(int second){
        hours = second/3600;
        minutes = (second%3600)/60;
        seconds = (second%3600)%60;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setHours(int h){
        hours = h;
    }
    public void setMinutes(int m){
        minutes = m;
    }
    public void setSeconds(int s){
        seconds = s;
    }
    public void tick()
    {
        seconds++;
        System.out.println(hours+":"+minutes+":"+seconds);
        
    }
    public void addClock(int h,int m,int s){
        hours = h;
        minutes = m;
        seconds = s;
    }
    public String toString(){
        return hours+":"+minutes+":"+seconds;
    }
    public void tickDown(){
        seconds--;
        System.out.println(hours+":"+minutes+":"+seconds);
    }
    public void subtractClock(int h,int m,int s){
        int hour = hours - h;
        int min = minutes - m;
        int secd = seconds - s;
      System.out.println(hour+":"+min+":"+secd);   
    }
    
}
