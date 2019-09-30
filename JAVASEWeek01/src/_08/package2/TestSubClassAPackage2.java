package _08.package2;


import _08.package1.TestA;

public class TestSubClassAPackage2 extends TestA {

	// farkli pakette kalitim soz konusu oldugunda protected ve default/package
	// level'in farki ortaya cikar.

	public void testMethods() {
		publicMethod();
		protectedMethod(); // kalitim soz konusu oldugunda , farkli paketten
							// protected method a erisim saglanabilirken default
							// leve/package level methoda erisim saglanamaz.
							// aralarindaki fark budur.

		//packageLevelMethod();// legal degildir!
	}

}