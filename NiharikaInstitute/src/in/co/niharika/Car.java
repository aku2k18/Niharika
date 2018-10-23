package in.co.niharika;

public class Car extends AbstractVehicle {

	public Car(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive() {
		System.out.println("Driving " + name + " fast");
	}
}
