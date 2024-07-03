package hk.edu20240703.day05;

public class D4_ConstructorTest {
	public static void main(String[] args) {
		D4_ConstructorTest con = new D4_ConstructorTest();
	}

	// 티비 객체
	private int size = 0; // 중요 데이터인 경우 private 선언
	public String color = "검정색"; // 색상

	// default 생성자는 단독으로 사용할 땐 생략 가능하지만 오버로딩시 생략 불가
	public D4_ConstructorTest() {
		super(); // 부모 생성자 호출(반드시 첫 줄에 작성)
		this.size = 60;
	}

	// 생성자 오버로딩(파라미터 1개 짜리)
	public D4_ConstructorTest(int size) {
		this.size = size;
	}

	public D4_ConstructorTest(int size, String color) {
		this.size = size;
		this.color = color;
	}

}
