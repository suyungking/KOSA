package pratice;

public class Equals {
	public static void main(String[] args) {
		String aString = "kim";
		String bString = "kim";
		
		
		if(aString==bString) {
			System.out.println("참조가 같습니다");
			
		}
		else {
			System.out.println("참조가틀립니다 ");
		}
		
		
		if(aString.equals(bString)) {
			System.out.println("참조가 같습니다.");
		}
		else {
			System.out.println("참조가 틀립니");
		}
		
		String cString = new String("kim");
		String dString = new String("kim");
		if(cString==dString) {
			System.out.println("참조가 같습니다");
			
		}
		else {
			System.out.println("참조가틀립니다 ");
		}
		
		
		if(cString.equals(dString)) {
			System.out.println("참조가 같습니다.");
		}
		else {
			System.out.println("참조가 틀립니");
		}
		
		
		
	}

}
