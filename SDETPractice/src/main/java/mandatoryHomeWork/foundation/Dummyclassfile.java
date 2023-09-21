package mandatoryHomeWork.foundation;

import java.nio.file.spi.FileSystemProvider;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import org.junit.Test;

import junit.framework.Assert;

public class Dummyclassfile {

	/* public static void main(String[] args) { */
	// TODO Auto-generated method stub
	/*
	 * String s = "abcdefgh"; String repchars=""; List<String> lisrepcharstring=new
	 * ArrayList<String>(); int count=0; Set<Character> dupele=new
	 * HashSet<Character>(); for (int i = 0; i < s.length(); i++) {
	 * if(dupele.add(s.charAt(i))) { repchars=repchars+s.charAt(i); }else {
	 * lisrepcharstring.add(repchars); i=i-1; repchars=""; dupele.clear(); } } for
	 * (int i = 0; i < lisrepcharstring.size(); i++) {
	 * if(lisrepcharstring.get(i).length()>count) {
	 * count=lisrepcharstring.get(i).length(); } } System.out.println(count); }
	 */

	// Class room exercise -1 Day 1DSA
	/*
	 * int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500}; int temp; int count=0;
	 * for(int a = 0; a <= arrNumbers.length - 1; a++) { for(int b = 0; b <=
	 * arrNumbers.length - 2; b++) { count++; if(arrNumbers[b] < arrNumbers[b + 1])
	 * { temp = arrNumbers[b]; arrNumbers[b] = arrNumbers[b + 1]; arrNumbers[b + 1]
	 * = temp; } } } System.out.println(count); for(int num : arrNumbers) {
	 * System.out.println(num); }
	 */

	// Class room exercise -2 Day 2 DSA
	/*
	 * int[] arrNumbers = {1,2,3,4,5,6,7}; for (int i = 0; i < arrNumbers.length;
	 * i++) { System.out.println("Array is of index "+i+" value is "+arrNumbers[i]);
	 * }
	 */

	// class room exercise -3 Day 3 DSA
	/*
	 * String [][] empdetails= {{"Ajay","29"},{"vijoy","31"},{"Vinoth","28"}};
	 * Employeeclass ec=new Employeeclass();
	 * System.out.println(ec.employeedetails(empdetails));
	 * 
	 * ArrayList<Integer> al=new ArrayList<Integer>(10); al.add(1); al.add(2);
	 * al.add(3); al.add(4); al.add(5); al.add(6); al.add(7); al.add(8); al.add(9);
	 * al.add(10); System.out.println(al); al.add(11); System.out.println(al); int
	 * sum = 0; int[] arr = {1,2,3,4,5}; for(int i =0 ; i <= arr.length;i++ ){ sum
	 * += arr[i]; }
	 */

	// 26.08.2023 problem 1

	/*
	 * @Test public void test1() { Assert.assertEquals("1[.]1[.]1[.]1",
	 * ipaddress("1.1.1.1")); }
	 * 
	 * @Test public void test2() { Assert.assertEquals("2[.]3[.]4",
	 * ipaddress("2.3.4")); }
	 * 
	 * public String ipaddress(String address) { String newaddress=""; for (int j =
	 * 0; j < address.length(); j++) { if(address.charAt(j)=='.') {
	 * newaddress+="[.]"; }else { newaddress+=address.charAt(j); } } return
	 * newaddress;
	 */

	// 26.08.2023 problem 2

	/*
	 * Data positive "Hi testleaf students" Data positive "HI TEstlEAf students"
	 * Data negative"bcd" edge " " pesudo code create an empty o/p string iterate
	 * through the string and check the characters presentin string contains
	 * a,e,i,o,u if it contains replace it contanins the vowel character ignore it
	 * else add to o/p string return the o/p string
	 */

	/*
	 * @Test public void test1() { Assert.assertEquals("H tstlf stdnts",
	 * removevowels("Hi testleaf students")); }
	 * 
	 * @Test public void test2() { Assert.assertEquals("H Tstlf stdnts",
	 * removevowels("HI TEstlEAf students")); }
	 * 
	 * @Test public void test3() { Assert.assertEquals("bcd", removevowels("bcd"));
	 * }
	 * 
	 * @Test public void test4() { Assert.assertEquals("", removevowels("")); }
	 * 
	 * @Test public void test5() { Assert.assertEquals("Fb@c@d",
	 * removevowels("Fb@c@deE")); }
	 * 
	 * public String removevowels(String input) { Approach 1 //String output="";
	 * 
	 * for (int i = 0; i < input.length(); i++) { if(input.charAt(i)=='a' ||
	 * input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' ||
	 * input.charAt(i)=='u' || input.charAt(i)=='A' || input.charAt(i)=='E' ||
	 * input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U') { }else
	 * { output=output+input.charAt(i); } }
	 * 
	 * 
	 * return input.replaceAll("[aeiouAEIOU]", "");
	 * 
	 * }
	 */

	public static void main(String[] args) {
		/*
		 * String s="My name is parthiv"; String temp = ""; String out=""; String []
		 * words=s.split(" "); for (int i = 0; i < words.length; i++) { for (int j =
		 * words[i].length()-1; j >=0; j--) { temp+=words[i].charAt(j); } out+=temp+" ";
		 * temp=""; } System.out.println(out.trim());
		 */

		/*
		 * String mergedString=""; String word1="abcdef"; String word2="pqrs"; int
		 * word1len=word1.length(); int word2len=word2.length(); if(word1len>word2len) {
		 * mergedString=word1.substring(0, word2len)+word2.substring(0,word2len);
		 * System.out.println(mergedString); }
		 */

		/*
		 * char ch='K'; int i=1; String s=""; s=s+ch; System.out.println(s); s=s+i;
		 * System.out.println(s);
		 */

		// String sentence="thequickbrownfoxjumpsoverthelazydog";
		/*
		 * int sentlengremdup = sentence.replaceAll("(.)(?=.*\\1)", "").length();
		 * System.out.println(sentlengremdup);
		 */

		/*
		 * String key="the quick brown fox jumps over the lazy dog"; String
		 * keywithoutspace=key.replaceAll(" ", ""); char[] keyarr =
		 * keywithoutspace.toCharArray(); String message="vkbs bs t suepuv"; char[]
		 * messarr = message.toCharArray(); char ch='a'; StringBuilder out = new
		 * StringBuilder(); Map<Character, Character> map=new HashMap<Character,
		 * Character>();
		 * 
		 * for (int i = 0; i < keyarr.length; i++) { if(!map.containsKey(keyarr[i]))
		 * map.put(keyarr[i],ch++); }
		 * 
		 * for (int i = 0; i < messarr.length; i++) { if(map.containsKey(messarr[i]))
		 * out.append(map.get(messarr[i])); else out.append(messarr[i]); }
		 * 
		 * System.out.println(out.toString());
		 */

//	String num="1210";
//	int count=0;
//	for (int i = 0; i < num.length(); i++) {
//		for (int j = 0; j < num.length(); j++) {
//			//if(i==nums[j])
//		}
//	}
		/*
		 * String word="a"; for(int i=0;i<word.length();i++){
		 * System.out.println(word.charAt(i)); }
		 */
		/*
		 * String str="aaaaaaaabbbbbbbbbbxccccccccccddd"; StringBuilder sb = new
		 * StringBuilder(); str.chars().distinct().forEach(c -> sb.append((char) c));
		 * System.out.println(sb);
		 */
		/*
		 * IntStream chars = str.chars().distinct();
		 * chars.mapToObj(Character::toChars).forEach(System.out::println);
		 */
		// IntStream distinct = chars.distinct();
		// distinct.mapToObj(Character::toChars).forEach(System.out::println);

		/*
		 * String str1="aabbccvveerru  uiiooz"; String outputString =
		 * str1.replaceAll("(.)(?=.*\\1)", "").replaceAll(" ", "");
		 * System.out.println(outputString);
		 */

		/*
		 * String s = "parthivajay"; String rev = ""; for (int i = s.length() - 1; i >=
		 * 0; i--) { rev = rev + s.charAt(i); }
		 * System.out.println("Solution 1 Using for loop " + rev); StringBuffer sb = new
		 * StringBuffer(s); sb.reverse();
		 * System.out.println("Solution 2 Using Stringbuffer " + sb); StringBuilder
		 * sbuild = new StringBuilder(s); sbuild.reverse();
		 * System.out.println("Solution 3 Using Stringbuilder " + sbuild); StringBuilder
		 * res = new StringBuilder(); for (int i = s.length() - 1; i >= 0; i--)
		 * res.append(s.charAt(i));
		 * System.out.println("Solution 4 Using Stringbuilder append " +
		 * res.toString());
		 */

		/*
		 * char[] chararr = s.toCharArray(); int k=0; int l=s.length()-1; char temp;
		 * while(k<l) { temp=chararr[k]; chararr[k]=chararr[l]; chararr[l]=temp; k++;
		 * l--; }
		 */

		// String s="parthivajay";
		/*
		 * char[] chararr = s.toCharArray(); int startindex = 0; int endindex =
		 * s.length() - 1; char temp; while (startindex < endindex) { temp =
		 * chararr[startindex]; chararr[startindex] = chararr[endindex];
		 * chararr[endindex] = temp; startindex++; endindex--; }
		 * 
		 * System.out.println("Solution 5 Using two pointers " +
		 * String.valueOf(chararr));
		 */
		
		/*
		 * int [] nums= {2,3,4,5}; int target=9; int start = 0; int end = nums.length-1;
		 * while(start<end) { if(nums[start]+nums[end]==target ){ return new int[]
		 * {start,end}; } else if(nums[start]+nums[end]>target) { end--; } else
		 * if(nums[start]+nums[end]<target) { start++; } } return new int[] {-1,-1};
		 */
		
		//two pointers reverse
		
//		int [] nums= {0,1,0,3,12};
//		int startind=0;
//		int endind=startind+1;
//		
//		while(startind<nums.length && endind<nums.length) {
//			if(nums[startind]==0 ) {
//				if(nums[endind]!=0) {
//				int temp=nums[endind];
//				nums[endind]=nums[startind];
//				nums[startind]=temp;
//			}else {
//				endind++;
//			}
//			}else {
//				startind++;
//				endind++;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
		
		char ch='h';
		char ch1='j';
		
		if(ch>ch1) {
			System.out.println(ch);
		}else {
			System.out.println(ch1);
		}
	}
}
