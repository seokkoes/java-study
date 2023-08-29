package JAVA0818;
import java.util.Scanner;

public class StringCast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String str;
		int [] num2 = new int[50];
		
		System.out.print("정수를 입력해 주세요 : ");
		num = sc.nextInt();
		
		sc.nextLine();//스캐너 초기화 라는 비슷한 뜻 , 문자열 위에다가 써줘야 한다.

		System.out.print("문자를 입력해 주세요 : ");
		str = sc.nextLine();
		
	
		System.out.println(num);
		System.out.println(str);
	}

}
