package _06.constructors;

class Person {
	
	String name;
	//birden fazla yapilandirici tanimlanabilir.(overloaded constructor)
	public Person(String name) {
		System.out.println("Person String ");
		this.name = name;
	}

	Person(){
		System.out.println("default constructor - person");
	}
}

public class Example {

	public static void main(String[] args) {
		Person person = new Person();
		//degiskenin tipi Person
		//objenin tipi Person
		
		//new Person(); --> bu ifade/experssion yapilandirinin cagrilmasidir.
		
		Person person2= new Person("test name");
	}
}
