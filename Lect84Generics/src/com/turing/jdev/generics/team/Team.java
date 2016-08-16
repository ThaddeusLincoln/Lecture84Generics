package com.turing.jdev.generics.team;

import java.util.ArrayList;

import com.turing.jdev.generics.Player;

public class Team {
	
	private String name;
	
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<Player> member = new ArrayList<Player>();
	
	// CONSTRUCTOR
	public Team(String name){
		this.name = name;
	}
	
	public boolean addPlaye(Player player){
		if(member.contains(player)){
			System.out.println(player.getName() + " is already in the team");
			return false;
		}else{
			member.add(player);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
	}
	
	public int getPlayersCount(){
		return this.member.size();
	}
	
	// keeps track of every match results, for the current team and also for the opponent
	public void matchResult(Team opponent, int ourScore, int theirScore){
		if(ourScore > theirScore){
			won++;
		}else if(ourScore == theirScore){
			tied++;
		}else{
			lost++;
		}
		
		if(opponent != null){
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	// simple ranking system
	public int ranking(){
		return (won*2) + tied;
	}

}
