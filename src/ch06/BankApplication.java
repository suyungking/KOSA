package ch06;

public class BankApplication {
	Account1[] account = new Account1[100];

	private int cnt;

	public void accountAdd(Account1 account1) {
		if (cnt >= account.length) {
			System.out.println("계좌가 가득 찼습니다");
			System.exit(0); // 프로그램 종료
		}
		account[cnt] = account1;
		cnt++;
		System.out.println("결과 : 계좌가 생성되엇습니다. ");
	}
	public void accountShow() {
		for (int i = 0; i < cnt; i++) {
			Account1 ac = account[i];
			System.out.println(ac.getAcnumString() + "\t" + ac.getAcnameString() + "\t" + ac.getAcnumber());
		}
	}

	public void acAdd(String acnumString, int acnumber) {
		boolean found = false;
		for (int i = 0; i < cnt; i++) {
			Account1 ac = account[i];
			if (ac.getAcnumString().equals(acnumString)) {
				ac.setAcnumber(ac.getAcnumber() + acnumber);
				found = true;
			}
		}
		if (!found) {
			System.out.println("계좌가 없습니다.");
		}
	}

	public void acSub(String acnumString, int acnumber) {
		boolean found = false;
		for (int i = 0; i < cnt; i++) {
			Account1 ac = account[i];
			if (ac.getAcnumString().equals(acnumString)) {
				if (ac.getAcnumber() - acnumber > 0) {
					ac.setAcnumber(ac.getAcnumber() - acnumber);
					found = true;
				} else {
					System.out.println("계좌에 돈이 부족합니다");
					return;
				}
			}
		}
		if (!found) {
			System.out.println("계좌가 없습니다.");
		}

	}

}
