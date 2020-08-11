package com.simplilearn.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SongListFecthOption {

	public static void main(String[] args) {
		
		Song track1 = new Song(001, "Shape Of You", "Ed Sheeran", "Same As Singer");
		Song track2 = new Song(002, "Maroon Sugar", "Maroon 5", "Same As Singer");
		Song track3 = new Song(003, "Closer", "The Chain Smokers", "Same As Singer");
		Song track4 = new Song(004, "Blank Space", "Talylor Swift", "Same As Singer");
		Song track5 = new Song(005, "Despacito", "Luis Fonsi", "Same as Singeer");
		
		//create employee list
		List<Song> songList = new LinkedList<Song>();
		
		//add employee object to list
		songList.add(track1);
		songList.add(track2);		
		songList.add(track3);
		songList.add(track4);
		songList.add(track5);
		
		for(Song mp3 : songList) {
			System.out.println("-------------------------");
			System.out.println("Track Id "+mp3.getTrackNo());
			System.out.println("Song Name"+mp3.getSongName());
			System.out.println("Singer "+mp3.getSinger());
			System.out.println("Writer "+mp3.getWriter());
			
			}
		
		System.out.println("-------------------------");
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Track No :");
		int id = input.nextInt();
		
		for(Song mp3 :songList ) {
			if(mp3.getTrackNo()==id) {
				System.out.println("Song Name : "+mp3.getSongName() 
				+" >> this Song is Sung By "+mp3.getSinger()+"  ^_^");
	
	}

		}
	}
}


