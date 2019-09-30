package _07.interface$.java8;

interface Java8Interface{
	//java 8 de gelen bir ozelliktir.
		default void defaultInterfaceMethod() {
			System.out.println("Hello defaultInterfaceMethod");
		}
		//
		//abstract methods...
		
		//java8 de gelen bir ozelliktir.
		public static void staticInterfaceMethod() {
			System.out.println("staticInterfaceMethod");
		}	
}

abstract class SuperAbstract {
	//methods...
} 

//sirasi onemli! once extends etmemiz sonrasinda implements etmemiz gereklidir!
class Java8InterfaceImpl extends SuperAbstract implements Java8Interface  {
	//
	//
}

public class Java8InterfaceRules {

	public static void main(String[] args) {
		Java8InterfaceImpl java8=new Java8InterfaceImpl();
		java8.defaultInterfaceMethod();
		//java8.staticInterfaceMethod(); //legal degildir.
		
		//interface'lerde tanimlanan static metotlari bu sekilde cagirmamiz gereklidir.
		//interfaceName.statiMethodName
		Java8Interface.staticInterfaceMethod();
			

}
	}