package Summer2019;
public class Test10{
    private int sum, y, x;
    public void methodA(){
        int[] msg = new int[1];
	msg[0] = 5;
	y = y + methodB(msg, msg[0]);
	x = y + methodB(x, msg[0]);
	sum = x + y + msg[0];
	System.out.println(x+" "+y+" "+sum);
    }
    private int methodB(int[] mg2, int y){
        this.y = y - mg2[0];
        this.x = x - 33 + y;
	sum = sum - x + y;
	mg2[0] = y - sum;
	return mg2[0];
    }
    private int methodB(int sum, int mg1){
        int x = 33 + mg1;
	y = y - this.sum;
	sum = sum + x + y;
	System.out.println(x+" "+y+" "+sum);
	return y - mg1;
    }
}


