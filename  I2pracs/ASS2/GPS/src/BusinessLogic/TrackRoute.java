package BusinessLogic;

import java.util.ArrayList;

public class TrackRoute 
{
	public String name;
	public double TotalDistance;
	public double AvgVelocity;
	private ArrayList<TrackPoint> trackpoints;
	
	int i = 0 ;
	
	public TrackRoute(String name, ArrayList<TrackPoint> points) {
		super();
		this.name = name;
		this.trackpoints = points; 
	}
	
	

	public TrackRoute() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalDistance() {
		return TotalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		TotalDistance = totalDistance;
	}

	public double getAvgVelocity() {
		return AvgVelocity;
	}

	public void setAvgVelocity(double avgVelocity) {
		AvgVelocity = avgVelocity;
	}

	public ArrayList<TrackPoint> getTrackpoints() {
		return trackpoints;
	}

	public void setTrackpoints(ArrayList<TrackPoint> trackpoints) {
		this.trackpoints = trackpoints;
	}
	
	public void calTotalDistance()
	{
		for (int i = 1; i < trackpoints.size(); i++) {

		   double tempFirst = trackpoints.get(i-1).getX();
		   double tempSecond = trackpoints.get((i)).getX();
		   double tempYFirst = trackpoints.get(i-1).getY();
		   double tempYSecond = trackpoints.get((i)).getY();
		   double tempZFirst = trackpoints.get(i-1).getZ();
		   double tempZSecond = trackpoints.get((i)).getZ();

		  double  xValue = tempFirst - tempSecond;
		   double yValue = tempYFirst - tempYSecond;
		   double zValue = tempZFirst - tempZSecond;

		   double tempX2 = Math.pow(xValue, 2);
		   double tempY2 = Math.pow(yValue, 2);
		   double tempZ2 = Math.pow(zValue, 2);

		   TotalDistance += Math.sqrt((tempX2 + tempY2 +tempZ2));

		   
		 }
		 //System.out.println("Total Length = "+TotalDistance);
		
	}
	
	public void calAvgVelocity()
	{
		for (int i = 1; i < trackpoints.size(); i++)
		{			
			double t1 = trackpoints.get(i).getTime();
			if(i+1 >= trackpoints.size())
			{
				//System.out.println(t1);
				AvgVelocity= TotalDistance/t1;
				//System.out.println("avrage velocity ="+AvgVelocity);
			}
			
		}
		
		
	}
	
	
	
	

}