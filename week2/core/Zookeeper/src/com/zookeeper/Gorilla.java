package com.zookeeper;

public class Gorilla extends Mamal {

 
    public void throwSomething() {
    	energyLevel -= 5;
        System.out.println("The gorilla has thrown something!");
    }

    public void eatBananas() {
    	energyLevel += 10;
        System.out.println("The gorilla is satisfied after eating bananas!");
    }

    
    public void climb() {
    	energyLevel -= 10;
        System.out.println("The gorilla has climbed a tree!");
    }
}

