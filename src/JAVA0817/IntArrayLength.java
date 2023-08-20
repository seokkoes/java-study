package JAVA0817;
import java.util.Scanner;

public class IntArrayLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int length = sc.nextInt();
        int [] intArr  = new int[length];
		 // 5개의 상자가 생긴다.
		//int [] intArr  = new int[sc.nextInt];

		//규칙 index 0시작해서 4까지 1씩 증가하면서 반복하고 있다.
		for(int index=0; index<intArr.length; index++) {
			System.out.print((index+1)+" 번째 숫자를 입력해 주세요 : ");
			intArr[index] = sc.nextInt();
			
		}
		
		System.out.println("배열의 길이는 " + intArr.length);

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
