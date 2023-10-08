package mandatoryHomeWork.foundation;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class Q108_NoofEqDompairs {
	
	@Test
	public void test1() {
		Assert.assertEquals(3, Nofunqpairs(new int [] [] {{1,2},{2,1},{3,4},{5,6},{1,2}}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, Nofunqpairs(new int [] [] {{1,2},{2,1},{3,4}}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(3, Nofunqpairs(new int [] [] {{1,2},{2,1},{3,4},{2,1}}));
	}

	public static int Nofunqpairs(int [][] dominoes) {
		int startpointer=0;
		int endpointer=0;
		int movingpointer=0;
		int count=0;
		
		while(startpointer<dominoes.length-1) {
			while(movingpointer<dominoes.length-1) {
			int a=dominoes[startpointer][endpointer];
			int b=dominoes[startpointer][endpointer+1];
			int c=dominoes[movingpointer+1][endpointer];
			int d=dominoes[movingpointer+1][endpointer+1];
			if((a==c && b==d) || (a==d && b==c)) {
				count++;
			}
			movingpointer++;
			}
			startpointer++;
			movingpointer=startpointer;
		}
		return count;
	}

}
