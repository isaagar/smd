	Automatic:

	package ccoew.it.i1.businesslogic;

	public class Automatic extends Bus{
	
		private int tvm;

		public Automatic(String reg_no, int driver_no,int tvm) {
			super(reg_no, driver_no);
			this.tvm=tvm;
		}

		public int getTvm() {
			return tvm;
		}

		public void setTvm(int tvm) {
			this.tvm = tvm;
		}
	}

	.........................................................................................
	Bus:

	package ccoew.it.i1.businesslogic;

	public class Bus {
	
		private String Reg_no;
		private int Driver_no;
	
		public String getReg_no() {
			return Reg_no;
		}
		public void setReg_no(String reg_no) {
			Reg_no = reg_no;
		}
		public int getDriver_no() {
			return Driver_no;
		}
		public void setDriver_no(int driver_no) {
			Driver_no = driver_no;
		}
		public Bus(String reg_no, int driver_no) {
			super();
			Reg_no = reg_no;
			Driver_no = driver_no;
		}
	}

	.........................................................................................
	Manual:

	package ccoew.it.i1.businesslogic;

	public class Manual extends Bus{
		int Conductor_no;

		public Manual(String reg_no, int driver_no,int Conductor_no) 
		{
			super(reg_no, driver_no);
			this.Conductor_no=Conductor_no;
		}

		public int getConductor_no() {
			return Conductor_no;
		}

		public void setConductor_no(int conductor_no) {
			Conductor_no = conductor_no;
		}
	}

	.........................................................................................
	Route:

	package ccoew.it.i1.businesslogic;

	import java.util.ArrayList;

	public class Route {

		int route_no;
		Bus b;

		public int getRoute_no() {
			return route_no;
		}

		public Route(int route_no, Bus b) {
			super();
			this.route_no = route_no;
			this.b = b;
		}

		public void setRoute_no(int route_no) {
			this.route_no = route_no;
		}

		public Route(int route_no) {
			super();
			this.route_no = route_no;
		}

		public Bus getB() {
			return b;
		}

		public void setB(Bus b) {
			this.b = b;
		}
	}

	.........................................................................................
	TransportSystem:

	package ccoew.it.i1.businesslogic;

	import java.util.ArrayList;

	public class TransportSystem {

		ArrayList<Bus>bus=new ArrayList<Bus>();
		ArrayList<Route>route=new ArrayList<Route>();
		public ArrayList<Bus> getBus() {
			return bus;
		}
		public void setBus(ArrayList<Bus> bus) {
			this.bus = bus;
		}
		public ArrayList<Route> getRoute() {
			return route;
		}
		public void setRoute(ArrayList<Route> route) {
			this.route = route;
		}
	
		public void addBus(Bus b)
		{
			bus.add(b);
		}
		public void adddRoute(Route r)
		{
			route.add(r);
		}	
	}

	.........................................................................................
	Client:

	package ccoew.it.i1.Client;
	import ccoew.it.i1.businesslogic.*;

	import java.util.*;
	public class Test {

		public static void main(String[] args) {
	
		ArrayList<Bus>pbus=new ArrayList<Bus>();
		ArrayList<Route>proute=new ArrayList<Route>();
		ArrayList<Bus>pbus1=new ArrayList<Bus>();
		Automatic a1=new Automatic("MH 12 1234",001,999);
		Automatic a2=new Automatic("MH 12 1235",002,777);
		Automatic a3=new Automatic("MH 12 1222",003,778);
	
		Manual m1=new Manual("MH 12 4444",004,111);
		Manual m2=new Manual("MH 12 5555",005,222);

		Route r1=new Route(1,a1);
		Route r2=new Route(2,a2);
		Route r3=new Route(3,m1);
		Route r4=new Route(4,m2);
		Route r5=new Route(5,a3);
	
		TransportSystem ts=new TransportSystem();
		ts.adddRoute(r1);
		ts.adddRoute(r2);
		ts.adddRoute(r3);
		ts.adddRoute(r4);
		ts.adddRoute(r5);
	
		ts.addBus(a1);
		ts.addBus(a2);
		ts.addBus(a3);
		ts.addBus(m1);
		ts.addBus(m2);
	
		proute=ts.getRoute();
		pbus=ts.getBus();
	
		System.out.println("Total Buses");
		int i;
		for(i=0;i<pbus.size();i++)
		{
			System.out.println("Bus " +pbus.get(i).getReg_no());
			System.out.println("Driver on this bus is "+pbus.get(i).getDriver_no());
		
		}
	
		System.out.println("Routes on this Transport System are->");
		for(i=0;i<proute.size();i++)
		{
			System.out.println("Route "+proute.get(i).getRoute_no());
			System.out.println("Route has bus " +proute.get(i).getB().getReg_no());
			System.out.println();
		}	
		}
	}

	.........................................................................................
	OUTPUT:

	Total Buses
	Bus MH 12 1234
	Driver on this bus is 1
	Bus MH 12 1235
	Driver on this bus is 2
	Bus MH 12 1222
	Driver on this bus is 3
	Bus MH 12 4444
	Driver on this bus is 4
	Bus MH 12 5555
	Driver on this bus is 5

	Routes on this Transport System are->
	Route 1
	Route has bus MH 12 1234

	Route 2
	Route has bus MH 12 1235

	Route 3
	Route has bus MH 12 4444

	Route 4
	Route has bus MH 12 5555

	Route 5
	Route has bus MH 12 1222

