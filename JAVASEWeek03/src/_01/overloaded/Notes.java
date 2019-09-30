package _01.overloaded;

public class Notes {

	// rule 1
	// public void overloadedTest(int a) {
	//
	// }
	//
	// public void overloadedTest(int a) {
	//
	// }

	// rule 2 , rule3
	private int overloadedTest(int a) {
		return 0;
	}

	public void overloadedTest(int a, int b) {

	}
}

// overloaded ;

// metotlar ve yapilandiricilar/constructor icin soz konusu olan bir durumdur.

// metot ismi ayni , parametre cesiti farkli.

// rule 1 --> overloaded metotlarin parametre listesi MUTLAKA FARKLI OLMAK
// ZORUNDADIR.
// rule 2-- >overloaded metotlarin donus tipi degiseiblir.

// rule3 -> overloaded metotlar icin access level farkli olabilir.

// rule4 -> overloaded metotlar hem ayni sinifta hem de subclassta olabilir.
