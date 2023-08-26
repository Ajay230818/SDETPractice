package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class Class_25082023_Arraybyparity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Psuedo code
		 * 1.create an empty array with same length as that of input array
		 * 2.if you have even number add at index 0 postion and so on 
		 * 3.else you add the number at the end index-1 and so on
		 * 4. return the array
		 * */
		
		
		int [] nums= {1,8,3,6,7,10};
		int startind=0;
		int lastind=nums.length-1;
		int [] out=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				out[startind]=nums[i];
				startind++;
			}
			else {
				out[lastind]=nums[i];
				lastind--;
			}
		}
		System.out.println(Arrays.toString(out));		
	}

}
