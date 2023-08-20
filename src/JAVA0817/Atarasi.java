package JAVA0817;

import java.util.Scanner;

import java.util.Scanner;

public class Atarasi {

	public static void main(String[] args) {
		// INIT:
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		// INPUT:
		System.out.println("하샤드 수를 입력해 주세요 : ");
		num = sc.nextInt(); // ex: 224 -> 8의 배수

		// CAL:
		for (int numCpy = num; numCpy != 0; numCpy /= 10) {
			int zarisoo = numCpy % 10;
			sum += zarisoo;
		}

		// PRINT:
		System.out.println("하샤드 수 판별: " + (num % sum == 0)); // 띠용
		// 우선 여기서부터.
		// 여기서 num%sum==0 이 부분은 이해가 돼요?
		// 넵 이해 됩니다!

		// 그러면 이때 num이 필요하잖아요. 그래서 반드시 num은 살아있어야 해요
		// 그래서 저희가 numCpy라고 num의 사본을 만든 다음에
		// 그 사본 numCpy만 numCpy/=10 이렇게 한 자리씩 줄인 건데

		// 224를 기준으로 보면 다음과 같이 변해갔다고 보시면 돼요(numCpy/=10)
		// numCpy = 224; -> 이때 numCpy%10은 4
		// numCpy = 22; -> 이때 numCpy%10은 2
		// numCpy = 2; -> 이때 numCpy%10은 2
		// numCpy = 0; -> for문 종료

		// 그러면 4, 2, 2가 하나씩 나오는데
		// sum += 4;
		// sum += 2;
		// sum += 2;
		// 이렇게 하나씩 하나씩 sum에다가 모은 거예요

	}// END::main
}// END::publicClass