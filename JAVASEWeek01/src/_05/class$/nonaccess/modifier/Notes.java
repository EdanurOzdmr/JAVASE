package _05.class$.nonaccess.modifier;

public class Notes {

}
//class'lar icin kullanabilecegimi non-access modifier'lar ; abstract ve final keyword'leridir.


//bir class final olarak tanimlanirsa bu class kalitilamaz!!!

class SuperClass {
	//
}

class SubClass extends SuperClass {
	//
}


final class FinalClass {
	
}

//class CompileError extends FinalClass{	}

//abstract keywordu

abstract class AbstractSuperClass {
	
}

class NonAbstractSubClass extends AbstractSuperClass{
	
}

//bir classta en az bir tane method abstract sa bu class abstract olmak zorundadir.

