package mandatoryHomeWork.foundation;

public class Class_01092023_AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Test Data 
		 * positive num1 = "123", num2 = "999"  /// check for the remainder 
		 * positive num1 = "13", num2 = "150"
		 * positive num1 = "456", num2 = "77"
		 * positive num1 = "0", num2 = "24"
		 * positive num1 = "0", num2 = "0"
		 * negative num1 = "-1" num2 = "0"
		 * negative num1 = "-1" num2 = "-6"
		 * negative num1 = "1" num2 = "-6"
		 * */
		
		/* Pesudo code 
		 * 1.iterate through the for loop using num 1 and convert string.charAt(i).int
		 * 2.repeat same for num 2
		 * 3.return num1+num2
		 * */
		
		String num1="11";
		String num2="999";
		int sum=0;
		String out="";
		int carry=0;
		int l1=num1.length();
		int l2=num2.length();
		
		if(l1<l2) {
			for (int i = num2.length()-1; i >=0 ; i--) {
				sum=0;
				System.out.println(num2.charAt(i));
				for (int j = num1.length()-1; j >=0 ;j--) {
					sum=0;
						sum=num2.charAt(i)-'0' + num1.charAt(j)-'0'+carry;
						out+=sum%10;
						if(sum>=10) {
							while (sum != 0) {
							      carry = Math.abs(sum % 10);
							      sum /= 10;
							    }
							System.out.println(carry);
						}
						break;
				}
				sum=num2.charAt(i)-'0'+carry;
				out+=sum%10;
				
			}
		}
		
		//System.out.println(sum);
	}

}
