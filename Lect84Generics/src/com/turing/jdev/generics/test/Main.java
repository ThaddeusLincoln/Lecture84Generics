package com.turing.jdev.generics.test;

import java.util.ArrayList;

import com.turing.jdev.generics.impl.BaseballPlayer;
import com.turing.jdev.generics.impl.FootballPlayer;
import com.turing.jdev.generics.impl.SoccerPlayer;
import com.turing.jdev.generics.team.Team;

public class Main {

	public static void main(String[] args){
		
		FootballPlayer jrice = new FootballPlayer("Jerry Rice");
		BaseballPlayer kgriffey = new BaseballPlayer("Ken Griffey Jr.");
		SoccerPlayer pkluivert = new SoccerPlayer("Patrick Kluivert");
		
		Team giants = new Team("New York Giants");
		giants.addPlaye(pkluivert);
		giants.addPlaye(kgriffey);
		giants.addPlaye(jrice);
		
		System.out.println(giants.getPlayersCount());
		
		
	}
}
