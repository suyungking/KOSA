package ch16;

public class Lamb {
	public static void main(String[] args) {
		Person person = new Person();	
		
		person.action(() -> System.out.println("출근 준비완료 "));
		
		
		person.action(() -> {
			System.out.println("출근준비 완료 ");
			System.out.println("퇴근준비 완료 ");
		});
	
	
	
	}

}
