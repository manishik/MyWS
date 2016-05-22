package com.scjp.chap3;

class TestNested {
	public static void main(String[] args) {
		String ext = "From external class";
		MyTopLevel1 mt = new MyTopLevel1();
		mt.createNested();
		MyTopLevel1.MyInner inner = mt.new MyInner();
		inner.accessInner(ext);
	}
}

class MyTopLevel1 {
	private String top = "From Top level class";
	MyInner minn = new MyInner();

	public void createNested() {
		minn.accessInner(top);
	}

	class MyInner {
		public void accessInner(String st) {
			System.out.println(st);
		}
	}
}