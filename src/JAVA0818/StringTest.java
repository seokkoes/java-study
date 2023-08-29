package JAVA0818;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0, min = 0; // 0 또는 null, false
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println((i + 1) + "정수를 입력하세요. :");
			arr[i] = sc.nextInt();

			// 첫 번째 회차에만 반드시 실행하는 코드
			if(i == 0) { 
				max = arr[i];
				min = arr[i];
				continue; // 이번 회차에 이 밑으론 가지 마
			}
			
			// 두 번째 회차부터 실행하는 코드
			if (max < arr[i]) { // min < max < arr[i] 관계 성립
				max = arr[i]; // 갱신
			}
			
			if (arr[i] < min) {
				min = arr[i]; // 갱신
			}
			
		}// for( i )
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);

	}
}
