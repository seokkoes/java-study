package JAVA0812;

import java.util.Scanner;

public class PALY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력해 주세요. : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해 주세요. : ");
		int num2 = sc.nextInt();
		System.out.println("첫 번째 연산 결과 : " + (num1 + num2));
		System.out.print("세 번째 숫자를 입력해 주세요. : ");
		int num3 = sc.nextInt();
		System.out.print("네 번째 숫자를 입력해 주세요. : ");
		int num4 = sc.nextInt();
		System.out.print("다섯 번째 숫자를 입력해 주세요. : ");
		int num5 = sc.nextInt();
		System.out.print("여섯 번째 숫자를 입력해 주세요. : ");
		int num6 = sc.nextInt();

		System.out.println("두 번째 연산 결과 : " + ((num1 + num2) - num3));
		System.out.println("세 번째 연산 결과 : " + (((num1 + num2) - num3) * num4));
		System.out.println("네 번째 연산 결과 : " + ((((num1 + num2) - num3) * num4) / num5));
		System.out.println("다섯번째 연산 결과 : " + (((((num1 + num2) - num3) * num4) / num5) % num6));
	}
}