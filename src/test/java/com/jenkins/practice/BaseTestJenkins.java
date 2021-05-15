package com.jenkins.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTestJenkins {
	

  @BeforeClass
  public void beforeClass() {
	  System.out.println("In before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in after class");
  }
}
