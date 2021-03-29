package test1;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		childClass.childFun();
		childClass.parentFun();
		childClass.makeJjajang();
		childClass.privateFun();
		*/
		
		ParentClass[] pArr = new ParentClass[2];
		
		//같은 데이터 타입이기 때문에 배열에 넣을 수 있다.
		FirstChildClass fch = new FirstChildClass();
		ParentClass sch = new SecondChildClass();
		
		pArr[0] = fch;
		pArr[1] = sch;
	}
}
