
package ch07;

public class MemberMain {
	public static void main(String[] args) {

		Member member = new Member();

		MemberChild memberChild = new MemberChild();

		Member member2 = new MemberChild(); // 업캐스팅
		Member member3 = memberChild; // 업캐스팅
		

		
		MemberChild memberChild2 = (MemberChild) member2; // 다운 캐스팅

		member.speak();
		memberChild.speak();
		
		System.out.println("-------------------------");
		member2.speak();
		member3.speak();
		member3.age();
		// member2.name(); //업캐스팅을 하면 오버로딩된 자식 메소드만 사용가능 자식에서 추가 생성한 메소드를 사용 불가능
		
		System.out.println("-------------------------");
		memberChild2.speak();
		memberChild2.name(); // 업캐스팅을 한후 다운 캐스팅 할 수 있음 // 다운 캐스팅을 하면 자식 메소드에서 추가한 메소드를 사용가능
		
		System.out.println("-------------------------");
		
		//
		Member[] arr = {new Member(), new MemberChild() };
		
		for (var string : arr) {
			string.speak();
		}

	}

}
// 오버로딩되기 전 부모 메서드 쓰려면 그냥 super() 써라

// 	자식객체를 부모 타입으로 변화해서 부모것만 쓰는것을 업캐스팅 이라 함// 오버로딩 된것
// 업캐스팅 이유 : 부모타입으로 여러 자식들을 사용하면 같은 방식으로 사용하면 코드가 간결해지고 유연해지니까/ 다형성때문에 
// 오버라딩 된게 없다면 부모꺼 나

// 부모타입을 자식 타입으로 다시 변환하기위해 다운캐스팅이라 함  // 자식메소드 다 사용 가능 
// 다운캐스팅 이유 : 다시 자식 타입으로 변환해서 자식 기능을 사용하기위해서 