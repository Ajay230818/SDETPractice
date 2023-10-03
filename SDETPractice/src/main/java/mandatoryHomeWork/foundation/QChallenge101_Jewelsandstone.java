package mandatoryHomeWork.foundation;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class QChallenge101_Jewelsandstone {
	
	@Test
	public void test1() {
		Assert.assertEquals(3, mapjewelandstone("aA", "aAAbbbb"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(0, mapjewelandstone("z", "ZZ"));
	}

	public  int mapjewelandstone(String jewels,String stones) {

		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < jewels.length(); i++) {
			map.put(jewels.charAt(i), 0);
		}

		System.out.println(map);

		for (int i = 0; i < stones.length(); i++) {
			if (map.containsKey(stones.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
