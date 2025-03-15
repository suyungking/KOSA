package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Machine {
	private ArrayList<Item> items = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public void run() {
		// 기존에있던 자판기 음료수
		items.add(new Item("칠성사이다", 1800, 3));
		items.add(new Item("코카콜라", 2000, 0));
		items.add(new Item("삼다수", 800, 1));
		items.add(new Item("레쓰비", 700, 13));

		boolean falg = true;
		while (falg) {
			System.out.println("================");
			displayItems();
			System.out.println("1. 음료수 고르기 | 2.음료수 추가하기 |3.음료수 수량 추가하기 | 4.종료");
			System.out.print("선택 > ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1: {
				drinkChoose();
				falg = false;
				break;
			}
			case 2:
				drinkAdd();
				break;

			case 3:
				drinkqAddQantity();
				break;
			case 4:
				System.out.println("종료합니다.");
				falg = false;
				break;

			default:
				System.out.println("번호를 다시 입력해주세요.");
			}
		}

	}

	private void displayItems() {

		if (items.size() == 0) {
			System.out.println("등록된 음료수가 없습니다.");
		} else {
			for (int i = 0; i < items.size(); i++) {
				Item item = items.get(i);
				System.out.println(i + 1 + "번 " + item.getName() + ": " + item.getPrice() + "원  남은 수량  : "
						+ item.getQuantity() + "개");
			}
			System.out.println("================");
		}

	}

	private void drinkAdd() {
		String name;
		while (true) {
			System.out.print("음료수 이름을 입력하세요 : ");
			name = sc.nextLine();

			boolean falg = false;
			for (Item item : items) {
				if (item.getName().equals(name)) {
					System.out.println("이미 등록된 음료수입니다. 다른 이름을 입력해주세요.");
					falg = true;
					break;
				}
			}
			if (!falg) {
				break;
			}
		}
		System.out.print("음료수 가격을 입력하세요 :");
		int price = sc.nextInt();
		System.out.print("음료수 수량을 입력하세요 :");
		int quantity = sc.nextInt();
		sc.nextLine();

		items.add(new Item(name, price, quantity));

	}

	private void drinkChoose() {
		boolean falg = true;
		System.out.print("돈을 입력해주세요 : ");
		int balance = sc.nextInt();
		while (falg) {

			System.out.print("음료수 번호를 눌러주세요 : ");
			int number = sc.nextInt();
			sc.nextLine();

			if (number < 1 || number > items.size()) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}

			Item item = items.get(number - 1);

			if (item.getQuantity() == 0) {
				System.out.println("재고가 없습니다.");
				continue;
			}

			while (balance < item.getPrice()) {
				System.out.print("돈이 부족합니다. 추가 금액을 입력해주세요.");
				int addMoney = sc.nextInt();
				sc.nextLine();
				balance += addMoney;
				System.out.println("현재 잔액: " + balance + " 원");

			}

			System.out.println("정상적으로 "+item.getName() + "가 출고되었습니다.");
			balance -= item.getPrice();
			System.out.println("거스름돈 : " + balance + " 원");
			item.setQuantity(item.getQuantity() - 1);
			System.out.println("종료합니다.");
			falg = false;
		}
	}

	private void drinkqAddQantity() {
		int number;
		while (true) {
			System.out.print("음료수 번호를 입력하세요 : ");
			number = sc.nextInt();
			sc.nextLine();

			if (number < 1 || number > items.size()) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}

		Item item = items.get(number - 1);
		System.out.println(item.getName() + "의 기존 수량은 " + item.getQuantity() + "개 입니다.");

		System.out.print("추가할실 수량을 입력하세요 :"); 
		int quantity = sc.nextInt();
		sc.nextLine();
		item.setQuantity(item.getQuantity() + quantity);

	}

}
