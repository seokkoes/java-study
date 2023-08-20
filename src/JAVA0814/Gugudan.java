package JAVA0814;

public class Gugudan {

	public static void main(String[] args) {
		//중첩 for문
		//i for 문 안에있는 j를 1~9를 반복하고 종료후 i 2를 시작한다.
		//제일 밭깥쪽 조건식을 출력후 안에있는 반복문을 다 처리후 밭같쪽의 반복문을 증감후 시작한다.
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}

	}

}
