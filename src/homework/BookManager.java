package homework;
/*
 * 도서관리 프로그램 
 * 
 * 도서 정보를 저장하는 클래스
 * Book 클래스 ( 도서번호 (ISBN), 도서제목, 도서가격, 저자, 출판일
 * BookManager (도서추가, 도서 삭제 , 도서 검색, 도서목록)
 * 
 * 
 * 도서 추가 : 
 * 도서번호( ISBN : 10자리 ) 중복되지 않음
 * 도서가격 5000~50000원 까지 만 가능
 * 도서제목 
 * 저자 
 * 출판일(1980-01-01~ 현재까지만 가능)
 * 
 * 도서 삭제 : 
 * 검색조건 : ISBM, 도서제목, 저자, 출판일 
 * 
 * 도서 검색 및 목: 
 * 1. 도서번호 ISBM 3자리 이상 입력하여 유사한 정보 출력한다.
 * 2. 도서제목 제목도 3자리 이상
 * 3. 저자 두자 이상
 * 4. 출판일 년월일 입력   범위로 입력 할 수 있다 .
 * 2025-03-01 ~ 2025-03-17여 범위에있는책을 싹 출력  
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Book> book = new HashMap<String, Book>();
	

	public void add_book() {
		while (true) {

			String number = Valid.validNumber(sc.nextLine());
			if (book.containsKey(number)) {
				System.out.println("도서번호가 중복됩니다.");
				continue;
			}
			String name = Valid.validComm(sc.nextLine());
			int price = Valid.validPrice(sc.nextLine());
			String author = Valid.validComm(sc.nextLine());
			String publish = Valid.validPublish(sc.nextLine());
			book.put(number, new Book(number, name, price, author, publish));
			System.out.println("도서가 추가 되었습니다.");
			break;

		}
		System.out.println("추가했습니다.");
	}

	public void delete_book() {
		boolean flag = true;
		if (book.isEmpty()) {
			System.out.println("도서가 없습니다.");
			return;
		}
		while (flag) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("삭제조건을 고르세요.");
			System.out.println("1.도서번호 | 2.도서제목 | 3.저자 | 4.출판일 | 5.삭제종료");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			int num = Integer.parseInt(Valid.validComm("선택 > "));
			switch (num) {
			case 1:
				deleteNumber();
				break;
			case 2:
				deleteName();
				break;
			case 3:
				deleteAuthor();
				break;
			case 4:
				deletePublish();
				break;
			case 5:
				System.out.println("삭제 종료");
				flag = false;
				break;
			default:
				System.out.println("다시입력하세요");
			}

		}
	}

	public void select_book() {
		boolean flag = true;
		if (book.isEmpty()) {
			System.out.println("도서가 없습니다.");
			return;
		}
		while (flag) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("검색조건을 고르세요.");
			System.out.println("1.도서번호 | 2.도서제목 | 3.저자 | 4.출판일 | 5.검색종료");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			int num = Integer.parseInt(Valid.validComm("선택 > "));

			switch (num) {
			case 1:
				selectNumber();
				break;
			case 2:
				selectName();
				break;
			case 3:
				selectAuthor();
				break;

			case 4:
				selectPublish();
				break;
			case 5:
				System.out.println("검색 종료");
				flag = false;
				break;
			default:
				System.out.println("다시입력하세요");
			}

		}
	}

	public void list_book() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;

		}
		for (Book b : book.values()) {
			System.out.println("도서번호: " + b.getNumber() + ", 도서제목: " + b.getName() + ", 도서가격: " + b.getPrice() + "원"
					+ ", 도서저자: " + b.getAuthor() + ", 도서출판일: " + b.getPublish());
		}

	}

	private void selectPublish() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;

		}
		while (true) {
			boolean found = false;
			String str_startDate = Valid.validComm("날짜를 입력하세요 (yyyy-MM-dd): ");
			String str_endDate = Valid.validComm("날짜를 입력하세요 (yyyy-MM-dd): ");

			LocalDate startDate = LocalDate.parse(str_startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			LocalDate endDate = LocalDate.parse(str_endDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			if (startDate.isAfter(endDate)) {
				System.out.println("시작 날짜는 종료 날짜보다 이전이어야 합니다. 다시 입력해주세요.");
				continue;
			}

			for (Book b : book.values()) {
				LocalDate publishDate = LocalDate.parse(b.getPublish(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

				if (!publishDate.isBefore(startDate) && !publishDate.isAfter(endDate)) {
					System.out.println("도서번호: " + b.getNumber() + ", 도서제목: " + b.getName() + ", 도서가격: " + b.getPrice()
							+ "원" + ", 도서저자: " + b.getAuthor() + ", 도서출판일: " + b.getPublish());
					found = true;
				}
			}
			if (!found) {
				System.out.println("도서정보가 없습니다. 다시 확인해주세요");
				return;
			}
			return;
		}

	}

	private void selectAuthor() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;

		}
		while (true) {
			boolean found = false;
			String author = Valid.validComm("도서 저자를 입력하세요 (2자이상):");
			if (author.length() < 2) {
				System.out.println("2자리 이상 입력해주세요.");
				continue;
			}
			for (Book b : book.values()) {
				if (b.getAuthor().contains(author)) {
					System.out.println("도서번호: " + b.getNumber() + ", 도서제목: " + b.getName() + ", 도서가격: " + b.getPrice()
							+ "원" + ", 도서저자: " + b.getAuthor() + ", 도서출판일: " + b.getPublish());
					found = true;
				}
			}
			if (!found) {
				System.out.println("도서정보가 없습니다. 다시 확인해주세요");
				return;
			}
			return;
		}
	}

	private void selectName() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;

		}
		while (true) {
			boolean found = false;
			String name = Valid.validComm("도서 제목를 입력하세요 (3자이상):");
			if (name.length() < 3) {
				System.out.println("3자리 이상 입력해주세요.");
				continue;
			}
			for (Book b : book.values()) {
				if (b.getName().contains(name)) {
					System.out.println("도서번호: " + b.getNumber() + ", 도서제목: " + b.getName() + ", 도서가격: " + b.getPrice()
							+ "원" + ", 도서저자: " + b.getAuthor() + ", 도서출판일: " + b.getPublish());
					found = true;
				}
			}
			if (!found) {
				System.out.println("도서정보가 없습니다. 다시 확인해주세요.");
				return;
			}
			return;
		}

	}

	private void selectNumber() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;

		}
		while (true) {
			boolean found = false;
			String number = Valid.validComm("도서 번호를 입력하세요 (3자이상) : ");
			if (number.length() < 3) {
				System.out.println("3자리 이상 입력해주세요.");
				continue;
			}
			for (Book b : book.values()) {
				if (b.getNumber().contains(number)) {
					System.out.println("도서번호: " + b.getNumber() + ", 도서제목: " + b.getName() + ", 도서가격: " + b.getPrice()
							+ "원" + ", 도서저자: " + b.getAuthor() + ", 도서출판일: " + b.getPublish());
					found = true;
				}
			}
			if (!found) {
				System.out.println("도서정보가 없습니다. 다시 확인해주세요.");
				return;
			}
			return;
		}

	}

	private void deletePublish() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;

		}
		while (true) {
			try {
				String publish = Valid.validPublish(sc.nextLine());
				for (Book b : book.values()) {
					if (b.getPublish().equals(publish)) {
						book.values().remove(b);
						System.out.println("도서가 삭제되었습니다.");
						return;
					}

				}
				System.out.println("도서정보가 없습니다. 다시 확인해주세요.");
			} catch (Exception e) {
				System.out.println("도서출을 다시 확인 탁드립니다.");
			}

		}

	}

	private void deleteAuthor() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;
		}
		while (true) {
			try {
				String author = Valid.validComm("저자이름을 입력해주세요 : ");
				for (Book b : book.values()) {
					if (b.getAuthor().equals(author)) {
						book.values().remove(b);
						System.out.println("도서가 삭제되었습니다.");
						return;
					}

				}
				System.out.println("도서정보가 없습니다. 다시 확인해주세요.");
			} catch (Exception e) {
				System.out.println("도서저자를 다시 확인 탁드립니다.");
			}

		}

	}

	private void deleteName() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;
		}
		while (true) {
			try {
				String name = Valid.validComm("도서이름을 입력해주세요 :");

				for (Book b : book.values()) {
					if (b.getName().equals(name)) {
						book.values().remove(b);
						System.out.println("도서가 삭제되었습니다.");
						return;
					}

				}
				System.out.println("해당 도서를 찾을 수 없습니다.");
			} catch (Exception e) {
				System.out.println("도서이름을 다시 확인 탁드립니다.");
			}

		}
	}

	private void deleteNumber() {
		if (book.isEmpty()) {
			System.out.println("도서목록이 없습니다.");
			return;
		}
		while (true) {
			boolean found = false;
			String number = Valid.validNumber(sc.nextLine());
			for (String b : book.keySet()) {
				if (b.equals(number)) {
					book.remove(b);
					System.out.println("도서가 삭제되었습니다.");
					return;
				}

			}
			if (!found) {
				System.out.println("도서정보가 없습니다. 다시 확인해주세요.");
				return;
			}

		}

	}

}