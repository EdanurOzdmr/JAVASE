package _11.static$;

public class HelloWorld {

	public String message = "my message!";
	public static String staticMessage="static message";

	public static void main(String[] args) {
		
		System.out.println(staticMessage);
		
		//Cannot make a static reference to the non-static field message
		//System.out.println(message);
		//bu noktada derleme hatasi aliriz!
		//cunku static metotlarda bu noktada bir obje yoktur!
		
		//javada objeler heapte yasarlar.
		//instance variable'lar ilgili objeyle birlikte heapte yasarlar.
		//yani instance variable'dan bahsedebilmek icin ortada bir obje olmasi gereklidir.
		
		HelloWorld hello = new HelloWorld();
		
		System.out.println(hello.message);
		
		HelloWorld hello2 = new HelloWorld();
		hello2.message="new message";
		
		System.out.println(hello2.message);
		
		
		System.out.println();
		
		hello.nonStatic();
		hello2.nonStatic();
	}
	
	public void nonStatic(){
		//legaldir!
		//bu metot static degildir!
		System.out.println(this.message);
		
		//System.out.println(staticMessage);
	}
	
	public static void testMethod(){
		
	}
}
