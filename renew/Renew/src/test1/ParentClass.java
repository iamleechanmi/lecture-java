package test1;

//모든 클래스의 최상위 클래스는 Object 클래스이다.
public class ParentClass {

	public ParentClass() {
		System.out.println("ParentClass constructor");
	}
	
	/*
	public void parentFun() {
		System.out.println("parentFun()");
	}
	
	//자식 클래스는 부모 클래스의 모든 자원을 사용할 수 있지만
	//private 접근자의 속성과 메소드는 사용할 수 없다.
	private void privateFun() {
		System.out.println("privateFun()");
	}
	*/
	
	public void makeJjajang() {
		System.out.println("--- makeJjajang() ---");
	}
}
