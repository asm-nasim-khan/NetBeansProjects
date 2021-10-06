/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task12;

/**
 *
 * @author Piplu
 */
public class Author {
    public String firstName;
    public String lastName;
    public Author (String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    public void setFirstName (String fname){
        firstName = fname;
    }
    public void setLastName (String lname){
        lastName = lname;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String toString(){
        String fullName = firstName.concat(lastName);
        return fullName;
    }
    
    
}
