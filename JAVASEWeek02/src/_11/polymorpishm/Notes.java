package _11.polymorpishm;

public class Notes {
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		// animal degiskeni -> local degiskendir.
				// animal degiskeni reference type degiskendir.
				// degiskenimizin tipi --> Animal
				// obje/object/instance tipi -> Animal

				// java'da , bir referans degisken/reference variable , kendi tipinde ya
				// da subclass tipinde bir objeyi/instance/object gosterebilir(refer).

				Animal animalDog = new Dog(); // Dog IS-A Animal onermesi dogrudur.
				// degiskenin tipi --> Animal
				// objenin tipi--> Dog

				// Dog dogAnimal = new Animal();
				// derleme hatasi verir!
				// legal degildir.
				// reference variable , super class tipinde bir objeyi gosteremez!

				Kangal kangal = new Kangal();
				Dog dogKangal = kangal; // Kangal IS-A Dog dogrudur!
				Animal animalKangal = dogKangal; //Kangal IS-A Animal ve Dog IS-A Animal
				Object objectKangal = animalKangal; // Kangal IS-A Object Dog IS-A Object Animal IS-A Object onermeleri dogrudur.

			}
		}

		class Animal {

		}

		class Dog extends Animal {

		}

		class Kangal extends Dog {

	

	}
	


