package ch12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GetClassExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("실행에 필요한 정보 부족");
			System.exit(0);
		}
//		//외부에 정보얻어서 실행
//		// 외부에 얻는 정보의 자료형-> 문자열 
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		int sum = a+b;
//		System.out.println(sum);
//		Vehicle vehicle = new  Vehicle();
//		vehicle.run();
//		how1
		// Class clazz = Car.class; // 스페셜한 클래

		// how2
		// 클래스 정보를 얻는
		// Class clazz = Class.forName("ch12.sec11.exam01.Vehicle"); //풀네임을다 적여야함 그리고
		// 문자열로 준 문자열만 맞으면 됨 하지만 에러가 잘 남 // 컴파일러가 안잡아줌
		Class clazz = Class.forName(args[0]);
		// 기본생성자 정보를 얻는
		Constructor constructor = clazz.getConstructor(); // 기본생성자 정보가 나옴
		// 기본생성자 호출
		Object object = constructor.newInstance();
// 메소드 정보 얻는

		try {
			Method run = clazz.getMethod(args[1]);
			// run함수 실
			if (run != null) {
				run.invoke(object);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		try {
			Method addMethod = clazz.getMethod("add", int.class, int.class);
			// run함수 실
			if (addMethod != null) {
				Object result = addMethod.invoke(object, 10, 20);
				System.out.println("result" + result);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}

		// how3
		// Car car = new Car();
		// Class clazz = car.getClass();

		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}
}