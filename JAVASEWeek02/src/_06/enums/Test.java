package _06.enums;

public class Test {
	
	enum EmployeeType{
		PART_TIME, FULL_TIME;
		
	}
	
	public static void main(String[] args) {
		
		CoffeeSize coffeeSize= CoffeeSize.GRANDE;
		
		System.out.println(coffeeSize.ordinal());
		System.out.println(coffeeSize.getPrice());
		
		for(CoffeeSize cs: CoffeeSize.values()) {
			System.out.println(cs + " " + cs.getPrice());
		}
		
	}
}
