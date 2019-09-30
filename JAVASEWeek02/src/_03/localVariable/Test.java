package _03.localVariable;

public class Test {

	public static void main(String[] args) {
		int number = 100; // bu degisken local degiskendir.

		// i local degiskendir. tanimlandigi block ; for
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// System.out.println(i); //legal degildir.

		// Illegal modifier for parameter compileError; only final is permitted
		// private String compileError="compileError";

		// local degiskenler sadece final anahtar kelimesini alabilirler.

		final int finalLocalVariable = 100;
		
		//finalLocalVariable=200; // degisekn final ise bu durumda degeri degistirilemez.
		
		//local degiskenlere otomatik deger atanmaz!
		//int number1; // 0 degil uninitialized durumdadir.
		//int number2;
		//System.out.println(number1 + number2);

	}
}

