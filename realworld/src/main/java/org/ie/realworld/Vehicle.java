package org.ie.realworld;

public class Vehicle {
   private String name;
   private String engine;
   private int mileage;
   private String vehicleNumber;
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEngine() {
	return engine;
}
public void setEngine(String engine) {
	this.engine = engine;
}
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
   public void start() {}
   public void stop() {}
   public void move() {}
   public void applyBreak() {}
   
   
}
