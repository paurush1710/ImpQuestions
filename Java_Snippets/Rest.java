
public class Rest {

	void display(Rest r) {
		System.out.println("Rest");
	}
	
	void display(String str) {
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		
		new Rest().display(null);
		
	}

}

// Compile Time Error  Ambiguous, Both can be taken as Null