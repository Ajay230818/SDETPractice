package mandatoryHomeWork.foundation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class Class_30082023_countitemsMtachingRule {
	
	@Test
	public void test1() {
		List<List<String>> items = new ArrayList<>();
		items.add(0, Arrays.asList("phone", "blue", "pixel"));
		items.add(1, Arrays.asList("computer", "silver", "lenovo"));
		items.add(2, Arrays.asList("phone", "gold", "iphone"));
		Assert.assertEquals(1, countmatchrule(items, "color", "silver"));
	}
	
	@Test
	public void test2() {
		List<List<String>> items = new ArrayList<>();
		items.add(0, Arrays.asList("phone", "blue", "pixel"));
		items.add(1, Arrays.asList("computer", "silver", "lenovo"));
		items.add(2, Arrays.asList("phone", "gold", "iphone"));
		Assert.assertEquals(2, countmatchrule(items, "type", "phone"));
	}
	
	@Test
	public void test3() {
		List<List<String>> items = new ArrayList<>();
		items.add(0, Arrays.asList("phone", "blue", "pixel"));
		items.add(1, Arrays.asList("computer", "silver", "lenovo"));
		items.add(2, Arrays.asList("phone", "gold", "iphone"));
		Assert.assertEquals(1, countmatchrule(items, "name", "lenovo"));
	}

	public static int countmatchrule(List<List<String>> items,String ruleKey,String ruleValue) {
		int count = 0;
		int rule =0;
		switch (ruleKey) {
		// Case statements
		case "type":
			rule = 0;
			break;
		case "color":
			rule = 1;
			break;
		case "name":
			rule = 2;
		}

		for (int i = 0; i < items.size(); i++) {
			for (int j = 0; j < items.get(i).size(); j++) {
				if (items.get(i).get(rule) == ruleValue && i==j) {
					count++;
				}
			}
		}
		return count;
    }
	}

