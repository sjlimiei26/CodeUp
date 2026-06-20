package codeup.q1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(true) {
			
			num = sc.nextInt();
			if (num == 0)
				break;
			System.out.println(num);
		}

		sc.close();
	}

}
