package com.zookeeper;

public class Bat extends Mamal {
	public Bat() {
		this.energyLevel=300;
	}
	  public void fly() {
	    	energyLevel -= 50;
	        System.out.println("The bat is airbone!");
	    }

	    public void eatHumans() {
	    	energyLevel += 25;
	        System.out.println("The bat is satisfied  after devouring a human!");
	    }

	    
	    public void attackTown(){
	    	energyLevel -= 100;
	        System.out.println("The bat attack a town!");
	    }
	

}
