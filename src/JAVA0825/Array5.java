package JAVA0825;

import java.util.Scanner;

public class Array5 {
	/**
	 * 정순으로 입력받고 역순으로 출력하든,
	 * 역순으로 입력받고 정순으로 출력하든 결과는 같다.
	 * */
	public static void main(String[] args) {
		/** 스캐너 */
		Scanner sc = new Scanner(System.in);
		/**1*/
		int a= 3;
		int []arr = new int[5];
		// 역순으로 숫자 받고
		for(int i=4; i>=0; i--) {
			System.out.print((5-i)+"번째 숫자 입력: ");
			arr[i] = sc.nextInt();
		}
		// 정순으로 출력
		for(int i=0; i<=4; i++) {
			System.out.print(arr[i]);
		}
		
		// 문자열 이용하는 방법
//		String str = 5+"";
//		for(int i=0; i<=4; i++) {
//			System.out.print((i+1)+"번째 숫자 입력: ");
//			int num = sc.nextInt();
//			str = num + str;
//			System.out.println("▶  현재 문자열: "+str);
//		}
//		System.out.println(str);
		
	}// END::main
}// END::public Class
