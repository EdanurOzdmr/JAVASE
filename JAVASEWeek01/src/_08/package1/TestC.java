package _08.package1;

public class TestC {

	public static void main(String[] args) {
		TestA aObject = new TestA();

		aObject.publicMethod();
		aObject.protectedMethod();
		aObject.packageLevelMethod();

		// aObject.privateMethod(); //legal degildir! private metoda ayni paket
		// de olsa erisim saglanamaz!!!
	}
}
