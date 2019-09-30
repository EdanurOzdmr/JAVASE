package _05.enums;


	/*

	butun enum'lar javada java.lang.Enum sinifinin alt sinifidir.

	public abstract class Enum<E extends Enum<E>>
	        implements Comparable<E>, Serializable {
	*/

	public enum CreditCardBrand {
		VISA, MASTERCARD, DISCOVER, AMEX
	}

	// mumkunse bu sekilde tutmak yerine bu noktada enum yapisindan yararlanmak
	// tercih edilir.
	class CreditCardBrand2 {
		public static final String VISA = "VISA";
		public static final String MASTERCARD = "MASTERCARD";
		//
	}
