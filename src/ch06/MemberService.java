package ch06;

public class MemberService {
	String name;
	String id;
	String password;
	int age;
	

	public boolean login(String id, String password) {
		boolean result = (id.equals("hong") && password.equals("12345") ) ? true : false; 
		return result;
	}

	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다. ");
	}

}
