package _01.overloaded;


public class Example2 {

	public static void main(String[] args) {
		Calcutor calculator = new Calcutor();

		// 10 -> int tipindedir
		calculator.overloadedMethod(10);

		// int >short >byte
		
		calculator.overloadedMethod((byte)10);
		
		//10.0==>double tipindedir.
		calculator.overloadedMethod(10.0);
		
		//10.0f -> float tipindedir.
		calculator.overloadedMethod(10.0f);
		
		//double>float
	}
}

class Calcutor {

	public void overloadedMethod(byte b) {
		System.out.println("byte");
	}

	public void overloadedMethod(int b) {
		System.out.println("int");
	}

	public void overloadedMethod(float b) {
		System.out.println("float");
	}

	public void overloadedMethod(double b) {
		System.out.println("double");
	}
}
