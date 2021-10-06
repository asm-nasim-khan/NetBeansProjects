package DuobleCallingMethod;
public class UserClass {
    private int sum, y, x;
    public void methodA(){
        int[] msg = new int[1];
	msg[0] = 5;
        System.out.println(y+" "+x);
	y =y+methodB(1,2);
	x = y + 4;
	sum = x + y + msg[0];
	System.out.println(x+" "+y+" "+sum);
    }
    public int methodB(int s,int r){
        this.y = 5;
        return 3;
    }

}
