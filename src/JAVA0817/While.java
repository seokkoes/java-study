package JAVA0817;
import java.util.Scanner;

public class While {

	/**
	 * 224에서 일의 자리 4를 얻고
	 * (10으로 나눠서 22로 만들고)
	 * 22에서 일의 자리 2를 얻고
	 * (10으로 나눠서 2로 만들고)
	 * 2에서 일의 자리 2를 얻고
	 * (10으로 나누면 0이 되고)
	 * 0이 되면 탈출 
	 */
	public static void main(String[] args) {

		boolean flag = true;
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("하샤드를 입력해 주세요. (양수) : ");
			num = sc.nextInt();
		}while(num<=0);

		// CAL: 최대한 이해해봐요 num 카피한게 numCpy 인데 나중에 num 사용
		// 계속 numCpy/=10 하면서, numCpy는 224 -> 22 -> 2 -> 0 이렇게 변하는데
		// num은 224를 그대로 갖고 있음. 그러고 나서 코드 이해하고 직접 짜보거라
		int numCpy = num; 	// 1. num은 나중에도 필요하니 사본으로 numCpy 만들고
		while (numCpy > 0) {// 2. numCpy가 0이 되기 전까지(양수에선 numCpy>0 해도 됨)
			
			int digit = numCpy % 10;// 남은 numCpy 값에서 일의 자리 획득
			sum += digit;			// 문제에서 요구한 '자릿수의 합'인 sum에 합산
			numCpy /= 10;	// 3. numCpy/=10; (10씩 줄어듦. 224 -> 22 -> 2)
			
		}
		
		// PRINT:
		System.out.println("하샤드 수 판별: " + (num % sum == 0));

	}// END::main
}// END::publicClass
