package overriding;

public class A {
	public static void m1() {
		m2();
		System.out.println("m1");
	}
	
	public static void m2() {
		m1();
		System.out.println("m1");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Hello");
	}

}
