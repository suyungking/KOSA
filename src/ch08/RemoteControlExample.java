package ch08;

/*
 * 일반화르 적용하여 기능을 구현 하고자 함
 * 일반화를 적용 -> 1. 의존성 역전 원칙 이용(구현체) 한다. / 부모를 만들고 자식을 만들면 사용 가능 
 * 				2. 개방 폐쇠의 원칙(사용자 측에 적용)
 * 
 * 부모클래스의 참조 변수 사용
 * 부모클래스의 참조 변수 배열
 * 반복문을 사용하여 여러개의 객체를동일하게 실행 할 수 있다. -> 결과는 다르게 나온다. 
 */
public class RemoteControlExample {
	public static void main(String[] args) {
//		// 1. 부모클래스의참조변수 사
//		RemoteControl rc = new Television();
//
//		//rc 변수에 Television 객체를 대입
//		
//		rc.turnOn();
//		
//		//rc 변수에 Audio 객체를 대입(교체시킴)
//		rc = new Audio();
//		rc.turnOn();
//		
//		rc = new Show();
//		rc.turnOn();
		
		
		//2. 배열을 사용하여 객체 선언하는 방법
		RemoteControl[] arr = {new Television(), new Audio(),new Show()};
		
		for(RemoteControl rc:arr) {
			rc.turnOn();
		}
		
		
		}
	}
