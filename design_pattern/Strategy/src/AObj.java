
public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}

	public void funcAA() {

		//어떤 기능을 구현할 때 그 책임을 다른 객체에 떠넘긴다. -> 위임한다.
		ainterface.funcA();
		ainterface.funcA();
		
		//System.out.println("AAA");
	}
}
