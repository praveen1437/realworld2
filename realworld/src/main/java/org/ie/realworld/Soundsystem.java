package org.ie.realworld;

public class Soundsystem {
   private String name;
   private String maxSound;
   private String color;
   private int noOfSpeakers;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMaxSound() {
	return maxSound;
}
public void setMaxSound(String maxSound) {
	this.maxSound = maxSound;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getNoOfSpeakers() {
	return noOfSpeakers;
}
public void setNoOfSpeakers(int noOfSpeakers) {
	this.noOfSpeakers = noOfSpeakers;
}
   
   public void turnOn() {}
   public void playMusic() {}
   public void stopMusic() {}
   public void turnoff() {}
   public void playRadio() {}
}
