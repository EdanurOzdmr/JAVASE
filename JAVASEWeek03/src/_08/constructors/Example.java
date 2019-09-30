package _08.constructors;

class Animal {

	int size;

	public Animal(int size) {
		super();
		this.size = size;
	}

//	 Animal(){
//	 super();
//	 }
	//

}

class Dog extends Animal {

	Dog() {		
		super(10);
	}
}

public class Example {

}
