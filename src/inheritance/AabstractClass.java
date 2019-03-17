package inheritance;
abstract class AabstractClass {
	int j = 2;
	static int i =100;
	public AabstractClass() {
		System.out.println("In parent abstract class");
	}
	static void staticMethod() {
		System.out.println("In parent abstract class staticMethod");		
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