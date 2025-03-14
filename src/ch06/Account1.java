package ch06;

public class Account1 {

	private final String acnumString; // 계좌번호
	private final String acnameString; // 계좌주
	private int acnumber; // 초기금

	public Account1(String acnumString, String acnameString, int acnumber) {
		this.acnumString = acnumString;
		this.acnameString = acnameString;
		this.acnumber = acnumber;
	}

	public void setAcnumber(int acnumber) {
		this.acnumber = acnumber;
	}

	public String getAcnumString() {
		return acnumString;
	}

	public String getAcnameString() {
		return acnameString;
	}

	public int getAcnumber() {
		return acnumber;
	}

}
