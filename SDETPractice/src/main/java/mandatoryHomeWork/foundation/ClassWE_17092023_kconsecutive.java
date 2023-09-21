package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class ClassWE_17092023_kconsecutive {

	public static void main(String[] args) {
		int [] nums= {0,1,2,4,5,6,7,9};
		int startpointer=0;
		int endpointer=1;
		int movingpointer=startpointer;
		
		while(endpointer<nums.length) {
			System.out.println(nums[startpointer]);
			System.out.println(nums[endpointer]);
			if(nums[movingpointer]+1==nums[endpointer]) {
				movingpointer++;
				endpointer++;
			}else if(nums[movingpointer]+1!=nums[endpointer]) {
				System.out.println(nums[startpointer]+"->"+nums[endpointer-1]);
				startpointer=movingpointer+1;
				endpointer=endpointer+1;
			}
		}
	}

}
