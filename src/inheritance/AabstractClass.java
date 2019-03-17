package inheritance;
abstract class AabstractClass {
	int j = 2;
	static int i =100;
	public AabstractClass() {
		System.out.println("In parent abstract class");
	}
	static void staticMethodOnlyinAbstract() {
		System.out.println("In parent abstract class staticMethodOnlyinAbstract");		
	}
	static void staticMethodinAandAbstract() {
		System.out.println("In parent abstract class staticMethodinAandAbstract");		
	}
	static void staticMethodinAandBandAbstract() {
		System.out.println("In parent abstract class staticMethodinA-BandAbstract");			
	}
	public void nonStaticMethodinAandBandAbstract() {
		System.out.println("In parent abstract class nonStaticMethodinA-BandAbstract");		
	}
	
	abstract void setTest();
	void setI() {
		i = 5;
		j = 5;
	}
	void display() {
		System.out.println("inside abstract i = "+i+" j = "+j);
	}
}