package com.turing.jdev.generics.league;

import java.util.ArrayList;

import java.util.Collections;

import com.turing.jdev.generics.team.Team;

public class League<T extends Team> {
	private String name;

	private ArrayList<T> league = new ArrayList<T>();
	
	// CONSTRUCTOR
	public League(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean add(T team){
		if(league.contains(team)){
			return false;
		}
		
		league.add(team);
		return true;
	}
	
	public void showLeagueTable(){
		Collections.sort(league); 	// here obtaining the benefit of Team implement Comparable
		
		// now that the list is sorted we only need to show it
		for(T currentTeam : league){
			System.out.println(currentTeam.getName() + " : " + currentTeam.ranking());
		}
	}
	

}
