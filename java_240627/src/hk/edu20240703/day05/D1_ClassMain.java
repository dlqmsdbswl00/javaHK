package hk.edu20240703.day05;

public class D1_ClassMain {

	public static void main(String[] args) {
	      //참조타입
	      D1_ClassTest classTest = new D1_ClassTest();
	      
	      classTest.methodTest(); //객체명.메서드() 호출
	      
	      D1_ClassTest.ststicMethodTest(); //정적메서드 클래스명.메서드() 호출
	      
	      //객체2
	      D1_ClassTest classTest2 = new D1_ClassTest();
	      classTest2.methodTest();
	      classTest2.number=19;
	      int number2=classTest2.number;
	      
	      
	      //인스턴스 : 객체 각각에 대해서 관리가 되기에 서로 영향 받지 않는다.
	      classTest.number=30;
	      System.out.println(classTest.number+":"+classTest2.number);
	      //클래스 변수
	      classTest.staticNumber=30;
	      System.out.println("클래스 변수:"+classTest2.staticNumber);
	      System.out.println("효정이 변수 : 효정이는 바부얌 ");
	   }


}
