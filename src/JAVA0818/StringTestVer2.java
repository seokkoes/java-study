package JAVA0818;
import java.util.Scanner;

public class StringTestVer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0, min = 0;

		// 첫 번째 회차:
		System.out.println("1번째 정수를 입력하세요. :");
		min = max = arr[0] = sc.nextInt();
		
		// 두 번째 회차부터:
		for (int i = 1; i < arr.length; i++) {

			System.out.println((i + 1) + "정수를 입력하세요. :");
			arr[i] = sc.nextInt();

			// 두 번째 회차부터 실행하는 코드
			
			if( max<arr[i]) {
				max = arr[i];
			} if (min>arr[i]) {
				min = arr[i];
			}
			
		}// for(i)
		
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);
		// 주석 Ctrl + / 
		/*
		 * 블럭주석 Ctrl+Shift+/
		 * */

	}// END::main
}// END::publicClass
