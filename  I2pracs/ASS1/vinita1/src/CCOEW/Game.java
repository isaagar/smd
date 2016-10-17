package CCOEW;
import java.util.ArrayList;

public class Game {
private int score ;
private Location location ; //should use Enum
private ArrayList<Team>setofteams ;

/*public Game(int score, String location) {
	super();
	this.score = score;
	this.location = location;
}
*/
public Game (int score, Location location,Team t1,Team t2){
	super();
	this.score = score;
	this.location = location; 
	// set of team will depicted by using ArrayList 
	 setofteams = new ArrayList<Team>();
	 setofteams.add(t1);
	 setofteams.add(t2);
	
}
public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public Location getLocation() {
	return location;
}

public void setLocation(Location location) {
	this.location = location;
}

@Override
public String toString() {
	return "Game [score=" + score + ", location=" + location + "]";
}

public void display() {
	System.out.println("Location : " + location + "\tScore : " + score);
	System.out.println("Teams : ");
	for(Team t:setofteams){
		System.out.println(t.getName());
		System.out.println(t.getRecord());
		System.out.println(t.getPlayerSet());
	}
		System.out.println("Score : " + score);
 }

}