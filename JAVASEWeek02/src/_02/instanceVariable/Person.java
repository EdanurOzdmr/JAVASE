package _02.instanceVariable;
	
	//bir instance variable hem reference type hem de primitive type olabilir.
	//bir instance variable private, protected , default , public access level'e sahip olabilir.
	//final ,transient anahtar kelimeleri alabilir.
	//bir degisken/variable abstract , synchronized olamaz.
	

public class Person {
	
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
