package pratice;

import java.security.PublicKey;
import java.util.Scanner;

public class p9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true ;
		int speed = 0;
		
		while (run){
			System.out.println("-------------------");
			System.out.println("1.속도 증가 2.속도  감소 3.현재 속도 4. 종료 " );
			System.out.println("-------------------");
			
		System.out.print("입력 > ");
		String strnum = sc.nextLine();
		int num = Integer.parseInt(strnum);
		
		
		switch (num) {
		case 1:
			System.out.println("속도 증가 ");
			speed +=1;
			break;
		case 2:
			System.out.println("속도 감소 ");
			if(speed != 0) {
			speed -= 1;
			}
			else {
				System.out.println("속도가 0입니다.");
			}
			break;
		case 3:
		System.out.println("현재 속도는 " + speed);
			break;
		case 4:
			System.out.println("종료합니다 ");
			run = false;
			break;
		default :
			System.out.println("다른 키를 입력하셨습니다. 다시 입력하세요 ");
		}
		}
		
	}

}
