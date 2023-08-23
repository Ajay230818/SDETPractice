package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class Q13setmismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2};
		int [] out= new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				out[0]=nums[i];
				out[1]=i+2;
			}
		}
		System.out.println(Arrays.toString(out));
	}

}
