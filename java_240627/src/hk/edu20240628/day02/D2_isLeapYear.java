package hk.edu20240628.day02;

public class D2_isLeapYear {

	public static void main(String[] args) {
		// 윤년 : 1년이 366일인 경우 (2월달이 29일)
		// 윤년 판단 조건 : 년도가 4의 배수이면서 100으로 나눠떨어지지 않는 수
		// 또는 400으로 나눠떨어지는 수
		// 2024년도가 윤년인지 아닌지 출력
		// 코드 : if{} else{}

		int year = 2024;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다");
		} else
			System.out.println("윤년이 아닙니다");
	}
}
