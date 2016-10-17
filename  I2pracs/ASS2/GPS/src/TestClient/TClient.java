package TestClient;



import BusinessLogic.*;
import java.util.ArrayList;
public class TClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		TrackRoute tr=new TrackRoute("Track Route1");
		
	
		
		TrackPoint point1 = new TrackPoint(100,100,100,100);
		TrackPoint point2 = new TrackPoint(150,150,150,150);
		TrackPoint point3 = new TrackPoint(200,200,200,200);
		TrackPoint point4 = new TrackPoint(300,300,300,1000);
		
		 ArrayList<TrackPoint> points = new ArrayList<TrackPoint>();
		 points.add(point1);
		 points.add(point2);
		 points.add(point3);
		 points.add(point4);
		 
		 TrackRoute trackroute = new TrackRoute("Karve Road",points);
		 Screen sc = new Screen();
		 GPS gps =new GPS(trackroute,sc);
			gps.StartRecording();
		System.out.println(trackroute.getName());
		// trackroute.calTotalDistance();
		 //trackroute.calAvgVelocity();
		gps.TotalLength();
		 gps.AvgVelocity();
			gps.StopRecording();
		 
		
		
		//System.out.println(point1.getX());
		

	}

}