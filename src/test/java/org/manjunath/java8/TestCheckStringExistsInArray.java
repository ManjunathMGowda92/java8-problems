package org.manjunath.java8;

import org.manjunath.java.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCheckStringExistsInArray {
	private CheckStringExistsInArray stringCheck;
	
	@BeforeClass
	public void doInitialization() {
		stringCheck = new CheckStringExistsInArray();
	}
	
	@Test(testName = "testStringExistsInArray1")
	@TestCase(Author = "Manjunath HM",
	expectedResult = "isStringExist() method should return true",
	testDescription = "isStringExist() is used to check the presence of testStr String the given Array using java8 Streams concept")
	public void testStringExistsInArray1() {
		Reporter.log("TestCheckStringExistsInArray: Start of testStringExistsInArray1() method", true);
		try {
			String[] horse = {"schema horse","schemachorse","schemah"};
			String testStr = "schema horse";
			Assert.assertEquals(stringCheck.isStringExist(testStr, horse), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertFalse(true);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertFalse(true);
		}
		Reporter.log("TestCheckStringExistsInArray: End of testStringExistsInArray1() method", true);
	}
	
	
	@Test(testName = "testStringExistsInArray2")
	@TestCase(Author = "Manjunath HM",
	expectedResult = "isStringExists() method should return true",
	testDescription = "isStringExists() is used to check the presence of testStr String the given Array using java8 Streams concept")
	public void testStringExistsInArray2() {
		Reporter.log("TestCheckStringExistsInArray: Start of testStringExistsInArray2() method", true);
		try {
			String[] horse = {"schema horse","schemachorse","schemah"};
			String testStr = "schema horse";
			Assert.assertEquals(stringCheck.isStringExists(testStr, horse), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertFalse(true);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertFalse(true);
		}
		Reporter.log("TestCheckStringExistsInArray: End of testStringExistsInArray2() method", true);
	}
	
	@Test(testName = "testStringExistsInArray3")
	@TestCase(Author = "Manjunath HM",
	expectedResult = "isStringExists() method should return false",
	testDescription = "isStringExists() is used to check the presence of testStr String the given Array using java8 Streams concept")
	public void testStringExistsInArray3() {
		Reporter.log("TestCheckStringExistsInArray: Start of testStringExistsInArray3() method", true);
		try {
			String[] cat = {"schema cat","schemacat","schemac"};
			String testStr = "schema horse";
			Assert.assertEquals(stringCheck.isStringExists(testStr, cat), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertFalse(true);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertFalse(true);
		}
		Reporter.log("TestCheckStringExistsInArray: End of testStringExistsInArray3() method", true);
	}
	
	@Test(testName = "testStringExistsInArray4")
	@TestCase(Author = "Manjunath HM",
	expectedResult = "isStringExist() method should return false",
	testDescription = "isStringExist() is used to check the presence of testStr String the given Array using java8 Streams concept")
	public void testStringExistsInArray4() {
		Reporter.log("TestCheckStringExistsInArray: Start of testStringExistsInArray4() method", true);
		try {
			String[] cat = {"schema cat","schemacat","schemac"};
			String testStr = "schema horse";
			Assert.assertEquals(stringCheck.isStringExist(testStr, cat), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertFalse(true);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertFalse(true);
		}
		Reporter.log("TestCheckStringExistsInArray: End of testStringExistsInArray4() method", true);
	}
}
