package kh.chapter6_Object.com.kh.field;

public class FieldTest {
	// 필드 예약어 사용하기
	
	// 필드 스테틱 테스트
	// 공유 용도로 다른 클래스에서도 사용할 수 있는 변수
	// static 영역은 모든 객체가 공유할 목적으로 
	// 사용하기 때문에 private을 붙이지 않으며,
	// 이로인해 캡슐화 원칙에 위배되는 코드가 된다.
	// 프로그램 실행 시 static 키워드가 붙은 필드 변수들은
	// 모두 정적 메모리에 저장되기 때문에
	// 자칫 남용할 경우 프로그램 자체가 느려질 수 있다.
	// 따라서 특별한 용도 이외에는 많이 사용하지 않는다.
	public static int num;
	
	// final은 상수 선언 시 사용한다.
	// 필드변수 특성 상 초기화 값을 적지 않으면
	// JVM이 자동으로 초기화를 시키는데,
	// 이때 fianl을 적으면 JVM 기본값에서 절대 변경할 수 없다.
	// final을 선언할 경우 반드시 직접 초기값을 기입해야 한다.
	public final double PI = 3.14;
	
	// 일반적으로 상수를 선언할 때에는
	// 공유용도로 사용하기도 하기 때문에
	// final과 static을 같이 붙여 사용한다.
	public static final double PI_2 = 3.14;
	
	// public final static double PI_2 = 3.14;도 가능하다( 순서 상관 X )
	
	
	
	











}
