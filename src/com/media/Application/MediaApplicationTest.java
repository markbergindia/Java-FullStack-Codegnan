package com.media.Application;

public class MediaApplicationTest 
{
	    public static void main(String[] args) {

	        VoiceRecorder player = new VoiceRecorder("Shape of You");
	        VoiceRecorder recorder = new VoiceRecorder("Voice Note");

	        MediaController controller = new MediaController();

	        System.out.println("---- Testing AudioPlayer ----");
	        controller.controlPlayback(player);

	        System.out.println("\n---- Testing VoiceRecorder Playback ----");
	        controller.controlPlayback(recorder);

	        System.out.println("\n---- Testing VoiceRecorder Recording ----");
	        controller.controlRecording(recorder, 10);

	        // Polymorphism
	        System.out.println("\n---- Polymorphism Example ----");
	        Playable ref = new VoiceRecorder("Interview Recording");
	        ref.play();  
	    }
}