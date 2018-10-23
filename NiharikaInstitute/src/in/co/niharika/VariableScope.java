package in.co.niharika;

public class VariableScope {
	//This variables can be accessed by all methods in this class
	String str = "Hello";
	int a = 1;
	boolean b = true;
	float f = 1.45f;
	char c = '!';
	
	public void testingScope() {
		System.out.println("1 " + str + " " + a + " " + b + " " + f + " " + c);
		testScope1();
		//testLoopScope();
	}
	public void testScope1() {
		//This variable is local to this method alone
		int a = 2;
		System.out.println("2 " + str + " " + a + " " + b + " " + f + " " + c);
		
	}

	public void testLoopScope() {
		for(int i=0; i<3; i++) {
			int j = 3;
			System.out.println(j * i);
		}
	}
	

}
