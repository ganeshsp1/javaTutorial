package inheritance;
class B extends A implements BInterface1{
	//static variables are bound to class, hence they are instantiated once the class is compiled 
	//and these values don't change even if new object is created, if one method increments it for one
	//object, it's incremented for all the objects.
	static int i =4; 
	int nonStaticJ=2;
	static int staticJ=2;
	//by default the constructor calls super();
	//try changing the constructor in A to private
	public B() {
		System.out.println("In child class B");
	}	
	public void displayB() {
		System.out.println("inside B i = "+i+" nonStaticJ = "+nonStaticJ+" staticJ = "+staticJ);
		}
	//this is used to avoid diamond problem, it has to be overriden and given specifically
	@Override
	public void defaultmethod() {
		//this will call the interface 1's default method
		BInterface1.super.defaultmethod();
		//this will get the interface 2's default method since super will call the default method of A which actually implements interface 2
		super.defaultmethod();
	}
	static void staticMethodinAandBandAbstract() {
		System.out.println("In child B class staticMethodinA-BandAbstract");			
	}
	public void nonStaticMethodinAandBandAbstract() {
		System.out.println("In child B class nonStaticMethodinA-BandAbstract");		
	}
	@Override
	public void abstractMethodinInterface2() {
		// TODO Auto-generated method stub
		
	}
}