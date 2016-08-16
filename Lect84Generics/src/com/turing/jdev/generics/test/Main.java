package com.turing.jdev.generics.test;

import sun.security.provider.PolicyParser.GrantEntry;

import com.turing.jdev.generics.impl.BaseballPlayer;
import com.turing.jdev.generics.impl.FootballPlayer;
import com.turing.jdev.generics.impl.SoccerPlayer;
import com.turing.jdev.generics.league.League;
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
		
		Team<SoccerPlayer> bayern = new Team<SoccerPlayer>("Bayern Munschen");
		bayern.addPlaye(pkluivert);
		
		Team<FootballPlayer> steelers = new Team<FootballPlayer>("Pitsburg Steelers");
		FootballPlayer abrown = new FootballPlayer("Antonio Brown");
		steelers.addPlaye(abrown);
		
		Team<FootballPlayer> jets = new Team<FootballPlayer>("New York Jets");
		FootballPlayer bmarshal = new FootballPlayer("Brandon Marshall");
		jets.addPlaye(bmarshal);
		
		Team<FootballPlayer> france = new Team<FootballPlayer>("France");
		Team<FootballPlayer> england = new Team<FootballPlayer>("England");
		
		france.matchResult(england, 10, 2);
		france.matchResult(steelers, 10, 8);
		
		giants.matchResult(france, 5, 5);
		// giants.matchResult(industriales, 10, 10);
		
		System.out.println("France ranking : " + france.ranking());
		System.out.println(france.compareTo(england));				// using compareTo()
		
		// NOTE : in the end the most helpful is using Collections.sort() once the classes have implemented Comparable
		
		League<Team<FootballPlayer>> nfl = new League<Team<FootballPlayer>>("NFL");
		nfl.add(giants);
		nfl.add(france);
		nfl.add(england);
		
		nfl.showLeagueTable();
		
	}
}
