package mandatoryHomeWork.foundation;

public class Q3823ReverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] s = {'h','e','l','l','o'};
		char arr[] = new char[s.length];
		for (int i = s.length-1; i>=0; i--) {
			int count=0; 
			arr[count]=s[i];
			count++;
		}
		System.out.println(arr);
	}

}
