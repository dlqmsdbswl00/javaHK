package hk.edu20240703.day05;

public class D1_ClassTest {
	public int number;
	   public static int staticNumber;
	      
	   //기본생성자:default 생성자라고 함, 파라미터 없음, 생략가능, 클래스의 초기화 작업 수행
	   public D1_ClassTest() {
	      //초기화 관련 코드가 작성됨
	      super();//super라는 단어는 부모클래스를 의미 / ()가 붙으면 부모의 생성자를 의미
	      this.number=5;//초기값 설정 가능 /this는 자기자신(현재클래스를 의미)
	      System.out.println("default생성자 실행됨");
	   }
	   public D1_ClassTest(int a) {}
	   
	   //메서드: 기능구현
	   //호출: 객체명, 메서드()
	   public void methodTest() {
	      System.out.println("클래스 내부에 기능을 정의한다: 메서드");
	   }
	   //호출: 클래스명.메서드()
	   public static void ststicMethodTest() {
	      System.out.println("static메모리에 이미 생성되어 사용되는 메서드");
	   }

}
