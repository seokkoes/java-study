package JAVA0817;

import java.util.Scanner;

public class HarshadVer2 {
	/**
	 * 이거도 사실 참고만
	 * ex:
	 * 
	 * 224에서
	 * [1] %10으로 4를 얻어내고(1로 나눔) => 그러면 4 나옴
	 * [2] %100으로 24를 얻어내서 10으로 나누고... => 그러면 2 나옴
	 * [3] %1000으로 224를 얻어내서 100으로 나누고... => 그러면 2 나옴
	 * [4] dividDown이 num보다 크면 탈출
	 */
	public static void main(String[] args) {
		int digit;
		int num;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하샤드 수를 입력해 주세요: ");
		num = sc.nextInt();
		
		int dividUp=10;
		int dividDown=1;
		while( true ) {
			
			 digit = num % dividUp; 	// %dividUp으로 XX를 얻어내서
			digit /= dividDown;			// dividDown으로 나누고...
			sum += digit;
			
			dividUp *= 10;				// 10배씩 키움
			dividDown *= 10;			// 10배씩 키움
			
			if(dividDown > num) {
				break;
			}
			
		}
		
		System.out.println("하샤드 수 판별: " + (num%sum==0) );
		
		
		// 밑에 거는 내일 주말에 봐
		
		// while(true) { ... if(...) break; } 구조인데
		// if문에 '탈출 조건'을 쓰면 돼서 생각하기 더 쉬움
		
		// while(반복 조건) { ... }
		// while(true){ ... if(탈출조건) break; } -> 처음에 생각하기 어려울 때 추천
		
		
	}//END::main
}//END::publicClass
