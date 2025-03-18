package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Valid {

	private static final int MAX_PRICE = 50000;
	private static final int MIN_PRICE = 5000;

	public static String validComm(String str) {
		return str;
	}

	public static String validNumber(String number) {
		while (true) {
			if (number.length() != 10) {
				System.out.println("도서번호는 10자리여야 합니다.");
				continue;
			} else {
				return number;
			}
		}
	}

	public static int validPrice(String pricestr) {
		while (true) {
			int price = Integer.parseInt(pricestr);
			if (price < MIN_PRICE || price > MAX_PRICE) {
				System.out.println("가격은 5000~50000원 사이어야 합니다.");
			} else {
				return price;
			}
		}
	}

	public static String validPublish(String publish) {
		while (true) {
			try {
				LocalDate date = LocalDate.parse(publish, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				if (date.isBefore(LocalDate.of(1980, 1, 1)) || date.isAfter(LocalDate.now())) {
					System.out.println("출판일은 1980-01-01 이후, " + LocalDate.now() + " 날짜 이전이어야 합니다.");
				} else {
					return publish;
				}
			} catch (Exception E) {

				System.out.println("날짜 형식이 잘못되었습니다. yyyy-MM-dd 형식으로 입력해주세요.");
			}

		}
	}
}
