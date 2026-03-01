package com.media.Application;

public class VoiceRecorder implements Playable 
{
	    private String recordingName;
	    private int duration;
	    private String playStatus;
	    private boolean recording;
	    private int recordedDuration;

	    public VoiceRecorder(String recordingName) {
	        this.recordingName = recordingName;
	        this.playStatus = "STOPPED";
	        this.recording = false;
	        this.recordedDuration = 0;
	    }

	    
	    public void addRecordingTime(int seconds) {
	        if (recording) {
	            recordedDuration += seconds;
	            duration = recordedDuration;
	            System.out.println("Recording... Total Duration: " + recordedDuration + " seconds");
	        } else {
	            System.out.println("Start recording first!");
	        }
	    }

	    
	    public void play() {
	        if (recordedDuration > 0) {
	            playStatus = "PLAYING";
	            System.out.println("Playing recording: " + recordingName);
	        } else {
	            System.out.println("No recording available.");
	        }
	    }

	    public void pause() {
	        playStatus = "PAUSED";
	        System.out.println("Playback paused.");
	    }

	    public void stop() {
	        playStatus = "STOPPED";
	        System.out.println("Playback stopped.");
	    }

	    public int getDuration() {
	        return duration;
	    }

	    public void startRecording() {
	        recording = true;
	        recordedDuration = 0;
	        System.out.println("Recording started...");
	    }

	    public void stopRecording() {
	        recording = false;
	        System.out.println("Recording stopped.");
	    }

	    public void saveRecording(String filename) {
	        if (recordedDuration > 0) {
	            System.out.println("Recording saved as: " + filename);
	        } else {
	            System.out.println("No recording to save.");
	        }
	    }

	    public boolean isRecording() {
	        return recording;
	    }
	}
