package codeup.q1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문자를 저장할 변수 선언
		String data;
		
		// 문자를 하나 입력 받기 -> Scanner!
		data = sc.next();
		
		// 입력 받은 문자 출력 하기
		System.out.println(data);

		sc.close();
	}

}
