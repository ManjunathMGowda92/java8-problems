package org.manjunath.java8;

import java.util.Arrays;

public class CheckStringExistsInArray {
	
	public boolean isStringExist(String testStr, String[] items) {
		return Arrays.stream(items).parallel().anyMatch( str -> {
														for (String str1 : items) {
															if (str1.contains(testStr))
																return true;
														}
														return false;
														});
	}
	
	public boolean isStringExists(String testStr, String[] items) {
		return Arrays.stream(items).parallel().anyMatch(testStr :: contains);
	}
}
