package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Q53AlternatingDigitSum {
	// Pseudo code
	/*
	 * 1.convert the given number to integer array 2.initialize a sum variable 3.add
	 * all the odd integers and subract all the even integers 4.return the sum
	 */
	
	@Test
	public void test1() {
		Assert.assertEquals(4, alternatedigitsum(521));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, alternatedigitsum(111));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, alternatedigitsum(886996));
	}

	public int alternatedigitsum(int num) {

		int sum = 0;
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		while (num > 0) {
			int remainder = num % 10;
			num /= 10;
			numlist.add(remainder);
		}
		Collections.reverse(numlist);
		for (int i = 0; i < numlist.size(); i++) {
			if (i % 2 == 0) {
				sum = sum + numlist.get(i);
			} else {
				sum = sum - numlist.get(i);
			}
		}
		return sum;
	}

}
