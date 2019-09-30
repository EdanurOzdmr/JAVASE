package _06.enums;

public enum CoffeeSize {
	
	SHORT(3), TALL(5), GRANDE(7), VENTI(9);
	private int price;

	private CoffeeSize(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	

}

// SHORT TALL vs.. bunlari tipi CoffeeSize tipindedir.

// class CoffeeSize {
//
// public static final CoffeeSize SHORT = new CoffeeSize("SHORT",3);
// public static final CoffeeSize TALL = new CoffeeSize("TALL",5);
// public static final CoffeeSize GRANDE = new CoffeeSize("GRANDE",7);
//
// }
	


