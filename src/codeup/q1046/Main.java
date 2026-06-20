package codeup.q1046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int total = n1 + n2 + n3;
		double avg = (double)total / 3;
		System.out.printf("%d %.1f", total, avg);
		
		sc.close();
	}

}
