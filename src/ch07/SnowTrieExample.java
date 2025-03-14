package ch07;

public class SnowTrieExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // 업캐스팅

		snowTire.run();
		tire.run();
	}

	/*
	 * 스노우 타이어가 굴러갑니다 
	 * 스노우 타이어가 굴러갑니다 
	 * 업캐스팅으로 인해서 부모 메소드를 호출하지만 오버로딩 되어있어 오버로딩된 자식 메소드가 출력된다.
	 */

}

/*	
 * 변수 대입
 * B b = 
 * 
 *메소드 선언
 * void method(B b) {...}
 * 
 * 메소드 호
 * method()
 * 
 * 2. (B) new A() 빈칸에 들어갈수 없는 코드입니다. A는 부모 클래스이기떄문이다
 */
	
