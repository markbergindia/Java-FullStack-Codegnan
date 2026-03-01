package com.media.Application;

public class AudioPlayer implements Playable{
	private String songName;
	private int duration;
	private String status;
	
	public AudioPlayer(String songName, int duration) {
		this.songName = songName;
		this.duration = duration;
		this.status = "STOPPED";
	}
	

	public void play() {
		status = "PLAYING";
		System.out.println("Playing Song: + songName");
	}

	public void pause() {
		if (status.equals("PLAYING")) {
			status = "PAUSED";
			System.out.println("Song Paused");
		}
	}

	public void stop() {
		status = "STOPPED";
		System.out.println("Song Stopped.");
	}

	public int getDuration() {	
		return duration;
	}
}
