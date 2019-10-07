package org.ie.realworld;

public class Door {
	private String material;
	private double height;
	private double width;
	private double thickNess;
	private String typeOfLocking;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getThickNess() {
		return thickNess;
	}
	public void setThickNess(double thickNess) {
		this.thickNess = thickNess;
	}
	public String getTypeOfLocking() {
		return typeOfLocking;
	}
	public void setTypeOfLocking(String typeOfLocking) {
		this.typeOfLocking = typeOfLocking;
	}
   public void openDoor() {}
   public void closeDoor() {}
   public void lockTheDoor() {}
   public void openLock() {}
	
}
