package com.learning.statics;

public class PlayerTestDrive {
	
	public static void main(String[] args) {
		
		System.out.println(Player.playerCount);
		
		Player one = new Player("Tiger Woods");
		System.out.println(Player.playerCount);
		
		Player two = new Player("Nadal");
		System.out.println(Player.playerCount);
		
		two.play();
		go();
	}
	
	static public void go(){
		System.out.println("Hey it's done");
	}

}


class Player{
	static int playerCount;
	int count;
	public String name;
	Player(String n){
		name = n;
		playerCount++;
		count++;
	}
	
	public void play(){
		System.out.println("Player:play()");
		System.out.println("playercount = "+playerCount);
		Player three = new Player("Manish");
		Player four = new Player("Sandesh");
		Player five = new Player("Kiran");
		System.out.println("count = "+five.count);
	}
}