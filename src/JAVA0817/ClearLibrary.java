package JAVA0817;

public class ClearLibrary {
	/**
	 * 
	 * */
	public static void main(String[] args) {
		// 상수: 그냥 안 바뀌게 안전하게 쓰고 싶으면 final 붙인다 생각
		final int AMOUNT = 30;

		/** 남은 책 수 */
		int rest = (int) 3e5; // 300000
		// 3 기준으로 0이 5개!
		// 3.5e5 이런 식이면 350000
		// 3e-1이면 0.3

		int people = 2;
		int period = 1;

		while (rest > 0) {
			rest -= (people * AMOUNT); // 60권 읽고
			period++; // 하루 증가시켰을 때
			if (period % 10 == 0) { // 10의 배수일 때마다.(10번마다.)
				people *= 2; // 인원 2배씩
			}
		}

		System.out.printf("책을 다 읽을 때까지 %d일 %d명입니다.", period, people);

	}

}
