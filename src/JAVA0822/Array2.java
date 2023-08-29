package JAVA0822;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int []arr = {20 , 25 , 30 , 10 , 15 , 5};
//		int []index = new int[2];
		int index1;
		int index2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택한 두 인덱스에 있는 값을 바꿉니다.");
		System.out.print("첫 번째 인덱스: ");
		index1 = sc.nextInt();	// ex: 1번 인덱스
		System.out.print("두 번째 인덱스: ");
		index2 = sc.nextInt();	// ex: 4번 인덱스
		
		{// 중괄호 없어도 됨.
			int tmp = arr[index1];		// tmp    = arr[1]
			arr[index1] = arr[index2];	// arr[1] = arr[4]
			arr[index2] = tmp;			// arr[4] = tmp
		}
		
//		{
//			int tmp1 = arr[index2];
//			int tmp2 = arr[index1];
//			arr[index1] = tmp1;
//			arr[index2] = tmp2;
//		}
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		
	}// END::main
}// END::publicClass
