package _08.package2;

//farkli paketten bir class'a erisiyorsak import etmemiz gereklidir!
//import edebilmek icin class'imiz public olmak zorundadir.
import _08.package1.TestA;

public class TestB {

	public static void main(String[] args) {
		TestA aObject = new TestA();
		
		aObject.publicMethod();
		
		//legal degildir , farkli paketten private ve default level'e erisim saglanamaz.
//		aObject.privateMethod();
//		aObject.protectedMethod();
//		aObject.packageLevelMethod();
	}
}
