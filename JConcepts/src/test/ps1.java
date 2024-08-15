package test;

import org.testng.annotations.Test;

public class ps1 extends ps{
	int a=3;
	
	
	@Test
	public void testRun() {
		ps2 objPS2 = new ps2(a);
		
		psPrintHello();
		System.out.println(objPS2.increment());
		System.out.println(objPS2.decrement());
		System.out.println(objPS2.multiplybyThree());
	}
}
