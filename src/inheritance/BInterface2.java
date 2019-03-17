package inheritance;
interface BInterface2 {
	String i ="i in interface";
	static void staticMethod() {
		System.out.println("In parent interface class 2 staticMethod");
	}
	default void defaultmethod() {
		System.out.println("In parent interface class 2 defaultmethod");
	}
	abstract void abstractMethodinInterface1And2();	
}