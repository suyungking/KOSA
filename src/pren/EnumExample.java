package pren;


public class EnumExample {
	public static void main(String[] args) {
		Pren pren =  Pren.mon;
		
		switch(pren) {
		case mon:
			System.out.println("월요일 입니다");
			break;
		default :
			System.out.println("다른 요일입니다.");
			break;
		}
	
		
		
	}

}
