
class Hello{
	
	public static void m1() {
		System.out.println("M1 in Hello");
	}
	
}

class Hi extends Hello{
	
	public void m1() throws ClassCastException{
		System.out.println("M1 in hi");
	}
	
}

public class qq {

	public static void main(String[] args) {
		Hello h = new Hi();
		h.m1();
	}

}

// This instance method cannot override the static method from Hello
// Compile time error