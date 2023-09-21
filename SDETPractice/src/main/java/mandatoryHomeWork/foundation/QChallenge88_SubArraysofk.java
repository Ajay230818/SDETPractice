package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge88_SubArraysofk {
	
	@Test
	public void test1() {
		Assert.assertEquals(3, numOfSubarrays(new int [] {2,2,2,2,5,5,5,8}, 3,4));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(6, numOfSubarrays(new int [] {11,13,17,23,29,31,7,5,2,3}, 3,5));
	}
	
	public int numOfSubarrays(int[] arr, int k, int threshold) {
		int pointer = 0, sum = 0, count=0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            sum +=arr[pointer++];
        
        if(sum/k>=threshold) {
        	count++;
        }
        //3. continue the operation for rest of the array
        while( pointer < arr.length){
            sum=sum-arr[pointer-k]+arr[pointer];
            if(sum/k>=threshold) {
            	count++;
            }
            pointer++;
        }
        
       return count;
		
	}
}
