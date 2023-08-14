package JAVA0812;

import java.util.Scanner;

public class PlusMain {

	public static void main(String[] args) {

		// 사용자로부터 2개의 정수를 입력받아서
		// 입력받은 정수의합계를 출력하는 코드를 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요 : ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다");
	}

}
