package inheritance;

class A extends AabstractClass implements BInterface2{
	static int i =1;
	int nonStaticJ=5;
	static int staticJ=5;	
	//constructors can be public, private or protected
	public A() {
		System.out.println("In parent class A");
	}
	static void staticMethod() {
		System.out.println("In parent class A staticMethod");		
	}
	@Override
	void setTest() {
		// TODO Auto-generated method stub
		
	}
	public void displayA() {
		System.out.println("inside A i = "+i+" j = "+j+" nonStaticJ = "+nonStaticJ+" staticJ = "+staticJ);
		
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}