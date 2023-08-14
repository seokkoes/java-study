package JAVA0813;

import java.util.Scanner;

public class Ifelseif {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. :");
		Scanner inputValue = new Scanner(System.in);
		int score = inputValue.nextInt();

		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("D학점");
		}
	}

}
