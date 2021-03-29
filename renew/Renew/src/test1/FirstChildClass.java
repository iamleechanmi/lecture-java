package test1;

public class FirstChildClass extends ParentClass {

	public FirstChildClass() {
		System.out.println("FirstChildClass constructor");
	}
	
	/*
	public void childFun() {
		System.out.println("childFun()");
	}
	*/
	
	@Override
	public void makeJjajang() {
		System.out.println("--- FirstChildClass's makeJjajang() ---");
	}
}
