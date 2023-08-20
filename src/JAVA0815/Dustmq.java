package JAVA0815;
import java.util.Scanner;

//파스칼의 삼각형
public class Dustmq {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
