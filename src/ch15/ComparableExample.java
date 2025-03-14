package ch15;

import java.awt.image.AbstractMultiResolutionImage;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import ch12.DateTimeCompareExample;
import lombok.experimental.var;

public class ComparableExample {
	public static void main(String[] args) {
		Person[] arr = { new Person("홍길동", 45), new Person("감자바", 25), new Person("박지원", 31) };
		
		for(var person : arr) {
			person.print();
		}
		
//		Arrays.sort(arr,new Comparator<Person>(){
//			public int compare(Person o1, Person o2) {
//				return o1.age - o2.age;
//			}
//		});
		
		Arrays.sort(arr,(o1,o2) -> o1.age-o2.age);
		
		System.out.println("정렬 후 ");
		for(var person : arr) {
			person.print();
		}

		// //TreeSet 컬렉션 생성
//		TreeSet<Person> treeSet = new TreeSet<Person>();
//
//		//객체 저장
//		treeSet.add(new Person("홍길동", 45));
//		treeSet.add(new Person("감자바", 25));
//		treeSet.add(new Person("박지원", 31));
//		
//		//객체를 하나씩 가져오기
//		for(Person person : treeSet) {
//			System.out.println(person.name + ":" + person.age);
//		}
	}
}