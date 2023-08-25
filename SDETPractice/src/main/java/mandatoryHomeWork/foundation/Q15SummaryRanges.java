package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q15SummaryRanges {
	
	/* Pesudo code 
	 * 1.iterate through the array
	 * 2.check for condition if index plus 1 equal to index so loop till condition satisfies else return in string in list
	 * 3.else return the index in list as string
	 * 4.return the list 
	 * */
	
	@Test
	public void test1() {
		ArrayList<String> firstList=new ArrayList<String>(Arrays.asList("0->2","4->5","7")); 
		Assert.assertEquals(firstList, sumrange(new int [] {0,1,2,4,5,7}));
	}
	
	@Test
	public void test2() {
		ArrayList<String> firstList=new ArrayList<String>(Arrays.asList("0","2->4","6","8->9")); 
		Assert.assertEquals(firstList, sumrange(new int [] {0,2,3,4,6,8,9}));
	}
	
	@Test
	public void test3() {
		ArrayList<String> firstList=new ArrayList<String>(Arrays.asList("-2","0->3","5","7->8")); 
		Assert.assertEquals(firstList, sumrange(new int [] {-2,0,1,2,3,5,7,8}));
	}

	public  List<String> sumrange(int [] nums) {
		List<String> opList = new ArrayList<>();
		if(nums.length==1)
			opList.add(String.valueOf(nums[0]));
		else {
		for(int i=0;i<nums.length;i++){
			int temp = nums[i];
			//1,2,3
			while(i<nums.length-1 && nums[i+1]-nums[i]==1){
				i++;
				}
			if(temp==nums[i]){
			opList.add(String.valueOf(nums[i]));
			}
			else {
				opList.add(temp+"->"+nums[i]);
			}
		}
		
		}
		return opList;
	}

}
