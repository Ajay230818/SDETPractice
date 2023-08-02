package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Q52colorOfchessBoardsquare {
	
	//Pseudo code
	//1.Since we 8*8 matrix and from the given tests
	//2.if sum of length of characters is even return false else true
	//3.convert the given string to tochararray
	//4.add two characters and check for the 2 nd condition
	@Test
	public void test1() {
		Assert.assertEquals(false, determinecolorofchessboard("a1"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, determinecolorofchessboard("h3"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(false, determinecolorofchessboard("c7"));
	}
	
	
	public boolean determinecolorofchessboard(String coordinates) {
		boolean flag=true;
		char[] ch = coordinates.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]%2==0 && ch[i+1]%2==0 || ch[i]%2!=0 && ch[i+1]%2!=0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
