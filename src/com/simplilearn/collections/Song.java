
package com.simplilearn.collections;

//encapsulated class
public class Song {
	
	private int trackNo;
	private String songName;
	private String singer;
	private String Writer;
{
		// TODO Auto-generated constructor stub
	}
	public int getTrackNo() {
		return trackNo;
	}
	public void setTrackNo(int trackNo) {
		this.trackNo = trackNo;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public Song(int trackNo, String songName, String singer, String writer) {
		super();
		this.trackNo = trackNo;
		this.songName = songName;
		this.singer = singer;
		this.Writer = writer;
	}
	
	public Song() {}
		
	
}
