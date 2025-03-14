package ch15;

/* 
 * 객체를 정렬하기 위해서는 Comparable, Comparator 둘중 한가지 방법을 정해서 구현해야 한다.
 *  Comparable 인터페이스이다. :: 소스를 수정할수 있는 권한이 있어야한다. 
 *  Comparator 클래스이다.
 * 	
 *  
 */

public class Person /*implements Comparable<Person>*/ {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(name + age);
	}

//// 비교함수를 설정해줘야함 
//	// 비교대상이 하나임
//	@Override
//	public int compareTo(Person o) {
//		// 오름차순
//		//return age - o.age;
//		// 내림차
//		int result = o.age - this.age;
//		return  result != 0 ?  result  :name.compareTo(o.name);
////		if (age < o.age)
////			return -1;
////		else if (age == o.age)
////			return 0;
////		else
////			return 1;
//	}
}