package Client;

import java.util.HashSet;

import CCOEW.Address;
import CCOEW.Coach;
import CCOEW.Game;
import CCOEW.HockeyLeague;
import CCOEW.Location;
import CCOEW.Player;
import CCOEW.Position;
import CCOEW.Team;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Address 
		Address add1 = new Address();
		add1.setBuildignNo(2);
		add1.setBuildingName("Aditya Garden");
		add1.setStreetName("Pune");
		add1.setPincode(411058);
		
		Address add2 = new Address();
		add2.setBuildignNo(3);
		add2.setBuildingName("Dipti Apartment");
		add2.setStreetName("Pune");
		add2.setPincode(411058);
		
		Address add3 = new Address();
		add3.setBuildignNo(3);
		add3.setBuildingName("Dipti Apartment");
		add3.setStreetName("Pune");
		add3.setPincode(411058);
		
		//Player
		Player player1=new Player( );
		player1.setNumber(1);
		player1.setPosition(Position.goalie);
		player1.setName("A");
		player1.setAddress(add1);
		
		Player player2=new Player( );
		player2.setNumber(2);
		player2.setPosition(Position.fullbacks);
		player2.setName("B");
		player2.setAddress(add2);
		
		Player player3=new Player();
		player3.setNumber(3);
		player3.setName("C");
		player3.setPosition(Position.fullbacks);
		player3.setAddress(add3);
		
		Player player4=new Player();
		player4.setPosition(Position.goalkeeper);
		player4.setNumber(4);
		player4.setName("D");
		player4.setAddress(add2);
		
		Player player5=new Player();
		player5.setNumber(5);
		player5.setName("E");
		player5.setPosition(Position.fullbacks);
		player5.setAddress(add1);
		
		Player player6=new Player();
		player6.setNumber(6);
		player6.setName("F");
		player6.setPosition(Position.goalie);
		player6.setAddress(add3);
			
		//Player Set
		HashSet<Player>setOfPlayer = new HashSet<Player>();
		setOfPlayer.add(player1);
		setOfPlayer.add(player2);
		setOfPlayer.add(player3);
		
		HashSet<Player>setOfPlayer2 = new HashSet<Player>();
		setOfPlayer2.add(player4);
		setOfPlayer2.add(player5);
		setOfPlayer2.add(player6);
		
		HashSet<Player>setOfPlayer3 = new HashSet<Player>();
		setOfPlayer3.add(player4);
		setOfPlayer3.add(player1);
		setOfPlayer3.add(player5);
		
		HashSet<Player>setOfPlayer4 = new HashSet<Player>();
		setOfPlayer4.add(player6);
		setOfPlayer4.add(player3);
		setOfPlayer4.add(player2);
		
		
		//Coach 
		Coach coach1 = new Coach();
		coach1.setName("VINITA");
		coach1.setAddress(add3);
		coach1.setLevel_of_accredition(10);
		coach1.setNo_of_experience(10);
		
		Coach coach2 = new Coach();
		coach2.setName("RUJUTA");
		coach2.setAddress(add1);
		coach2.setLevel_of_accredition(8);
		coach2.setNo_of_experience(15);
		
		Coach coach3 = new Coach();
		coach3.setName("SAYALI");
		coach3.setAddress(add2);
		coach3.setLevel_of_accredition(5);
		coach3.setNo_of_experience(3);
		
		Coach coach4 = new Coach();
		coach4.setName("AKSHITA");
		coach4.setAddress(add1);
		coach4.setLevel_of_accredition(1);
		coach4.setNo_of_experience(0);
		
		//Team
		Team team1 = new Team("team1", "RUJUTA",setOfPlayer,coach1);
		Team team2 = new Team("team2", "VINITA",setOfPlayer2,coach2);
		Team team3 = new Team("team3","SAYALI",setOfPlayer3,coach3);
		Team team4 = new Team("team4","AKSHITA",setOfPlayer4,coach4);
		
		System.out.println("Teams : ");
		team1.display();
		System.out.println("");
		team2.display();
		System.out.println("");
		team3.display();
		System.out.println("");
		team4.display();
		System.out.println(" ");
		
		//Hockey League
		System.out.println("Hockey League");
		HockeyLeague hk = new HockeyLeague(team1,team2,team3,team4);
		hk.display();
		System.out.println(" ");
		System.out.println(" ");
		
		//Game = 1 ; Team 1 && Team 2
		System.out.println("Game 1");
		Game game1 = new Game(100,Location.MUMBAI, team1, team2);
		game1.display();
		System.out.println("");
		System.out.println(" ");
		
		//Game = 2 ; Team 3 && Team 4
		System.out.println("Game 2");
		Game game2 = new Game(150,Location.PUNE, team3, team4);
		game2.display();			

	}

}