package test;

public class ps2 extends ps3{
	int a;
	public ps2(int a) {
		super(a);
		this.a = a;
		
	}
	
	public int increment() {
		a++;
		return a;
	}
	
	public int decrement() {
		a--;
		return a;
	}
}
