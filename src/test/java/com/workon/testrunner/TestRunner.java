package com.workon.testrunner;

import org.testng.TestNG;

import com.workon.testcases.functional.bug.TestCase_Bug16794;
import com.workon.testcases.generic.TestCase_APMAZERequestCreation;
import com.workon.testcases.generic.TestCase_RBGARequestCreation;

public class TestRunner {

	static TestNG testng;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testng=new TestNG();
		
		//testng.setTestClasses(new Class[] {TestCase_RBGARequestCreation.class,TestCase_APMAZERequestCreation.class});
		testng.setTestClasses(new Class[] {TestCase_Bug16794.class});
		
		
		testng.run();
	}

}
