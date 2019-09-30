package _05.methodreturntype;

public class Example {

	public String getCustomerName() {
		// java.lang.String reference type degisken!
		return null;
	}

	public Integer getCustomerAge() {
		// java.lang.Integer reference type degiskendir!
		return null;
	}

	public int[] getNumbers() {
		// int[] reference type degiskendir!
		// arrayler her zaman referecen typetir!
		return null;
	}

	public int getCustomerId() {

		// legal degildir! int -> primitive
		// return null;

		return 0;
	}

	public int getPrice() {
		//
		double d = 10.5;

		return (int) d;
	}

	public void noneReturn() {

		// return 10; //legal degildir!

		return;

		// Unreachable code
		// System.out.println("unreachable code - legal degildir");

		// if(..) {
		// return;
		// }
		//
		//
		// business logic

	}

	public static void main(String[] args) {
		System.out.println(giveMeChar());
		System.out.println(giveMeChar(97));
	}

	//javada char veri tipi 16 bit unsigned bir veri tipidir.
	// [0 , 2^16-1]
	public static int giveMeChar() {
		char c = 'a';
		return c;
	}

	public static char giveMeChar(int a) {
		char c = (char) a;
		return c;
	}

}

/// primitive tipler disindaki degiskenler reference type degiskendir.
// bir metotun tipi reference type ise bu durumda null donebilir.

// primitive icin null donemez.