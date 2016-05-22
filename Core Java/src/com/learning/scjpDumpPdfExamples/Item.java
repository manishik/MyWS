package com.learning.scjpDumpPdfExamples;

public class Item {

	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String d) {
		desc = d;
	}

	public static void modifyDesc(Item item, String str) {
		item = new Item();
		item.setDesc(str);
	}

	public static void main(String[] args) {
		Item it = new Item();
		it.setDesc("Gobstopper");

		Item it2 = new Item();
		it2.setDesc("FizzingLifting");

		modifyDesc(it, "Scrum");

		System.out.println(it.getDesc());
		System.out.println(it2.getDesc());
	}

}
