package com.learning.Map.Hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class PlanetDiameters {
	public static void main(String args[]) {
		String names[] = { "Mercury", "Venus", "Earth", "Mars", "Jupiter",
				"Saturn", "Uranus", "Neptune", "Pluto" };
		float diameters[] = { 4800f, 12103.6f, 12756.3f, 6794f, 142984f,
				120536f, 51118f, 49532f, 2274f };
		Hashtable hash = new Hashtable();
		for (int i = 0, n = names.length; i < n; i++) {
			hash.put(names[i], new Float(diameters[i]));
		}
		Enumeration e = hash.keys();
		Object obj = new Object();
		while (e.hasMoreElements()) {
			obj = e.nextElement();
			System.out.println(obj + ": " + hash.get(obj));
		}
	}
}
