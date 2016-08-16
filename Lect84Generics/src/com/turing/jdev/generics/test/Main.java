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
		
		Team<FootballPlayer> giants = new Team<FootballPlayer>("New York Giants");
		// we'll get a compilation time error if we try to add something that is not a football player to the team
		/*giants.addPlaye(pkluivert);
		giants.addPlaye(kgriffey);*/
		giants.addPlaye(jrice);
		
		System.out.println(giants.getPlayersCount());
		
		Team<BaseballPlayer> industriales = new Team<BaseballPlayer>("Industriales");
		industriales.addPlaye(kgriffey);
		
		// nevertheless nothing forbid us from doing this
		// Team<String> falseTeam = new Team<String>("False team");
		// which will cause an error at runtime
		
		
		
		
	}
}
