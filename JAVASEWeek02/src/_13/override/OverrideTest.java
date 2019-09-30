package _13.override;

class Animal {

	int size = 10;
	static int number = 100;

}

class Dog extends Animal {
	int size = 20;
	static int number = 200;
}

public class OverrideTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.size);
		System.out.println(animal.number);

		Dog dog = new Dog();
		System.out.println(dog.size);
		System.out.println(dog.number);

		//

		Animal animalDog = new Dog();

		System.out.println(animalDog.size);
		System.out.println(animalDog.number);
		
		//javada sadece instance methodlar icin override soz konusudur!
		//instance variable , static variable icin override soz konusu degildir.
		//instance variable static variable ve static methodlar icin DEGISKENIN TIPI ONEMLIDIR!
		//instance method'larda override soz konusu oldugunda OBJENIN tipi onemlidir.
	}
}

