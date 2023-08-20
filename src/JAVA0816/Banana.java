package JAVA0816;

import java.util.Scanner;

public class Banana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("자릿수 숫자 : ");
		int num = sc.nextInt();
		int count = 0;
		int i = 1;
		while (true) {
			if (num / i < 1 && num / i > 0) {
				System.out.println(num + "��" + count);
				break;
			}
			i *= 10;
			count++;
		}
	}
}
