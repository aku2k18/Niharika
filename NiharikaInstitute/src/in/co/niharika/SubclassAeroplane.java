package in.co.niharika;

public class SubclassAeroplane extends SuperClassVehicle {

	public SubclassAeroplane(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive() {
		System.out.println("Flying " + name + " in air");
	}
}
