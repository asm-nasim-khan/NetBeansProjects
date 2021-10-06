/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task14;

/**
 *
 * @author Piplu
 */
public class Complex {
    public double realPart;
    public double imaginaryPart;
    public String fcomNumber;
    public Complex (){
        realPart = 0;
        imaginaryPart = 0;
    }
    public Complex (double rPart, double iPart){
        realPart = rPart;
        imaginaryPart = iPart;
       fcomNumber = realPart.concat("+"+imaginaryPart);
    }
    public Complex add(Complex otherNumber){
        fcomNumber = realPart + imaginaryPart;
        double newComplex = fRealNumber + otherNumber;
        
        
    }
    public Complex subtract (Complex otherNumber){
        
    }
    public Complex multiply (Complex otherNumber){
        
    }
    public Complex divide (Complex otherNumber){
        
    }
    public void setRealPart (double realPart){
        
    }
    public void setImaginaryPart (double realPart){
        
    }
    public double getRealPart(){
        
    }
    public double getImaginaryPart(){
        
    }
    public String toString(){
        return realPart + imaginaryPart +"i";
    }
}

