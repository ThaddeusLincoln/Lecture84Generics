package com.turing.jdev.generics;

public abstract class Player {

	private String name;

	// CONSTURCTOR
	public Player(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
