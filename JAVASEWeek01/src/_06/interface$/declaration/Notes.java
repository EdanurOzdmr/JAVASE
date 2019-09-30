package _06.interface$.declaration;

public class Notes {

}
//javada "interface" bir anahtar kelimedir(keyword)
//interface'ler bir sablon/taslak.

//java8'e kadar interface'lerde SADECE abstract metotlar tanimlanabiliyordu!.
//java8'le birlikte interface'lerde default ve static metotlar artik tanimlanabiliyor.


//javada bir class sadece bir class'i kalitabilir.

class A {
	
}

class C {
	
}

//class B extends A,C {} //legal degildir.

//javada bir interface birden fazla interface'si kalitabilir.


interface MyInterface1 {
	//
	//
}

interface MyInterface2 { 
	//
	//
}

interface MyInterface3 extends MyInterface1 , MyInterface2{ 
	//
	//
}

//access level olarak public ya da default/package level olabilir. class'larda oldugu gibi.
//private ya da protected olamaz!!!

//private interface CompileError {} // legal degildir!

