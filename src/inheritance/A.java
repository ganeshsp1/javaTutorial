package inheritance;

class A extends AabstractClass implements BInterface2{
	static int i =1;
	int nonStaticJ=5;
	static int staticJ=5;	
	//constructors can be public, private or protected
	public A() {
//		this below line will make the whole program run in infinite loop and hence cause stack overflow error
//		new B();
		System.out.println("In parent class A");
	}
	public void displayA() {
		System.out.println("inside A i = "+i+" j = "+j+" nonStaticJ = "+nonStaticJ+" staticJ = "+staticJ);
		
	}
	
	static void staticMethodinAandAbstract() {
		System.out.println("In parent A class staticMethodinAandAbstract");		
	}
	static void staticMethodinAandBandAbstract() {
		System.out.println("In parent A class staticMethodinA-BandAbstract");			
	}
	public void nonStaticMethodinAandBandAbstract() {
		System.out.println("In parent A class nonStaticMethodinA-BandAbstract");		
	}
	@Override
	void setTest() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abstractMethodinInterface1And2() {
		// TODO Auto-generated method stub
		
	}

}