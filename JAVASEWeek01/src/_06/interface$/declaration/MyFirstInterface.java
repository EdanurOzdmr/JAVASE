package _06.interface$.declaration;

public interface MyFirstInterface {
	
	void myMethod();
	
	// interface'lerin metotlari public ve abstractir.
		// compiler bunu soyle gormektedir;

		// public abstract void myMethod();

		// private void compileError(); //private olamaz!

		// protected void compileError2(); //protected olamaz

		void testMethod(); // bu metot gizli olarak/implicit public metottur!!!
		
//		public void nonAbstract() {
//		//interfacelerde govdeli metot / non-abstract metot / suslu parantezli metot { } / tanimlamaz!	
//		}
		
		//interface'lerin degiskenleri aslinda SABIT'tir constant'tir.
		//interface'lerin degiskenleri final , static ozellige sahiptir.
		
		int number=10;
		//public static final int number=10; //anlamina gelmektedir.
		
		
	}



