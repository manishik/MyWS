package com.learning.assorted;

import java.util.ArrayList;
import java.util.List;

public class Ques04 {
	public static void main(String[] args) {
		List<? extends Instrument> allInstruments = new ArrayList<Instrument>();
		// -->X
		// allInstruments.add(new Guitar()); //compiler error
		// allInstruments.add(new Violin()); //compiler error
		
		List<? extends Instrument1> allInstruments1 = new ArrayList<Instrument1>();
		//allInstruments1.add(new Guitar1()); //compiler error
		//allInstruments1.add(new Violin1()); //compiler error

	}
}

interface Instrument {
	public void play();
}

class Guitar implements Instrument {
	public void play() {
		System.out.println("Playing Guitar.");
	}
}

class Violin implements Instrument {
	public void play() {
		System.out.println("Playing Violin.");
	}
}

class Instrument1 {
	public void play(){
		System.out.println("Playing Instument1");	
	}
}

class Guitar1 extends Instrument1 {
	public void play() {
		System.out.println("Playing Guitar.");
	}
}

class Violin1 extends Instrument1 {
	public void play() {
		System.out.println("Playing Violin.");
	}
}
