package _12.override;
	
	class Animal{
		public void eatFood() {
			System.out.println("Animal eatFood...");

		}
		
		public static void breathe() {
			System.out.println("Animal breathe");
		}
		
		public void testMethod() {
			System.out.println("test method");

			
		}
	}
	
	class Dog extends Animal{
		
		@Override
		public void eatFood() {
			System.out.println("Dog eatFood...");

		}
		
		public void run() {
			System.out.println("Dog running...");
		}
		
		//@Override
		//OVERRIDE DEGILDIR! static metotlar OVERRIDE edilmezler!
		public static void breathe() {
			System.out.println("Dog breathe");
		}
		
	}
	
	class Kangal extends Dog {
		@Override
		public void eatFood() {
			System.out.println("Kangal eatFood...");
		}
	}
	
	// 1 - override soz konusuysa kalitim/extends ya da uygulama/implements soz
	// konusudur.
	// 2 - subclassta ayni isimde metodu tanimladik.

	public class OverrideTest {

		public static void main(String[] args) {
			
		Animal animal= new Animal();
		Dog dog=new Dog();
		animal.eatFood();
		dog.eatFood();
		
		dog.testMethod();
		
		Animal animalDog= new Dog();
		// degiskenin tipi Animal
				// objenin tili Dog
				// Dog IS-A Animal
				animalDog.eatFood();


				// animalDog.run(); //bu degiskenin tipi Animaldir. Animal sinifinda run
				// diye bir method yer almaz!
				((Dog) animalDog).run();

				// javada override soz konusu oldugunda , calisma zamaninda/runtime'da ,
				// dynamic method dispatch yapilir.
				// objenin tipi neyse ilgili siniftaki metot calisir.

				animalDog = new Kangal();
				animalDog.eatFood();
				
				// static method test
				System.out.println();
				Animal animalObject = new Animal();	
				animalObject.breathe();

				Dog dogObject = new Dog();
				dogObject.breathe();
				
				Animal animalDogObject = new Dog();
				animalDogObject.breathe();
				
				//static methodlar soz konusu oldugunda override islemi YOKTUR!
				//static method call'larda/cagrilmasinda degiskenin tipi ONEMLIDIR! Objenin tipinin bir onemi yoktur!!!
			}
		}
