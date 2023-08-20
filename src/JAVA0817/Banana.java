package JAVA0817;

public class Banana {

	public static void main(String[] args) {

		int[] hol = new int[50];
		int index = 0; // Alt+Shift+R : 동일한 변수 변수명 한 번에 바꾸기
		for (int num = 1; num <= 100; num++) {

			if (num % 2 == 1) {
				hol[index] = num;
				System.out.println((index + 1) + " 번째 정수를 출력하시요 : " + hol[index]);
				index++; // 배열에 뭐 하나 넣을 때마다 index 증가
			}

		} // for(i)

		// 또 다른 방법은

		index = 0;
		for (int num = 1; num <= 100; num += 2) {
			hol[index++] = num; // 여기서 값 넣고
			// 밑에 출력문 적어라
			// 십진수 0은 이진수로 0000
			// 십진수 1은 이진수로 0001
			// 십진수 2는 이진수로 0010
			// 십진수 3은 이진수로 0011
			// 십진수 4는 이진수로 0100
			// 십진수 5는 이진수로 0101
			// 십진수 6은 이진수로 0110
			// ... 홀수는 맨 오른쪽 비트가 1, 짝수는 맨 오른쪽 비트가 0
			// 이런 것도 있어서
			// 혹시 나중에 홀짝 검사할 때 (num&1)==0 짝수, (num&1)==1 홀수

		}

	}// END::main
}// END::mainClass

// 순서에 따라서
// 1. hol[index]에 num(홀수) 넣기
// 2. 출력 System.out.println( (index+1) + " 번째 정수를 출력하시요 : " +   hol[index] )
// 3. index++

// 1. hol[index]에 num(홀수) 넣기
// 2. index++
// 3. 출력 System.out.println( index + " 번째 정수를 출력하시요 : " +   hol[index-1] )

// 이 정도 보정은 해야함
// 정확하게 변수를 잘 구분좀...
// index는 말 그대로 '배열 번호'로 사용되는 거고
// num은 실제로 담길 홀수 값(1, 3, 5, 7, 9, ...)
