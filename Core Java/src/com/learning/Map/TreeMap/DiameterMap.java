package com.learning.Map.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DiameterMap {
	public static void main(String args[]) {
		String names[] = { "Mercury", "Venus", "Earth", "Mars", "Jupiter",
				"Saturn", "Uranus", "Neptune", "Pluto" };
		float diameters[] = { 4800f, 12103.6f, 12756.3f, 6794f, 142984f,
				120536f, 51118f, 49532f, 2274f };
		Map map = new TreeMap();
		for (int i = 0, n = names.length; i < n; i++) {
			map.put(names[i], diameters[i]);
		}
		Iterator it = map.keySet().iterator();
		Object obj;
		while (it.hasNext()) {
			obj = it.next();
			System.out.println(obj + ": " + map.get(obj));
		}
	}

}
