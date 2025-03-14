package ch06;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		
		
		MemberService member = new MemberService();
		MemberService member1 = new MemberService();
		
		boolean result = member.login("hong", "12345");
		boolean result1 = member1.login("홍길", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			member.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		if(result1) {
			System.out.println("로그인 되었습니다.");
			member.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
