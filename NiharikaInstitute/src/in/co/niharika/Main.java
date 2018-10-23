package in.co.niharika;

//import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// This is the main program
		System.out.println("Hello World");
		//Create instance of class VariableScope
		VariableScope scope = new VariableScope();
    	scope.testingScope();
    	scope.testLoopScope();
    	
    	//1. Inheritance & Compile time polymorphism
    	
    	//Normal subclass with drive method override
    	//This also is an example for compile time polymorphism
    	SuperClassVehicle vehicle3 = new SubclassCar("Polo3");
    	vehicle3.drive();
    	//Normal subclass without drive method
    	SuperClassVehicle vehicle4 = new SubClassWithoutDrive("Polo4");
    	vehicle4.drive();
    	//Normal subclass example with additional method and how to use
    	SubclassBus bus = new SubclassBus("BMTC");
    	bus.drive();
		bus.collectTicket();
		//Why subclasses? How it is useful? In what scenarios?
		SubclassAeroplane Aeroplane = new SubclassAeroplane("KingFisher");
		Aeroplane.drive();
    	
    	//2. Abstraction
		
       //You cannot create a instance of AbstractVehicle because it is abstract
       //AbstractVehicle vehicle = new AbstractVehicle("Polo");{	
        //But you can create a instance for sub class of superclass in abstracted class
    	//With override method
    	AbstractVehicle vehicle1 = new Car("Polo1");
    	vehicle1.drive();
    	//without drive method
    	AbstractVehicle vehicle2 = new CarNoOveride("Polo2");
    	vehicle2.drive();
    	
    	//3. Runtime Polymorphism
    	
    	System.out.println(PolymorphismMathOperations.addNumbers(1, 2));
    	System.out.println(PolymorphismMathOperations.addNumbers(1, 2, 6));
    	
    	//4. Encapuslation
    	
    	//Withour encapsulation there wont be any control on variables and you can do wat ever you want
    	WithoutEncapsulationStudent justchek = new WithoutEncapsulationStudent();
    	justchek.name ="Niharika";
    	justchek.grade = 'A';
    	System.out.println(justchek.name);
    	System.out.println(justchek.grade);
    	
    	//After Encapsulation we can have a control over variables as shown below
    	EncapsulationStudent justchek1 = new EncapsulationStudent();
    	justchek1.setId(1);
		justchek1.setName("Niharika");
		justchek1.setMarks(190);
		//justchek1.setDob(new Date("09/19/1990"));
		justchek1.setGrade('A');
		System.out.println("justchek1.id : " + justchek1.getId());
		System.out.println("justchek1.name : " + justchek1.getName());
		System.out.println("justchek1.marks : " + justchek1.getMarks());
		//System.out.println("justchek1.dob : " + justchek1.getDob());
		System.out.println("justchek1.grade : " + justchek1.getGrade());
		
		//5. Strings - Immutable & string pool
		// The pointer points to same object for str, str2, str3 (Even though new instance is created); which saves memory
		String str = "asd";
		String str1 = "dfgdf";
		String str2 = "asd";
		String str3 = new String("asd");
		System.out.println("1 : " + str.equals("asd"));
		System.out.println("2 : " + str.equals(str1));
		System.out.println("3 : " + str.equals(str2));
		System.out.println("4 : " + str.equals(str3));
		
		//6. Collection Framework, Collections
		
		CollectionsNiharika ArrList = new CollectionsNiharika();
		// Normal Array and disadvantages is Size has to be given at the implementation time itself
		ArrList.NormalArrays();
		//List Array, Advantage is size is dynamic but contains duplicates
		ArrList.ListArraysNiharika();
		//You can use collection class to sort the data
		ArrList.SortArraysNiharika();
		//To avoid duplicates we can use sets
		ArrList.SetsNiharika();
		//Queue is just used to retrive the top of stack like LIFO or FIFO; Used based on required use cases
		ArrList.QueueNiharika();
		//Map is used to map a key and value; You can change the key or value based on requirement
		ArrList.MapNiharika();
		
    	}

}
