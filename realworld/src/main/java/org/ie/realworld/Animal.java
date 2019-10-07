package org.ie.realworld;

public class Animal {
    private String name;
	private  int legs;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 public void run() {}
	 public void jump() {}
	 public void hunt() {}
	
}
