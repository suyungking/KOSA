package pratice;

public class Charat {
	public static void main(String[] args) {
		String numString = "자바 프로그래밍";
		
		for(int i=0; i< numString.length(); i++) {
			char c = numString.charAt(i);
			System.out.println(c);
		}
	}
}
