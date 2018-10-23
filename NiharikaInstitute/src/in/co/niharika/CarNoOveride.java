package in.co.niharika;

public class CarNoOveride extends AbstractVehicle {

	public CarNoOveride(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//Comment the below given method and see how the abstraction enforces creation of drive method
	//Comment below given code and check the error 
	@Override
	public void drive() {
		System.out.println("Driving " + name + " fast");
	}
}
