package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class ClassWE_minimumpossible_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,5,2,3,7,1};
		Arrays.sort(nums);
		int k=3;
		
		int min = Integer.MAX_VALUE, pointer = 0, currentmin = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentmin =nums[pointer-k]-nums[pointer];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            min = Math.min(currentmin, min);
            System.out.println(pointer);
            System.out.println(pointer-k);
            currentmin =currentmin -nums[pointer-k]+ nums[pointer] ;
            pointer++;
        }
        System.out.println(Math.min(currentmin, min));
	}

}
