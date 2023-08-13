
class Base {

	public void test() {

	}

}

class Base1 extends Base {

	public void test() {

		System.out.println("Base1");

	}

}

class Base2 extends Base {

	public void test() {

		System.out.println("Base2");

	}

}

class CastCheck {

	public static void main(String[] args) {

		Base obj = new Base1();

		((Base2) obj).test(); // CAST

	}

}


// Base will be printed, After it Error will be thrown
// class Base1 cannot be cast to class Base2 