package BusinessLogic;

//import java.util.ArrayList;

public class GPS {
	
	TrackRoute tracks ;
	Screen sc;
	
	
	public GPS(TrackRoute tracks, Screen sc) {
		super();
		this.tracks = tracks;
		this.sc = sc;
	}
	//sc.StopRecording();
	public void StartRecording()
	{
		
		sc.displayMessage("Start Recording");
	}
	public void StopRecording()
	{
		
		sc.displayMessage("Stop Recording");
	}
	
	public void AvgVelocity()
	{
		tracks.calAvgVelocity();
		sc.displayMessage("Avarage Velocity : " +tracks.getAvgVelocity());
		
	}
	
	public void TotalLength()
	{
		tracks.calTotalDistance();
		sc.displayMessage("Total Length : " +tracks.getTotalDistance());
		
	}
	
	
}