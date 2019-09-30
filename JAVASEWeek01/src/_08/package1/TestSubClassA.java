package _08.package1;

public class TestSubClassA extends TestA{

	public void testMethods(){
		publicMethod();
		protectedMethod();
		packageLevelMethod();
		
		//privateMethod(); // kalitim da olsa ayni pakette private metotlara erisim saglanamaz!
	}
}

