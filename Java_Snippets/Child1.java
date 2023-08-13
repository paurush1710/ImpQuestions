
class Parent1{
	
	static void Check() {
		System.out.println("Parent");
	}
	
}

public class Child1 extends Parent1{

	static void test() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.test();
	}

}

// Compile Time Exception