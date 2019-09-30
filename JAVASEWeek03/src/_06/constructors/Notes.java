package _06.constructors;

public class Notes {

	public Notes(){
	//sinif publicse yapilandirici da public olmaktadir !
	}
}

// rule1 -> javada abstract class'lar dahil butun siniflar icin en az bir tane
// yapilandirici/constructor vardir.
// yapilandirici olmasi tanimlamak zorunda oldugumuz anlamina gelmez.

// burada biz yapilandirici tanimlamadik.java bizim icin bir yapilandirici
// tanimlar.
// bu yapilandiciri her zaman no-args constructor dir yani parametre almayan
// yapilandiricidir.
class Car {

	Car() {
		// arka planda javanin tanimlamis oldugu yapilandirici!
	}
}

class Ford {
	Ford() {
		// default yapilandirici tanimlanir!
	}
}

// eger biz bir tane bile yapilandirici tanimlarsak java bizim icin no-arg
// default yapilandirici tanimlamaz!

class BMW {
	int price;
	int model;
	
	//burada biz bir yapilandirci tanimladigimiz icin , java bizim isimize karismaz ve no-arg constructor i olusturmaz!
	public BMW(int price, int model) {
		this.price = price;
		this.model = model;
	}
	
//	BMW() {
//		//bu yapilandirici java tarafindan otamatik olarak olusturulmaz!
//	}
}

