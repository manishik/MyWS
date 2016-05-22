package com.learning.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CopyOneMapToAnother {

	Map<String, Animal> srcMap = new HashMap<String, Animal>();
	Map<String, Animal> destMap = null;

	public static void main(String[] args) {
		CopyOneMapToAnother another = new CopyOneMapToAnother();
		another.createMaps();
	}

	void createMaps() {
		srcMap.put("Animal 1", new Doggie());
		srcMap.put("Animal 2", new Doggie());
		srcMap.put("Animal 3", new Cattie());
		srcMap.put("Animal 4", new Cattie());
		Map<String, Animal> map = copyMap(srcMap);
	}

	public Map<String, Animal> copyMap(Map<String, Animal> mp) {

		/*if (mp != null) {
			for (Iterator<String> iterator = mp.keySet().iterator(); iterator
					.hasNext();) {
				String key = iterator.next();
				Animal value = mp.get(key);
				destMap.put(key, value);
			}
		}*/

		if (mp != null) {
			destMap = new HashMap<String, Animal>();
			destMap.putAll(mp);
		}
		return destMap;
	}

}

interface Animal {
	void eat();
}

class Doggie implements Animal {
	private String name = "Max";

	public void eat() {
		System.out.println("Doggie eating");
	}

	public String toString() {
		return name;
	}
}

class Cattie implements Animal {
	private String name = "Tom";

	public void eat() {
		System.out.println("Cattie eating");
	}

	public String toString() {
		return name;
	}
}