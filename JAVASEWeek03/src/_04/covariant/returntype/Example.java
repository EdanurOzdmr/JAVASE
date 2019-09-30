package _04.covariant.returntype;

class Car {

}

class Ford extends Car {

}

class SuperClass {
	public Car getMyCar() {
		return new Car();
	}
}

class SubClass extends SuperClass {
	@Override
	//Ford IS-A Car oldugu icin override metotlarda bu durum legaldir.
	//buna covariant return adi verilir.
	//override metotlarda sadece bu case/durum icin metot donus tipi farkli olabilir.
	public Ford getMyCar() {
		return new Ford();
	}
}

public class Example {

}
