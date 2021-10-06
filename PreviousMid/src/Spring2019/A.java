package Spring2019;
	public class A {
	    int x = 1;
	    int y = 7;
	    int methodA() {
	        x = x - y;
	        y = y + x;
	        System.out.println(x+" "+y);
	        return x - y;
	    }
	    void methodB() {
	        int x = 8;
	        x = x * y;
	        y = y + x;
	        System.out.println(x+" "+y);
	    }
	}

