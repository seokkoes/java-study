package JAVA0823;

public class Array3 {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 7, 2, 4, 8 };
		int max, min;

		max = min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			// TODO 최댓값, 최솟값 구하기
			
			if (max < arr[i]) { // ('갱신'을 하는 조건) max보다 큰 값이 나오면
				max = arr[i];	// 갱신
			}
		}// 여기까지가 반복 영역
		System.out.println("최댓값 : " + max); // 얘를 옮기면 되겠지요
		
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최솟값 : " + min); 
		// 여러 번 뜨는 이유가 뭐라고 생각해요? 반복문 '안'에 있어서 그렇죠?
		// 밖으로 빼면 한 번만 뜰 거예요

	}// END::main
}// END::publicClass


// 뭔가 결과 보면 최댓값이 2, 최솟값이 8로 됐네요