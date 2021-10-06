package objectorybasic;

/**
 *
 * @author 19101623
 */
public class OnePlus {
    public double fcamera;
    public double storage;
    public int battary;
    public boolean dual;
public void initialize(double fc,double rom,int mah,boolean duo){
        fcamera = fc;
        storage = rom;
        battary = mah;
        dual = duo;
}
public void printinfo()
{
    System.out.println("Front Camera: "+fcamera+" MP");
    System.out.println("Storage: "+storage+" GB");
    System.out.println("Battary: "+battary+" mAh");
    System.out.println("Dual Sim: "+dual);      
}
    
}
