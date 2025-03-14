package ch07;

public class ChildExample {
	public static void main(String[] args) {
		Child1 child =  new Child1();
	}
	
	/*
	 * 자식 클래스의 생성자가 호출될 때는 항상 부모 클래스의 생성자가 먼저 호출이 된다.
	 * 그래서 먼저 부모 호출 된다. this()로인해서 Parent1(String nation) call 출력되고  
	 * 그 다음인 Parent1 () call 출력되고 그다음으로 자식의 Child1(String name) call 출력되고 마지막으로 Child1() call 출력된
	 */
}
