package ch12;

import lombok.Builder;

public class LombookExam {

	public static void main(String[] args) {

		Member member = new Member();
		
		System.out.println(member);
		
		
		Member member1 = new Member("1","h",20);
		
		System.out.println(member1);
		
		System.out.println("id : " + member1.getId()+ ", name : " + member1.getName() +" , Age : " +member1.getAge());
		
		
		Member member2 = Member.builder()
				.name("h")
				.id("123")
				.age(23)
				.build();
		
		System.out.println(member2);
	}

}
