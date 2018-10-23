package in.co.niharika;

public abstract class AbstractVehicle {
	String name;
	
	AbstractVehicle(String name) {
		this.name = name;
	}
	//Once the below given abstraction is given; it is a must in subclasses to have a method drive else it will shoot a error 
	public abstract void drive();

//	public void drive() {
//		System.out.println("Driving " + name);
//	}
}
