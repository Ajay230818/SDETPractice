package mandatoryHomeWork.foundation;

import java.lang.module.FindException;

import org.junit.Test;

import junit.framework.Assert;

public class Qchallenge94 {
	
	@Test
	public void test1() {
		Assert.assertEquals(2,findkbeauty(240,2) );
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(2,findkbeauty(430043,2) );
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1,findkbeauty(430043,3) );
	}

	public  int findkbeauty(int num,int k) {
		String strnum=""+num;
		int startpointer = 0, endpointer=0,count=0;
		
        while(endpointer<strnum.length()-k+1){
        	String divide = strnum.substring(startpointer, endpointer+k);
        	if(Integer.parseInt(divide)!=0 && num%Integer.parseInt(divide)==0) {
        		count++;
        	}
        	startpointer++;
        	endpointer++;
        }
        
       return count;
	}

}
