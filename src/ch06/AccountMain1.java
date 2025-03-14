package ch06;

import java.util.Scanner;

public class AccountMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		BankApplication ba = new BankApplication();

		while (flag) {
			System.out.println("------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------");

			System.out.print("선택 > ");
			String numberString = sc.nextLine();
			int number = Integer.parseInt(numberString);

			switch (number) {
			case 1: {

				System.out.println("--------------");
				System.out.println("계좌생성");
				System.out.println("--------------");

				System.out.print("계좌번호 : ");
				String acnumString = sc.nextLine();

				System.out.print("계좌 주: ");
				String acnameString = sc.nextLine();

				System.out.print("초기입금 : ");
				String acnumberString = sc.nextLine();
				int acnumber = Integer.parseInt(acnumberString);

				Account1 ac = new Account1(acnumString, acnameString, acnumber);

				ba.accountAdd(ac);

				break;
			}

			case 2:
				System.out.println("--------------");
				System.out.println("계좌 목록");
				System.out.println("--------------");
				ba.accountShow();
				break;

			case 3:
				System.out.println("--------------");
				System.out.println("예금");
				System.out.println("--------------");
				System.out.print("계좌번호 : ");
				String acnumString1 = sc.nextLine();

				System.out.print("예금액 : ");
				String acnumberString1 = sc.nextLine();
				int acnumber1 = Integer.parseInt(acnumberString1);

				ba.acAdd(acnumString1, acnumber1);

				break;

			case 4:
				System.out.println("--------------");
				System.out.println("출금");
				System.out.println("--------------");

				System.out.print("계좌번호 : ");
				String acnumString2 = sc.nextLine();

				System.out.print("출금액 : ");
				String acnumberString2 = sc.nextLine();
				int acnumber2 = Integer.parseInt(acnumberString2);
				ba.acSub(acnumString2, acnumber2);

				break;

			case 5:
				System.out.println("프로그램 종료 ");
				flag = false;
				break;

			default:
				System.out.println("다시 입력하세요 ");
			}
		}

	}

}
