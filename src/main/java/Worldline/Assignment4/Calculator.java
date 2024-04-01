package Worldline.Assignment4;

public class Calculator {
	
	public int addFunc(int a, int b) {
        return a + b;
    }

    public int subFunc(int a, int b) {
        return a - b;
    }

    public int multFunc(int a, int b) {
        return a * b;
    }

    public int divFunc(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (int) ((double) a / b);
    }

}
