package in.co.niharika;

public class SubclassCar extends SuperClassVehicle {

	public SubclassCar(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive() {
		System.out.println("Driving " + name + " fast");
	}
}
