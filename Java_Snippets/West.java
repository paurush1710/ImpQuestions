
public class West {

	void display(Object r) {
		System.out.println("West");
	}
	
	void display(String str) {
		System.out.println("String");
	}
	
	public static void main(String[] args) {
		
		new West().display(null);
		
	}

}

// Output : String