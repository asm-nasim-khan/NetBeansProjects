package uribeginner;
import java.util.Scanner;
public class Task1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,areaotri,areaocir,areaotrap,areaosq,areaorec;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        areaotri = .5*a*c;
        areaocir =  3.14159*(c*c);
        areaotrap = ((a+b)/2)*c;
        areaosq = (b*b);
        areaorec = (a*b);
        System.out.printf("TRIANGULO: %.3f\n", areaotri);
        System.out.printf("CIRCULO: %.3f\n", areaocir);
        System.out.printf("TRAPEZIO: %.3f\n", areaotrap);
        System.out.printf("QUADRADO: %.3f\n", areaosq);
        System.out.printf("RETANGULO: %.3f\n", areaorec);
    }
}