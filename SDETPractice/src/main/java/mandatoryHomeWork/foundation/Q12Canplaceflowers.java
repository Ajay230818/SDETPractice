package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Q12Canplaceflowers {
	
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
