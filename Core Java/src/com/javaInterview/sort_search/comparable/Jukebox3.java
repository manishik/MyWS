package com.javaInterview.sort_search.comparable;

import java.util.*;
import java.io.*;

public class Jukebox3 {
	
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new Jukebox3().go();
	}

	public void go() {
		getSongs();
		System.out.println("Song Name List = "+songList);
		Collections.sort(songList);
		System.out.println("Sorted Song Name List = "+songList);
	}

	void getSongs (){
		try {
			File file = new File("c:\\Professional Life\\WorkSpace\\Learning WS\\Core Java\\src\\com\\javaInterview\\sort_search\\comparable\\SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line= reader.readLine())!= null) {
				addSong(line);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
