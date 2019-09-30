package _05.class$.nonaccess.modifier;

public abstract class Animal {
	public void takeBrath() {
		System.out.println("ortak method...");
	}
	
	public abstract void eatFood();
	
	

}

class Dog extends Animal {

	@Override
	public void eatFood() {

		System.out.println("Dog eating...");
		
	}
	
}

class Cat extends Animal{

	@Override
	public void eatFood() {

		System.out.println("Cat eating...");
		
	}
	
}

class Bird extends Animal{

	@Override
	public void eatFood() {
		
		System.out.println("Bird eating...");
		
	}
	
	
}
	
 class Test {
	 public static void main(String args[]){  
			Animal animals=new Bird();
			animals.eatFood();
			
			
		}
	
}
