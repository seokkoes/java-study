package JAVA0817;

public class Atarasi2 {

	public static void main(String[] args) {
		
		int [] hol = new int[50];
		int index = 0;
		for(int num = 1; num<=100; num++) {
			if(num%2==1) {
				hol[index] = num;
				System.out.println((index+1)+"번째 방은"+hol[index]);
			index++;
			}
		}

	}

}
