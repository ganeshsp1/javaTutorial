package inheritance;
interface BInterface1 {
	//Interfaces cannot have constructors unlike abstract classes

	//by default interface variables are static and final
	//== public static final String i = "i in interface";
	String i ="i in interface";
	String j ="j in interface";
	//either static method or defaul t methods are possible,
	//All methods must be public
	static void staticMethodOnlyInInterface() {
		System.out.println("In parent interface class 1 staticMethod");
	}
	//default methods can be added even in future thus not breaking the whole code but adding extra methods as well.
	default void defaultmethod() {
		System.out.println("In parent interface class 1 defaultmethod");
	}
	//abstract methods have to be implemented by child classes.
	//only public, abstract, default, static and strictfp (strict floating point has to be given at class level) are permitted
	abstract void abstractMethodinInterface2();
	//	****This method is common in both the interfaces and it is not required for B to implement it if A is implementing the method
	//	this is a special case when the implementation of the abstract method is not implicitly given in child class instead it 
	//	inherits it's implementation from another parent class.
	abstract void abstractMethodinInterface1And2();


}