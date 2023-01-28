package oop4;

public class Calculatorc implements BasicCalc, AdvCalc{
	@Override
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	@Override
	public void sub(int a, int b) {
		int sub = a-b;
		System.out.println(sub);
		
	}
	@Override
	public void multiple(int a, int b) {
		int m = a*b;
		System.out.println(m);
		
	}
	
	public static void main(String[] args) {
		
		Calculatorc c1 = new Calculatorc();
		c1.add(100,100);
		
		
		
		
	}

}
