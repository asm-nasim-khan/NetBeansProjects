package feb5lab3;

/**
 *
 * @author 19101623
 */
public class Task7 {
    public static void main(String[] args) {
        String a = "Xyz ajaira ";
        String b = "pqr";
        int result;
        result = a.compareTo(b);
        System.out.println(result);
        result = a.compareToIgnoreCase(b);
        System.out.println(result);
        System.out.println(a.startsWith("Z"));
        System.out.println(b.endsWith("F"));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.indexOf("X"));
        System.out.println(a.lastIndexOf("z"));
        System.out.println(a.length());
        System.out.println(a.replace("y", "F"));
        System.out.println(a.substring(6));
        System.out.println(a.toCharArray());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.trim());
        System.out.println(String.valueOf(1000000.07763)); 
    }
    
}
