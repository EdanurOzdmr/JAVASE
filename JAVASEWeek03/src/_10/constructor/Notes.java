package _10.constructor;

abstract class AbstractClass {
	AbstractClass() {
		System.out.println("abstract class constructor");
	}
}

class SubClass extends AbstractClass {

	SubClass() {
		super();
	}
}

interface MyInterface {
	//MyInterface() {} //legal degildir! yapilandirici interfaceler icin tanimlamaz.
}

public class Notes {

	public static void main(String[] args) {
		// Cannot instantiate the type AbstractClass
		// AbstractClass object = new AbstractClass();
		// javada abstract classlardan obje olusmaz!

		// javada constructor chaining/yapilandirici zinciri oldugu icin
		// Abstract classlardan obje olusmasada yapilandirici tanimlanabilir.
		// ya da tanimli degilse java default no-arg constructor i tanimlar.
		
		//MyInterface iFace = new MyInterface(); //legal degildir!
		//abstract classlar da oldugu gibi Interfacelerde obje olusmaz!
	}
}
