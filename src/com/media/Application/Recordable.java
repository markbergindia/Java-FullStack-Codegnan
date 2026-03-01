package com.media.Application;

public interface Recordable {
	void startRecording();
	void stopRecording();
	void saveRecording(String filename);
	boolean isRecording();
	

}
