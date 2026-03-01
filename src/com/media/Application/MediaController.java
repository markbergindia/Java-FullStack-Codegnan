package com.media.Application;

public class MediaController {
	    public void controlPlayback(VoiceRecorder recorder) {
	        recorder.play();
	        System.out.println("Duration: " + recorder.getDuration() + " seconds");
	        recorder.pause();
	        recorder.stop();
	    }

	    public void controlRecording(VoiceRecorder recorder, int seconds) {
	        recorder.startRecording();

	        if (recorder instanceof VoiceRecorder) {
	            ((VoiceRecorder) recorder).addRecordingTime(seconds);
	        }

	        recorder.stopRecording();
	        recorder.saveRecording("my_recording.wav");
	    }
	}