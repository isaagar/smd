package CCOEW;

public class Coach extends People{
	
	private int level_of_accredition ;
	private int no_of_experience ;
	
	public int getLevel_of_accredition() {
		return level_of_accredition;
	}
	public void setLevel_of_accredition(int level_of_accredition) {
		this.level_of_accredition = level_of_accredition;
	}
	public int getNo_of_experience() {
		return no_of_experience;
	}
	public void setNo_of_experience(int no_of_experience) {
		this.no_of_experience = no_of_experience;
	}
	@Override
	public String toString() {
		return "[level_of_accredition=" + level_of_accredition
				+ ", no_of_experience=" + no_of_experience + "]";
	}
	
}
