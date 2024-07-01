package hk.edu20240701.day03;

import java.util.Iterator;

public class D1_ControlFlow {

	public static void main(String[] args) {
		// if문 유형 3가지
		// 1. if(조건식) {실행코드}
		// 2. if(조건식) {실행코드} else {실행코드}
		// 3. if(조건식) {실행코드} else if(조건식) {실행코드} else if(조건식)...

		int num1 = 10;
		int num2 = 5;

		if (num1 > num2) {
			System.out.println("실행결과 : " + num1 + ">" + num2);
		}

		if (num1 < num2) {
			System.out.println("실행결과 : " + num1 + "<" + num2);
		}

		// 참과 거짓에 의한 실행이 반드시 일어나야 하는 경우
		if (num1 > num2) {
			System.out.println("실행결과 : " + num1 + ">" + num2);
		} else {
			System.out.println("실행결과 : " + num1 + "<" + num2);
		}

		// switch case문 : 대상값이 정수형, string
		int num = 10;
		switch (num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		case 10:
			System.out.println("10입니다.");
			break;
		case 20:
			System.out.println("20입니다.");
			break;

		default:
			System.out.println("일치하는값이 없습니다");
			break;
		}

		// 제어문(반복문)
		// for문 : 기본형식(index 기반의 실행), 향상된 for문
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break; // 가장 가까운 반복문 빠져나오기
				// continue; //가장 가까운 반복문으로 돌아가기
			}
			System.out.println(i);
		}

		// 향상된 for문
		// 배열 : 어떤 값의 나열 -> 자바에서는 같은 타입만 나열

		// while문 : 반드시 반복문을 바져나가는 코드 처리 필요

		// 2~9단 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}
			System.out.println("\n");
		}

		// 2~9단 짝수단 출력
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 0) {
				System.out.println("\n");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d\n", i, j, (i * j));
				}
			}
		}

		// 2~9단 홀수단 출력
		for (int i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				System.out.println("\n");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d\n", i, j, (i * j));
				}
			}
		}

		// 1~100까지 총합 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.printf("1~100까지 총합 : %d\n", sum);

		// 1~100까지 3의 배수 총합 출력
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 += i;
			}
		}
		System.out.printf("1~100까지 3의 배수 총합 : %d\n", sum3);
	}

}
