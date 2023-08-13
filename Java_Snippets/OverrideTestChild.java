class OverrideTest{
	
	int i=5;
	public void methodTest() {
		System.out.println(i);
	}
		
}


public class OverrideTestChild extends OverrideTest{

	int i = 1000;
	
	public void method() {
		System.out.println("i: "+i);
		i=super.i;
		System.out.println("i: "+i);
	}
	
	public static void main(String[] args) {

		OverrideTestChild o = new OverrideTestChild();
		o.method();
	}

}

// Output
// i: 1000
// i: 5