package JAVA0817;

import java.util.Scanner;

public class HarshardVer1 {
	/**
	 * 이거 위주로 이해하세요
	 */
	public static void main(String[] args) {

		// INIT:
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		// INPUT:
		System.out.print("하샤드 수를 입력해 주세요 : ");
		num = sc.nextInt(); // ex: 224 -> 8의 배수

		// CAL:
		// 1. num은 나중에도 필요하니 사본으로 numCpy 만들고
		// 2. numCpy가 0이 되기 전까지(양수에선 numCpy>0 해도 됨)
		// 3. numCpy/=10; (10씩 줄어듦)
		// 그동안 자릿수(digit) 구해서 sum에 더해주면 됨
		for (int numCpy = num; numCpy != 0; numCpy /= 10) {
			int digit = numCpy % 10; // 일의 자리 획득
			sum += digit; // sum에 누산
		}

		// PRINT:
		System.out.println("하샤드 수가 " + ((num % sum == 0) ? "맞습니다." : "아닙니다."));

	}

}
