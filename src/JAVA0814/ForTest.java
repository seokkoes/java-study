package JAVA0814;

public class ForTest {

	public static void main(String[] args) {
		//초기값 조건식 증감식 같이 한 경우
		//7번부터 9번까지 블록, 초기값을 같이 쓰는것이 좋다.
		
		//for (int i = 1; i <= 10000; ++i) {
			//	System.out.println(i);
		//}

		//초기값을 미리만든 경우
		//미리 만든 경우는 4번부터 20번까지의 블록
		int a = 0; 
		
	
		for(; a<=100; a+=2) {
			System.out.println(a);
		}
		
			System.out.println(a);
		
	}

}
