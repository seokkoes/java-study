package JAVA0822;

public class Array1 {

	public static void main(String[] args) {
		
		int []arr = {29, 37, 12, 45, 60};
		
		int a0, a1, a2;			// a0, a1, a2		-> 반복문에 사용하기 어려움
		int a[] = new int[3];	// a[0], a[1], a[2]	-> 반복문에 사용하기 용이
		
		for(int index=0; index<3; index++) { // 인덱스가 3이 되기 전까지만 출력
			System.out.println(arr[index]);
		}
		
		for(int i=4; i<arr.length; i++) { // 인덱스가 4인 곳부터 출력
			System.out.println(arr[i]);
		}
		
		// 아래와 같은 의미
//		for(int index=0; index<arr.length; index++) {
//			if( index!=3 ) // index가 3일 때는 실행하지 않는 문장
//				System.out.println(arr[index]);
//		}
		
	}// END::main
}// END::public Class
