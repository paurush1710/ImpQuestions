class C {

	public void run() {
		System.out.println("Parent func");
	}

	public void walk() {
		System.out.println("Parent walk");
	}

}

class B extends C {

	@Override
	public void run() {
		System.out.println("Child func");
	}
	
	public int run(int i) {
		return 6;
	} 
	
//	if child is extending parent it should not change return type if no of parameter are same

}

public class Main2 {

	public static void main(String[] args) {

		B b = new B();
		b.run();          // Child func

		C c = new B();
		c.run();          // Child func
		
		C c1 = null;
		c1.run();         // Exception in thread "main" java.lang.NullPointerException: 
		                  // Cannot invoke "C.run()" because "c1" is null
	}

}