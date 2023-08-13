
class Parent2{
	void test() {
		System.out.println("Parent");
	}
}

public class Child2 extends Parent2{

	void test() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {

		Parent2 p = new Child2();
		p.test();
	}

}

// Child