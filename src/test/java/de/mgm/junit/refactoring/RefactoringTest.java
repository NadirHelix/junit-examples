package de.mgm.junit.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;

/**
 * Simple example for refactoring.
 * 
 * @author pmueller
 *
 */
public class RefactoringTest {
	
	int[] array = new int[] { 1, 2, 3, 0, 5 };
	
	@Rule
	public Stopwatch sw = new Stopwatch() {
	};

	private int sum(int[] array) {
		int result = 0;

		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		
		return result;
	}
	
	private int sumB(int[] array) {

		for (int i = 1; i < array.length; i++) {
			array[0] += array[i];
		}
		
		return array[0];
	}
	@Test
	public void testSum() {		
		
		int result = sum(array);
		
		assertEquals(11, result);
		System.out.print("A:");
	}
	@Test
	public void testSumB() {		
		
		int result = sumB(array);
		
		assertEquals(11, result);
		System.out.print("B:");
	}

	@After
	public void after() {
		System.out.println(sw.runtime(TimeUnit.MICROSECONDS));
	}
}
