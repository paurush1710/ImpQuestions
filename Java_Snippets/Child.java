
class Parent{
	
	Child display(int i) {
		System.out.println("Parent");
		return null;
	}
	
}

public class Child extends Parent{

	Parent display(int i) {
		System.out.println("Child");
		return null;
	}
	
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.display();
		
	}

}

//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The method display(int) in the type Parent is not applicable for the arguments ()