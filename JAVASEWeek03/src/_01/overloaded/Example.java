package _01.overloaded;

public class Example {
	public static void main(String[] args) {
		
		Calculate calculator= new Calculate();
		
				// 100 --> javada varsayilan olarak tamsayi literali int tipindedir.
				// 100.0 -->javada varsayilan olarak noktali sayilar double tipindedir.
				calculator.sumNumber(100, 200);
				calculator.sumNumber(100.0, 200.0);
				
				//100->int
				//10.5->double
				calculator.sumNumber(100, 10.5);

	}

}

class Calculate{
	
	public int sumNumber(int a, int b) {
		
		System.out.println("int int");	
		
		return a +b ;
	}
	
	//overloaded metotlarin donus tipi farkli olabilir.
		//override metotlarda donus tipi farkli olamaz.(covariant return haric)	

	
	public double sumNumber(double a, double b) {
		
		System.out.println("double double");	
		
		return a +b ;
	}
}
