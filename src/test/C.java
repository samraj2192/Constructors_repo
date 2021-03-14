package test;

public class C extends P {
	String S = "Child class";
	
	public void m1() {
		System.out.println(S); //default will call the child class variable
		System.out.println(this.S); //will call the current class (child class) instance variable
		System.out.println(super.S); //will call the parent class variable
	}
}
