package test;

import org.testng.annotations.BeforeMethod;

public class ps {

	
	public void psPrintHello() {
		System.out.println("ps - Hello");
	}
	
	@BeforeMethod
	public void BeforeRun() {
		System.out.println("ps - BeforeMethod");
	}
}
