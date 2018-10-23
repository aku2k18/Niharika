package in.co.niharika;

public class SuperClassVehicle {
String name;
	
SuperClassVehicle(String name) {
		this.name = name;
	}

	public void drive() {
		System.out.println("Driving " + name);
	}
}
