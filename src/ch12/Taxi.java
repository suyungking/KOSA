package ch12;

public class Taxi extends Vehicle {
	public Taxi() {
		System.out.println("Taxi 호출 ");
	}
	//메소드 재정의(오버라이딩)
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}