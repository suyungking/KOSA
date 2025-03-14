package pratice;

public class p6 {
	public static void main(String[] args) {

		while(true) {
			int num = (int) (Math.random()*6) +1 ; 
			int num1 = (int) (Math.random()*6) +1 ;
			if(num + num1 == 5 ) {
				System.out.println("("+num+","+num1+") 입니다.");
				break;
				
			}
		}
		
	}

}
