package JAVA0813;

import java.util.Scanner;

public class play {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요. : ");
		int num = sc.nextInt();

		char c = (num % 2) == 0 ? '짝' : '홀';
		System.out.println(c);
	}

}