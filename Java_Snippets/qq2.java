class Helloo{
	
	int x;
	
	Helloo(int x){
		this.x = x;
		System.out.println("Constructor");
	}
	
	public Object clones() {
		Helloo h = new Helloo(this.x);
		System.out.println("Inside Clone");
		return h;
	}
	
	public String toString() {
		System.out.println("Inside toString");
		return ""+x;
	}
	
}


public class qq2 {

	public static void main(String[] args) {
		
		Helloo h = new Helloo(56);
		System.out.println(h.clones());
		
	}

}

//Constructor
//Constructor
//Inside Clone
//Inside toString  --> toString is called whenever object has to be printed
//56