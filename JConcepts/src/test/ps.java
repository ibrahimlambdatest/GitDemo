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
	
	public void forGitX() {
		System.out.println("forGitX1");
		System.out.println("forGitX2");
		
		System.out.println("forGitDemo1");
		System.out.println("forGitDemo2");
		System.out.println("forGitDemo3");
	}
	
	public void forGitXArchitect() {
		System.out.println("forGitDemoArchitect1");
		System.out.println("forGitDemoArchitect2");
		System.out.println("forGitDemoArchitect3");

	}
}
