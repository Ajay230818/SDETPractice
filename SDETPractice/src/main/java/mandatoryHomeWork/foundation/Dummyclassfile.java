package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class Dummyclassfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {-1,-98,-1,100,99,98};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int option1 = nums[0] * nums[1] * nums[nums.length - 1];
		int option2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
		System.out.println(Math.max(option1, option2));
	}

}
