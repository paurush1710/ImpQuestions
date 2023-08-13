
public class Test {

	int Test(int i) {
		System.out.println("Test2");
		return i;
	}
	
	Test(){
		System.out.println("Test1");
	}
	
	public static void main(String[] args) {
		
		Test test = new Test(5);
		
	}

}

// Compile time exception, as constructor cannot return anything