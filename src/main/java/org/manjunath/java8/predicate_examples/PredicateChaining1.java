package org.manjunath.java8.predicate_examples;

import java.util.function.Predicate;

/**
 * PredicateChaining1 class is used to test the predicate joining methods for an
 * integer array. The example contains 2 predicates, one for checking the number
 * is greater than 10 or not and other one to find number is even or not.
 * 
 * @author Manjunath HM
 *
 */
public class PredicateChaining1 {
	
	public void executePredicates() {
		int[] arr = {0, 1, 4, 5, 8, 10, 13, 15, 18, 20, 25, 30, 35};
		
		//Predicate lambda expression to check the number is greater than 10 or not
		Predicate<Integer> p1 = i -> i > 10;
		
		//Predicate lambda expression to check number is even or not
		Predicate<Integer> p2 = i -> i % 2 == 0;
		
		//Print the numbers which are greater than 10
		System.out.println("The numbers greater than 10 are:");
		predicateCheck(p1, arr);
		
		//Print the numbers which are even
		System.out.println("The numbers which are even are::");
		predicateCheck(p2, arr);
		
		//Print the numbers which are less than 10 using negate() function of Predicate
		System.out.println("The numbers which are less than 10 are::");
		predicateCheck(p1.negate(), arr);
		
		//Print the numbers which are greater than 10 and even by using and() function of Predicate
		System.out.println("The numbers which are greater than 10 and evn are::");
		predicateCheck(p1.and(p2), arr);
		
		
		//Print the numbers which are greater than 10 or even by using the or() function of Predicate
		System.out.println("The numbers which are greater than 10 or even are::");
		predicateCheck(p1.or(p2), arr);
		
		//Print the numbers which are less than 10 and even by using negate() and and() functions of Predicate
		System.out.println("The numbers which are less than 10 and evn");
		predicateCheck(p1.negate().and(p2), arr);
	}
	
	private void predicateCheck(Predicate<Integer> p, int[] arr) {
		for (int i : arr) {
			if (p.test(i))
				System.out.print(i+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PredicateChaining1 p = new PredicateChaining1();
		p.executePredicates();
	}
}
