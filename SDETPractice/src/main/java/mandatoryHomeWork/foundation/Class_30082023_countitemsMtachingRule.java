package mandatoryHomeWork.foundation;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Class_30082023_countitemsMtachingRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> items = new ArrayList<>();
        items.add(0, Arrays.asList("phone","blue","pixel"));
        items.add(1, Arrays.asList("computer","silver","lenovo"));
        items.add(2, Arrays.asList("phone","gold","iphone"));
        
       System.out.println(items);
       for (int i = 0; i < items.size(); i++) {
		//System.out.println(items[i]);
	}
	}

}
