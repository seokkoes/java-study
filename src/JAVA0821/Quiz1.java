package JAVA0821;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 20, 25, 30, 10, 15, 5 };
		int index = 0;
		int index2 = 0;
		int box = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("첫 번째 인덱스 번호를 입력하세요. :");
			i = sc.nextInt();
			for (int j = 0; j < arr.length; j++) {
				System.out.println("두 번째 인덱스 번호를 입력하세요. : ");
				j = sc.nextInt();

				box = i;
				i = j;
				j = box;

			}
			System.out.println(arr[i]);
		}
	}
}
