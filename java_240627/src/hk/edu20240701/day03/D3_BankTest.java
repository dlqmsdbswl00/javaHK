package hk.edu20240701.day03;

import java.util.Scanner;

public class D3_BankTest {
	public static void main(String[] args) {
//		// 클래스를 객체 생성해서 변수에 저장할 때 선언되는 타입 = 참조타입
//		Scanner scan = new Scanner(System.in); // system.in = 키보드로 입력되는 정보
//		System.out.println("키보드로 입력하세요");
//		String s = scan.next();
//		//next : 한 단어만(띄어쓰기 전) nextLine : 한 줄 전체
//		System.out.println("입력된 내용 : "+s);
		
		
		//예제
		//while문과 Scanner 객체를 이용해 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능 구현
		//예금한 금액을 저장할 변수 선언
		//키보드로 입력받은 값을 저장할 변수 선언
		
		int inMoney=0;
		int outMoney=0;
		Scanner scanner=new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			
			System.out.println("선택 > ");
			int menu = scanner.nextInt();
		
			if (menu==1) {
				System.out.println("예금액>");
				inMoney=scanner.nextInt();
			} 
			
			else if (menu==2) {
				System.out.println("출금액>");
				outMoney=scanner.nextInt();
			}
			
			else if (menu==3) {
				System.out.printf("잔고>%d\n",(inMoney-outMoney));
			}
			else if (menu==4) {
				System.out.println("프로그그램을 종료합니다.");
				break;
			}
		}
	}
}
