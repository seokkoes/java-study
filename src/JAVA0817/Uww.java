package JAVA0817;
import java.util.Scanner;

public class Uww {

	public static void main(String[] args) {

		
	Scanner sc = new Scanner(System.in);
    System.out.print("1숫자입력해");
	int num = sc.nextInt();
	int fac = 1;
	
    for(;num > 0;num--) {
    	fac*=num;
    }
    System.out.println(fac);

	}
}
		
