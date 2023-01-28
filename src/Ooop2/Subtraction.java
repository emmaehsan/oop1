package Ooop2;

public class Subtraction extends Addition {
	
	//oop
	//1. Inheritance
	//2. Polymorphism - 1. overloading 2. overriding
	//3. Encapsulation
	//4. Abstraction 

	void sub (int a, int b) {
		int s = a-b;
		System.out.println(s);
	}// end sub
	
	// inheritance - establish a parent and child relationship between 2 class
	
	
	
	
	public static void main(String[] args) {
		
		Subtraction s1 = new Subtraction();
		s1.sub(100,50);
		
		
		//100+100+100-75
		int sum = s1.add(100, 100, 100);
		s1.sub(sum, 75);
		
		}//end main

}//end class
