package overriding;

abstract class Test {
	int x;
	Test(int x){
		this.x = x;
		System.out.println("constructor executed" + x);
	}

}
