package JAVA0824;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// INIT:
		Scanner sc = new Scanner(System.in);
		int []arr= new int[5];
		int sum = 0;
		double avg;
		
		// INPUT:
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력: ");
			arr[i] = sc.nextInt();
		}
		
		// CAL:
		for(int i=0; i<arr.length; i++) { // INPUT쪽 for문과 합칠 수 있음(똑같은 for문)
			sum += arr[i];
		}
		avg = (double)sum/(double)arr.length;
		
		// PRINT:
		System.out.println("총합: "+sum+", 평균: "+avg);
		
	}// END::main
}// END::public Class
