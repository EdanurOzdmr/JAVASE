package _07.constructors;

//default olarak/varsayilan olarak javada yapilandiricilarin basinda super(); ifadesi yer alir;
//super(); --> bir ust siniftaki /super classtaki default yapilandirici cagir anlamina gelmektedir!
class Animal {
	Animal() {
		super();
		System.out.println("Animal default constructor");
		///
		//
		
	}
}

class Dog extends Animal {
	Dog() {
		super();
		System.out.println("Dog default constructor");
		//
		//
	}
}

class Kangal extends Dog {

	Kangal() {
		
		//System.out.println("legal degildir!");
		// super(); ifadesi bir yapilandirica calisan ilk ifade olmalidir!
		super();
		//ust siniftaki no-args constructor a git !
		System.out.println("kangal default constructor");
		//
		//
	}
}

public class Example {

	public static void main(String[] args) {
		Kangal kangal = new Kangal();
		System.out.println("main");
	}
}
