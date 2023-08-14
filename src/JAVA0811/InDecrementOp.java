package JAVA0811;

import java.util.Scanner;

public class InDecrementOp {

	public static void main(String[] args) {
		//Scanner를 사용하기 위해서는 import를 해야한다.
		//Import는 가져온다라는 의미
		//IMport하는 방법은 Scanner문자 끝에 커서를 놓고 ctrl+space
		//Scanner는 키보드를 통해서 입력한 내용을 자바에서 사용할 수 있도록 도와주는 객체
		//sc는 객체명(식별자)
		//new 생성한다
		//Scanner()생성자 Scanner()는 new랑 같이 사용한다.
		//system = pc, in = 키보드 느낌
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		//매소드 nextInt()는 Int형의 값을 입력받겠다.
		int cnt = sc.nextInt();
		//int cnt = 10;
		
		System.out.print("cnt : "+cnt); 
		System.out.println();//<--ln효과 엔터효과
		System.out.println("cnt++ : " + cnt++);
		System.out.println("cnt++ 처리후 : " + cnt);
		System.out.println("cnt : " + ++cnt);
		
		
	}

}
