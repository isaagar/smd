package CCOEW;

import java.util.HashSet;

public class Team {
	
	private String record;	
	private String name;
	private HashSet<Player>playerSet ;
	private Coach coach ;

	public Team(String name, String record,HashSet<Player>playerSet,Coach coach) {
		super();
		this.name = name;
		this.record = record;
		this.playerSet = playerSet ;
		this.coach = coach;
	}
	
	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashSet<Player> getPlayerSet() {
		return playerSet;
	}

	public void setPlayerSet(HashSet<Player> playerSet) {
		this.playerSet = playerSet;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}
	@Override
	public String toString() {
		return "Name= "+name+", Record= " + record ;
		
	}

	public void display() {
		//System.out.println(getName());
		//System.out.println(getRecord());
		System.out.println("Name : "+name);
		System.out.println("Record : "+record);
		System.out.println("Coach : "+coach);
	}
}