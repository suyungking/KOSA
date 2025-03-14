package pratice;
import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean flag = true;
		while(flag) {
			System.out.println("---------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("---------------------");
			
			System.out.print("선택 > ");
			String Stringnum = sc.nextLine();
			int num = Integer.parseInt(Stringnum);
			
			
			
			switch(num) {
				case 1:
					System.out.print("예금액 > ");
					String num1 = sc.nextLine();
					int num2 = Integer.parseInt(num1);
					balance+= num2;
					break;

				case 2:
					System.out.print("출금 > ");
					String num3 = sc.nextLine();
					int num4 = Integer.parseInt(num3);
					balance -= num4;
					break;
				case 3:
					System.out.println("잔고  > " + balance);
					break;
				case 4:
					System.out.println("프로그램 종료 ");
					flag = false;
					break;
					
				

			}
		}
		
		
		
		
		
	}

}
