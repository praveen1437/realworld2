package org.ie.realworld;

public class Phone {
    private String companyName;
    private String modelName;
    private double price;
    private int BatteryPower;
    private String ram;
    private String memory;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBatteryPower() {
		return BatteryPower;
	}
	public void setBatteryPower(int batteryPower) {
		BatteryPower = batteryPower;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
    
	public void unBoxing() {}
    public void switchOn() {}
    public void switchOff() {}
    public void sendMessage() {}
    public void playMusic() {}
}
