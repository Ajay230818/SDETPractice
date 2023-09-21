package mandatoryHomeWork.foundation;

public class ClassWE_16092023_Summaryranges_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,5,2,3,7,1};
		int k=3;
		/*
		 * while( startpointer<nums.length && endpointer<nums.length) {
		 * if(nums[movingpointer]+1==nums[endpointer]) { endpointer++; movingpointer++;
		 * }else if(nums[movingpointer]+1!=nums[endpointer]) {
		 * System.out.println(nums[startpointer]+"->"+nums[endpointer-1]);
		 * startpointer=endpointer; endpointer=endpointer+1; movingpointer=startpointer;
		 * } }
		 */
		
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            System.out.println(pointer);
            System.out.println(pointer-k);
            currentSum =currentSum -nums[pointer-k]+ nums[pointer] ;
            pointer++;
        }
        System.out.println(Math.max(currentSum, max));
    }
	
	/*currentSum += nums[pointer];
	currentSum-= nums[pointer++-k];

	to ease out the understanding of the sliding window pointer movement use the above code instead of

	currentSum += nums[pointer] - nums[pointer++-k];

	 * 
	 */		
	}
