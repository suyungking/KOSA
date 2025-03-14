package ch05;

public class Ps {
	public static void main(String[] args) {
		// 시적 배열
		String[] value = {"자바 " ,"자바 " ,new String("java")};
		
		System.out.println(value[0] == value[1] );
		System.out.println(value[0] == value[2] );
		System.out.println(value[0].equals(value[2]));
		
		System.out.println("==============================");
		// 명시적배열 
		String[] value1 = new String[] {"자바 " ,"자바 " ,new String("java")};
		
		System.out.println(value1[0] == value1[1] );
		System.out.println(value1[0] == value1[2] );
		System.out.println(value1[0].equals(value1[2]));
	}
	
}
