package _03.reference.variable.casting;

class Animal {

	public void eat() {
		System.out.println("animal eat");
	}

}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("dog eat");
	}
}

public class Example {

	public static void main(String[] args) {
		Animal animal0 = new Dog();
		// legaldir! Dog IS-A Animal
		Dog dog0 = (Dog) animal0;
		// downcasting

		// Burada animal0 Dog tipindeki bir objeyi gosteriyor.
		// bu degiskeni dog0 degiskenine assign ettigimzide bu casting islemi
		// problem cikartmaz!
		// objenin tipi DOG!
		dog0.eat();
		// dog eat -> objenin tipi Dog dolayisiyla Dog#eat metodu calisir!

		Dog dog00 = new Dog();
		Animal animal00 = dog00; //bu her zaman legaldir. risk yoktur!
		//upcasting
		//burada classcastexception hatasi vermez.

		Animal animal = new Animal();
		Dog dog = (Dog) animal;
		// java.lang.ClassCastException
		// 1 ) animal reference variable Animal tipinde bir objeyi
		// gostermektedir.
		// 2) Dog tipindeki reference variable bu Animal tipindeki objeyi
		// GOstersin diyoruz!
		// Javada bir reference variable super type tipinde bir objeyi
		// gosteremez.
		// yani Dog tipindeki bir degisken Animal tipindeki bir objeyi
		// gosteremez!legal degildir.

		dog.eat();

	}
}
