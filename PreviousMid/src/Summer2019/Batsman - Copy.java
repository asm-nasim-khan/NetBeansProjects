package Summer2019;
public class Batsman {
    public String name;
    public int run;
    public int ball;
    public Batsman(int r,int b){
        name = "New Batsman";
        run = r;
        ball = b;
    }
    public Batsman(String n,int r,int b){
        name = n;
        run = r;
        ball = b;
    }
    public void setName(String s){
        name = s;
    }
    public void printCareerStatistics(){
        System.out.println("Name: "+name);
        System.out.println("Runs Scored:"+run+", Balls Faced: 7380");
    }
    public double battingStrikeRate(){
        double str =(double)run/ ball * 100;
        return str;
    }
    

}
