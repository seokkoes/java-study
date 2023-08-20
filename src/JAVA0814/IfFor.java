package JAVA0814;

import java.util.Scanner;

public class IfFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num1 = sc.nextInt();

		System.out.println("숫자 입력");
		int num2 = sc.nextInt();
		int odd = 0; // 홀수들의 합계를 저장 (누적합)

		if (num1 > num2) {
			System.out.println("잘못 입력 하셨습니다.");
		} else {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 1) {
					odd += 1;
				}
			}
			System.out.println("홀수의 합은 :" + odd);
		}

	}

}
