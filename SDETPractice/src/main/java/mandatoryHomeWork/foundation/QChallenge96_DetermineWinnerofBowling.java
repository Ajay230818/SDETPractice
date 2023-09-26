package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge96_DetermineWinnerofBowling {
	
	@Test
	public void test1() {
		Assert.assertEquals(1, isWinner(new int [] {4,10,7,9}, new int [] {6,5,2,3}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2, isWinner(new int [] {3,5,7,6}, new int [] {8,10,10,2}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, isWinner(new int [] {2,3}, new int [] {4,1}));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(1, isWinner(new int [] {10,2,2,3}, new int [] {3,8,4,5}));
	}

	 public int isWinner(int[] player1, int[] player2) {
	        int p1score=0;
			int p2score=0;
			for (int i = 0; i < player1.length; i++) {
				if((i>=1 && player1[i-1]==10) || (i>=2 && player1[i-2]==10) ) {
					p1score+=player1[i]*2;

				}else {
					p1score+=player1[i];
				}
			}
			for (int i = 0; i < player2.length; i++) {
				if((i>=1 && player2[i-1]==10) || (i>=2 && player2[i-2]==10) ) {
					p2score+=player2[i]*2;

				}else {
					p2score+=player2[i];
				}
			}
			if(p1score>p2score) {
				return 1;
			}else if(p1score<p2score) {
				return 2;
			}else{
	            return 0;
	        }
	    }

}
