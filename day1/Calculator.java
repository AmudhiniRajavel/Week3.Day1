package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Addition of 2 value is: "+ sum);
	}
	public void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Addition of 3 value is: "+ sum);
	}
	public void mul(int a, int b) {
		int mul = a*b;
		System.out.println("Multiplication of 2 value is: "+ mul);
	}

	public void mul(int a, double b) {
		double mul = a*b;
		System.out.println("Multiplication of 2 value is: "+ mul);
	}
	public void sub(int a, int b) {
		int sub = a-b;
		System.out.println("Subtraction of 2 value is: "+ sub);
	}
	public void sub(double a, double b) {
		double sub = a-b;
		System.out.println("Subtraction of 2 value is: "+ sub);
	}
	public void div(int a, int b) {
		int div = a/b;
		System.out.println("Division of 2 value is: "+ div);
	}
	public void div(double a, int b) {
		double div = a/b;
		System.out.println("Division of 2 value is: "+ div);
	}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(5, 3);
	cal.add(4, 5, 8);
	cal.mul(3, 5);
	cal.mul(4, 5.4);
	cal.sub(4.5, 0.8);
	cal.sub(5, 3);
	cal.div(8, 4);
	cal.div(8.3, 2);
}
}
