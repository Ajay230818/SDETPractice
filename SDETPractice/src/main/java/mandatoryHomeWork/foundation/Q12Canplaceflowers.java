package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Q12Canplaceflowers {
	
	/* Pseudo code 
	 * 1.if n =0 there are no flowers to place hence return as true
	 * 2.if n<0 kindly check for the condition whether i-1,i and i+1 are zero and place the flower in i position
	 * 3.whenever you are placing the flower reduce the flower count by 1
	 * 4.At the end if n value is 0 return true else return false
	 * */
	
	@Test
	public void test1() {
		Assert.assertEquals(true, placeflowerbeds(new int [] {1,0,0,0,1}, 1));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, placeflowerbeds(new int [] {1,0,0,0,1}, 2));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, placeflowerbeds(new int [] {0,0,1,0,0,0,1}, 2));
	}

	public  boolean placeflowerbeds(int[] fb, int n) {
		// TODO Auto-generated method stub

        if (n == 0) {
            return true;
        }
        for (int i = 0; i < fb.length; i++) {
            if (fb[i] == 0 && (i == 0 || fb[i-1] == 0) && (i == fb.length-1 || fb[i+1] == 0)) {
                fb[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    
	}

}
