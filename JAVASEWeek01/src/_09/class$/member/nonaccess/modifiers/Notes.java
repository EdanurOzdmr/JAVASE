package _09.class$.member.nonaccess.modifiers;

public class Notes {

}
//bir metot final tanimlanirsa bu metot override edilemez!!

abstract class SuperClass {
	
	public void overrideMe () {
		//
		//
	}
	
	//final methodlar override edilmesin diye tanimlanir.
	public final void cantOverride () {
		
	}
	
	//abstract classlar override edilmek icin tanimlanir.
	abstract void abstractTestMethod();
	
	//final vs abstract tir.
	
}


class SubClass extends SuperClass {
	
	@Override
	public void overrideMe () {
		//
		//
	}
	//override edilemez. derleme hatasi verir!
	//public void cantOverride () {	} // legal degildir!

	@Override
	void abstractTestMethod() {
		// TODO Auto-generated method stub
		
	}
	
	public synchronized void synMethod() {
		//
	}
}