class Test{
	
}


public class TestChild extends Test{

	int k;
	public TestChild() {
		this();          // Recursive constructor invocation, Code will not compile (Parameterized constructor should have been called)
		super();         // Also super() must be the first statement in a constructor
		k=5;
	}
	
}
