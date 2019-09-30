package _04.static$variable;

public class Test {
	static int count=0;
	private int instanceVariable=10;
	
	public static void main(String[] args) {
		
		System.out.println(count);
		
		count++;
		count++;
		
	// System.out.println(instanceVariable); //derleme hatasi verir!
		
		testMethod();
		System.out.println(count);

	}
	public static void testMethod() {
		count++;
		count++;
	}
	

}
