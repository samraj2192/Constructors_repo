package overloading;

public class Test {
	Test(double d){
		this(10);
		System.out.println("double");
	}
	Test(int i){
		this();
		System.out.println("int");
	}
	Test(){
		System.out.println("no-arg");
	}

	public static void main(String[] args) {
		Test t1 = new Test(10.5);
		Test t2 = new Test(10);
		Test t3 = new Test();

	}

}
