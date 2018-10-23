package in.co.niharika;

public class SubclassBus extends SuperClassVehicle {

	public SubclassBus(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drive() {
		System.out.println("Driving " + name + " slowly in traffic");
	}
	
	public void collectTicket() {
		System.out.println("Collecting ticket in " + name);
	}

}
