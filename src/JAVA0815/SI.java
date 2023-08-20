package JAVA0815;

import java.util.Scanner;

public class SI {
	// 들여쓰기 컨트롤 시프트 에프
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
        
		int fac = 1;
		
		for( ;  num > 0; num--) {
		fac *= num; //fac = fac * num 5
		}
			System.out.println(fac);
		}
}
