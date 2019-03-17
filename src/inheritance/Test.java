package inheritance;

public class Test{

	public static void main(String[] args) {
		System.out.println("=======================Instantiating Classes=========================");
		System.out.println("A a = new A()");
		A a = new A();
		System.out.println("B b = new B()");
		B b = new B();
		System.out.println("BInterface1 bi = new B()");
		BInterface1 bi = new B();
		System.out.println("AabstractClass aab = new B()");
		AabstractClass aab = new B();
		System.out.println("AabstractClass aaa = new A()");
		AabstractClass aaa = new A();
		
		System.out.println("Anonymous Class for Interface");
		//This is not instantiating the interface, instead it's instantiating an anonymous inner class , hence creating an anonymous object.
		BInterface1 bbi = new BInterface1() {
			
			@Override
			public void abstractMethodinInterface2() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void abstractMethodinInterface1And2() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println("Anonymous Class for Abstract Class");
		AabstractClass aa = new AabstractClass() {
			@Override
			void setTest() {
			}
		};
		
		System.out.println("=======================Testing Variables (i is static and j is non static)=========================");
		System.out.println("Before setI");
		System.out.println("A.i "+a.i);
		System.out.println("A.j "+a.j);
		System.out.println("Abstract object A i "+aaa.i);
		System.out.println("Abstract object B i "+aab.i);
		a.display();
		a.setI();
		System.out.println("After setI on A - sets i =5 and j=5 in abstract class");
		a.display();
		System.out.println("A.i "+a.i);
		System.out.println("A.j "+a.j);
		System.out.println("Abstract object A i "+aaa.i);
		System.out.println("Abstract object B i "+aab.i);
		System.out.println("Abstract object Anonymous i "+aa.i);
		System.out.println("Abstract object A j "+aaa.j);
		System.out.println("Abstract object B j "+aab.j);
		System.out.println("Abstract object Anonymous j "+aa.j);
		

		System.out.println("interface object B i "+bi.i);
		System.out.println("interface Anonymous object i "+bbi.i);
		System.out.println("interface object B j "+bi.j);
		System.out.println("interface Anonymous object j "+bbi.j);
		
		
		//this will throw a compile time error The field b.j is ambiguous, you have to call the interface or the abstract separately
//		System.out.println(b.j);
		//this works since i is there in b
		System.out.println("Object B value of i "+b.i);
		
		System.out.println("================================================");
		
		b.displayB();
		a.displayA();
		System.out.println("Incrementing I of A");	
		a.i++;
		a.displayA();
		System.out.println("Creating new B class object of type A");
		A ab = new B();
		b.displayB();
		System.out.println("Printing new B class object of type A");
		ab.displayA();
		
		System.out.println("=====================Default Interface Methods===========================");

		bi.defaultmethod();
		b.defaultmethod();
		
		System.out.println("===============static Method Only in Abstract=======================");
		a.staticMethodOnlyinAbstract();
		b.staticMethodOnlyinAbstract();
		System.out.println("Printing A class object of type Abstract - static method");
		aa.staticMethodOnlyinAbstract();
		System.out.println("Printing B class object of type A - static method");
		ab.staticMethodOnlyinAbstract();
		
		
		System.out.println("===============static Method in A and Abstract=======================");
		a.staticMethodinAandAbstract();
		b.staticMethodinAandAbstract();
		System.out.println("Printing A class object of type Abstract - static method");
		aa.staticMethodinAandAbstract();
		System.out.println("Printing B class object of type A - static method");
		ab.staticMethodinAandAbstract();
		
		System.out.println("===============static Method in A and B and Abstract=======================");
		a.staticMethodinAandBandAbstract();
		b.staticMethodinAandBandAbstract();
		System.out.println("Printing A class object of type Abstract");
		aa.staticMethodinAandBandAbstract();
		System.out.println("Printing B class object of type A");
		ab.staticMethodinAandBandAbstract();
		
		System.out.println("===============Non static Method in A and B and Abstract=======================");
		a.nonStaticMethodinAandBandAbstract();
		b.nonStaticMethodinAandBandAbstract();
		System.out.println("Printing A class object of type Abstract");
		aa.nonStaticMethodinAandBandAbstract();
//		note the output of following line to know difference between static and non static methods
		System.out.println("Printing B class object of type A");
		ab.nonStaticMethodinAandBandAbstract();
		
		System.out.println("===============static Method Only in interface=======================");
//		The static method of interface BInterface1 can only be accessed as BInterface1.staticMethodOnlyInInterface
//		b.staticMethodOnlyInInterface();
//		a.staticMethodOnlyInInterface();
//		bi.staticMethodOnlyInInterface();
		BInterface1.staticMethodOnlyInInterface();
		
		
	};
}
