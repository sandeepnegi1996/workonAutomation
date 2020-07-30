package com.workon.testrunner;

import org.testng.TestNG;

import com.workon.testcases.centralsearch.TestCase_CentralSearch;
import com.workon.testcases.functional.bug.TestCase_Bug16794;
import com.workon.testcases.generic.TestCase_AMLACTGLIBMAERequestCreation;
import com.workon.testcases.generic.TestCase_APMAZERequestCreation;
import com.workon.testcases.generic.TestCase_EMEAAVGRequestCreation;
import com.workon.testcases.generic.TestCase_RBGARequestCreation;
import com.workon.testcases.generic.TestCase_RBUBKPARequestCreation;
import com.workon.testcases.generic.TestCase_STGARequestCreation;
import com.workon.testcases.regression.TestCase_CopyRequest;
import com.workon.testcases.regression.TestCase_DeleteAsDraft;
import com.workon.testcases.regression.TestCase_PrintRequest;
import com.workon.testcases.regression.TestCase_SaveAsDraft;
import com.workon.testcases.regression.TestCase_SuspendRequest;

public class TestRunner {

	static TestNG testng;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testng = new TestNG();

		// Test cases for the generic Testing

		
		/* testng.setTestClasses(new Class[] {TestCase_RBGARequestCreation.class}); */
		 
		/*
		 * testng.setTestClasses(new Class[] { TestCase_RBGARequestCreation.class,
		 * TestCase_APMAZERequestCreation.class, TestCase_RBUBKPARequestCreation.class,
		 * TestCase_STGARequestCreation.class,
		 * TestCase_AMLACTGLIBMAERequestCreation.class,
		 * TestCase_EMEAAVGRequestCreation.class });
		 * 
		 */
		// Testcases for the Central Search

		// testng.setTestClasses(new Class[] {TestCase_CentralSearch.class});

		/* testng.setTestClasses(new Class[] {TestCase_RBGARequestCreation.class}); */
		
		
		//Regression TestCases
		
		/*
		 * testng.setTestClasses(new Class[]
		 * {TestCase_SaveAsDraft.class,TestCase_DeleteAsDraft.class});
		 */
		
		
		 
		// testng.setTestClasses(new Class[] {TestCase_DeleteAsDraft.class}); 
		 
		 
		 //testng.setTestClasses(new Class[] {TestCase_CopyRequest.class}); 
		 
		 
			/*
			 * testng.setTestClasses(new Class[]
			 * {TestCase_SaveAsDraft.class,TestCase_PrintRequest.class});
			 */

		 
		 
		 
		 testng.setTestClasses(new Class[] {TestCase_SuspendRequest.class}); 
		 
		 

		testng.run();

	}
}
