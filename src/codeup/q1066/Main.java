package codeup.q1066;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		/*
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int[] arr = {n1, n2, n3};
		*/
		
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		for(int i=0; i<arr.length; i++) {
			String result = arr[i] % 2 == 0 ? "even" : "odd";
			System.out.println(result);
		}
		*/
		for(int n : arr) {
			System.out.println(n % 2 == 0 ? "even": "odd");
		}
		
		sc.close();
	}

}
