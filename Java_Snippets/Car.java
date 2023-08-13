
class Vehcile {

	Vehcile display(int i) {
		System.out.println("Vehicle");
		return null;
	}
	
	
}

public class Car extends Vehcile{
	
	Car display(int i) {
		System.out.println("Car");
		return null;
	}
	
	public static void main(String[] args) {
		Vehcile v = new Car();
		v.display(5);
	}
	
}
