package assignment2tictac;
public class DesignClass {
    static String[] a ={"1","2","3"};
    static String[] b = {"4","5","6"};
    static String[] c = {"7","8","9"};
    public static void gBoard(String[] s){
        for (int i = 0; i < 3; i++) {
            System.out.print(s[i]+"   ");
        }
        System.out.println("");
        System.out.println("============");
    }
    public void printBoard(){
        gBoard(a);
        gBoard(b);
        gBoard(c);
    }
    public void setvalue(String[] s,int p){
            if(p == 1){
                a[0]= "x";
            }
            else if(p == 2){
                a[1]= "x";
            }
            else if(p == 3){
                a[2]= "x";
            }
            else if(p == 4){
                a[1]= "x";
            }
            else if(p == 5){
                a[1]= "x";
            }
            else if(p == 6){
                a[1]= "x";
            }
        
            
            
        }
    }
    
    

}
