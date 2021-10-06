/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task15;

/**
 *
 * @author Piplu
 */
public class BoroInt {
    String val;
    public BoroInt(){
        val = "0";
    }
    public BoroInt(int n){
        int s = n;
        val =s.toString();
    }
    public String trim(String s){
        return s.trim();
    }
    public boolean validValue( String va){
        if(va){
            return true;
        }
        else{
            return false;
        }
    }
    public BoroInt add(BoroInt vl){
        String value =val+vl;
        return null;
    }
    public BoroInt subtract(BoroInt _val){
        
    }
}
