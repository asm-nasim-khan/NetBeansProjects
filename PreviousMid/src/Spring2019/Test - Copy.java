package Spring2019;
class Test {
    int x = 9;
    int y = 8;
    int sum = 7;
    Test t;
    void methodOne()
    {
        t = new Test();
        t.sum += sum;
        System.out.println(t.sum);
    }
    int methodTwo() {
        System.out.println(x--);
        methodOne();
        System.out.println(--y);
        return x * y * sum;
    }
    int methodThree() {
        t.sum += methodTwo();
	System.out.println(t.sum++);
	return ++sum;
    }
}

