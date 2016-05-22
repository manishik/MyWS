package com.learning.Map.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		SortTreeMapByValue cmp = new SortTreeMapByValue();
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("C", 10);
		treeMap.put("B", 20);
		treeMap.put("A", 5);
		
		System.out.println("TreeMap = "+treeMap);

		/*for (Map.Entry<String, Integer> pair : map.entrySet()) {
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}*/
	}
}

class SortTreeMapByValue implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

/*class SortTreeMapByValue implements Comparator<Map.Entry<String, Integer>> {
	public int compare(Map.Entry<String, Integer> e1,
			Map.Entry<String, Integer> e2) {
		if (e1.getValue() < e2.getValue()) {
			return 1;
		} else if (e1.getValue() == e2.getValue()) {
			return 0;
		} else {
			return -1;
		}
	}
}*/