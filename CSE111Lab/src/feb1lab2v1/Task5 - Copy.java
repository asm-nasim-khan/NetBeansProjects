package feb1lab2v1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double E,R,L,C,f,I,Ii,Iii,Iiii;
        System.out.println("Enter voltage in volts: ");
        E = sc.nextDouble();
        System.out.println("Enter resistance in ohms : ");
        R = sc.nextDouble();
        System.out.println("Enter inductance in henrys: ");
        L = sc.nextDouble();
        System.out.println("Enter capacitance in farads: ");
        C = sc.nextDouble();
        System.out.println("Enter frequency in hertz: ");
        f = sc.nextDouble();        
        Ii=E/(Math.sqrt((R*R)+Math.pow((2*Math.PI*f*L -(1/2*Math.PI*f*C)),2)));   
        System.out.println("Current is "+Ii+" amperes"); 
    }
    
}
