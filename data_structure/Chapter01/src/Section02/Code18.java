package Section02;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		
		//bubble sort
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for (int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//배열을 매개변수로 넘겨줄 때는 배열의 이름을 넣으면 된다.
		bubbleSort(n, data);
		
		System.out.println("Sorted data: ");
		for (int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}
	
	//굳이 return 타입이 필요하지 않다.
	static void bubbleSort(int n, int [] data){
		
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (data[j] > data[j+1]) {
					//swap data[j] and data[j+1]
					//호출문 안의 parameter를 actual parameter
					swap(data[j], data[j+1]);
					/*
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
					*/
				}
			}
		}
		//아무것도 리턴하지 않았지만 메소드가 한 일은 배열 data에 반영이 되어 있다.
	}
	
	//호출된 메소드 안의 parameter를 formal parameter
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
	//전혀 sort 되지 않았다.
	
	//값에 의한 호출 Call by value
	//actural parameter와 foraml parameter는 별개의 변수라는 의미이다.
	//호출하는 순간 formal parameter로 복사가 되는 것뿐이고 완전히 별개의 변수이다.
	//따라서 a와 b의 값을 변경해도 data[j], data[j+1]의 값에는 변화가 없다.
	
	//배열의 값은 호출된 메소드에서 변경하면 호출한 쪽에서도 변경된다.
}
