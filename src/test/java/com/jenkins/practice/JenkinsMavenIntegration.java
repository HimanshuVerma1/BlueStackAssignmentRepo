package com.jenkins.practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JenkinsMavenIntegration extends BaseTestJenkins {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing before method");
	}
	
	@Test
	public void myMethod() {
		System.out.println("Executing my method");
	}
	
	@Test
	public void myMethod_1() {
		System.out.println("Executing my method one");
	}
}
