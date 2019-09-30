package _02.overrrideVSoverloaded;

class Animal {

	public void eatFood() {

	}

	void run() {
	}

	public void run(int a) {

	}

	public void breathe() {

	}

	private void fly() {

	}

	public static void test() {
	}

}

class Dog extends Animal {

	// override metotlar icin access level azalamaz artabilir!
	// yani publicse default yapamayiz.
	// @Override
	// void eatFood() {
	//
	// }

	// public > protected > default >private
	protected void run() {
	}

	// override metotlarda, overloaded metotlarin tam aksi oalrak ,metot
	// parametre listesi AYNI olmak zorundadir.
	// dolayisiyla bu metotlar override degil overloaded oldu.
	// BU METOT OVERRIDE OLMAZ! Parametreler farkli!
	// @Override
	public void breathe(int a) {

	}

	// javada private metotlar override edilemez! cunku visible/gorunur
	// degildir.
	// private metotlar sadece tanimlandigi sinifta gorunur/visible durumdadir.
	// @Override
	// BU METOT OVERRIDE degildir!!!
	private void fly() {

	}

	
	//javada static metotlar override edilemez!
	//@Override
	//override edilmez fakat overridetaki kurallar burada da gecerlidir.
	//bu islem OVERRIDE DEGIL! redefine adi evrilir.
	public static void test() {
	
	}
}

public class Example {

}
