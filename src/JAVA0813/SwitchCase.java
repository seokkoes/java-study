package JAVA0813;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.print("분류코드를 입력하세요 : ");
		Scanner inputValue = new Scanner(System.in);
		int code = inputValue.nextInt();

		switch (code) {
		case 1:
			System.out.println("철학입니다.");
			break;
		case 2:
			System.out.println("종교입니다.");
			// break;
		case 3:
			System.out.println("사회과학입니다.");
			break;
		default:
			System.out.println("기타 입니다.");
			break;
		}

	}

}
