package _03.localVariable;

public class Test2 {
	int myVariable = 100;

	public static void main(String[] args) {
		// System.out.println(myVariable);
		Test2 object = new Test2();
		object.method1();
		object.method2();
	}

	public void method1() {
		int myVariable = 200; //local degiskenin ismi instance variable ile ayni burada golgeleme/shadowing olur.
		//bu noktada local variable'in degeri yazilir.
		System.out.println(myVariable);
		System.out.println(this.myVariable); //this.myVariable -->
	}

	public void method2() {
		System.out.println(myVariable);
	}
}
