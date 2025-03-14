package pratice;

public class PraticeString2 {
	public static void main(String[] arg) {
		String answerString = "자바 프로그래밍 ";
		
		int indexString = answerString.indexOf("바");
		String num = answerString.replace("바", "나");
		
		
		System.out.println(indexString);
		System.out.println(num);
		
	}
}