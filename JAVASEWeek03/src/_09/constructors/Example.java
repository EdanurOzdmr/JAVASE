package _09.constructors;

class Car {
	int price;
	int brand;

	//ayni classta yer alan bir yapilandiriciyi this(...) ifadesi ile cagirabiliriz.
	//super(...) ifadesinde oldugu gibi yine ilk ifade  this(..._) olmasi gereklidir/zorunludur.
	//this(...) ifadesi ile super(...) ifadesi ayni yapilandiricida yer alamaz.
	
	Car() {
		//System.out.println("compile error");
		//super();//legal degildir! hem super(..) hem this(...) ayni anda olamazlar!
		this(100);
		//super();
		
		System.out.println("Car default");
	}

	protected Car(int price) {
		super();
		this.price = price;
		
		System.out.println("Car int");
	}
	
	public void method(){
		//this(100); //legal degildir! metot icerisinden yapilandirici cagiramayiz!!!
	}

}

public class Example {

	public static void main(String[] args) {
		Car car = new Car();
	}
}
