package com.zookeeper;

public class Mamal {
	protected int energyLevel;
	
public Mamal() {
	this.energyLevel=100;
	
}

public int getEnergyLevel() {
	return energyLevel;
}

public void setEnergyLevel(int energyLevel) {
	this.energyLevel = energyLevel;
}
public int displayEnergy() {
	System.out.println("energy level:" + energyLevel);
	return energyLevel;
}
}
