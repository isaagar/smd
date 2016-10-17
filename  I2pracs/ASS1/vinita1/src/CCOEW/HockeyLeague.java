package CCOEW;
import java.util.ArrayList;

public class HockeyLeague {

	private ArrayList<Team> Hsetofteams ;
	
	public HockeyLeague(Team t1,Team t2,Team t3,Team t4){
		super();
		 Hsetofteams = new ArrayList<Team>();
		 Hsetofteams.add(t1);
		 Hsetofteams.add(t2);
		 Hsetofteams.add(t3);
		 Hsetofteams.add(t4);
	}

	@Override
	public String toString() {
		return "HockeyLeague []";
	}	
	
	public void display(){
		System.out.println("Teams in Hockey League :");
		for(Team t : Hsetofteams){
			System.out.println(t);
		}
	}
}