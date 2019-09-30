package _08.package1;

public class TestA {

	//test!
	public int publicInstanceVariable = 100;
	private int privateInstanceVariable = 100;
	protected int protectedInstanceVariable = 100;
	int defaultLeveltInstanceVariable = 100;

	public void publicMethod() {
		//
	}

	private void privateMethod() {
		//
	}

	protected void protectedMethod() {

	}

	void packageLevelMethod() {

	}

	public void usePrivateMethod() {
		privateMethod(); // private metotlara erisim sadece class icerisinde
							// olabilir!
	}
}

class TestASubClass extends TestA {

	public void testMethods() {
		publicMethod();
		protectedMethod();
		packageLevelMethod();
		// privateMethod(); //derleme hatasi verir. legal degildir.
		// private metotlara erisim sadece tanimlandigi classta yapilabilir.
	}
}
