package test1;

public class SecondChildClass extends ParentClass {

	public SecondChildClass() {
		System.out.println("SecondChildClass constructor");
	}
	
	/*
	public void childFun() {
		System.out.println("childFun()");
	}
	*/
	
	@Override
	public void makeJjajang() {
		System.out.println("--- SecondChildClass's makeJjajang() ---");
	}
}
