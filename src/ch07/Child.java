package ch07;

public class Child extends Parent {
	public int studentNo;

	public Child(int studentNo) {
		super("홍길동");
		//super("홍길동");
		this.studentNo = studentNo;
		
	}
 
/*
 * why? : Child 클래스의 생성자가 호출될 때는 항상 부모 클래스의 생성자가 먼저 호출이 된다.
 * 그래서 컴파일러는 자식 클래스가 생성될 때 자동으로 부모 클래스의 기본 생성자를 호출한다.
 * 하지만 이코드는 부모클래스의 기본 생성자가 없다 그래서 기본 생성자를 못 찼겠다는 오류를 발생시켰다.
 * 
 * 해결방안 : 1, 부모 생성자를 생성한다. 2, super()를 사용해서 문자열 매개변수를 받는 부모 생성자를 명시적으로 호출한.
 */
	
}
